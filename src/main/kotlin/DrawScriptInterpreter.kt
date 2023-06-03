import java.lang.IllegalArgumentException

class DrawScriptInterpreter(private val script: Script) {
    private val initializedConstants = mutableMapOf<String, ExpressionData>()
    private val initializedVars = mutableMapOf<String, Int>()
    private val executionStack = SequenceStack()

    fun run() {
        script.validate()
        initializedConstants.putAll(script.initializedConstants)
        val sintaxErrors = script.errors
        if (sintaxErrors.isNotEmpty()) {
            println("Erros na validação: $sintaxErrors")
            return
        }
        println("Script sem erros")

        val mainIterator = SequenceIterator(script.instructions)
        executionStack.push(mainIterator)
        while(!executionStack.isEmpty) {
            println(executionStack.toString())
            iterateTop()
        }
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
            is Border -> println("BORDER ${inst.color}")
            is IfElse -> {
                println("--- IF ---")
                val value = evaluate(inst.guard)
                println("Valor da guard: $value")
                if (value == 1) {
                    val newIter = SequenceIterator(inst.sequence)
                    executionStack.push(newIter)
                    iterateTop()
                } else if (inst.alternative.isNotEmpty()){
                    val newIter = SequenceIterator(inst.alternative)
                    executionStack.push(newIter)
                    iterateTop()
                }
            }

            is Circle -> TODO()
            is Elipse -> TODO()
            is Line -> TODO()
            is Rectangle -> TODO()
            is Fill -> println("FILL ${inst.varId}")
            is ForLoop -> {
                println("--- FOR LOOP ---")
                val variableId = inst.incrementVar.varId
                val start = evaluate(inst.interval.start)
                val end = if (inst.interval.exclusive) (evaluate(inst.interval.end) - 1) else evaluate(inst.interval.end)
                initializedVars[variableId] = start

                var value = initializedVars[variableId]!!
                while (value < end) {
                    value = initializedVars[variableId]!!
                    println("$variableId = $value")
                    val newIter = SequenceIterator(inst.sequence)
                    executionStack.push(newIter)
                    iterateTop()
                    initializedVars[variableId] = (value + 1)
                }
                println("--- FIM FOR LOOP ---")

            }
        }
    }


    private fun evaluate(exp: Expression): Int =
        when (exp) {
            is Literal -> exp.value
            is ConstantRef -> {
                val value = initializedConstants[exp.constId]
                if(value is Literal)
                    value.value
                else throw IllegalArgumentException("Não é possível avaliar esta constante (é cor)")
            }
            is BinaryExpression -> operation(evaluate(exp.left), exp.operator, evaluate(exp.right))
            is Bool -> if (evaluate(exp.left) == evaluate(exp.right)) 1 else 0
            is Variable -> initializedVars[exp.varId]!!
            else -> throw IllegalArgumentException("Expressão não válida $exp")
        }
    private fun operation(left: Int, oper: Operator, right: Int): Int {
        val res : Int
        when (oper) {
            Operator.PLUS -> res = left + right
            Operator.MINUS -> res = left - right
            Operator.TIMES -> res = left * right
            Operator.DIVISION -> res = left / right
            Operator.MOD -> res = left % right
        }
//        println("$left $oper $right = $res")
        return res
    }

}