import com.ibm.icu.impl.coll.CollationRoot

class DrawScriptInterpreter(private val script: Script) {
    private val initializedConstants = mutableMapOf<String, ExpressionData>()
    private val initializedVars = mutableMapOf<String, Int>()
    private val executionStack = SequenceStack()
    private val paintInstructions = mutableListOf<Pair<Color, Figure>>()
    lateinit var currentColor: Color
    lateinit var SCRIPT_DIM : Dimension

    fun run(): List<Pair<Color, Figure>> {
        script.validate()
        initializedConstants.putAll(script.initializedConstants)
        val sintaxErrors = script.errors
        if (sintaxErrors.isNotEmpty()) {
            println("Erros na validação: $sintaxErrors")
            return emptyList()
        }
        println("Script sem erros")
        currentColor = script.expressionBackground as Color
        val scriptWidth = Literal(evaluate(script.expressionDimension.w))
        val scriptHeight = Literal(evaluate(script.expressionDimension.h))
        SCRIPT_DIM = Dimension(w = scriptWidth, h = scriptHeight)

        val mainIterator = SequenceIterator(script.instructions)
        executionStack.push(mainIterator)
        while (!executionStack.isEmpty) {
//            println(executionStack.toString())
            iterateTop()
        }
        println(paintInstructions)
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
            is Border -> println("BORDER PLACEHOLDER")
            is IfElse -> {
//                println("--- IF ---")
                val value = evaluate(inst.guard)
//                println("Valor da guard: $value")
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

            is Figure -> paintInstructions.add(Pair(currentColor, resolveFigure(inst)))
            is Fill -> {
                val constValue = initializedConstants[inst.varId]
                if (constValue is Color)
                    currentColor = constValue
                else throw IllegalArgumentException("Validações falharam - Não se pode fazer fill com cores")
            }

            is ForLoop -> {
//                println("--- FOR LOOP ---")
                val variableId = inst.incrementVar.varId
                val start = evaluate(inst.interval.start)
                val end =
                    if (inst.interval.exclusive) (evaluate(inst.interval.end) - 1) else evaluate(inst.interval.end)
                initializedVars[variableId] = start

                var value = initializedVars[variableId]!!
                while (value < end) {
                    value = initializedVars[variableId]!!
//                    println("$variableId = $value")
                    val newIter = SequenceIterator(inst.sequence)
                    executionStack.push(newIter)
                    iterateTop()
                    initializedVars[variableId] = (value + 1)
                }
//                println("--- FIM FOR LOOP ---")

            }
        }
    }

    private fun resolveFigure(figure: Figure): Figure {
        val origin = Point(Literal(evaluate(figure.origin.x)), Literal(evaluate(figure.origin.y)))
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
                val destination = Point(Literal(evaluate(figure.destination.x)), Literal(evaluate(figure.destination.y)))
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

    private fun operation(left: Int, oper: Operator, right: Int): Int {
        val res = when (oper) {
            Operator.PLUS -> left + right
            Operator.MINUS -> left - right
            Operator.TIMES -> left * right
            Operator.DIVISION -> left / right
            Operator.MOD -> left % right
        }
//        println("$left $oper $right = $res")
        return res
    }


}