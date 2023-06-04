import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import java.awt.BorderLayout
import java.awt.Dimension
import java.awt.Graphics
import java.awt.Graphics2D
import javax.swing.JComponent
import javax.swing.JFrame

class DrawScriptSkeleton(private val instructions: List<Pair<Color, Figure>>, private val windowWidth: Int, private val windowHeight: Int) : JComponent() {
    override fun paintComponent(graphics: Graphics) {
        val g = graphics as Graphics2D
        instructions.forEach { inst ->
            val c = inst.first
            val s = inst.second
            g.color = java.awt.Color(c.r, c.g, c.b)
            paintShape(g, s)
        }
    }

    private fun paintShape(g: Graphics2D, s: Figure) {
        val x = (s.origin.x as Literal).value
        val y = (s.origin.y as Literal).value
        when (s) {
            is Circle -> {
                val w = (s.radius as Literal).value * 2
                g.fillOval(x, y, w, w)
            }
            is Elipse -> {
                val w = (s.dim.w as Literal).value
                val h = (s.dim.h as Literal).value
                g.fillOval(x, y, w, h)
            }
            is Line -> {
                val dx = (s.destination.x as Literal).value
                val dy = (s.destination.y as Literal).value
                g.drawLine(x, y, dx, dy)
            }
            is Rectangle -> {
                val w = (s.dim.w as Literal).value
                val h = (s.dim.h as Literal).value
                g.fillRect(x, y, w, h)
            }
        }
    }

    override fun getPreferredSize(): Dimension {
        return Dimension(windowWidth, windowHeight)
    }


}


fun main() {
    val testFileName = "ScriptsExemplo/Exemplo2.txt"
    val lexer = DrawScriptLexer(CharStreams.fromFileName(testFileName))
    val parser = DrawScriptParser(CommonTokenStream(lexer))
    val scriptObj = parser.script().toAst()
    println(scriptObj)
    val interp = DrawScriptInterpreter(scriptObj)
    val paintInstructions = interp.run()

    val frame = JFrame("Draw")
    frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    val windowWidth = (interp.SCRIPT_DIM.w as Literal).value
    val windowHeight = (interp.SCRIPT_DIM.h as Literal).value

    val drawScriptSkeleton = DrawScriptSkeleton(paintInstructions, windowWidth, windowHeight)
    drawScriptSkeleton.isVisible = true

    frame.add(drawScriptSkeleton, BorderLayout.CENTER)
    frame.setSize(windowWidth, windowHeight)
    frame.setLocationRelativeTo(null)
    frame.pack()
    frame.isVisible = true
}
