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
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, PROP=24, CONST=25, 
		LITERAL=26, BOOL=27, OPERATOR=28, TIMES=29, PLUS=30, DIV=31, MINUS=32, 
		MOD=33, COMMENT=34, WS=35;
	public static final int
		RULE_script = 0, RULE_declaration_list = 1, RULE_declaration = 2, RULE_property_list = 3, 
		RULE_property = 4, RULE_instruction_list = 5, RULE_instruction = 6, RULE_for = 7, 
		RULE_ifElse = 8, RULE_alternative = 9, RULE_figure = 10, RULE_rectangle = 11, 
		RULE_square = 12, RULE_circle = 13, RULE_elipse = 14, RULE_line = 15, 
		RULE_border = 16, RULE_fill = 17, RULE_expression = 18, RULE_expressionData = 19, 
		RULE_constant = 20, RULE_variable = 21, RULE_boolean = 22, RULE_point = 23, 
		RULE_dimension = 24, RULE_interval = 25, RULE_color = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"script", "declaration_list", "declaration", "property_list", "property", 
			"instruction_list", "instruction", "for", "ifElse", "alternative", "figure", 
			"rectangle", "square", "circle", "elipse", "line", "border", "fill", 
			"expression", "expressionData", "constant", "variable", "boolean", "point", 
			"dimension", "interval", "color"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'---'", "':'", "'for'", "'in'", "'{'", "'}'", "'if'", "'else {'", 
			"'rectangle'", "'square'", "'circle'", "'elipse'", "'line'", "'border'", 
			"'fill'", "'('", "')'", "'='", "','", "'~'", "'['", "']'", "'|'", null, 
			null, null, null, null, "'*'", "'+'", "'/'", "'-'", "'%'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"PROP", "CONST", "LITERAL", "BOOL", "OPERATOR", "TIMES", "PLUS", "DIV", 
			"MINUS", "MOD", "COMMENT", "WS"
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
			setState(54);
			declaration_list();
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(55);
				match(WS);
				}
				}
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(61);
			match(T__0);
			setState(65);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(62);
					match(WS);
					}
					} 
				}
				setState(67);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(68);
			property_list();
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(69);
				match(WS);
				}
				}
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(75);
			match(T__0);
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(76);
				match(WS);
				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(82);
			instruction_list();
			setState(83);
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
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CONST) {
				{
				{
				setState(85);
				declaration();
				setState(89);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(86);
						match(WS);
						}
						} 
					}
					setState(91);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				}
				}
				}
				setState(96);
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
			setState(97);
			match(CONST);
			setState(98);
			match(T__1);
			setState(99);
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
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PROP) {
				{
				{
				setState(101);
				property();
				setState(105);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(102);
						match(WS);
						}
						} 
					}
					setState(107);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				}
				}
				}
				setState(112);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
			setState(113);
			match(PROP);
			setState(114);
			match(T__1);
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(115);
				expression(0);
				}
				break;
			case 2:
				{
				setState(116);
				point();
				}
				break;
			case 3:
				{
				setState(117);
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
			setState(127); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(120);
				instruction();
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(121);
					match(WS);
					}
					}
					setState(126);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(129); 
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
			setState(135);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				fill();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				for_();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(133);
				ifElse();
				}
				break;
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
				enterOuterAlt(_localctx, 4);
				{
				setState(134);
				figure();
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
			setState(137);
			match(T__2);
			setState(138);
			variable();
			setState(139);
			match(T__3);
			setState(140);
			interval();
			setState(141);
			match(T__4);
			setState(142);
			instruction_list();
			setState(143);
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
			setState(145);
			match(T__6);
			setState(146);
			boolean_();
			setState(147);
			match(T__4);
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(148);
				match(WS);
				}
				}
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(154);
			instruction_list();
			setState(155);
			match(T__5);
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(156);
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
			setState(159);
			match(T__7);
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(160);
				match(WS);
				}
				}
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(166);
			instruction_list();
			setState(167);
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
		public BorderContext border() {
			return getRuleContext(BorderContext.class,0);
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
			setState(175);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				rectangle();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				square();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(171);
				circle();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 4);
				{
				setState(172);
				elipse();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 5);
				{
				setState(173);
				line();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 6);
				{
				setState(174);
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
			setState(177);
			match(T__8);
			setState(178);
			point();
			setState(179);
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
			setState(181);
			match(T__9);
			setState(182);
			point();
			setState(183);
			expression(0);
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
			setState(185);
			match(T__10);
			setState(186);
			point();
			setState(187);
			expression(0);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
			setState(189);
			match(T__11);
			setState(190);
			point();
			setState(191);
			expression(0);
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
		public PointContext point() {
			return getRuleContext(PointContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
			setState(193);
			match(T__12);
			setState(194);
			point();
			setState(195);
			expression(0);
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
		public ColorContext color() {
			return getRuleContext(ColorContext.class,0);
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
			setState(197);
			match(T__13);
			setState(198);
			color();
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
			setState(200);
			match(T__14);
			setState(201);
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
		public TerminalNode CONST() { return getToken(DrawScriptParser.CONST, 0); }
		public ExpressionDataContext expressionData() {
			return getRuleContext(ExpressionDataContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OPERATOR() { return getToken(DrawScriptParser.OPERATOR, 0); }
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
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(204);
				match(CONST);
				}
				break;
			case 2:
				{
				setState(205);
				expressionData();
				}
				break;
			case 3:
				{
				setState(206);
				variable();
				}
				break;
			case 4:
				{
				setState(207);
				constant();
				}
				break;
			case 5:
				{
				setState(208);
				match(T__15);
				setState(209);
				expression(0);
				setState(210);
				match(T__16);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(219);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(214);
					if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
					setState(215);
					match(OPERATOR);
					setState(216);
					expression(7);
					}
					} 
				}
				setState(221);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
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
		enterRule(_localctx, 38, RULE_expressionData);
		try {
			setState(224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				match(LITERAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(223);
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
		public TerminalNode PROP() { return getToken(DrawScriptParser.PROP, 0); }
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
		enterRule(_localctx, 40, RULE_constant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
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
		enterRule(_localctx, 42, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
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
		public TerminalNode BOOL() { return getToken(DrawScriptParser.BOOL, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
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
		enterRule(_localctx, 44, RULE_boolean);
		try {
			setState(235);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(230);
				match(BOOL);
				}
				break;
			case T__15:
			case T__22:
			case PROP:
			case CONST:
			case LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(231);
				expression(0);
				setState(232);
				match(T__17);
				setState(233);
				expression(0);
				}
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
		enterRule(_localctx, 46, RULE_point);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(T__15);
			setState(238);
			expression(0);
			setState(239);
			match(T__18);
			setState(240);
			expression(0);
			setState(241);
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
		enterRule(_localctx, 48, RULE_dimension);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			expression(0);
			setState(244);
			match(T__19);
			setState(245);
			expression(0);
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
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
		enterRule(_localctx, 50, RULE_interval);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(T__20);
			setState(248);
			expression(0);
			setState(249);
			match(T__18);
			setState(250);
			expression(0);
			setState(251);
			_la = _input.LA(1);
			if ( !(_la==T__20 || _la==T__21) ) {
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
		enterRule(_localctx, 52, RULE_color);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LITERAL) {
				{
				setState(253);
				match(LITERAL);
				}
			}

			setState(256);
			match(T__22);
			setState(257);
			match(LITERAL);
			setState(258);
			match(T__22);
			setState(260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(259);
				match(LITERAL);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 18:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001#\u0107\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0001\u0000\u0001\u0000"+
		"\u0005\u00009\b\u0000\n\u0000\f\u0000<\t\u0000\u0001\u0000\u0001\u0000"+
		"\u0005\u0000@\b\u0000\n\u0000\f\u0000C\t\u0000\u0001\u0000\u0001\u0000"+
		"\u0005\u0000G\b\u0000\n\u0000\f\u0000J\t\u0000\u0001\u0000\u0001\u0000"+
		"\u0005\u0000N\b\u0000\n\u0000\f\u0000Q\t\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0005\u0001X\b\u0001\n\u0001\f\u0001"+
		"[\t\u0001\u0005\u0001]\b\u0001\n\u0001\f\u0001`\t\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0005\u0003h\b"+
		"\u0003\n\u0003\f\u0003k\t\u0003\u0005\u0003m\b\u0003\n\u0003\f\u0003p"+
		"\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004w\b\u0004\u0001\u0005\u0001\u0005\u0005\u0005{\b\u0005\n\u0005\f"+
		"\u0005~\t\u0005\u0004\u0005\u0080\b\u0005\u000b\u0005\f\u0005\u0081\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0088\b\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u0096\b\b\n"+
		"\b\f\b\u0099\t\b\u0001\b\u0001\b\u0001\b\u0003\b\u009e\b\b\u0001\t\u0001"+
		"\t\u0005\t\u00a2\b\t\n\t\f\t\u00a5\t\t\u0001\t\u0001\t\u0001\t\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00b0\b\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0003\u0012\u00d5\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0005\u0012\u00da\b\u0012\n\u0012\f\u0012\u00dd\t\u0012\u0001\u0013\u0001"+
		"\u0013\u0003\u0013\u00e1\b\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003"+
		"\u0016\u00ec\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u001a\u0003\u001a\u00ff\b\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0003\u001a\u0105\b\u001a\u0001\u001a\u0000\u0001$\u001b\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.024\u0000\u0001\u0001\u0000\u0015\u0016\u010b\u00006\u0001"+
		"\u0000\u0000\u0000\u0002^\u0001\u0000\u0000\u0000\u0004a\u0001\u0000\u0000"+
		"\u0000\u0006n\u0001\u0000\u0000\u0000\bq\u0001\u0000\u0000\u0000\n\u007f"+
		"\u0001\u0000\u0000\u0000\f\u0087\u0001\u0000\u0000\u0000\u000e\u0089\u0001"+
		"\u0000\u0000\u0000\u0010\u0091\u0001\u0000\u0000\u0000\u0012\u009f\u0001"+
		"\u0000\u0000\u0000\u0014\u00af\u0001\u0000\u0000\u0000\u0016\u00b1\u0001"+
		"\u0000\u0000\u0000\u0018\u00b5\u0001\u0000\u0000\u0000\u001a\u00b9\u0001"+
		"\u0000\u0000\u0000\u001c\u00bd\u0001\u0000\u0000\u0000\u001e\u00c1\u0001"+
		"\u0000\u0000\u0000 \u00c5\u0001\u0000\u0000\u0000\"\u00c8\u0001\u0000"+
		"\u0000\u0000$\u00d4\u0001\u0000\u0000\u0000&\u00e0\u0001\u0000\u0000\u0000"+
		"(\u00e2\u0001\u0000\u0000\u0000*\u00e4\u0001\u0000\u0000\u0000,\u00eb"+
		"\u0001\u0000\u0000\u0000.\u00ed\u0001\u0000\u0000\u00000\u00f3\u0001\u0000"+
		"\u0000\u00002\u00f7\u0001\u0000\u0000\u00004\u00fe\u0001\u0000\u0000\u0000"+
		"6:\u0003\u0002\u0001\u000079\u0005#\u0000\u000087\u0001\u0000\u0000\u0000"+
		"9<\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000"+
		"\u0000;=\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000=A\u0005\u0001"+
		"\u0000\u0000>@\u0005#\u0000\u0000?>\u0001\u0000\u0000\u0000@C\u0001\u0000"+
		"\u0000\u0000A?\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000BD\u0001"+
		"\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000DH\u0003\u0006\u0003\u0000"+
		"EG\u0005#\u0000\u0000FE\u0001\u0000\u0000\u0000GJ\u0001\u0000\u0000\u0000"+
		"HF\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000IK\u0001\u0000\u0000"+
		"\u0000JH\u0001\u0000\u0000\u0000KO\u0005\u0001\u0000\u0000LN\u0005#\u0000"+
		"\u0000ML\u0001\u0000\u0000\u0000NQ\u0001\u0000\u0000\u0000OM\u0001\u0000"+
		"\u0000\u0000OP\u0001\u0000\u0000\u0000PR\u0001\u0000\u0000\u0000QO\u0001"+
		"\u0000\u0000\u0000RS\u0003\n\u0005\u0000ST\u0005\u0000\u0000\u0001T\u0001"+
		"\u0001\u0000\u0000\u0000UY\u0003\u0004\u0002\u0000VX\u0005#\u0000\u0000"+
		"WV\u0001\u0000\u0000\u0000X[\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000"+
		"\u0000YZ\u0001\u0000\u0000\u0000Z]\u0001\u0000\u0000\u0000[Y\u0001\u0000"+
		"\u0000\u0000\\U\u0001\u0000\u0000\u0000]`\u0001\u0000\u0000\u0000^\\\u0001"+
		"\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_\u0003\u0001\u0000\u0000"+
		"\u0000`^\u0001\u0000\u0000\u0000ab\u0005\u0019\u0000\u0000bc\u0005\u0002"+
		"\u0000\u0000cd\u0003&\u0013\u0000d\u0005\u0001\u0000\u0000\u0000ei\u0003"+
		"\b\u0004\u0000fh\u0005#\u0000\u0000gf\u0001\u0000\u0000\u0000hk\u0001"+
		"\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000"+
		"jm\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000le\u0001\u0000\u0000"+
		"\u0000mp\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000no\u0001\u0000"+
		"\u0000\u0000o\u0007\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000"+
		"qr\u0005\u0018\u0000\u0000rv\u0005\u0002\u0000\u0000sw\u0003$\u0012\u0000"+
		"tw\u0003.\u0017\u0000uw\u00030\u0018\u0000vs\u0001\u0000\u0000\u0000v"+
		"t\u0001\u0000\u0000\u0000vu\u0001\u0000\u0000\u0000w\t\u0001\u0000\u0000"+
		"\u0000x|\u0003\f\u0006\u0000y{\u0005#\u0000\u0000zy\u0001\u0000\u0000"+
		"\u0000{~\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000|}\u0001\u0000"+
		"\u0000\u0000}\u0080\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000"+
		"\u007fx\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081"+
		"\u007f\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082"+
		"\u000b\u0001\u0000\u0000\u0000\u0083\u0088\u0003\"\u0011\u0000\u0084\u0088"+
		"\u0003\u000e\u0007\u0000\u0085\u0088\u0003\u0010\b\u0000\u0086\u0088\u0003"+
		"\u0014\n\u0000\u0087\u0083\u0001\u0000\u0000\u0000\u0087\u0084\u0001\u0000"+
		"\u0000\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0087\u0086\u0001\u0000"+
		"\u0000\u0000\u0088\r\u0001\u0000\u0000\u0000\u0089\u008a\u0005\u0003\u0000"+
		"\u0000\u008a\u008b\u0003*\u0015\u0000\u008b\u008c\u0005\u0004\u0000\u0000"+
		"\u008c\u008d\u00032\u0019\u0000\u008d\u008e\u0005\u0005\u0000\u0000\u008e"+
		"\u008f\u0003\n\u0005\u0000\u008f\u0090\u0005\u0006\u0000\u0000\u0090\u000f"+
		"\u0001\u0000\u0000\u0000\u0091\u0092\u0005\u0007\u0000\u0000\u0092\u0093"+
		"\u0003,\u0016\u0000\u0093\u0097\u0005\u0005\u0000\u0000\u0094\u0096\u0005"+
		"#\u0000\u0000\u0095\u0094\u0001\u0000\u0000\u0000\u0096\u0099\u0001\u0000"+
		"\u0000\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000"+
		"\u0000\u0000\u0098\u009a\u0001\u0000\u0000\u0000\u0099\u0097\u0001\u0000"+
		"\u0000\u0000\u009a\u009b\u0003\n\u0005\u0000\u009b\u009d\u0005\u0006\u0000"+
		"\u0000\u009c\u009e\u0003\u0012\t\u0000\u009d\u009c\u0001\u0000\u0000\u0000"+
		"\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u0011\u0001\u0000\u0000\u0000"+
		"\u009f\u00a3\u0005\b\u0000\u0000\u00a0\u00a2\u0005#\u0000\u0000\u00a1"+
		"\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a5\u0001\u0000\u0000\u0000\u00a3"+
		"\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4"+
		"\u00a6\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a6"+
		"\u00a7\u0003\n\u0005\u0000\u00a7\u00a8\u0005\u0006\u0000\u0000\u00a8\u0013"+
		"\u0001\u0000\u0000\u0000\u00a9\u00b0\u0003\u0016\u000b\u0000\u00aa\u00b0"+
		"\u0003\u0018\f\u0000\u00ab\u00b0\u0003\u001a\r\u0000\u00ac\u00b0\u0003"+
		"\u001c\u000e\u0000\u00ad\u00b0\u0003\u001e\u000f\u0000\u00ae\u00b0\u0003"+
		" \u0010\u0000\u00af\u00a9\u0001\u0000\u0000\u0000\u00af\u00aa\u0001\u0000"+
		"\u0000\u0000\u00af\u00ab\u0001\u0000\u0000\u0000\u00af\u00ac\u0001\u0000"+
		"\u0000\u0000\u00af\u00ad\u0001\u0000\u0000\u0000\u00af\u00ae\u0001\u0000"+
		"\u0000\u0000\u00b0\u0015\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005\t\u0000"+
		"\u0000\u00b2\u00b3\u0003.\u0017\u0000\u00b3\u00b4\u00030\u0018\u0000\u00b4"+
		"\u0017\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005\n\u0000\u0000\u00b6\u00b7"+
		"\u0003.\u0017\u0000\u00b7\u00b8\u0003$\u0012\u0000\u00b8\u0019\u0001\u0000"+
		"\u0000\u0000\u00b9\u00ba\u0005\u000b\u0000\u0000\u00ba\u00bb\u0003.\u0017"+
		"\u0000\u00bb\u00bc\u0003$\u0012\u0000\u00bc\u001b\u0001\u0000\u0000\u0000"+
		"\u00bd\u00be\u0005\f\u0000\u0000\u00be\u00bf\u0003.\u0017\u0000\u00bf"+
		"\u00c0\u0003$\u0012\u0000\u00c0\u001d\u0001\u0000\u0000\u0000\u00c1\u00c2"+
		"\u0005\r\u0000\u0000\u00c2\u00c3\u0003.\u0017\u0000\u00c3\u00c4\u0003"+
		"$\u0012\u0000\u00c4\u001f\u0001\u0000\u0000\u0000\u00c5\u00c6\u0005\u000e"+
		"\u0000\u0000\u00c6\u00c7\u00034\u001a\u0000\u00c7!\u0001\u0000\u0000\u0000"+
		"\u00c8\u00c9\u0005\u000f\u0000\u0000\u00c9\u00ca\u0005\u0019\u0000\u0000"+
		"\u00ca#\u0001\u0000\u0000\u0000\u00cb\u00cc\u0006\u0012\uffff\uffff\u0000"+
		"\u00cc\u00d5\u0005\u0019\u0000\u0000\u00cd\u00d5\u0003&\u0013\u0000\u00ce"+
		"\u00d5\u0003*\u0015\u0000\u00cf\u00d5\u0003(\u0014\u0000\u00d0\u00d1\u0005"+
		"\u0010\u0000\u0000\u00d1\u00d2\u0003$\u0012\u0000\u00d2\u00d3\u0005\u0011"+
		"\u0000\u0000\u00d3\u00d5\u0001\u0000\u0000\u0000\u00d4\u00cb\u0001\u0000"+
		"\u0000\u0000\u00d4\u00cd\u0001\u0000\u0000\u0000\u00d4\u00ce\u0001\u0000"+
		"\u0000\u0000\u00d4\u00cf\u0001\u0000\u0000\u0000\u00d4\u00d0\u0001\u0000"+
		"\u0000\u0000\u00d5\u00db\u0001\u0000\u0000\u0000\u00d6\u00d7\n\u0006\u0000"+
		"\u0000\u00d7\u00d8\u0005\u001c\u0000\u0000\u00d8\u00da\u0003$\u0012\u0007"+
		"\u00d9\u00d6\u0001\u0000\u0000\u0000\u00da\u00dd\u0001\u0000\u0000\u0000"+
		"\u00db\u00d9\u0001\u0000\u0000\u0000\u00db\u00dc\u0001\u0000\u0000\u0000"+
		"\u00dc%\u0001\u0000\u0000\u0000\u00dd\u00db\u0001\u0000\u0000\u0000\u00de"+
		"\u00e1\u0005\u001a\u0000\u0000\u00df\u00e1\u00034\u001a\u0000\u00e0\u00de"+
		"\u0001\u0000\u0000\u0000\u00e0\u00df\u0001\u0000\u0000\u0000\u00e1\'\u0001"+
		"\u0000\u0000\u0000\u00e2\u00e3\u0005\u0018\u0000\u0000\u00e3)\u0001\u0000"+
		"\u0000\u0000\u00e4\u00e5\u0005\u0018\u0000\u0000\u00e5+\u0001\u0000\u0000"+
		"\u0000\u00e6\u00ec\u0005\u001b\u0000\u0000\u00e7\u00e8\u0003$\u0012\u0000"+
		"\u00e8\u00e9\u0005\u0012\u0000\u0000\u00e9\u00ea\u0003$\u0012\u0000\u00ea"+
		"\u00ec\u0001\u0000\u0000\u0000\u00eb\u00e6\u0001\u0000\u0000\u0000\u00eb"+
		"\u00e7\u0001\u0000\u0000\u0000\u00ec-\u0001\u0000\u0000\u0000\u00ed\u00ee"+
		"\u0005\u0010\u0000\u0000\u00ee\u00ef\u0003$\u0012\u0000\u00ef\u00f0\u0005"+
		"\u0013\u0000\u0000\u00f0\u00f1\u0003$\u0012\u0000\u00f1\u00f2\u0005\u0011"+
		"\u0000\u0000\u00f2/\u0001\u0000\u0000\u0000\u00f3\u00f4\u0003$\u0012\u0000"+
		"\u00f4\u00f5\u0005\u0014\u0000\u0000\u00f5\u00f6\u0003$\u0012\u0000\u00f6"+
		"1\u0001\u0000\u0000\u0000\u00f7\u00f8\u0005\u0015\u0000\u0000\u00f8\u00f9"+
		"\u0003$\u0012\u0000\u00f9\u00fa\u0005\u0013\u0000\u0000\u00fa\u00fb\u0003"+
		"$\u0012\u0000\u00fb\u00fc\u0007\u0000\u0000\u0000\u00fc3\u0001\u0000\u0000"+
		"\u0000\u00fd\u00ff\u0005\u001a\u0000\u0000\u00fe\u00fd\u0001\u0000\u0000"+
		"\u0000\u00fe\u00ff\u0001\u0000\u0000\u0000\u00ff\u0100\u0001\u0000\u0000"+
		"\u0000\u0100\u0101\u0005\u0017\u0000\u0000\u0101\u0102\u0005\u001a\u0000"+
		"\u0000\u0102\u0104\u0005\u0017\u0000\u0000\u0103\u0105\u0005\u001a\u0000"+
		"\u0000\u0104\u0103\u0001\u0000\u0000\u0000\u0104\u0105\u0001\u0000\u0000"+
		"\u0000\u01055\u0001\u0000\u0000\u0000\u0016:AHOY^inv|\u0081\u0087\u0097"+
		"\u009d\u00a3\u00af\u00d4\u00db\u00e0\u00eb\u00fe\u0104";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}