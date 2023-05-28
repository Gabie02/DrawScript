

data class Script(val constants: List<Constant>, val properties: Property, val instructions: List<Instruction>) {

    override fun toString(): String {
        return "$constants---\n$properties---\n$instructions".filterNot { it == ',' || it == '[' || it == ']' }
    }

    fun validate() {
        val initializedConstants = mutableSetOf<String>()
        constants.forEach {
            if(initializedConstants.contains(it.varId))
                throw IllegalStateException("Variable ${it.varId} já existia")
            if(it.expression is Color) {
                it.expression.color.forEach {
                    if(it < 0 || it > 255)
                        throw IllegalArgumentException("Valor $it não é válido para o componente de cor")
                }
            }
            initializedConstants.add(it.varId)
        }}



}


data class Constant(val varId: String, val expression: Expression) {

    override fun toString(): String {
        return "$varId: $expression\n"
    }

}

data class Property(val expressionDimension: Expression, val expressionBackground: Expression) {

    override fun toString(): String {
        return "dimension: $expressionDimension\nbackground: $expressionBackground\n"
    }

}

sealed interface Instruction

sealed interface ControlStructure : Instruction {
    val guard: Expression
    val sequence: List<Instruction>
}

data class IfElse(override val guard: Expression, override val sequence: List<Instruction>, val alternative: List<Instruction>) : ControlStructure {

    override fun toString(): String {
        return "IfElse(guard=$guard, sequence=$sequence, alternative=$alternative)"
    }

}

data class Fill(val varId: String) : Instruction {

}

sealed interface Figure : Instruction



sealed interface Expression

data class Literal(val value: Int) : Expression {

    override fun toString(): String {
        return "$value"
    }

}
// n tenho a certeza de onde colocar os tipos como a cor
data class Color(val color: List<Int>) : Expression {

    override fun toString(): String {
        return "${color[0]}|${color[1]}|${color[2]}"
    }
}


data class BinaryExpression(val left: Expression, val operator: Operator, val right: Expression) : Expression {

    override fun toString(): String {
        return "$left $operator $right"
    }

}

enum class Operator {
    PLUS, MINUS, TIMES, DIVISION, REMAINDER;
}


fun main() {
    val script = Script(
        // CONSTANTS
        listOf(
            // N: 8
            Constant("N", Literal(8)),
            // SIDE: 40
            Constant("SIDE", Literal(40)),
            // MARGIN: 5
            Constant("MARGIN", Literal(5)),
            ),

        // PROPERTIES
        // NOTA: acho q temos de trocar alguma coisa nas nossas classes pq n conseguimos acessar as constantes quando criamos uma BinaryExpression
        Property( Literal(80), Literal(10) ),

        // INSTRUCTIONS
        emptyList()
    )
    print(script)
}