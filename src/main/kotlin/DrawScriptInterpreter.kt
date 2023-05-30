class DrawScriptInterpreter(private val script: Script) {
    private val initializedConstants = script.initializedConstants
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
            //TODO
            executionStack.pop()
        }
    }


}