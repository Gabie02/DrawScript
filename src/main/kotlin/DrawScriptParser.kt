import DrawScriptParser.*
import org.antlr.v4.runtime.tree.TerminalNode
import javax.swing.JComponent

fun main() {
//    val script = Script(
        // CONSTANTS
//        listOf(
//            // N: 8
//            Declaration("N", Literal(8)),
//            // SIDE: 40
//            Declaration("SIDE", Color(0,255,20)),
//            // MARGIN: 5
//            Declaration("MARGIN", Literal(5)),
//            ),
//
//        // PROPERTIES
//        //Literal(80),
//        Literal(10),
//        Point(Literal(0),Literal(0)),
//
//        // INSTRUCTIONS
//        emptyList()
//    )
//    script.validate()
//    print(script)
}



fun ScriptContext.toAst(): Script {
    var dimension  = Dimension(Literal(40),Literal(40))
    var background = Color(255,255,255)
    var point = Point(Literal(0),Literal(0))

//TODO

//    val propList : List<Property> = property_list().toAst()
//    if(propList[0] != null)
//        dimension = propList[0]
//    if(propList[1] != null)
//        background = propList[1]

    return Script(declaration_list().toAst(), dimension, background, point,  instruction_list().toAst())
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
        expression() != null -> Property("background", expression().expressionData().color().toAst())
        else -> throw IllegalStateException("Invalid expression")
    }


fun ExpressionContext.toAst() : Expression = when {
    expressionData() != null-> expressionData().toAst()
    constant() != null-> constant().toAst()
    variable() != null -> variable().toAst()
    CONST() != null -> Literal(CONST)
    expression() != null -> {
        when (expression().size) {
            1 -> expression()[0].toAst()
            else -> {
                if (expression()[0].children.filterIsInstance<TerminalNode>().isNotEmpty()
                    && expression()[1].children.filterIsInstance<TerminalNode>().isNotEmpty()
                ) {
                    val left = expression()[0].toAst()
                    val right = expression()[1].toAst()
                    if(left is Color || right is Color)
                        throw IllegalArgumentException("Não se podem fazer contas com cores!")
                    BinaryExpression(
                        left,
                        getOperatorFor(children[1].text),
                        right
                    )
                }
                Literal(expression()[0].text.toInt() + expression()[1].text.toInt())

            }
        }
    }
    else -> toAst()
}

fun getOperatorFor(text: String?): Operator = when (text) {
    "+" -> Operator.PLUS
    "-" -> Operator.MINUS
    "*" -> Operator.TIMES
    "/" -> Operator.DIVISION
    else -> Operator.MOD
}


fun ConstantContext.toAst() : ConstantRef = ConstantRef(PROP().text)

fun VariableContext.toAst() : Variable = Variable(PROP().text)

fun ExpressionDataContext.toAst() : ExpressionData =
    when {
        LITERAL() != null -> Literal(text.toInt())
        color() != null -> color().toAst()
        else -> throw IllegalStateException("Invalid expression")
    }

fun ColorContext.toAst() : Color {
    return Color(LITERAL(0).text.toInt(),LITERAL(1).text.toInt() ,LITERAL(2).text.toInt())
}

fun DimensionContext.toAst() : Dimension {
    return Dimension(expression(0).toAst(), expression(1).toAst())
}

fun PointContext.toAst() : Point {
    return Point(expression(0).toAst(), expression(1).toAst())
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
        else -> throw IllegalStateException("Invalid expression")
    }

fun IfElseContext.toAst() : IfElse = when {
    alternative() != null -> IfElse(boolean_().toAst(), instruction_list().toAst(), alternative().toAst())
    else -> IfElse(boolean_().toAst(), instruction_list().toAst(), emptyList())
}

fun BooleanContext.toAst() : Bool = when {
    BOOL() != null -> Bool(text.toBoolean())
    else -> Bool(expression()[0].toAst() == expression()[1].toAst())
}

fun IntervalContext.toAst() : Interval = Interval(expression()[0].toAst(), expression()[1].toAst(), CLOSE_INTERVAL() == null)

fun AlternativeContext.toAst(): List<Instruction> = instruction_list().toAst()

fun FillContext.toAst() : Fill = Fill(text)


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

fun ElipseContext.toAst() : Elipse = Elipse(point().toAst(), expression().toAst())

fun LineContext.toAst() : Line = Line(point().toAst(), expression().toAst())

fun BorderContext.toAst() : Border = Border(color().toAst())





