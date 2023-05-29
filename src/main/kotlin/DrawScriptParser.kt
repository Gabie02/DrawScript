

data class Script(val declarations: List<Declaration>, val expressionDimension: Expression, val expressionBackground: Expression, val origin: Point, val instructions: List<Instruction>) {

    override fun toString(): String {
        return "$declarations---\ndimension: $expressionDimension\nbackground: $expressionBackground\n---\n$instructions".filterNot { it == ',' || it == '[' || it == ']' }
    }

    fun validate() {
        val initializedConstants = mutableSetOf<String>()
        declarations.forEach {
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


data class Declaration(val varId: String, val expression: ExpressionData) {

    override fun toString(): String {
        return "$varId: $expression\n"
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

data class Fill(val varId: String) : Instruction





sealed interface Figure : Instruction

data class Point(val x : Expression, val y : Expression)

data class Dimension(val w : Expression, val h : Expression)









sealed interface Expression

data class ConstantRef(val varId: Int) : Expression {

    override fun toString(): String {
        return "$varId"
    }
}

sealed interface ExpressionData : Expression

data class Literal(val value: Int) : ExpressionData {

    override fun toString(): String {
        return "$value"
    }

}

data class Color(val color: List<Int>) : ExpressionData {

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
    PLUS, MINUS, TIMES, DIVISION, MOD;
}


fun main() {
    val script = Script(
        // CONSTANTS
        listOf(
            // N: 8
            Declaration("N", Literal(8)),
            // SIDE: 40
            Declaration("SIDE", Color(listOf(0,255,20))),
            // MARGIN: 5
            Declaration("MARGIN", Literal(5)),
            ),

        // PROPERTIES
        Literal(80),
        Literal(10),
        Point(Literal(0),Literal(0)),

        // INSTRUCTIONS
        emptyList()
    )
    script.validate()
    print(script)
}


