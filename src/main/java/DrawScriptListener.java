// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DrawScriptParser}.
 */
public interface DrawScriptListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DrawScriptParser#script}.
	 * @param ctx the parse tree
	 */
	void enterScript(DrawScriptParser.ScriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptParser#script}.
	 * @param ctx the parse tree
	 */
	void exitScript(DrawScriptParser.ScriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawScriptParser#declaration_list}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration_list(DrawScriptParser.Declaration_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptParser#declaration_list}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration_list(DrawScriptParser.Declaration_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawScriptParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(DrawScriptParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(DrawScriptParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawScriptParser#property_list}.
	 * @param ctx the parse tree
	 */
	void enterProperty_list(DrawScriptParser.Property_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptParser#property_list}.
	 * @param ctx the parse tree
	 */
	void exitProperty_list(DrawScriptParser.Property_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawScriptParser#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(DrawScriptParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptParser#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(DrawScriptParser.PropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawScriptParser#instruction_list}.
	 * @param ctx the parse tree
	 */
	void enterInstruction_list(DrawScriptParser.Instruction_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptParser#instruction_list}.
	 * @param ctx the parse tree
	 */
	void exitInstruction_list(DrawScriptParser.Instruction_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawScriptParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(DrawScriptParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(DrawScriptParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawScriptParser#for}.
	 * @param ctx the parse tree
	 */
	void enterFor(DrawScriptParser.ForContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptParser#for}.
	 * @param ctx the parse tree
	 */
	void exitFor(DrawScriptParser.ForContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawScriptParser#ifElse}.
	 * @param ctx the parse tree
	 */
	void enterIfElse(DrawScriptParser.IfElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptParser#ifElse}.
	 * @param ctx the parse tree
	 */
	void exitIfElse(DrawScriptParser.IfElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawScriptParser#alternative}.
	 * @param ctx the parse tree
	 */
	void enterAlternative(DrawScriptParser.AlternativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptParser#alternative}.
	 * @param ctx the parse tree
	 */
	void exitAlternative(DrawScriptParser.AlternativeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawScriptParser#figure}.
	 * @param ctx the parse tree
	 */
	void enterFigure(DrawScriptParser.FigureContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptParser#figure}.
	 * @param ctx the parse tree
	 */
	void exitFigure(DrawScriptParser.FigureContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawScriptParser#rectangle}.
	 * @param ctx the parse tree
	 */
	void enterRectangle(DrawScriptParser.RectangleContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptParser#rectangle}.
	 * @param ctx the parse tree
	 */
	void exitRectangle(DrawScriptParser.RectangleContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawScriptParser#square}.
	 * @param ctx the parse tree
	 */
	void enterSquare(DrawScriptParser.SquareContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptParser#square}.
	 * @param ctx the parse tree
	 */
	void exitSquare(DrawScriptParser.SquareContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawScriptParser#circle}.
	 * @param ctx the parse tree
	 */
	void enterCircle(DrawScriptParser.CircleContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptParser#circle}.
	 * @param ctx the parse tree
	 */
	void exitCircle(DrawScriptParser.CircleContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawScriptParser#elipse}.
	 * @param ctx the parse tree
	 */
	void enterElipse(DrawScriptParser.ElipseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptParser#elipse}.
	 * @param ctx the parse tree
	 */
	void exitElipse(DrawScriptParser.ElipseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawScriptParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(DrawScriptParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(DrawScriptParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawScriptParser#border}.
	 * @param ctx the parse tree
	 */
	void enterBorder(DrawScriptParser.BorderContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptParser#border}.
	 * @param ctx the parse tree
	 */
	void exitBorder(DrawScriptParser.BorderContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawScriptParser#fill}.
	 * @param ctx the parse tree
	 */
	void enterFill(DrawScriptParser.FillContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptParser#fill}.
	 * @param ctx the parse tree
	 */
	void exitFill(DrawScriptParser.FillContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(DrawScriptParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(DrawScriptParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawScriptParser#expressionAdd}.
	 * @param ctx the parse tree
	 */
	void enterExpressionAdd(DrawScriptParser.ExpressionAddContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptParser#expressionAdd}.
	 * @param ctx the parse tree
	 */
	void exitExpressionAdd(DrawScriptParser.ExpressionAddContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawScriptParser#expressionMult}.
	 * @param ctx the parse tree
	 */
	void enterExpressionMult(DrawScriptParser.ExpressionMultContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptParser#expressionMult}.
	 * @param ctx the parse tree
	 */
	void exitExpressionMult(DrawScriptParser.ExpressionMultContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawScriptParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterExpressionAtom(DrawScriptParser.ExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitExpressionAtom(DrawScriptParser.ExpressionAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawScriptParser#expressionData}.
	 * @param ctx the parse tree
	 */
	void enterExpressionData(DrawScriptParser.ExpressionDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptParser#expressionData}.
	 * @param ctx the parse tree
	 */
	void exitExpressionData(DrawScriptParser.ExpressionDataContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawScriptParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(DrawScriptParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(DrawScriptParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawScriptParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(DrawScriptParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(DrawScriptParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawScriptParser#boolean}.
	 * @param ctx the parse tree
	 */
	void enterBoolean(DrawScriptParser.BooleanContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptParser#boolean}.
	 * @param ctx the parse tree
	 */
	void exitBoolean(DrawScriptParser.BooleanContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawScriptParser#point}.
	 * @param ctx the parse tree
	 */
	void enterPoint(DrawScriptParser.PointContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptParser#point}.
	 * @param ctx the parse tree
	 */
	void exitPoint(DrawScriptParser.PointContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawScriptParser#dimension}.
	 * @param ctx the parse tree
	 */
	void enterDimension(DrawScriptParser.DimensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptParser#dimension}.
	 * @param ctx the parse tree
	 */
	void exitDimension(DrawScriptParser.DimensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawScriptParser#background}.
	 * @param ctx the parse tree
	 */
	void enterBackground(DrawScriptParser.BackgroundContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptParser#background}.
	 * @param ctx the parse tree
	 */
	void exitBackground(DrawScriptParser.BackgroundContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawScriptParser#interval}.
	 * @param ctx the parse tree
	 */
	void enterInterval(DrawScriptParser.IntervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptParser#interval}.
	 * @param ctx the parse tree
	 */
	void exitInterval(DrawScriptParser.IntervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawScriptParser#color}.
	 * @param ctx the parse tree
	 */
	void enterColor(DrawScriptParser.ColorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawScriptParser#color}.
	 * @param ctx the parse tree
	 */
	void exitColor(DrawScriptParser.ColorContext ctx);
}