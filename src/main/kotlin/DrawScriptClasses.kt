import kotlin.reflect.KClass

class SequenceIterator(private val sequence: List<Instruction>) {
    private var next = 0
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
data class ConstError(val constId: String) : ScriptError {

    override fun toString(): String {
        return "Error with $constId initialization"
    }
}

data class ConstTypeError(val constId: String) : ScriptError {

    override fun toString(): String {
        return "Type of constant $constId is different from the expected"
    }
}

data class TypeError(val actual: KClass<out Data>, val expected: KClass<out Data>) : ScriptError {

    override fun toString(): String {
        return "Expected Type $expected but got $actual"
    }
}

data class Script(
    val declarations: List<Declaration>, val expressionDimension: Dimension,
    val expressionBackground: Expression, val origin: Point, val instructions: List<Instruction>
) {

    var initializedConstants = mutableMapOf<String, ExpressionData>()
    var backgroundColor: Color = Color(255, 255, 255) // Valor inicial
    var canvasDimensions: Dimension = expressionDimension
    var errors = mutableListOf<ScriptError>()
    init {
        validate()
    }

    override fun toString(): String {
        return ("${declarations.joinToString("\n") { it.toString() }}\n---" +
                "\ndimension: $expressionDimension" +
                "\nbackground: $expressionBackground" +
                "\norigin: $origin\n---\n$instructions")
                .filterNot { it == '[' || it == ']' }
    }

    fun validate() {
        /* Validação da cor passou para a própria classe color */

        //Verificar se uma constante não é inicializada mais do que uma vez
        declarations.forEachIndexed { line, it ->
            if (initializedConstants != null) {
                if (isInitialized(it.varId))
                    errors.add(ConstError(it.varId))
                else
                    initializedConstants[it.varId] = it.expression
            }
        }

        //Verificar se o background é inicializado com uma cor
        if(expressionBackground is ConstantRef) {
            if(isInitialized(expressionBackground.constId)) {
                if(initializedConstants[expressionBackground.constId] !is Color)
                    errors.add(ConstTypeError(expressionBackground.constId))
            } else {
                errors.add(ConstError(expressionBackground.constId))
            }
        } else if(expressionBackground is Color) {
            backgroundColor = expressionBackground
        }
//        if (expressionBackground is ConstantRef
//            && initializedConstants[expressionBackground.constId] !is Color
//        )
//            errors.add(ConstTypeError(expressionBackground.constId))
//        else if (expressionBackground is Color)
//            backgroundColor = expressionBackground

        //Verificar se a dimension não tem uma expressão inválida
        validateExpression(expressionDimension.w)
        validateExpression(expressionDimension.h)

        //Validar instruções
        validateInstructions(instructions)
        println("Erros na validação: $errors")
    }


    fun isInitialized(constId: String): Boolean {
        return initializedConstants.contains(constId)
    }

    fun validateInstructions(instructions: List<Instruction>) {
        instructions.forEachIndexed { line, it ->
            when (it) {
                is Figure -> errors.addAll(validateFigure(it))
                is IfElse -> {
                    validateInstructions(it.sequence)
                    validateInstructions(it.alternative)
                }

                is Fill -> {
                    if (initializedConstants != null && isInitialized(it.varId)) {
                        if (initializedConstants[it.varId] !is Color)
                            errors.add(TypeError(initializedConstants[it.varId]!!::class, Color::class))
                    } else {
                        errors.add(ConstError(it.varId))
                    }
                }

                is ForLoop -> validateInstructions(it.sequence)
                is Border -> println("Skip de validações do border")
            }
        }
    }

    fun validateExpression(expression: Expression) {
        fun validateSimpleExpression(simpleExp: Expression) {
            if (simpleExp is ConstantRef
                && (!isInitialized(simpleExp.constId) || initializedConstants[simpleExp.constId] is Color))
                errors.add(ConstTypeError(simpleExp.constId))

            if (simpleExp is Color)
                errors.add(TypeError(Color::class, Literal::class))
        }


        fun validateBinaryExpression(binaryExp: BinaryExpression) {
            validateExpression(binaryExp.left)
            validateExpression(binaryExp.right)
        }
        when (expression) {
            is BinaryExpression -> validateBinaryExpression(expression)
            else -> validateSimpleExpression(expression)
        }
    }

    fun validateFigure(figure: Figure): List<ScriptError> {
        val errors = mutableListOf<ScriptError>()
        validateExpression(figure.origin.y)
        validateExpression(figure.origin.x)
        when (figure) {
            is Rectangle -> {
                validateExpression(figure.dim.w)
                validateExpression(figure.dim.h)
            }

            is Circle -> validateExpression(figure.radius)
            is Elipse -> TODO()
            is Line -> validateExpression(figure.width)
        }
        return errors
    }

}


data class Declaration(val varId: String, val expression: ExpressionData) {

    override fun toString(): String {
        return "$varId: $expression"
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

        if (exclusive)
            return "[$start, $end["
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

data class Border(val color: Color) : Instruction {

    override fun toString(): String {
        return "border $color"
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

data class Bool(val left: Expression, val right: Expression) : Expression {
    override fun toString(): String {
        return "$left = $right"
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

sealed interface ExpressionData : Expression, Data

data class Literal(val value: Int) : ExpressionData {

    override fun toString(): String {
        return "$value"
    }

}

data class Color(val r: Int, val g: Int, val b: Int) : ExpressionData {
    init {
        require(r in 0..255 && g in 0..255 && b in 0..255)
    }

    override fun toString(): String {
        return "$r|$g|$b"
    }
}


