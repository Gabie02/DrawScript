import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DrawScriptTest {

    @Test
    fun parseTest() {
        val script = Script(
//         CONSTANTS
            listOf(
                // N: 8
                Declaration("N", Literal(8)),
                // SIDE: 40
                Declaration("SIDE", Color(0, 255, 20)),
                // MARGIN: 5
                Declaration("MARGIN", Literal(5)),
                // WHITE: 255|255|255
                Declaration("WHITE", Color(255, 255, 255))
            ),

            // PROPERTIES
            Dimension(Literal(40), Literal(40)),
            Color(200, 200, 200),
            Point(Literal(1), Literal(1)),

            // INSTRUCTIONS
            listOf(Fill("WHITE"))
        )
        //print(script)
        val testFileName = "src/test/resources/parse-test.txt"
        val lexer = DrawScriptLexer(CharStreams.fromFileName(testFileName))
        val parser = DrawScriptParser(CommonTokenStream(lexer))

        val actualScript = parser.script().toAst()
        assertEquals(actualScript, script)
    }

    @Test
    fun forLoopTest() {

    }
}