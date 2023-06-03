import DrawScriptParser.*
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream

fun main() {
    val testFileName = "src/test/resources/parse-test.txt"
    val lexer = DrawScriptLexer(CharStreams.fromFileName(testFileName))
    val parser = DrawScriptParser(CommonTokenStream(lexer))
    val scriptObj = parser.script().toAst()
    println(scriptObj)
    val interp  = DrawScriptInterpreter(scriptObj)
    interp.run()
}



fun ScriptContext.toAst(): Script {
    var dimension  = Dimension(Literal(40),Literal(40))
    var background = Background(Color(255,255,255))
    var origin = Point(Literal(0),Literal(0))

//TODO

    val propList : List<Property> = property_list().toAst()
    propList.forEach {
        if(it.prop == "dimension")
            dimension = it.value as Dimension
        if(it.prop == "background")
            background = it.value as Background
        if(it.prop == "origin")
            origin = it.value as Point
    }

    return Script(declaration_list().toAst(), dimension, background, origin,  instruction_list().toAst())
}

fun Declaration_listContext.toAst() : List<Declaration> {
    return declaration().map { it.toAst() }
}

fun DeclarationContext.toAst() : Declaration {
    return Declaration(CONST().toString(), expressionData().toAst())
}

fun Property_listContext.toAst() : List<Property> {
    return property().map {it.toAst()}
}

fun PropertyContext.toAst() : Property =
    when {
        point() != null -> Property("origin", point().toAst())
        dimension() != null -> Property("dimension",dimension().toAst())
//        expression() != null -> Property("background", expression().toAst())
        background() != null -> Property("background", background().toAst())
        else -> throw IllegalStateException("Invalid expression")
    }

fun ExpressionContext.toAst() : Expression {
    return expressionAdd().toAst()
}

fun ExpressionAddContext.toAst() : Expression =
    when {
        PLUS() != null -> BinaryExpression(expressionMult(0).toAst(), Operator.PLUS, expressionMult(1).toAst())
        MINUS() != null -> BinaryExpression(expressionMult(0).toAst(), Operator.MINUS, expressionMult(1).toAst())
        else -> throw IllegalArgumentException("Expressão desconhecida ${this.text}")
    }

fun ExpressionMultContext.toAst() : Expression =
    when {
        TIMES() != null -> BinaryExpression(expressionAtom(0).toAst(), Operator.TIMES, expressionAtom(1).toAst())
        DIV() != null -> BinaryExpression(expressionAtom(0).toAst(), Operator.DIVISION, expressionAtom(1).toAst())
        MOD() != null -> BinaryExpression(expressionAtom(0).toAst(), Operator.MOD, expressionAtom(1).toAst())
        else -> throw IllegalArgumentException("Expressão desconhecida ${this.text}")
    }


fun ExpressionAtomContext.toAst() : Expression = when {
    expressionData() != null -> expressionData().toAst()
    constant() != null -> constant().toAst()
    variable() != null -> variable().toAst()
    expression() != null -> expression().toAst()
    else -> throw IllegalArgumentException("Expressão desconhecida ${this.text}")
}


//fun ExpressionContext.toAst() : Expression = when {
//    expressionData() != null-> expressionData().toAst()
//    constant() != null-> constant().toAst()
//    variable() != null -> variable().toAst()
//    expression() != null && expression().isNotEmpty() -> {
//        when (expression().size) {
//            1 -> expression()[0].toAst()
//            else -> {
////                for(e in expression()) {
////                    println(e.text)
////                }
////                println("${expression()[0].children.filterIsInstance<TerminalNode>().isNotEmpty()} &&" +
////                        "${expression()[1].children.filterIsInstance<TerminalNode>().isNotEmpty()}")
////                if (expression()[0].children.filterIsInstance<TerminalNode>().isNotEmpty()
////                    || expression()[1].children.filterIsInstance<TerminalNode>().isNotEmpty()
////                ) {
//                    val left = expression()[0].toAst()
//                    val right = expression()[1].toAst()
//                    if(left is Color || right is Color)
//                        throw IllegalArgumentException("Não se podem fazer contas com cores!")
//                    BinaryExpression(
//                        left,
//                        getOperatorFor(children[1].text),
//                        right
//                    )
////                } else if(expression()[0].children.filterIsInstance<TerminalNode>().isNotEmpty()) {
////                    expression()[0].toAst()
////                } else {
////                    expression()[1].toAst()
////                }
//            }
//        }
//    }
//    else -> throw IllegalArgumentException("Expressão desconhecida ${this.text}")
//}

fun getOperatorFor(text: String?): Operator = when (text) {
    "+" -> Operator.PLUS
    "-" -> Operator.MINUS
    "*" -> Operator.TIMES
    "/" -> Operator.DIVISION
    else -> Operator.MOD
}


fun ConstantContext.toAst() : ConstantRef = ConstantRef(CONST().text)

fun VariableContext.toAst() : Variable = Variable(PROP().text)

fun ExpressionDataContext.toAst() : ExpressionData =
    when {
        LITERAL() != null -> Literal(text.toInt())
        color() != null -> color().toAst()
        else -> throw IllegalStateException("Invalid expression")
    }

fun ColorContext.toAst() : Color {
    if(LITERAL(0) != null && LITERAL(1) != null && LITERAL(2) != null)
        return Color(LITERAL(0).text.toInt(),LITERAL(1).text.toInt() ,LITERAL(2).text.toInt())
    return Color(LITERAL(0).text.toInt(),LITERAL(0).text.toInt() ,LITERAL(0).text.toInt())
}

fun DimensionContext.toAst() : Dimension {
    return Dimension(expression(0).toAst(), expression(1).toAst())
}

fun PointContext.toAst() : Point {
    return Point(expression(0).toAst(), expression(1).toAst())
}

fun BackgroundContext.toAst() : Background {
    return Background(expression().toAst())
}


fun Instruction_listContext.toAst() : List<Instruction> {
    return instruction().map { it.toAst() }
}


fun InstructionContext.toAst() : Instruction =
    when {
        fill() != null -> fill().toAst()
        for_() != null -> for_().toAst()
        ifElse()!= null -> ifElse().toAst()
        figure() != null -> figure().toAst()
        border() != null -> border().toAst()
        else -> throw IllegalArgumentException("Erro ao traduzir a instrução na AST")
    }

fun IfElseContext.toAst() : IfElse = when {
    alternative() != null -> IfElse(boolean_().toAst(), instruction_list().toAst(), alternative().toAst())
    else -> IfElse(boolean_().toAst(), instruction_list().toAst(), emptyList())
}

fun BooleanContext.toAst() : Bool = Bool(expression()[0].toAst(), expression()[1].toAst())


fun IntervalContext.toAst() : Interval = Interval(expression()[0].toAst(), expression()[1].toAst(), CLOSE_INTERVAL() == null)

fun AlternativeContext.toAst(): List<Instruction> = instruction_list().toAst()

fun FillContext.toAst() : Fill = Fill(CONST().text)


fun ForContext.toAst() : ForLoop = ForLoop(variable().toAst(), interval().toAst(), instruction_list().toAst())

fun FigureContext.toAst() : Figure = when {
    rectangle() != null -> rectangle().toAst()
    square() != null -> square().toAst()
    circle() != null -> circle().toAst()
    elipse() != null -> elipse().toAst()
    line() != null -> line().toAst()
    else -> throw IllegalStateException("Invalid figure")
}

fun RectangleContext.toAst() : Rectangle = Rectangle(point().toAst(), dimension().toAst())

fun SquareContext.toAst() : Rectangle = Rectangle(point().toAst(), Dimension(expression().toAst(), expression().toAst()))

fun CircleContext.toAst() : Circle = Circle(point().toAst(), expression().toAst())

fun ElipseContext.toAst() : Elipse = Elipse(point().toAst(), dimension().toAst())

fun LineContext.toAst() : Line = Line(point()[0].toAst(), point()[1].toAst())

fun BorderContext.toAst() : Border = Border(color().toAst())





