class DrawScriptInterpreter(private val script: Script) {
    private val initializedConstants = mutableMapOf<String, ExpressionData>()
    private val initializedVars = mutableMapOf<String, Int>()
    private val executionStack = SequenceStack()
    private val paintInstructions = mutableListOf<Triple<Color, Figure, Boolean>>()
    private lateinit var currentColor: Color

    lateinit var SCRIPT_DIM: Dimension
    lateinit var SCRIPT_ORIGIN: Point

    fun run(): List<Triple<Color, Figure, Boolean>> {
        script.validate()
        initializedConstants.putAll(script.initializedConstants)
        val sintaxErrors = script.errors
        if (sintaxErrors.isNotEmpty()) {
            println("Erros na validação: $sintaxErrors")
            return emptyList()
        }
        println("Script sem erros")

        val scriptWidth = Literal(evaluate(script.expressionDimension.w))
        val scriptHeight = Literal(evaluate(script.expressionDimension.h))
        SCRIPT_DIM = Dimension(w = scriptWidth, h = scriptHeight)

        val scriptX = Literal(evaluate(script.origin.x))
        val scriptY = Literal(evaluate(script.origin.y))
        SCRIPT_ORIGIN = Point(scriptX, scriptY)

        // Pintar com o background color
        val scriptBackgroundExp = script.expressionBackground.exp
        currentColor = when (scriptBackgroundExp) {
            is Color -> scriptBackgroundExp
            is ConstantRef -> initializedConstants[scriptBackgroundExp.constId] as Color
            else -> Color(255, 255, 255)
        }
        paintInstructions.add(Triple(currentColor, Rectangle(SCRIPT_ORIGIN, SCRIPT_DIM), false))

        val mainIterator = SequenceIterator(script.instructions)
        executionStack.push(mainIterator)
        while (!executionStack.isEmpty)
            iterateTop()

        return paintInstructions
    }


    private fun iterateTop() {
        val iter = executionStack.pop()
        while (iter.hasNext) {
            val nextInst = iter.next()
            evaluateInstruction(nextInst)
        }
    }


    private fun evaluateInstruction(inst: Instruction) {
        when (inst) {
            is Border -> paintInstructions.add(Triple(currentColor, resolveFigure(inst.figure), true))
            is IfElse -> {
                val value = evaluate(inst.guard)
                if (value == 1) {
                    val newIter = SequenceIterator(inst.sequence)
                    executionStack.push(newIter)
                    iterateTop()
                } else if (inst.alternative.isNotEmpty()) {
                    val newIter = SequenceIterator(inst.alternative)
                    executionStack.push(newIter)
                    iterateTop()
                }
            }

            is Figure -> paintInstructions.add(Triple(currentColor, resolveFigure(inst), false))
            is Fill -> {
                val constValue = initializedConstants[inst.varId]
                if (constValue is Color)
                    currentColor = constValue
                else throw IllegalArgumentException("Validações falharam - Não se pode fazer fill com cores")
            }

            is ForLoop -> {
                val variableId = inst.incrementVar.varId
                val start = evaluate(inst.interval.start)
                val end =
                    if (inst.interval.exclusive) (evaluate(inst.interval.end) - 1) else evaluate(inst.interval.end)
                initializedVars[variableId] = start

                var value = initializedVars[variableId]!!
                while (value < end) {
                    value = initializedVars[variableId]!!
                    val newIter = SequenceIterator(inst.sequence)
                    executionStack.push(newIter)
                    iterateTop()
                    initializedVars[variableId] = (value + 1)
                }

            }
        }
    }

    private fun resolveFigure(figure: Figure): Figure {
        val x = Literal(evaluate(BinaryExpression(figure.origin.x, Operator.PLUS, SCRIPT_ORIGIN.x)))
        val y = Literal(evaluate(BinaryExpression(figure.origin.y, Operator.PLUS, SCRIPT_ORIGIN.y)))
        val origin = Point(x, y)
        val resolvedFigure: Figure = when (figure) {
            is Circle -> {
                val radius = Literal(evaluate(figure.radius))
                Circle(origin, radius)
            }

            is Elipse -> {
                val dimension = Dimension(Literal(evaluate(figure.dim.w)), Literal(evaluate(figure.dim.h)))
                Elipse(origin, dimension)
            }

            is Line -> {
                val dx = Literal(evaluate(BinaryExpression(figure.destination.x, Operator.PLUS, SCRIPT_ORIGIN.x)))
                val dy = Literal(evaluate(BinaryExpression(figure.destination.y, Operator.PLUS, SCRIPT_ORIGIN.y)))
                val destination = Point(dx, dy)
                Line(origin, destination)
            }

            is Rectangle -> {
                val dimension = Dimension(Literal(evaluate(figure.dim.w)), Literal(evaluate(figure.dim.h)))
                Rectangle(origin, dimension)
            }
        }
        return resolvedFigure
    }


    private fun evaluate(exp: Expression): Int =
        when (exp) {
            is Literal -> exp.value
            is ConstantRef -> {
                val value = initializedConstants[exp.constId]
                if (value is Literal)
                    value.value
                else throw IllegalArgumentException("Não é possível avaliar esta constante (é cor)")
            }
            is BinaryExpression -> operation(evaluate(exp.left), exp.operator, evaluate(exp.right))
            is Bool -> if (evaluate(exp.left) == evaluate(exp.right)) 1 else 0
            is Variable -> initializedVars[exp.varId]!!
            else -> throw IllegalArgumentException("Expressão não válida $exp")
        }

    private fun operation(left: Int, oper: Operator, right: Int): Int = when (oper) {
        Operator.PLUS -> left + right
        Operator.MINUS -> left - right
        Operator.TIMES -> left * right
        Operator.DIVISION -> left / right
        Operator.MOD -> left % right
    }
}



