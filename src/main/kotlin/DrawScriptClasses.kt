import java.lang.Error
import java.lang.reflect.Type

class SequenceIterator(private val sequence: List<Instruction>) {
    private var next = 0;
    val hasNext: Boolean get() = next < sequence.size

    fun next(): Instruction {
        return sequence[next++]
    }
}

class SequenceStack {
    private val elements: MutableList<SequenceIterator> = mutableListOf()

    val isEmpty: Boolean get() = elements.isEmpty()

    fun push(it: SequenceIterator): Boolean = elements.add(it)

    fun pop(): SequenceIterator = elements[elements.size - 1]
}

sealed interface ScriptError
data class ConstError(val constId: String, val line: Int) : ScriptError {

    override fun toString(): String {
        return "Constant $constId is initialized again at line $line"
    }
}

data class ConstTypeError(val constId: String) : ScriptError {

    override fun toString(): String {
        return "Type of constant $constId is different from the expected"
    }
}

data class TypeError(val actual: Any, val expected: Any) : ScriptError {

    override fun toString(): String {
        return "Expected Type $expected and got $expected"
    }
}

data class Script(
    val declarations: List<Declaration>, val expressionDimension: Dimension,
    val expressionBackground: Expression, val origin: Point, val instructions: List<Instruction>
) {

    private var initializedConstants = mutableMapOf<String, ExpressionData>()
    private var backgroundColor: Color = Color(255, 255, 255) // Valor inicial
    private var canvasDimensions: Dimension = expressionDimension

    override fun toString(): String {
        return ("$declarations---" +
                "\ndimension: $expressionDimension" +
                "\nbackground: $expressionBackground" +
                "\norigin: $origin---\n$instructions")
            .filterNot { it == ',' || it == '[' || it == ']' }
    }

    fun validate(): List<ScriptError> {
        val errors = mutableListOf<ScriptError>()
        /* Validação da cor passou para a própria classe color */

        //Verificar se uma constante não é inicializada mais do que uma vez
        declarations.forEachIndexed { line, it ->
            if (initializedConstants.contains(it.varId))
                errors.add(ConstError(it.varId, line + 1))
            else
                initializedConstants[it.varId] = it.expression
        }

        //Verificar se o background é inicializado com uma cor
        if (expressionBackground is ConstantRef
            && initializedConstants[expressionBackground.constId] !is Color
        )
            errors.add(ConstTypeError(expressionBackground.constId))
        else if (expressionBackground is Color)
            backgroundColor = expressionBackground

        //Verificar se a dimension não tem uma expressão inválida
        errors.addAll(validateExpression(expressionDimension.w))
        errors.addAll(validateExpression(expressionDimension.h))

        //Validar instruções
        instructions.forEachIndexed { line, it ->
            when (it) {
                is Figure -> errors.addAll(validateFigure(it))
                is Border -> TODO()
                is IfElse -> TODO()
                is Fill -> TODO()
                is ForLoop -> TODO()
            }
        }
        return errors
    }

    fun validateExpression(expression: Expression): List<ScriptError> {
        val errors = mutableListOf<ScriptError>()
        fun validateSimpleExpression(simpleExp: Expression) {
            if (simpleExp is ConstantRef && initializedConstants[simpleExp.constId] is Color)
                errors.add(ConstTypeError(simpleExp.constId))
        }

        fun validateBinaryExpression(binaryExp: BinaryExpression) {
            errors.addAll(validateExpression(binaryExp.left))
            errors.addAll(validateExpression(binaryExp.right))
        }
        when (expression) {
            is BinaryExpression -> validateBinaryExpression(expression)
            else -> validateSimpleExpression(expression)
        }
        return errors
    }

    fun validateFigure(figure: Figure): List<ScriptError> {
        val errors = mutableListOf<ScriptError>()
        when (figure) {
            is Rectangle -> {
                errors.addAll(validateExpression(figure.dim.w))
                errors.addAll(validateExpression(figure.dim.h))
            }
            is Circle -> TODO()
            is Elipse -> TODO()
            is Line -> TODO()
        }
    }

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

data class IfElse(
    override val guard: Expression,
    override val sequence: List<Instruction>,
    val alternative: List<Instruction>
) : ControlStructure {
    override fun toString(): String {
        if (alternative.isNotEmpty())
            return "if($guard) {\n$sequence\n}else{\n$alternative"
        return "if($guard) {\n$sequence\n}"
    }
}

data class ForLoop(val incrementVar: Variable, val interval: Interval, val sequence: List<Instruction>) : Instruction {

    override fun toString(): String {
        return "for $incrementVar in $interval {" +
                "\n $sequence " +
                "\n}"
    }
}

data class Interval(val start: Expression, val end: Expression, val exclusive: Boolean) {

    override fun toString(): String {
        return "[$start, $end]"
    }
}

data class Fill(val varId: String) : Instruction {
    override fun toString(): String {
        return "fill $varId"
    }
}

sealed interface Data

data class Point(val x: Expression, val y: Expression) : Data {

    override fun toString(): String {
        return "($x, $y)"
    }
}

data class Dimension(val w: Expression, val h: Expression) : Data {

    override fun toString(): String {
        return "$w ~ $h"
    }
}

sealed interface Figure : Instruction {
    val origin: Point
}

data class Rectangle(override val origin: Point, val dim: Dimension) : Figure {
    override fun toString(): String {
        if (dim.h == dim.w)
            return "square $origin ${dim.h}"
        return "rectangle origin:$origin dimensions:$dim"
    }
}

data class Circle(override val origin: Point, val radius: Expression) : Figure {
    override fun toString(): String {
        return "circle origin:$origin radius:$radius"
    }
}

data class Elipse(override val origin: Point, val radius: Expression) : Figure {
    override fun toString(): String {
        return "circle origin:$origin radius:$radius"
    }
}

data class Line(override val origin: Point, val width: Expression) : Figure {
    override fun toString(): String {
        return "line origin:$origin width:$width"
    }
}

data class Border(val color: Color) : Instruction


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


data class BinaryExpression(val left: Expression, val operator: Operator, val right: Expression) : Expression {

    override fun toString(): String {
        return "$left $operator $right"
    }

}

enum class Operator {
    PLUS, MINUS, TIMES, DIVISION, MOD;
}

sealed interface ExpressionData : Expression

data class Literal(val value: Int) : ExpressionData, Data {

    override fun toString(): String {
        return "$value"
    }

}

data class Color(val r: Int, val g: Int, val b: Int) : ExpressionData, Data {
    init {
        require(r in 0..255 && g in 0..255 && b in 0..255)
    }

    override fun toString(): String {
        return "$r|$g|$b"
    }
}


