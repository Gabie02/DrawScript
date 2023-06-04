// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class DrawScriptParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, OPERATORADD=21, OPERATORMULT=22, LOGICOPERATOR=23, 
		PROP=24, CONST=25, LITERAL=26, OPEN_INTERVAL=27, CLOSE_INTERVAL=28, BOOL=29, 
		OPERATOR=30, TIMES=31, PLUS=32, DIV=33, MINUS=34, MOD=35, EQUAL=36, DIF=37, 
		LESS=38, GREATER=39, COMMENT=40, WS=41;
	public static final int
		RULE_script = 0, RULE_declaration_list = 1, RULE_declaration = 2, RULE_property_list = 3, 
		RULE_property = 4, RULE_instruction_list = 5, RULE_instruction = 6, RULE_for = 7, 
		RULE_ifElse = 8, RULE_alternative = 9, RULE_figure = 10, RULE_rectangle = 11, 
		RULE_square = 12, RULE_circle = 13, RULE_elipse = 14, RULE_line = 15, 
		RULE_border = 16, RULE_fill = 17, RULE_expression = 18, RULE_expressionAdd = 19, 
		RULE_expressionMult = 20, RULE_expressionAtom = 21, RULE_expressionData = 22, 
		RULE_constant = 23, RULE_variable = 24, RULE_boolean = 25, RULE_point = 26, 
		RULE_dimension = 27, RULE_background = 28, RULE_interval = 29, RULE_color = 30;
	private static String[] makeRuleNames() {
		return new String[] {
			"script", "declaration_list", "declaration", "property_list", "property", 
			"instruction_list", "instruction", "for", "ifElse", "alternative", "figure", 
			"rectangle", "square", "circle", "elipse", "line", "border", "fill", 
			"expression", "expressionAdd", "expressionMult", "expressionAtom", "expressionData", 
			"constant", "variable", "boolean", "point", "dimension", "background", 
			"interval", "color"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'---'", "':'", "'for'", "'in'", "'{'", "'}'", "'if'", "'else {'", 
			"'rectangle'", "'square'", "'circle'", "'elipse'", "'line'", "'border'", 
			"'fill'", "'('", "')'", "','", "'~'", "'|'", null, null, null, null, 
			null, null, "'['", "']'", null, null, "'*'", "'+'", "'/'", "'-'", "'%'", 
			"'='", "'!='", "'<'", "'>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "OPERATORADD", 
			"OPERATORMULT", "LOGICOPERATOR", "PROP", "CONST", "LITERAL", "OPEN_INTERVAL", 
			"CLOSE_INTERVAL", "BOOL", "OPERATOR", "TIMES", "PLUS", "DIV", "MINUS", 
			"MOD", "EQUAL", "DIF", "LESS", "GREATER", "COMMENT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DrawScriptParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ScriptContext extends ParserRuleContext {
		public Declaration_listContext declaration_list() {
			return getRuleContext(Declaration_listContext.class,0);
		}
		public Property_listContext property_list() {
			return getRuleContext(Property_listContext.class,0);
		}
		public Instruction_listContext instruction_list() {
			return getRuleContext(Instruction_listContext.class,0);
		}
		public TerminalNode EOF() { return getToken(DrawScriptParser.EOF, 0); }
		public List<TerminalNode> WS() { return getTokens(DrawScriptParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(DrawScriptParser.WS, i);
		}
		public ScriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_script; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).enterScript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).exitScript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawScriptVisitor ) return ((DrawScriptVisitor<? extends T>)visitor).visitScript(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScriptContext script() throws RecognitionException {
		ScriptContext _localctx = new ScriptContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_script);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			declaration_list();
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(63);
				match(WS);
				}
				}
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(69);
			match(T__0);
			setState(73);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(70);
					match(WS);
					}
					} 
				}
				setState(75);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(76);
			property_list();
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(77);
				match(WS);
				}
				}
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(83);
			match(T__0);
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(84);
				match(WS);
				}
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(90);
			instruction_list();
			setState(91);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Declaration_listContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(DrawScriptParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(DrawScriptParser.WS, i);
		}
		public Declaration_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).enterDeclaration_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).exitDeclaration_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawScriptVisitor ) return ((DrawScriptVisitor<? extends T>)visitor).visitDeclaration_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaration_listContext declaration_list() throws RecognitionException {
		Declaration_listContext _localctx = new Declaration_listContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaration_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CONST) {
				{
				{
				setState(93);
				declaration();
				setState(97);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(94);
						match(WS);
						}
						} 
					}
					setState(99);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				}
				}
				}
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(DrawScriptParser.CONST, 0); }
		public ExpressionDataContext expressionData() {
			return getRuleContext(ExpressionDataContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawScriptVisitor ) return ((DrawScriptVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(CONST);
			setState(106);
			match(T__1);
			setState(107);
			expressionData();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Property_listContext extends ParserRuleContext {
		public List<PropertyContext> property() {
			return getRuleContexts(PropertyContext.class);
		}
		public PropertyContext property(int i) {
			return getRuleContext(PropertyContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(DrawScriptParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(DrawScriptParser.WS, i);
		}
		public Property_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).enterProperty_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).exitProperty_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawScriptVisitor ) return ((DrawScriptVisitor<? extends T>)visitor).visitProperty_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Property_listContext property_list() throws RecognitionException {
		Property_listContext _localctx = new Property_listContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_property_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PROP) {
				{
				{
				setState(109);
				property();
				setState(113);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(110);
						match(WS);
						}
						} 
					}
					setState(115);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				}
				}
				}
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyContext extends ParserRuleContext {
		public TerminalNode PROP() { return getToken(DrawScriptParser.PROP, 0); }
		public BackgroundContext background() {
			return getRuleContext(BackgroundContext.class,0);
		}
		public PointContext point() {
			return getRuleContext(PointContext.class,0);
		}
		public DimensionContext dimension() {
			return getRuleContext(DimensionContext.class,0);
		}
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).enterProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).exitProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawScriptVisitor ) return ((DrawScriptVisitor<? extends T>)visitor).visitProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_property);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(PROP);
			setState(122);
			match(T__1);
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(123);
				background();
				}
				break;
			case 2:
				{
				setState(124);
				point();
				}
				break;
			case 3:
				{
				setState(125);
				dimension();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Instruction_listContext extends ParserRuleContext {
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(DrawScriptParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(DrawScriptParser.WS, i);
		}
		public Instruction_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).enterInstruction_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).exitInstruction_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawScriptVisitor ) return ((DrawScriptVisitor<? extends T>)visitor).visitInstruction_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Instruction_listContext instruction_list() throws RecognitionException {
		Instruction_listContext _localctx = new Instruction_listContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_instruction_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(128);
				instruction();
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(129);
					match(WS);
					}
					}
					setState(134);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(137); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 65160L) != 0 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InstructionContext extends ParserRuleContext {
		public FillContext fill() {
			return getRuleContext(FillContext.class,0);
		}
		public ForContext for_() {
			return getRuleContext(ForContext.class,0);
		}
		public IfElseContext ifElse() {
			return getRuleContext(IfElseContext.class,0);
		}
		public FigureContext figure() {
			return getRuleContext(FigureContext.class,0);
		}
		public BorderContext border() {
			return getRuleContext(BorderContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).exitInstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawScriptVisitor ) return ((DrawScriptVisitor<? extends T>)visitor).visitInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_instruction);
		try {
			setState(144);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				fill();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				for_();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(141);
				ifElse();
				}
				break;
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
				enterOuterAlt(_localctx, 4);
				{
				setState(142);
				figure();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 5);
				{
				setState(143);
				border();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public Instruction_listContext instruction_list() {
			return getRuleContext(Instruction_listContext.class,0);
		}
		public ForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).enterFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).exitFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawScriptVisitor ) return ((DrawScriptVisitor<? extends T>)visitor).visitFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForContext for_() throws RecognitionException {
		ForContext _localctx = new ForContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_for);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(T__2);
			setState(147);
			variable();
			setState(148);
			match(T__3);
			setState(149);
			interval();
			setState(150);
			match(T__4);
			setState(151);
			instruction_list();
			setState(152);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfElseContext extends ParserRuleContext {
		public BooleanContext boolean_() {
			return getRuleContext(BooleanContext.class,0);
		}
		public Instruction_listContext instruction_list() {
			return getRuleContext(Instruction_listContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(DrawScriptParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(DrawScriptParser.WS, i);
		}
		public AlternativeContext alternative() {
			return getRuleContext(AlternativeContext.class,0);
		}
		public IfElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifElse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).enterIfElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).exitIfElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawScriptVisitor ) return ((DrawScriptVisitor<? extends T>)visitor).visitIfElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfElseContext ifElse() throws RecognitionException {
		IfElseContext _localctx = new IfElseContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ifElse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(T__6);
			setState(155);
			boolean_();
			setState(156);
			match(T__4);
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(157);
				match(WS);
				}
				}
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(163);
			instruction_list();
			setState(164);
			match(T__5);
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(165);
				alternative();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AlternativeContext extends ParserRuleContext {
		public Instruction_listContext instruction_list() {
			return getRuleContext(Instruction_listContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(DrawScriptParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(DrawScriptParser.WS, i);
		}
		public AlternativeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alternative; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).enterAlternative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).exitAlternative(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawScriptVisitor ) return ((DrawScriptVisitor<? extends T>)visitor).visitAlternative(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlternativeContext alternative() throws RecognitionException {
		AlternativeContext _localctx = new AlternativeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_alternative);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(T__7);
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(169);
				match(WS);
				}
				}
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(175);
			instruction_list();
			setState(176);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FigureContext extends ParserRuleContext {
		public RectangleContext rectangle() {
			return getRuleContext(RectangleContext.class,0);
		}
		public SquareContext square() {
			return getRuleContext(SquareContext.class,0);
		}
		public CircleContext circle() {
			return getRuleContext(CircleContext.class,0);
		}
		public ElipseContext elipse() {
			return getRuleContext(ElipseContext.class,0);
		}
		public LineContext line() {
			return getRuleContext(LineContext.class,0);
		}
		public FigureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_figure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).enterFigure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).exitFigure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawScriptVisitor ) return ((DrawScriptVisitor<? extends T>)visitor).visitFigure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FigureContext figure() throws RecognitionException {
		FigureContext _localctx = new FigureContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_figure);
		try {
			setState(183);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				rectangle();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				square();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(180);
				circle();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 4);
				{
				setState(181);
				elipse();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 5);
				{
				setState(182);
				line();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RectangleContext extends ParserRuleContext {
		public PointContext point() {
			return getRuleContext(PointContext.class,0);
		}
		public DimensionContext dimension() {
			return getRuleContext(DimensionContext.class,0);
		}
		public RectangleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rectangle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).enterRectangle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).exitRectangle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawScriptVisitor ) return ((DrawScriptVisitor<? extends T>)visitor).visitRectangle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RectangleContext rectangle() throws RecognitionException {
		RectangleContext _localctx = new RectangleContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_rectangle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(T__8);
			setState(186);
			point();
			setState(187);
			dimension();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SquareContext extends ParserRuleContext {
		public PointContext point() {
			return getRuleContext(PointContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SquareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_square; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).enterSquare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).exitSquare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawScriptVisitor ) return ((DrawScriptVisitor<? extends T>)visitor).visitSquare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SquareContext square() throws RecognitionException {
		SquareContext _localctx = new SquareContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_square);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(T__9);
			setState(190);
			point();
			setState(191);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CircleContext extends ParserRuleContext {
		public PointContext point() {
			return getRuleContext(PointContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CircleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_circle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).enterCircle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).exitCircle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawScriptVisitor ) return ((DrawScriptVisitor<? extends T>)visitor).visitCircle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CircleContext circle() throws RecognitionException {
		CircleContext _localctx = new CircleContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_circle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(T__10);
			setState(194);
			point();
			setState(195);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElipseContext extends ParserRuleContext {
		public PointContext point() {
			return getRuleContext(PointContext.class,0);
		}
		public DimensionContext dimension() {
			return getRuleContext(DimensionContext.class,0);
		}
		public ElipseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elipse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).enterElipse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).exitElipse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawScriptVisitor ) return ((DrawScriptVisitor<? extends T>)visitor).visitElipse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElipseContext elipse() throws RecognitionException {
		ElipseContext _localctx = new ElipseContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_elipse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(T__11);
			setState(198);
			point();
			setState(199);
			dimension();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LineContext extends ParserRuleContext {
		public List<PointContext> point() {
			return getRuleContexts(PointContext.class);
		}
		public PointContext point(int i) {
			return getRuleContext(PointContext.class,i);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).exitLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawScriptVisitor ) return ((DrawScriptVisitor<? extends T>)visitor).visitLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(T__12);
			setState(202);
			point();
			setState(203);
			point();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BorderContext extends ParserRuleContext {
		public FigureContext figure() {
			return getRuleContext(FigureContext.class,0);
		}
		public BorderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_border; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).enterBorder(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).exitBorder(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawScriptVisitor ) return ((DrawScriptVisitor<? extends T>)visitor).visitBorder(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BorderContext border() throws RecognitionException {
		BorderContext _localctx = new BorderContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_border);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(T__13);
			setState(206);
			figure();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FillContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(DrawScriptParser.CONST, 0); }
		public FillContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fill; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).enterFill(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).exitFill(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawScriptVisitor ) return ((DrawScriptVisitor<? extends T>)visitor).visitFill(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FillContext fill() throws RecognitionException {
		FillContext _localctx = new FillContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_fill);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(T__14);
			setState(209);
			match(CONST);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionAddContext expressionAdd() {
			return getRuleContext(ExpressionAddContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawScriptVisitor ) return ((DrawScriptVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			expressionAdd();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionAddContext extends ParserRuleContext {
		public List<ExpressionMultContext> expressionMult() {
			return getRuleContexts(ExpressionMultContext.class);
		}
		public ExpressionMultContext expressionMult(int i) {
			return getRuleContext(ExpressionMultContext.class,i);
		}
		public List<TerminalNode> OPERATORADD() { return getTokens(DrawScriptParser.OPERATORADD); }
		public TerminalNode OPERATORADD(int i) {
			return getToken(DrawScriptParser.OPERATORADD, i);
		}
		public ExpressionAddContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionAdd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).enterExpressionAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).exitExpressionAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawScriptVisitor ) return ((DrawScriptVisitor<? extends T>)visitor).visitExpressionAdd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionAddContext expressionAdd() throws RecognitionException {
		ExpressionAddContext _localctx = new ExpressionAddContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expressionAdd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			expressionMult();
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPERATORADD) {
				{
				{
				{
				setState(214);
				match(OPERATORADD);
				}
				setState(215);
				expressionMult();
				}
				}
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionMultContext extends ParserRuleContext {
		public List<ExpressionAtomContext> expressionAtom() {
			return getRuleContexts(ExpressionAtomContext.class);
		}
		public ExpressionAtomContext expressionAtom(int i) {
			return getRuleContext(ExpressionAtomContext.class,i);
		}
		public List<TerminalNode> OPERATORMULT() { return getTokens(DrawScriptParser.OPERATORMULT); }
		public TerminalNode OPERATORMULT(int i) {
			return getToken(DrawScriptParser.OPERATORMULT, i);
		}
		public ExpressionMultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionMult; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).enterExpressionMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).exitExpressionMult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawScriptVisitor ) return ((DrawScriptVisitor<? extends T>)visitor).visitExpressionMult(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionMultContext expressionMult() throws RecognitionException {
		ExpressionMultContext _localctx = new ExpressionMultContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_expressionMult);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			expressionAtom();
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPERATORMULT) {
				{
				{
				{
				setState(222);
				match(OPERATORMULT);
				}
				setState(223);
				expressionAtom();
				}
				}
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionAtomContext extends ParserRuleContext {
		public ExpressionDataContext expressionData() {
			return getRuleContext(ExpressionDataContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionAtom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).enterExpressionAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).exitExpressionAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawScriptVisitor ) return ((DrawScriptVisitor<? extends T>)visitor).visitExpressionAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionAtomContext expressionAtom() throws RecognitionException {
		ExpressionAtomContext _localctx = new ExpressionAtomContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_expressionAtom);
		try {
			setState(236);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__19:
			case LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(229);
				expressionData();
				}
				break;
			case PROP:
				enterOuterAlt(_localctx, 2);
				{
				setState(230);
				variable();
				}
				break;
			case CONST:
				enterOuterAlt(_localctx, 3);
				{
				setState(231);
				constant();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 4);
				{
				setState(232);
				match(T__15);
				setState(233);
				expression();
				setState(234);
				match(T__16);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionDataContext extends ParserRuleContext {
		public TerminalNode LITERAL() { return getToken(DrawScriptParser.LITERAL, 0); }
		public ColorContext color() {
			return getRuleContext(ColorContext.class,0);
		}
		public ExpressionDataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionData; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).enterExpressionData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).exitExpressionData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawScriptVisitor ) return ((DrawScriptVisitor<? extends T>)visitor).visitExpressionData(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionDataContext expressionData() throws RecognitionException {
		ExpressionDataContext _localctx = new ExpressionDataContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_expressionData);
		try {
			setState(240);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				match(LITERAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(239);
				color();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(DrawScriptParser.CONST, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawScriptVisitor ) return ((DrawScriptVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_constant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(CONST);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableContext extends ParserRuleContext {
		public TerminalNode PROP() { return getToken(DrawScriptParser.PROP, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawScriptVisitor ) return ((DrawScriptVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(PROP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BooleanContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LOGICOPERATOR() { return getToken(DrawScriptParser.LOGICOPERATOR, 0); }
		public BooleanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).enterBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).exitBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawScriptVisitor ) return ((DrawScriptVisitor<? extends T>)visitor).visitBoolean(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanContext boolean_() throws RecognitionException {
		BooleanContext _localctx = new BooleanContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_boolean);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(246);
			expression();
			setState(247);
			match(LOGICOPERATOR);
			setState(248);
			expression();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PointContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public PointContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_point; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).enterPoint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).exitPoint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawScriptVisitor ) return ((DrawScriptVisitor<? extends T>)visitor).visitPoint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PointContext point() throws RecognitionException {
		PointContext _localctx = new PointContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_point);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(T__15);
			setState(251);
			expression();
			setState(252);
			match(T__17);
			setState(253);
			expression();
			setState(254);
			match(T__16);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DimensionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public DimensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).enterDimension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).exitDimension(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawScriptVisitor ) return ((DrawScriptVisitor<? extends T>)visitor).visitDimension(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimensionContext dimension() throws RecognitionException {
		DimensionContext _localctx = new DimensionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_dimension);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			expression();
			setState(257);
			match(T__18);
			setState(258);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BackgroundContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BackgroundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_background; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).enterBackground(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).exitBackground(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawScriptVisitor ) return ((DrawScriptVisitor<? extends T>)visitor).visitBackground(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BackgroundContext background() throws RecognitionException {
		BackgroundContext _localctx = new BackgroundContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_background);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IntervalContext extends ParserRuleContext {
		public List<TerminalNode> OPEN_INTERVAL() { return getTokens(DrawScriptParser.OPEN_INTERVAL); }
		public TerminalNode OPEN_INTERVAL(int i) {
			return getToken(DrawScriptParser.OPEN_INTERVAL, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode CLOSE_INTERVAL() { return getToken(DrawScriptParser.CLOSE_INTERVAL, 0); }
		public IntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).enterInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).exitInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawScriptVisitor ) return ((DrawScriptVisitor<? extends T>)visitor).visitInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalContext interval() throws RecognitionException {
		IntervalContext _localctx = new IntervalContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_interval);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(OPEN_INTERVAL);
			setState(263);
			expression();
			setState(264);
			match(T__17);
			setState(265);
			expression();
			setState(266);
			_la = _input.LA(1);
			if ( !(_la==OPEN_INTERVAL || _la==CLOSE_INTERVAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ColorContext extends ParserRuleContext {
		public List<TerminalNode> LITERAL() { return getTokens(DrawScriptParser.LITERAL); }
		public TerminalNode LITERAL(int i) {
			return getToken(DrawScriptParser.LITERAL, i);
		}
		public ColorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_color; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).enterColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawScriptListener ) ((DrawScriptListener)listener).exitColor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawScriptVisitor ) return ((DrawScriptVisitor<? extends T>)visitor).visitColor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColorContext color() throws RecognitionException {
		ColorContext _localctx = new ColorContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_color);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LITERAL) {
				{
				setState(268);
				match(LITERAL);
				}
			}

			setState(271);
			match(T__19);
			setState(272);
			match(LITERAL);
			setState(273);
			match(T__19);
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LITERAL) {
				{
				setState(274);
				match(LITERAL);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001)\u0116\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0001\u0000\u0001\u0000\u0005\u0000A\b\u0000\n\u0000\f\u0000D\t\u0000"+
		"\u0001\u0000\u0001\u0000\u0005\u0000H\b\u0000\n\u0000\f\u0000K\t\u0000"+
		"\u0001\u0000\u0001\u0000\u0005\u0000O\b\u0000\n\u0000\f\u0000R\t\u0000"+
		"\u0001\u0000\u0001\u0000\u0005\u0000V\b\u0000\n\u0000\f\u0000Y\t\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0005\u0001"+
		"`\b\u0001\n\u0001\f\u0001c\t\u0001\u0005\u0001e\b\u0001\n\u0001\f\u0001"+
		"h\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0005\u0003p\b\u0003\n\u0003\f\u0003s\t\u0003\u0005\u0003"+
		"u\b\u0003\n\u0003\f\u0003x\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004\u007f\b\u0004\u0001\u0005\u0001\u0005"+
		"\u0005\u0005\u0083\b\u0005\n\u0005\f\u0005\u0086\t\u0005\u0004\u0005\u0088"+
		"\b\u0005\u000b\u0005\f\u0005\u0089\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006\u0091\b\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u009f\b\b\n\b\f\b\u00a2\t\b\u0001"+
		"\b\u0001\b\u0001\b\u0003\b\u00a7\b\b\u0001\t\u0001\t\u0005\t\u00ab\b\t"+
		"\n\t\f\t\u00ae\t\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0003\n\u00b8\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0005\u0013\u00d9\b\u0013\n\u0013\f\u0013\u00dc\t\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u00e1\b\u0014\n\u0014\f\u0014"+
		"\u00e4\t\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0003\u0015\u00ed\b\u0015\u0001\u0016\u0001\u0016"+
		"\u0003\u0016\u00f1\b\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0003\u001e"+
		"\u010e\b\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e"+
		"\u0114\b\u001e\u0001\u001e\u0000\u0000\u001f\u0000\u0002\u0004\u0006\b"+
		"\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02"+
		"468:<\u0000\u0001\u0001\u0000\u001b\u001c\u0115\u0000>\u0001\u0000\u0000"+
		"\u0000\u0002f\u0001\u0000\u0000\u0000\u0004i\u0001\u0000\u0000\u0000\u0006"+
		"v\u0001\u0000\u0000\u0000\by\u0001\u0000\u0000\u0000\n\u0087\u0001\u0000"+
		"\u0000\u0000\f\u0090\u0001\u0000\u0000\u0000\u000e\u0092\u0001\u0000\u0000"+
		"\u0000\u0010\u009a\u0001\u0000\u0000\u0000\u0012\u00a8\u0001\u0000\u0000"+
		"\u0000\u0014\u00b7\u0001\u0000\u0000\u0000\u0016\u00b9\u0001\u0000\u0000"+
		"\u0000\u0018\u00bd\u0001\u0000\u0000\u0000\u001a\u00c1\u0001\u0000\u0000"+
		"\u0000\u001c\u00c5\u0001\u0000\u0000\u0000\u001e\u00c9\u0001\u0000\u0000"+
		"\u0000 \u00cd\u0001\u0000\u0000\u0000\"\u00d0\u0001\u0000\u0000\u0000"+
		"$\u00d3\u0001\u0000\u0000\u0000&\u00d5\u0001\u0000\u0000\u0000(\u00dd"+
		"\u0001\u0000\u0000\u0000*\u00ec\u0001\u0000\u0000\u0000,\u00f0\u0001\u0000"+
		"\u0000\u0000.\u00f2\u0001\u0000\u0000\u00000\u00f4\u0001\u0000\u0000\u0000"+
		"2\u00f6\u0001\u0000\u0000\u00004\u00fa\u0001\u0000\u0000\u00006\u0100"+
		"\u0001\u0000\u0000\u00008\u0104\u0001\u0000\u0000\u0000:\u0106\u0001\u0000"+
		"\u0000\u0000<\u010d\u0001\u0000\u0000\u0000>B\u0003\u0002\u0001\u0000"+
		"?A\u0005)\u0000\u0000@?\u0001\u0000\u0000\u0000AD\u0001\u0000\u0000\u0000"+
		"B@\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000CE\u0001\u0000\u0000"+
		"\u0000DB\u0001\u0000\u0000\u0000EI\u0005\u0001\u0000\u0000FH\u0005)\u0000"+
		"\u0000GF\u0001\u0000\u0000\u0000HK\u0001\u0000\u0000\u0000IG\u0001\u0000"+
		"\u0000\u0000IJ\u0001\u0000\u0000\u0000JL\u0001\u0000\u0000\u0000KI\u0001"+
		"\u0000\u0000\u0000LP\u0003\u0006\u0003\u0000MO\u0005)\u0000\u0000NM\u0001"+
		"\u0000\u0000\u0000OR\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000"+
		"PQ\u0001\u0000\u0000\u0000QS\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000"+
		"\u0000SW\u0005\u0001\u0000\u0000TV\u0005)\u0000\u0000UT\u0001\u0000\u0000"+
		"\u0000VY\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000WX\u0001\u0000"+
		"\u0000\u0000XZ\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000Z[\u0003"+
		"\n\u0005\u0000[\\\u0005\u0000\u0000\u0001\\\u0001\u0001\u0000\u0000\u0000"+
		"]a\u0003\u0004\u0002\u0000^`\u0005)\u0000\u0000_^\u0001\u0000\u0000\u0000"+
		"`c\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000"+
		"\u0000be\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000d]\u0001\u0000"+
		"\u0000\u0000eh\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000fg\u0001"+
		"\u0000\u0000\u0000g\u0003\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000"+
		"\u0000ij\u0005\u0019\u0000\u0000jk\u0005\u0002\u0000\u0000kl\u0003,\u0016"+
		"\u0000l\u0005\u0001\u0000\u0000\u0000mq\u0003\b\u0004\u0000np\u0005)\u0000"+
		"\u0000on\u0001\u0000\u0000\u0000ps\u0001\u0000\u0000\u0000qo\u0001\u0000"+
		"\u0000\u0000qr\u0001\u0000\u0000\u0000ru\u0001\u0000\u0000\u0000sq\u0001"+
		"\u0000\u0000\u0000tm\u0001\u0000\u0000\u0000ux\u0001\u0000\u0000\u0000"+
		"vt\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000w\u0007\u0001\u0000"+
		"\u0000\u0000xv\u0001\u0000\u0000\u0000yz\u0005\u0018\u0000\u0000z~\u0005"+
		"\u0002\u0000\u0000{\u007f\u00038\u001c\u0000|\u007f\u00034\u001a\u0000"+
		"}\u007f\u00036\u001b\u0000~{\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000"+
		"\u0000~}\u0001\u0000\u0000\u0000\u007f\t\u0001\u0000\u0000\u0000\u0080"+
		"\u0084\u0003\f\u0006\u0000\u0081\u0083\u0005)\u0000\u0000\u0082\u0081"+
		"\u0001\u0000\u0000\u0000\u0083\u0086\u0001\u0000\u0000\u0000\u0084\u0082"+
		"\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0088"+
		"\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0087\u0080"+
		"\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u0087"+
		"\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u000b"+
		"\u0001\u0000\u0000\u0000\u008b\u0091\u0003\"\u0011\u0000\u008c\u0091\u0003"+
		"\u000e\u0007\u0000\u008d\u0091\u0003\u0010\b\u0000\u008e\u0091\u0003\u0014"+
		"\n\u0000\u008f\u0091\u0003 \u0010\u0000\u0090\u008b\u0001\u0000\u0000"+
		"\u0000\u0090\u008c\u0001\u0000\u0000\u0000\u0090\u008d\u0001\u0000\u0000"+
		"\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0090\u008f\u0001\u0000\u0000"+
		"\u0000\u0091\r\u0001\u0000\u0000\u0000\u0092\u0093\u0005\u0003\u0000\u0000"+
		"\u0093\u0094\u00030\u0018\u0000\u0094\u0095\u0005\u0004\u0000\u0000\u0095"+
		"\u0096\u0003:\u001d\u0000\u0096\u0097\u0005\u0005\u0000\u0000\u0097\u0098"+
		"\u0003\n\u0005\u0000\u0098\u0099\u0005\u0006\u0000\u0000\u0099\u000f\u0001"+
		"\u0000\u0000\u0000\u009a\u009b\u0005\u0007\u0000\u0000\u009b\u009c\u0003"+
		"2\u0019\u0000\u009c\u00a0\u0005\u0005\u0000\u0000\u009d\u009f\u0005)\u0000"+
		"\u0000\u009e\u009d\u0001\u0000\u0000\u0000\u009f\u00a2\u0001\u0000\u0000"+
		"\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000"+
		"\u0000\u00a1\u00a3\u0001\u0000\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000"+
		"\u0000\u00a3\u00a4\u0003\n\u0005\u0000\u00a4\u00a6\u0005\u0006\u0000\u0000"+
		"\u00a5\u00a7\u0003\u0012\t\u0000\u00a6\u00a5\u0001\u0000\u0000\u0000\u00a6"+
		"\u00a7\u0001\u0000\u0000\u0000\u00a7\u0011\u0001\u0000\u0000\u0000\u00a8"+
		"\u00ac\u0005\b\u0000\u0000\u00a9\u00ab\u0005)\u0000\u0000\u00aa\u00a9"+
		"\u0001\u0000\u0000\u0000\u00ab\u00ae\u0001\u0000\u0000\u0000\u00ac\u00aa"+
		"\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad\u00af"+
		"\u0001\u0000\u0000\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000\u00af\u00b0"+
		"\u0003\n\u0005\u0000\u00b0\u00b1\u0005\u0006\u0000\u0000\u00b1\u0013\u0001"+
		"\u0000\u0000\u0000\u00b2\u00b8\u0003\u0016\u000b\u0000\u00b3\u00b8\u0003"+
		"\u0018\f\u0000\u00b4\u00b8\u0003\u001a\r\u0000\u00b5\u00b8\u0003\u001c"+
		"\u000e\u0000\u00b6\u00b8\u0003\u001e\u000f\u0000\u00b7\u00b2\u0001\u0000"+
		"\u0000\u0000\u00b7\u00b3\u0001\u0000\u0000\u0000\u00b7\u00b4\u0001\u0000"+
		"\u0000\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b7\u00b6\u0001\u0000"+
		"\u0000\u0000\u00b8\u0015\u0001\u0000\u0000\u0000\u00b9\u00ba\u0005\t\u0000"+
		"\u0000\u00ba\u00bb\u00034\u001a\u0000\u00bb\u00bc\u00036\u001b\u0000\u00bc"+
		"\u0017\u0001\u0000\u0000\u0000\u00bd\u00be\u0005\n\u0000\u0000\u00be\u00bf"+
		"\u00034\u001a\u0000\u00bf\u00c0\u0003$\u0012\u0000\u00c0\u0019\u0001\u0000"+
		"\u0000\u0000\u00c1\u00c2\u0005\u000b\u0000\u0000\u00c2\u00c3\u00034\u001a"+
		"\u0000\u00c3\u00c4\u0003$\u0012\u0000\u00c4\u001b\u0001\u0000\u0000\u0000"+
		"\u00c5\u00c6\u0005\f\u0000\u0000\u00c6\u00c7\u00034\u001a\u0000\u00c7"+
		"\u00c8\u00036\u001b\u0000\u00c8\u001d\u0001\u0000\u0000\u0000\u00c9\u00ca"+
		"\u0005\r\u0000\u0000\u00ca\u00cb\u00034\u001a\u0000\u00cb\u00cc\u0003"+
		"4\u001a\u0000\u00cc\u001f\u0001\u0000\u0000\u0000\u00cd\u00ce\u0005\u000e"+
		"\u0000\u0000\u00ce\u00cf\u0003\u0014\n\u0000\u00cf!\u0001\u0000\u0000"+
		"\u0000\u00d0\u00d1\u0005\u000f\u0000\u0000\u00d1\u00d2\u0005\u0019\u0000"+
		"\u0000\u00d2#\u0001\u0000\u0000\u0000\u00d3\u00d4\u0003&\u0013\u0000\u00d4"+
		"%\u0001\u0000\u0000\u0000\u00d5\u00da\u0003(\u0014\u0000\u00d6\u00d7\u0005"+
		"\u0015\u0000\u0000\u00d7\u00d9\u0003(\u0014\u0000\u00d8\u00d6\u0001\u0000"+
		"\u0000\u0000\u00d9\u00dc\u0001\u0000\u0000\u0000\u00da\u00d8\u0001\u0000"+
		"\u0000\u0000\u00da\u00db\u0001\u0000\u0000\u0000\u00db\'\u0001\u0000\u0000"+
		"\u0000\u00dc\u00da\u0001\u0000\u0000\u0000\u00dd\u00e2\u0003*\u0015\u0000"+
		"\u00de\u00df\u0005\u0016\u0000\u0000\u00df\u00e1\u0003*\u0015\u0000\u00e0"+
		"\u00de\u0001\u0000\u0000\u0000\u00e1\u00e4\u0001\u0000\u0000\u0000\u00e2"+
		"\u00e0\u0001\u0000\u0000\u0000\u00e2\u00e3\u0001\u0000\u0000\u0000\u00e3"+
		")\u0001\u0000\u0000\u0000\u00e4\u00e2\u0001\u0000\u0000\u0000\u00e5\u00ed"+
		"\u0003,\u0016\u0000\u00e6\u00ed\u00030\u0018\u0000\u00e7\u00ed\u0003."+
		"\u0017\u0000\u00e8\u00e9\u0005\u0010\u0000\u0000\u00e9\u00ea\u0003$\u0012"+
		"\u0000\u00ea\u00eb\u0005\u0011\u0000\u0000\u00eb\u00ed\u0001\u0000\u0000"+
		"\u0000\u00ec\u00e5\u0001\u0000\u0000\u0000\u00ec\u00e6\u0001\u0000\u0000"+
		"\u0000\u00ec\u00e7\u0001\u0000\u0000\u0000\u00ec\u00e8\u0001\u0000\u0000"+
		"\u0000\u00ed+\u0001\u0000\u0000\u0000\u00ee\u00f1\u0005\u001a\u0000\u0000"+
		"\u00ef\u00f1\u0003<\u001e\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000\u00f0"+
		"\u00ef\u0001\u0000\u0000\u0000\u00f1-\u0001\u0000\u0000\u0000\u00f2\u00f3"+
		"\u0005\u0019\u0000\u0000\u00f3/\u0001\u0000\u0000\u0000\u00f4\u00f5\u0005"+
		"\u0018\u0000\u0000\u00f51\u0001\u0000\u0000\u0000\u00f6\u00f7\u0003$\u0012"+
		"\u0000\u00f7\u00f8\u0005\u0017\u0000\u0000\u00f8\u00f9\u0003$\u0012\u0000"+
		"\u00f93\u0001\u0000\u0000\u0000\u00fa\u00fb\u0005\u0010\u0000\u0000\u00fb"+
		"\u00fc\u0003$\u0012\u0000\u00fc\u00fd\u0005\u0012\u0000\u0000\u00fd\u00fe"+
		"\u0003$\u0012\u0000\u00fe\u00ff\u0005\u0011\u0000\u0000\u00ff5\u0001\u0000"+
		"\u0000\u0000\u0100\u0101\u0003$\u0012\u0000\u0101\u0102\u0005\u0013\u0000"+
		"\u0000\u0102\u0103\u0003$\u0012\u0000\u01037\u0001\u0000\u0000\u0000\u0104"+
		"\u0105\u0003$\u0012\u0000\u01059\u0001\u0000\u0000\u0000\u0106\u0107\u0005"+
		"\u001b\u0000\u0000\u0107\u0108\u0003$\u0012\u0000\u0108\u0109\u0005\u0012"+
		"\u0000\u0000\u0109\u010a\u0003$\u0012\u0000\u010a\u010b\u0007\u0000\u0000"+
		"\u0000\u010b;\u0001\u0000\u0000\u0000\u010c\u010e\u0005\u001a\u0000\u0000"+
		"\u010d\u010c\u0001\u0000\u0000\u0000\u010d\u010e\u0001\u0000\u0000\u0000"+
		"\u010e\u010f\u0001\u0000\u0000\u0000\u010f\u0110\u0005\u0014\u0000\u0000"+
		"\u0110\u0111\u0005\u001a\u0000\u0000\u0111\u0113\u0005\u0014\u0000\u0000"+
		"\u0112\u0114\u0005\u001a\u0000\u0000\u0113\u0112\u0001\u0000\u0000\u0000"+
		"\u0113\u0114\u0001\u0000\u0000\u0000\u0114=\u0001\u0000\u0000\u0000\u0016"+
		"BIPWafqv~\u0084\u0089\u0090\u00a0\u00a6\u00ac\u00b7\u00da\u00e2\u00ec"+
		"\u00f0\u010d\u0113";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}