import java.lang.IllegalArgumentException

class DrawScriptInterpreter(private val script: Script) {
    private val initializedConstants = mutableMapOf<String, Int>()
    private val initializedVars = mutableMapOf<String, Int>()
    private val executionStack = SequenceStack()

    fun run() {
        val sintaxErrors = script.errors
        if (sintaxErrors.isNotEmpty()) {
            println(sintaxErrors)
            return
        }

        val mainIterator = SequenceIterator(script.instructions)
        executionStack.push(mainIterator)
        while(!executionStack.isEmpty) {
            iterateThroughSequence(executionStack.pop())
        }
    }


    private fun iterateThroughSequence(iter: SequenceIterator) {
        while (iter.hasNext) {
            val nextInst = iter.next()
            evaluateInstruction(nextInst)
        }
    }


    private fun evaluateInstruction(inst: Instruction) {
        when (inst) {
            is Border -> TODO()
            is IfElse -> {
                if (evaluate(inst.guard) == 1) {
                    val newIter = SequenceIterator(inst.sequence)
                    executionStack.push(newIter)
                    iterateThroughSequence(newIter)
                    executionStack.pop()
                }
            }

            is Circle -> TODO()
            is Elipse -> TODO()
            is Line -> TODO()
            is Rectangle -> TODO()
            is Fill -> TODO()
            is ForLoop -> {
                val start = evaluate(inst.interval.start)
                val end = if (inst.interval.exclusive) (evaluate(inst.interval.end) - 1) else evaluate(inst.interval.end)
                initializedVars[inst.incrementVar.varId] = start

                val newIter = SequenceIterator(inst.sequence)
                executionStack.push(newIter)
                while (initializedVars[inst.incrementVar.varId]!! <= end) {
                    iterateThroughSequence(newIter)
                }
                executionStack.pop()

            }
        }
    }


    private fun evaluate(exp: Expression): Int =
        when (exp) {
            is Literal -> exp.value
            is ConstantRef -> initializedConstants[exp.constId]!!
            is BinaryExpression -> operation(evaluate(exp.left), exp.operator, evaluate(exp.right))
            is Bool -> if (evaluate(exp.left) == evaluate(exp.right)) 1 else 0
            is Variable -> initializedVars[exp.varId]!!
            else -> throw IllegalArgumentException("Expressão não válida $exp")
        }
    private fun operation(left: Int, oper: Operator, right: Int): Int =
        when (oper) {
            Operator.PLUS -> left + right
            Operator.MINUS -> left - right
            Operator.TIMES -> left * right
            Operator.DIVISION -> left / right
            Operator.MOD -> left%right
        }

}