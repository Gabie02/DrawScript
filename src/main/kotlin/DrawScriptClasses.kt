import javax.swing.JComponent

data class Script(val declarations: List<Declaration>, val expressionDimension: Dimension, val expressionBackground: Color, val origin: Point, val instructions: List<Instruction>) {

    override fun toString(): String {
        return "$declarations---\ndimension: $expressionDimension\nbackground: $expressionBackground\norigin: $origin---\n$instructions".filterNot { it == ',' || it == '[' || it == ']' }
    }

    fun validate() {
        val initializedConstants = mutableSetOf<String>()
        declarations.forEach {
            if(initializedConstants.contains(it.varId))
                throw IllegalStateException("Variable ${it.varId} já existia")
            if(it.expression is Color) {
                if(it.expression.r < 0 || it.expression.r > 255 || it.expression.g < 0 || it.expression.g > 255 || it.expression.b < 0 || it.expression.b > 255)
                    throw IllegalArgumentException("Valor $it não é válido para o componente de cor")

            }
            initializedConstants.add(it.varId)
        }}



}


data class Declaration(val varId: String, val expression: ExpressionData) {

    override fun toString(): String {
        return "$varId: $expression\n"
    }

}

data class Property(val prop: String, val value: Data) {

    override fun toString(): String {
        return "$prop: $value\n"
    }

}


sealed interface Instruction

sealed interface ControlStructure : Instruction {
    val guard: Expression
    val sequence: List<Instruction>
}

data class IfElse(override val guard: Bool, override val sequence: List<Instruction>, val alternative: List<Instruction>) : ControlStructure {

    override fun toString(): String {
        return "IfElse(guard=$guard, sequence=$sequence, alternative=$alternative)"
    }

}

data class Fill(val varId: String) : Instruction {
    override fun toString(): String {
        return "fill $varId"
    }
}



sealed interface Figure : Instruction

data class Point(val x : Expression, val y : Expression) : Data {

    override fun toString(): String {
        return "($x, $y)"
    }
}

data class Dimension(val w : Expression, val h : Expression) : Data {

    override fun toString(): String {
        return "$w ~ $h"
    }
}

data class Rectangle(val origin: Point, val dim: Dimension) : Figure {
    override fun toString(): String {
        if(dim.h == dim.w)
            return "square $origin ${dim.h}"
        return "rectangle origin:$origin dimensions:$dim"
    }
}

data class Circle(val origin: Point, val radius: Int) : Figure {
    override fun toString(): String {
        return "circle origin:$origin radius:$radius"
    }
}

data class Elipse(val origin: Point, val radius: Int) : Figure {
    override fun toString(): String {
        return "circle origin:$origin radius:$radius"
    }
}

data class Line(val origin: Point, val width: Int) : Figure {
    override fun toString(): String {
        return "line origin:$origin width:$width"
    }
}






sealed interface Expression

data class ConstantRef(val constId: String) : Expression {

    override fun toString(): String {
        return constId
    }
}

data class Variable(val varId: String) : Expression {

    override fun toString(): String {
        return varId
    }
}

data class Bool(val value: Boolean) : Expression {
    override fun toString(): String {
        return value.toString()
    }
}
sealed interface ExpressionData : Expression

data class Literal(val value: Int) : ExpressionData, Data {

    override fun toString(): String {
        return "$value"
    }

}

data class Color(val r: Int, val g: Int, val b: Int) : ExpressionData, Data {

    override fun toString(): String {
        return "$r|$g|$b"
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

sealed interface Data
