// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DrawScriptParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DrawScriptVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DrawScriptParser#script}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScript(DrawScriptParser.ScriptContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawScriptParser#declaration_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration_list(DrawScriptParser.Declaration_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawScriptParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(DrawScriptParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawScriptParser#property_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty_list(DrawScriptParser.Property_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawScriptParser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty(DrawScriptParser.PropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawScriptParser#instruction_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction_list(DrawScriptParser.Instruction_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawScriptParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction(DrawScriptParser.InstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawScriptParser#for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(DrawScriptParser.ForContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawScriptParser#ifElse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElse(DrawScriptParser.IfElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawScriptParser#alternative}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlternative(DrawScriptParser.AlternativeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawScriptParser#figure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFigure(DrawScriptParser.FigureContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawScriptParser#rectangle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRectangle(DrawScriptParser.RectangleContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawScriptParser#square}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSquare(DrawScriptParser.SquareContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawScriptParser#circle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCircle(DrawScriptParser.CircleContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawScriptParser#elipse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElipse(DrawScriptParser.ElipseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawScriptParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(DrawScriptParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawScriptParser#border}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBorder(DrawScriptParser.BorderContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawScriptParser#fill}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFill(DrawScriptParser.FillContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(DrawScriptParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawScriptParser#expressionData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionData(DrawScriptParser.ExpressionDataContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawScriptParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(DrawScriptParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawScriptParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(DrawScriptParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawScriptParser#boolean}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean(DrawScriptParser.BooleanContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawScriptParser#point}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPoint(DrawScriptParser.PointContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawScriptParser#dimension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimension(DrawScriptParser.DimensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawScriptParser#background}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackground(DrawScriptParser.BackgroundContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawScriptParser#interval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterval(DrawScriptParser.IntervalContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawScriptParser#color}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColor(DrawScriptParser.ColorContext ctx);
}