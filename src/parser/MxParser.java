// Generated from Mx.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MxParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		INTCONST=39, STRINGCONST=40, VOID=41, BOOL=42, INT=43, STRING=44, NEW=45, 
		CLASS=46, NULL=47, TRUE=48, FALSE=49, THIS=50, IF=51, ELSE=52, FOR=53, 
		WHILE=54, BREAK=55, CONTINUE=56, RETURN=57, IDENTIFIER=58, WHITESPACE=59, 
		COMMENT=60;
	public static final int
		RULE_prog = 0, RULE_def = 1, RULE_funcdef = 2, RULE_classdef = 3, RULE_vardef = 4, 
		RULE_stmtsuite = 5, RULE_stmt = 6, RULE_expr = 7, RULE_atomtype = 8, RULE_arraytype = 9, 
		RULE_type = 10, RULE_literal = 11, RULE_arrayliteral = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "def", "funcdef", "classdef", "vardef", "stmtsuite", "stmt", 
			"expr", "atomtype", "arraytype", "type", "literal", "arrayliteral"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'()'", "'('", "','", "')'", "'{};'", "'{'", "'};'", "'='", "';'", 
			"'{}'", "'}'", "'.'", "'['", "']'", "'++'", "'--'", "'-'", "'!'", "'~'", 
			"'/'", "'*'", "'%'", "'+'", "'<<'", "'>>'", "'<'", "'>'", "'<='", "'>='", 
			"'=='", "'!='", "'&'", "'^'", "'|'", "'&&'", "'||'", "'?'", "':'", null, 
			null, "'void'", "'bool'", "'int'", "'string'", "'new'", "'class'", "'null'", 
			"'true'", "'false'", "'this'", "'if'", "'else'", "'for'", "'while'", 
			"'break'", "'continue'", "'return'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "INTCONST", "STRINGCONST", "VOID", "BOOL", "INT", "STRING", 
			"NEW", "CLASS", "NULL", "TRUE", "FALSE", "THIS", "IF", "ELSE", "FOR", 
			"WHILE", "BREAK", "CONTINUE", "RETURN", "IDENTIFIER", "WHITESPACE", "COMMENT"
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
	public String getGrammarFileName() { return "Mx.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MxParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public List<DefContext> def() {
			return getRuleContexts(DefContext.class);
		}
		public DefContext def(int i) {
			return getRuleContext(DefContext.class,i);
		}
		public TerminalNode EOF() { return getToken(MxParser.EOF, 0); }
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(26);
				def();
				}
				}
				setState(29); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 288333730244722688L) != 0) );
			setState(32);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(31);
				match(EOF);
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
	public static class DefContext extends ParserRuleContext {
		public FuncdefContext funcdef() {
			return getRuleContext(FuncdefContext.class,0);
		}
		public ClassdefContext classdef() {
			return getRuleContext(ClassdefContext.class,0);
		}
		public VardefContext vardef() {
			return getRuleContext(VardefContext.class,0);
		}
		public DefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefContext def() throws RecognitionException {
		DefContext _localctx = new DefContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_def);
		try {
			setState(37);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				funcdef();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
				classdef();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(36);
				vardef();
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
	public static class FuncdefContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(MxParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(MxParser.IDENTIFIER, i);
		}
		public StmtsuiteContext stmtsuite() {
			return getRuleContext(StmtsuiteContext.class,0);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode VOID() { return getToken(MxParser.VOID, 0); }
		public FuncdefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcdef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterFuncdef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitFuncdef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitFuncdef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncdefContext funcdef() throws RecognitionException {
		FuncdefContext _localctx = new FuncdefContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_funcdef);
		int _la;
		try {
			setState(66);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BOOL:
				case INT:
				case STRING:
				case IDENTIFIER:
					{
					setState(39);
					type();
					}
					break;
				case VOID:
					{
					setState(40);
					match(VOID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(43);
				match(IDENTIFIER);
				setState(44);
				match(T__0);
				setState(45);
				stmtsuite();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(48);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BOOL:
				case INT:
				case STRING:
				case IDENTIFIER:
					{
					setState(46);
					type();
					}
					break;
				case VOID:
					{
					setState(47);
					match(VOID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(50);
				match(IDENTIFIER);
				setState(51);
				match(T__1);
				setState(52);
				type();
				setState(53);
				match(IDENTIFIER);
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(54);
					match(T__2);
					setState(55);
					type();
					setState(56);
					match(IDENTIFIER);
					}
					}
					setState(62);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(63);
				match(T__3);
				setState(64);
				stmtsuite();
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
	public static class ClassdefContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(MxParser.CLASS, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(MxParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(MxParser.IDENTIFIER, i);
		}
		public List<VardefContext> vardef() {
			return getRuleContexts(VardefContext.class);
		}
		public VardefContext vardef(int i) {
			return getRuleContext(VardefContext.class,i);
		}
		public List<FuncdefContext> funcdef() {
			return getRuleContexts(FuncdefContext.class);
		}
		public FuncdefContext funcdef(int i) {
			return getRuleContext(FuncdefContext.class,i);
		}
		public StmtsuiteContext stmtsuite() {
			return getRuleContext(StmtsuiteContext.class,0);
		}
		public ClassdefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classdef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterClassdef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitClassdef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitClassdef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassdefContext classdef() throws RecognitionException {
		ClassdefContext _localctx = new ClassdefContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_classdef);
		int _la;
		try {
			int _alt;
			setState(94);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				match(CLASS);
				setState(69);
				match(IDENTIFIER);
				setState(70);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				match(CLASS);
				setState(72);
				match(IDENTIFIER);
				setState(73);
				match(T__5);
				setState(78);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(76);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
						case 1:
							{
							setState(74);
							vardef();
							}
							break;
						case 2:
							{
							setState(75);
							funcdef();
							}
							break;
						}
						} 
					}
					setState(80);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				}
				setState(84);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(81);
					match(IDENTIFIER);
					setState(82);
					match(T__0);
					setState(83);
					stmtsuite();
					}
					break;
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 288263361500545024L) != 0)) {
					{
					setState(88);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						setState(86);
						vardef();
						}
						break;
					case 2:
						{
						setState(87);
						funcdef();
						}
						break;
					}
					}
					setState(92);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(93);
				match(T__6);
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
	public static class VardefContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(MxParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(MxParser.IDENTIFIER, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public VardefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterVardef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitVardef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitVardef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VardefContext vardef() throws RecognitionException {
		VardefContext _localctx = new VardefContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_vardef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			type();
			setState(97);
			match(IDENTIFIER);
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(98);
				match(T__7);
				setState(99);
				expr(0);
				}
			}

			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(102);
				match(T__2);
				setState(103);
				match(IDENTIFIER);
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(104);
					match(T__7);
					setState(105);
					expr(0);
					}
				}

				}
				}
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(113);
			match(T__8);
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
	public static class StmtsuiteContext extends ParserRuleContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public StmtsuiteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmtsuite; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterStmtsuite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitStmtsuite(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitStmtsuite(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtsuiteContext stmtsuite() throws RecognitionException {
		StmtsuiteContext _localctx = new StmtsuiteContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_stmtsuite);
		int _la;
		try {
			setState(124);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				match(T__9);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				match(T__5);
				setState(118); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(117);
					stmt();
					}
					}
					setState(120); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 571956602921256516L) != 0) );
				setState(122);
				match(T__10);
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
	public static class StmtContext extends ParserRuleContext {
		public DefContext def() {
			return getRuleContext(DefContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<StmtsuiteContext> stmtsuite() {
			return getRuleContexts(StmtsuiteContext.class);
		}
		public StmtsuiteContext stmtsuite(int i) {
			return getRuleContext(StmtsuiteContext.class,i);
		}
		public TerminalNode IF() { return getToken(MxParser.IF, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(MxParser.ELSE, 0); }
		public TerminalNode FOR() { return getToken(MxParser.FOR, 0); }
		public TerminalNode WHILE() { return getToken(MxParser.WHILE, 0); }
		public TerminalNode BREAK() { return getToken(MxParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(MxParser.CONTINUE, 0); }
		public TerminalNode RETURN() { return getToken(MxParser.RETURN, 0); }
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_stmt);
		int _la;
		try {
			setState(183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				match(T__8);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				def();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(128);
				expr(0);
				setState(129);
				match(T__8);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(131);
				type();
				setState(132);
				match(T__8);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(134);
				stmtsuite();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(135);
				match(IF);
				setState(136);
				match(T__1);
				setState(137);
				expr(0);
				setState(138);
				match(T__3);
				setState(141);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(139);
					stmt();
					}
					break;
				case 2:
					{
					setState(140);
					stmtsuite();
					}
					break;
				}
				setState(148);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(143);
					match(ELSE);
					setState(146);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						setState(144);
						stmt();
						}
						break;
					case 2:
						{
						setState(145);
						stmtsuite();
						}
						break;
					}
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(150);
				match(FOR);
				setState(151);
				match(T__1);
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 290378272117588036L) != 0)) {
					{
					setState(152);
					expr(0);
					}
				}

				setState(155);
				match(T__8);
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 290378272117588036L) != 0)) {
					{
					setState(156);
					expr(0);
					}
				}

				setState(159);
				match(T__8);
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 290378272117588036L) != 0)) {
					{
					setState(160);
					expr(0);
					}
				}

				setState(163);
				match(T__3);
				setState(166);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(164);
					stmt();
					}
					break;
				case 2:
					{
					setState(165);
					stmtsuite();
					}
					break;
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(168);
				match(WHILE);
				setState(169);
				match(T__1);
				setState(170);
				expr(0);
				setState(171);
				match(T__3);
				setState(172);
				stmtsuite();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(174);
				match(BREAK);
				setState(175);
				match(T__8);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(176);
				match(CONTINUE);
				setState(177);
				match(T__8);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(178);
				match(RETURN);
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 290378272117588036L) != 0)) {
					{
					setState(179);
					expr(0);
					}
				}

				setState(182);
				match(T__8);
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
	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableContext extends ExprContext {
		public TerminalNode IDENTIFIER() { return getToken(MxParser.IDENTIFIER, 0); }
		public VariableContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PostIncDecContext extends ExprContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PostIncDecContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterPostIncDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitPostIncDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitPostIncDec(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConstantContext extends ExprContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ConstantContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PreIncDecContext extends ExprContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PreIncDecContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterPreIncDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitPreIncDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitPreIncDec(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ThisPointerContext extends ExprContext {
		public TerminalNode THIS() { return getToken(MxParser.THIS, 0); }
		public ThisPointerContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterThisPointer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitThisPointer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitThisPointer(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NewTypeContext extends ExprContext {
		public TerminalNode NEW() { return getToken(MxParser.NEW, 0); }
		public AtomtypeContext atomtype() {
			return getRuleContext(AtomtypeContext.class,0);
		}
		public NewTypeContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterNewType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitNewType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitNewType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinaryExpContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public BinaryExpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterBinaryExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitBinaryExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitBinaryExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignExpContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AssignExpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterAssignExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitAssignExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitAssignExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayAccessContext extends ExprContext {
		public TerminalNode IDENTIFIER() { return getToken(MxParser.IDENTIFIER, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ArrayAccessContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterArrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitArrayAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitArrayAccess(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NewArrayContext extends ExprContext {
		public TerminalNode NEW() { return getToken(MxParser.NEW, 0); }
		public AtomtypeContext atomtype() {
			return getRuleContext(AtomtypeContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public NewArrayContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterNewArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitNewArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitNewArray(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TernaryExpContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TernaryExpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterTernaryExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitTernaryExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitTernaryExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MemberAccessContext extends ExprContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(MxParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(MxParser.IDENTIFIER, i);
		}
		public TerminalNode THIS() { return getToken(MxParser.THIS, 0); }
		public MemberAccessContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterMemberAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitMemberAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitMemberAccess(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MemberFunctionCallContext extends ExprContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(MxParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(MxParser.IDENTIFIER, i);
		}
		public TerminalNode THIS() { return getToken(MxParser.THIS, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MemberFunctionCallContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterMemberFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitMemberFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitMemberFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends ExprContext {
		public TerminalNode IDENTIFIER() { return getToken(MxParser.IDENTIFIER, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public FunctionCallContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryExpContext extends ExprContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public UnaryExpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterUnaryExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitUnaryExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitUnaryExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NewClassContext extends ExprContext {
		public TerminalNode NEW() { return getToken(MxParser.NEW, 0); }
		public TerminalNode IDENTIFIER() { return getToken(MxParser.IDENTIFIER, 0); }
		public NewClassContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterNewClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitNewClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitNewClass(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenthesesContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParenthesesContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterParentheses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitParentheses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitParentheses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				_localctx = new ConstantContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(186);
				literal();
				}
				break;
			case 2:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(187);
				match(IDENTIFIER);
				}
				break;
			case 3:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(188);
				match(IDENTIFIER);
				setState(189);
				match(T__0);
				}
				break;
			case 4:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(190);
				match(IDENTIFIER);
				{
				setState(191);
				match(T__1);
				setState(192);
				expr(0);
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(193);
					match(T__2);
					setState(194);
					expr(0);
					}
					}
					setState(199);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(200);
				match(T__3);
				}
				}
				break;
			case 5:
				{
				_localctx = new ThisPointerContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(202);
				match(THIS);
				}
				break;
			case 6:
				{
				_localctx = new MemberAccessContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(206);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFIER:
					{
					setState(203);
					match(IDENTIFIER);
					}
					break;
				case THIS:
					{
					setState(204);
					match(THIS);
					setState(205);
					match(T__11);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(208);
				match(IDENTIFIER);
				}
				break;
			case 7:
				{
				_localctx = new MemberFunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(212);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFIER:
					{
					setState(209);
					match(IDENTIFIER);
					}
					break;
				case THIS:
					{
					setState(210);
					match(THIS);
					setState(211);
					match(T__11);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(214);
				match(IDENTIFIER);
				setState(215);
				match(T__0);
				}
				break;
			case 8:
				{
				_localctx = new MemberFunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(219);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFIER:
					{
					setState(216);
					match(IDENTIFIER);
					}
					break;
				case THIS:
					{
					setState(217);
					match(THIS);
					setState(218);
					match(T__11);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(221);
				match(IDENTIFIER);
				{
				setState(222);
				match(T__1);
				setState(223);
				expr(0);
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(224);
					match(T__2);
					setState(225);
					expr(0);
					}
					}
					setState(230);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(231);
				match(T__3);
				}
				}
				break;
			case 9:
				{
				_localctx = new ArrayAccessContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(233);
				match(IDENTIFIER);
				setState(238); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(234);
						match(T__12);
						setState(235);
						expr(0);
						setState(236);
						match(T__13);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(240); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 10:
				{
				_localctx = new NewArrayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(242);
				match(NEW);
				setState(243);
				atomtype();
				setState(249); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(244);
						match(T__12);
						setState(246);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 290378272117588036L) != 0)) {
							{
							setState(245);
							expr(0);
							}
						}

						setState(248);
						match(T__13);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(251); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 11:
				{
				_localctx = new NewTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(253);
				match(NEW);
				setState(254);
				atomtype();
				}
				break;
			case 12:
				{
				_localctx = new NewClassContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(255);
				match(NEW);
				setState(256);
				match(IDENTIFIER);
				setState(258);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(257);
					match(T__0);
					}
					break;
				}
				}
				break;
			case 13:
				{
				_localctx = new PostIncDecContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(260);
				((PostIncDecContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__14 || _la==T__15) ) {
					((PostIncDecContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(261);
				expr(16);
				}
				break;
			case 14:
				{
				_localctx = new UnaryExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(262);
				((UnaryExpContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 917504L) != 0)) ) {
					((UnaryExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(263);
				expr(15);
				}
				break;
			case 15:
				{
				_localctx = new ParenthesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(264);
				match(T__1);
				setState(265);
				expr(0);
				setState(266);
				match(T__3);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(316);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(314);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryExpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(270);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(271);
						((BinaryExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__19 || _la==T__20) ) {
							((BinaryExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(272);
						expr(15);
						}
						break;
					case 2:
						{
						_localctx = new BinaryExpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(273);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(274);
						((BinaryExpContext)_localctx).op = match(T__21);
						setState(275);
						expr(14);
						}
						break;
					case 3:
						{
						_localctx = new BinaryExpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(276);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(277);
						((BinaryExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__16 || _la==T__22) ) {
							((BinaryExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(278);
						expr(13);
						}
						break;
					case 4:
						{
						_localctx = new BinaryExpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(279);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(280);
						((BinaryExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__23 || _la==T__24) ) {
							((BinaryExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(281);
						expr(12);
						}
						break;
					case 5:
						{
						_localctx = new BinaryExpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(282);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(283);
						((BinaryExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1006632960L) != 0)) ) {
							((BinaryExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(284);
						expr(11);
						}
						break;
					case 6:
						{
						_localctx = new BinaryExpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(285);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(286);
						((BinaryExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__29 || _la==T__30) ) {
							((BinaryExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(287);
						expr(10);
						}
						break;
					case 7:
						{
						_localctx = new BinaryExpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(288);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(289);
						((BinaryExpContext)_localctx).op = match(T__31);
						setState(290);
						expr(9);
						}
						break;
					case 8:
						{
						_localctx = new BinaryExpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(291);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(292);
						((BinaryExpContext)_localctx).op = match(T__32);
						setState(293);
						expr(8);
						}
						break;
					case 9:
						{
						_localctx = new BinaryExpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(294);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(295);
						((BinaryExpContext)_localctx).op = match(T__33);
						setState(296);
						expr(7);
						}
						break;
					case 10:
						{
						_localctx = new BinaryExpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(297);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(298);
						((BinaryExpContext)_localctx).op = match(T__34);
						setState(299);
						expr(6);
						}
						break;
					case 11:
						{
						_localctx = new BinaryExpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(300);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(301);
						((BinaryExpContext)_localctx).op = match(T__35);
						setState(302);
						expr(5);
						}
						break;
					case 12:
						{
						_localctx = new TernaryExpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(303);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(304);
						match(T__36);
						setState(305);
						expr(0);
						setState(306);
						match(T__37);
						setState(307);
						expr(3);
						}
						break;
					case 13:
						{
						_localctx = new AssignExpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(309);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(310);
						match(T__7);
						setState(311);
						expr(2);
						}
						break;
					case 14:
						{
						_localctx = new PreIncDecContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(312);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(313);
						((PreIncDecContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__14 || _la==T__15) ) {
							((PreIncDecContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					}
					} 
				}
				setState(318);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
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
	public static class AtomtypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(MxParser.INT, 0); }
		public TerminalNode BOOL() { return getToken(MxParser.BOOL, 0); }
		public TerminalNode STRING() { return getToken(MxParser.STRING, 0); }
		public TerminalNode IDENTIFIER() { return getToken(MxParser.IDENTIFIER, 0); }
		public AtomtypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomtype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterAtomtype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitAtomtype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitAtomtype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomtypeContext atomtype() throws RecognitionException {
		AtomtypeContext _localctx = new AtomtypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_atomtype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 288261162477289472L) != 0)) ) {
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
	public static class ArraytypeContext extends ParserRuleContext {
		public AtomtypeContext atomtype() {
			return getRuleContext(AtomtypeContext.class,0);
		}
		public List<TerminalNode> INTCONST() { return getTokens(MxParser.INTCONST); }
		public TerminalNode INTCONST(int i) {
			return getToken(MxParser.INTCONST, i);
		}
		public ArraytypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arraytype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterArraytype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitArraytype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitArraytype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArraytypeContext arraytype() throws RecognitionException {
		ArraytypeContext _localctx = new ArraytypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_arraytype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			atomtype();
			setState(327); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(322);
				match(T__12);
				setState(324);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INTCONST) {
					{
					setState(323);
					match(INTCONST);
					}
				}

				setState(326);
				match(T__13);
				}
				}
				setState(329); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__12 );
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
	public static class TypeContext extends ParserRuleContext {
		public AtomtypeContext atomtype() {
			return getRuleContext(AtomtypeContext.class,0);
		}
		public ArraytypeContext arraytype() {
			return getRuleContext(ArraytypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_type);
		try {
			setState(333);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(331);
				atomtype();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(332);
				arraytype();
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
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode INTCONST() { return getToken(MxParser.INTCONST, 0); }
		public TerminalNode STRINGCONST() { return getToken(MxParser.STRINGCONST, 0); }
		public TerminalNode TRUE() { return getToken(MxParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(MxParser.FALSE, 0); }
		public TerminalNode NULL() { return getToken(MxParser.NULL, 0); }
		public ArrayliteralContext arrayliteral() {
			return getRuleContext(ArrayliteralContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_literal);
		try {
			setState(341);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTCONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(335);
				match(INTCONST);
				}
				break;
			case STRINGCONST:
				enterOuterAlt(_localctx, 2);
				{
				setState(336);
				match(STRINGCONST);
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(337);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 4);
				{
				setState(338);
				match(FALSE);
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 5);
				{
				setState(339);
				match(NULL);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 6);
				{
				setState(340);
				arrayliteral();
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
	public static class ArrayliteralContext extends ParserRuleContext {
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public ArrayliteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayliteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterArrayliteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitArrayliteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitArrayliteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayliteralContext arrayliteral() throws RecognitionException {
		ArrayliteralContext _localctx = new ArrayliteralContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_arrayliteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			match(T__5);
			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 986811685929024L) != 0)) {
				{
				setState(344);
				literal();
				setState(349);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(345);
					match(T__2);
					setState(346);
					literal();
					}
					}
					setState(351);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(354);
			match(T__10);
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
		case 7:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 14);
		case 1:
			return precpred(_ctx, 13);
		case 2:
			return precpred(_ctx, 12);
		case 3:
			return precpred(_ctx, 11);
		case 4:
			return precpred(_ctx, 10);
		case 5:
			return precpred(_ctx, 9);
		case 6:
			return precpred(_ctx, 8);
		case 7:
			return precpred(_ctx, 7);
		case 8:
			return precpred(_ctx, 6);
		case 9:
			return precpred(_ctx, 5);
		case 10:
			return precpred(_ctx, 4);
		case 11:
			return precpred(_ctx, 3);
		case 12:
			return precpred(_ctx, 2);
		case 13:
			return precpred(_ctx, 17);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001<\u0165\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0001\u0000\u0004\u0000\u001c\b\u0000\u000b\u0000\f\u0000\u001d"+
		"\u0001\u0000\u0003\u0000!\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001&\b\u0001\u0001\u0002\u0001\u0002\u0003\u0002*\b\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u00021\b"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0005\u0002;\b\u0002\n\u0002\f\u0002>\t"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002C\b\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0005\u0003M\b\u0003\n\u0003\f\u0003P\t\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u0003U\b\u0003\u0001\u0003\u0001"+
		"\u0003\u0005\u0003Y\b\u0003\n\u0003\f\u0003\\\t\u0003\u0001\u0003\u0003"+
		"\u0003_\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004e\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004k\b\u0004\u0005\u0004m\b\u0004\n\u0004\f\u0004p\t\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0004\u0005w\b\u0005"+
		"\u000b\u0005\f\u0005x\u0001\u0005\u0001\u0005\u0003\u0005}\b\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u008e\b\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006\u0093\b\u0006\u0003\u0006\u0095\b\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u009a\b\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006\u009e\b\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"\u00a2\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00a7\b"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0003\u0006\u00b5\b\u0006\u0001\u0006\u0003\u0006\u00b8\b\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00c4\b\u0007"+
		"\n\u0007\f\u0007\u00c7\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00cf\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00d5\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00dc\b\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00e3"+
		"\b\u0007\n\u0007\f\u0007\u00e6\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0004\u0007\u00ef\b\u0007"+
		"\u000b\u0007\f\u0007\u00f0\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u00f7\b\u0007\u0001\u0007\u0004\u0007\u00fa\b\u0007\u000b"+
		"\u0007\f\u0007\u00fb\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007\u0103\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u010d"+
		"\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u013b\b\u0007\n\u0007\f\u0007"+
		"\u013e\t\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0003\t\u0145\b"+
		"\t\u0001\t\u0004\t\u0148\b\t\u000b\t\f\t\u0149\u0001\n\u0001\n\u0003\n"+
		"\u014e\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0003\u000b\u0156\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0005\f\u015c\b\f\n\f\f\f\u015f\t\f\u0003\f\u0161\b\f\u0001\f\u0001\f"+
		"\u0001\f\u0000\u0001\u000e\r\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u0000\b\u0001\u0000\u000f\u0010\u0001\u0000\u0011"+
		"\u0013\u0001\u0000\u0014\u0015\u0002\u0000\u0011\u0011\u0017\u0017\u0001"+
		"\u0000\u0018\u0019\u0001\u0000\u001a\u001d\u0001\u0000\u001e\u001f\u0002"+
		"\u0000*,::\u01ab\u0000\u001b\u0001\u0000\u0000\u0000\u0002%\u0001\u0000"+
		"\u0000\u0000\u0004B\u0001\u0000\u0000\u0000\u0006^\u0001\u0000\u0000\u0000"+
		"\b`\u0001\u0000\u0000\u0000\n|\u0001\u0000\u0000\u0000\f\u00b7\u0001\u0000"+
		"\u0000\u0000\u000e\u010c\u0001\u0000\u0000\u0000\u0010\u013f\u0001\u0000"+
		"\u0000\u0000\u0012\u0141\u0001\u0000\u0000\u0000\u0014\u014d\u0001\u0000"+
		"\u0000\u0000\u0016\u0155\u0001\u0000\u0000\u0000\u0018\u0157\u0001\u0000"+
		"\u0000\u0000\u001a\u001c\u0003\u0002\u0001\u0000\u001b\u001a\u0001\u0000"+
		"\u0000\u0000\u001c\u001d\u0001\u0000\u0000\u0000\u001d\u001b\u0001\u0000"+
		"\u0000\u0000\u001d\u001e\u0001\u0000\u0000\u0000\u001e \u0001\u0000\u0000"+
		"\u0000\u001f!\u0005\u0000\u0000\u0001 \u001f\u0001\u0000\u0000\u0000 "+
		"!\u0001\u0000\u0000\u0000!\u0001\u0001\u0000\u0000\u0000\"&\u0003\u0004"+
		"\u0002\u0000#&\u0003\u0006\u0003\u0000$&\u0003\b\u0004\u0000%\"\u0001"+
		"\u0000\u0000\u0000%#\u0001\u0000\u0000\u0000%$\u0001\u0000\u0000\u0000"+
		"&\u0003\u0001\u0000\u0000\u0000\'*\u0003\u0014\n\u0000(*\u0005)\u0000"+
		"\u0000)\'\u0001\u0000\u0000\u0000)(\u0001\u0000\u0000\u0000*+\u0001\u0000"+
		"\u0000\u0000+,\u0005:\u0000\u0000,-\u0005\u0001\u0000\u0000-C\u0003\n"+
		"\u0005\u0000.1\u0003\u0014\n\u0000/1\u0005)\u0000\u00000.\u0001\u0000"+
		"\u0000\u00000/\u0001\u0000\u0000\u000012\u0001\u0000\u0000\u000023\u0005"+
		":\u0000\u000034\u0005\u0002\u0000\u000045\u0003\u0014\n\u00005<\u0005"+
		":\u0000\u000067\u0005\u0003\u0000\u000078\u0003\u0014\n\u000089\u0005"+
		":\u0000\u00009;\u0001\u0000\u0000\u0000:6\u0001\u0000\u0000\u0000;>\u0001"+
		"\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000"+
		"=?\u0001\u0000\u0000\u0000><\u0001\u0000\u0000\u0000?@\u0005\u0004\u0000"+
		"\u0000@A\u0003\n\u0005\u0000AC\u0001\u0000\u0000\u0000B)\u0001\u0000\u0000"+
		"\u0000B0\u0001\u0000\u0000\u0000C\u0005\u0001\u0000\u0000\u0000DE\u0005"+
		".\u0000\u0000EF\u0005:\u0000\u0000F_\u0005\u0005\u0000\u0000GH\u0005."+
		"\u0000\u0000HI\u0005:\u0000\u0000IN\u0005\u0006\u0000\u0000JM\u0003\b"+
		"\u0004\u0000KM\u0003\u0004\u0002\u0000LJ\u0001\u0000\u0000\u0000LK\u0001"+
		"\u0000\u0000\u0000MP\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000"+
		"NO\u0001\u0000\u0000\u0000OT\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000"+
		"\u0000QR\u0005:\u0000\u0000RS\u0005\u0001\u0000\u0000SU\u0003\n\u0005"+
		"\u0000TQ\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000UZ\u0001\u0000"+
		"\u0000\u0000VY\u0003\b\u0004\u0000WY\u0003\u0004\u0002\u0000XV\u0001\u0000"+
		"\u0000\u0000XW\u0001\u0000\u0000\u0000Y\\\u0001\u0000\u0000\u0000ZX\u0001"+
		"\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[]\u0001\u0000\u0000\u0000"+
		"\\Z\u0001\u0000\u0000\u0000]_\u0005\u0007\u0000\u0000^D\u0001\u0000\u0000"+
		"\u0000^G\u0001\u0000\u0000\u0000_\u0007\u0001\u0000\u0000\u0000`a\u0003"+
		"\u0014\n\u0000ad\u0005:\u0000\u0000bc\u0005\b\u0000\u0000ce\u0003\u000e"+
		"\u0007\u0000db\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000en\u0001"+
		"\u0000\u0000\u0000fg\u0005\u0003\u0000\u0000gj\u0005:\u0000\u0000hi\u0005"+
		"\b\u0000\u0000ik\u0003\u000e\u0007\u0000jh\u0001\u0000\u0000\u0000jk\u0001"+
		"\u0000\u0000\u0000km\u0001\u0000\u0000\u0000lf\u0001\u0000\u0000\u0000"+
		"mp\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000no\u0001\u0000\u0000"+
		"\u0000oq\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000qr\u0005\t\u0000"+
		"\u0000r\t\u0001\u0000\u0000\u0000s}\u0005\n\u0000\u0000tv\u0005\u0006"+
		"\u0000\u0000uw\u0003\f\u0006\u0000vu\u0001\u0000\u0000\u0000wx\u0001\u0000"+
		"\u0000\u0000xv\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000yz\u0001"+
		"\u0000\u0000\u0000z{\u0005\u000b\u0000\u0000{}\u0001\u0000\u0000\u0000"+
		"|s\u0001\u0000\u0000\u0000|t\u0001\u0000\u0000\u0000}\u000b\u0001\u0000"+
		"\u0000\u0000~\u00b8\u0005\t\u0000\u0000\u007f\u00b8\u0003\u0002\u0001"+
		"\u0000\u0080\u0081\u0003\u000e\u0007\u0000\u0081\u0082\u0005\t\u0000\u0000"+
		"\u0082\u00b8\u0001\u0000\u0000\u0000\u0083\u0084\u0003\u0014\n\u0000\u0084"+
		"\u0085\u0005\t\u0000\u0000\u0085\u00b8\u0001\u0000\u0000\u0000\u0086\u00b8"+
		"\u0003\n\u0005\u0000\u0087\u0088\u00053\u0000\u0000\u0088\u0089\u0005"+
		"\u0002\u0000\u0000\u0089\u008a\u0003\u000e\u0007\u0000\u008a\u008d\u0005"+
		"\u0004\u0000\u0000\u008b\u008e\u0003\f\u0006\u0000\u008c\u008e\u0003\n"+
		"\u0005\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008d\u008c\u0001\u0000"+
		"\u0000\u0000\u008e\u0094\u0001\u0000\u0000\u0000\u008f\u0092\u00054\u0000"+
		"\u0000\u0090\u0093\u0003\f\u0006\u0000\u0091\u0093\u0003\n\u0005\u0000"+
		"\u0092\u0090\u0001\u0000\u0000\u0000\u0092\u0091\u0001\u0000\u0000\u0000"+
		"\u0093\u0095\u0001\u0000\u0000\u0000\u0094\u008f\u0001\u0000\u0000\u0000"+
		"\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u00b8\u0001\u0000\u0000\u0000"+
		"\u0096\u0097\u00055\u0000\u0000\u0097\u0099\u0005\u0002\u0000\u0000\u0098"+
		"\u009a\u0003\u000e\u0007\u0000\u0099\u0098\u0001\u0000\u0000\u0000\u0099"+
		"\u009a\u0001\u0000\u0000\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b"+
		"\u009d\u0005\t\u0000\u0000\u009c\u009e\u0003\u000e\u0007\u0000\u009d\u009c"+
		"\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u009f"+
		"\u0001\u0000\u0000\u0000\u009f\u00a1\u0005\t\u0000\u0000\u00a0\u00a2\u0003"+
		"\u000e\u0007\u0000\u00a1\u00a0\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001"+
		"\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3\u00a6\u0005"+
		"\u0004\u0000\u0000\u00a4\u00a7\u0003\f\u0006\u0000\u00a5\u00a7\u0003\n"+
		"\u0005\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a5\u0001\u0000"+
		"\u0000\u0000\u00a7\u00b8\u0001\u0000\u0000\u0000\u00a8\u00a9\u00056\u0000"+
		"\u0000\u00a9\u00aa\u0005\u0002\u0000\u0000\u00aa\u00ab\u0003\u000e\u0007"+
		"\u0000\u00ab\u00ac\u0005\u0004\u0000\u0000\u00ac\u00ad\u0003\n\u0005\u0000"+
		"\u00ad\u00b8\u0001\u0000\u0000\u0000\u00ae\u00af\u00057\u0000\u0000\u00af"+
		"\u00b8\u0005\t\u0000\u0000\u00b0\u00b1\u00058\u0000\u0000\u00b1\u00b8"+
		"\u0005\t\u0000\u0000\u00b2\u00b4\u00059\u0000\u0000\u00b3\u00b5\u0003"+
		"\u000e\u0007\u0000\u00b4\u00b3\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001"+
		"\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\u00b8\u0005"+
		"\t\u0000\u0000\u00b7~\u0001\u0000\u0000\u0000\u00b7\u007f\u0001\u0000"+
		"\u0000\u0000\u00b7\u0080\u0001\u0000\u0000\u0000\u00b7\u0083\u0001\u0000"+
		"\u0000\u0000\u00b7\u0086\u0001\u0000\u0000\u0000\u00b7\u0087\u0001\u0000"+
		"\u0000\u0000\u00b7\u0096\u0001\u0000\u0000\u0000\u00b7\u00a8\u0001\u0000"+
		"\u0000\u0000\u00b7\u00ae\u0001\u0000\u0000\u0000\u00b7\u00b0\u0001\u0000"+
		"\u0000\u0000\u00b7\u00b2\u0001\u0000\u0000\u0000\u00b8\r\u0001\u0000\u0000"+
		"\u0000\u00b9\u00ba\u0006\u0007\uffff\uffff\u0000\u00ba\u010d\u0003\u0016"+
		"\u000b\u0000\u00bb\u010d\u0005:\u0000\u0000\u00bc\u00bd\u0005:\u0000\u0000"+
		"\u00bd\u010d\u0005\u0001\u0000\u0000\u00be\u00bf\u0005:\u0000\u0000\u00bf"+
		"\u00c0\u0005\u0002\u0000\u0000\u00c0\u00c5\u0003\u000e\u0007\u0000\u00c1"+
		"\u00c2\u0005\u0003\u0000\u0000\u00c2\u00c4\u0003\u000e\u0007\u0000\u00c3"+
		"\u00c1\u0001\u0000\u0000\u0000\u00c4\u00c7\u0001\u0000\u0000\u0000\u00c5"+
		"\u00c3\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001\u0000\u0000\u0000\u00c6"+
		"\u00c8\u0001\u0000\u0000\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000\u00c8"+
		"\u00c9\u0005\u0004\u0000\u0000\u00c9\u010d\u0001\u0000\u0000\u0000\u00ca"+
		"\u010d\u00052\u0000\u0000\u00cb\u00cf\u0005:\u0000\u0000\u00cc\u00cd\u0005"+
		"2\u0000\u0000\u00cd\u00cf\u0005\f\u0000\u0000\u00ce\u00cb\u0001\u0000"+
		"\u0000\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001\u0000"+
		"\u0000\u0000\u00d0\u010d\u0005:\u0000\u0000\u00d1\u00d5\u0005:\u0000\u0000"+
		"\u00d2\u00d3\u00052\u0000\u0000\u00d3\u00d5\u0005\f\u0000\u0000\u00d4"+
		"\u00d1\u0001\u0000\u0000\u0000\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d5"+
		"\u00d6\u0001\u0000\u0000\u0000\u00d6\u00d7\u0005:\u0000\u0000\u00d7\u010d"+
		"\u0005\u0001\u0000\u0000\u00d8\u00dc\u0005:\u0000\u0000\u00d9\u00da\u0005"+
		"2\u0000\u0000\u00da\u00dc\u0005\f\u0000\u0000\u00db\u00d8\u0001\u0000"+
		"\u0000\u0000\u00db\u00d9\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000"+
		"\u0000\u0000\u00dd\u00de\u0005:\u0000\u0000\u00de\u00df\u0005\u0002\u0000"+
		"\u0000\u00df\u00e4\u0003\u000e\u0007\u0000\u00e0\u00e1\u0005\u0003\u0000"+
		"\u0000\u00e1\u00e3\u0003\u000e\u0007\u0000\u00e2\u00e0\u0001\u0000\u0000"+
		"\u0000\u00e3\u00e6\u0001\u0000\u0000\u0000\u00e4\u00e2\u0001\u0000\u0000"+
		"\u0000\u00e4\u00e5\u0001\u0000\u0000\u0000\u00e5\u00e7\u0001\u0000\u0000"+
		"\u0000\u00e6\u00e4\u0001\u0000\u0000\u0000\u00e7\u00e8\u0005\u0004\u0000"+
		"\u0000\u00e8\u010d\u0001\u0000\u0000\u0000\u00e9\u00ee\u0005:\u0000\u0000"+
		"\u00ea\u00eb\u0005\r\u0000\u0000\u00eb\u00ec\u0003\u000e\u0007\u0000\u00ec"+
		"\u00ed\u0005\u000e\u0000\u0000\u00ed\u00ef\u0001\u0000\u0000\u0000\u00ee"+
		"\u00ea\u0001\u0000\u0000\u0000\u00ef\u00f0\u0001\u0000\u0000\u0000\u00f0"+
		"\u00ee\u0001\u0000\u0000\u0000\u00f0\u00f1\u0001\u0000\u0000\u0000\u00f1"+
		"\u010d\u0001\u0000\u0000\u0000\u00f2\u00f3\u0005-\u0000\u0000\u00f3\u00f9"+
		"\u0003\u0010\b\u0000\u00f4\u00f6\u0005\r\u0000\u0000\u00f5\u00f7\u0003"+
		"\u000e\u0007\u0000\u00f6\u00f5\u0001\u0000\u0000\u0000\u00f6\u00f7\u0001"+
		"\u0000\u0000\u0000\u00f7\u00f8\u0001\u0000\u0000\u0000\u00f8\u00fa\u0005"+
		"\u000e\u0000\u0000\u00f9\u00f4\u0001\u0000\u0000\u0000\u00fa\u00fb\u0001"+
		"\u0000\u0000\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000\u00fb\u00fc\u0001"+
		"\u0000\u0000\u0000\u00fc\u010d\u0001\u0000\u0000\u0000\u00fd\u00fe\u0005"+
		"-\u0000\u0000\u00fe\u010d\u0003\u0010\b\u0000\u00ff\u0100\u0005-\u0000"+
		"\u0000\u0100\u0102\u0005:\u0000\u0000\u0101\u0103\u0005\u0001\u0000\u0000"+
		"\u0102\u0101\u0001\u0000\u0000\u0000\u0102\u0103\u0001\u0000\u0000\u0000"+
		"\u0103\u010d\u0001\u0000\u0000\u0000\u0104\u0105\u0007\u0000\u0000\u0000"+
		"\u0105\u010d\u0003\u000e\u0007\u0010\u0106\u0107\u0007\u0001\u0000\u0000"+
		"\u0107\u010d\u0003\u000e\u0007\u000f\u0108\u0109\u0005\u0002\u0000\u0000"+
		"\u0109\u010a\u0003\u000e\u0007\u0000\u010a\u010b\u0005\u0004\u0000\u0000"+
		"\u010b\u010d\u0001\u0000\u0000\u0000\u010c\u00b9\u0001\u0000\u0000\u0000"+
		"\u010c\u00bb\u0001\u0000\u0000\u0000\u010c\u00bc\u0001\u0000\u0000\u0000"+
		"\u010c\u00be\u0001\u0000\u0000\u0000\u010c\u00ca\u0001\u0000\u0000\u0000"+
		"\u010c\u00ce\u0001\u0000\u0000\u0000\u010c\u00d4\u0001\u0000\u0000\u0000"+
		"\u010c\u00db\u0001\u0000\u0000\u0000\u010c\u00e9\u0001\u0000\u0000\u0000"+
		"\u010c\u00f2\u0001\u0000\u0000\u0000\u010c\u00fd\u0001\u0000\u0000\u0000"+
		"\u010c\u00ff\u0001\u0000\u0000\u0000\u010c\u0104\u0001\u0000\u0000\u0000"+
		"\u010c\u0106\u0001\u0000\u0000\u0000\u010c\u0108\u0001\u0000\u0000\u0000"+
		"\u010d\u013c\u0001\u0000\u0000\u0000\u010e\u010f\n\u000e\u0000\u0000\u010f"+
		"\u0110\u0007\u0002\u0000\u0000\u0110\u013b\u0003\u000e\u0007\u000f\u0111"+
		"\u0112\n\r\u0000\u0000\u0112\u0113\u0005\u0016\u0000\u0000\u0113\u013b"+
		"\u0003\u000e\u0007\u000e\u0114\u0115\n\f\u0000\u0000\u0115\u0116\u0007"+
		"\u0003\u0000\u0000\u0116\u013b\u0003\u000e\u0007\r\u0117\u0118\n\u000b"+
		"\u0000\u0000\u0118\u0119\u0007\u0004\u0000\u0000\u0119\u013b\u0003\u000e"+
		"\u0007\f\u011a\u011b\n\n\u0000\u0000\u011b\u011c\u0007\u0005\u0000\u0000"+
		"\u011c\u013b\u0003\u000e\u0007\u000b\u011d\u011e\n\t\u0000\u0000\u011e"+
		"\u011f\u0007\u0006\u0000\u0000\u011f\u013b\u0003\u000e\u0007\n\u0120\u0121"+
		"\n\b\u0000\u0000\u0121\u0122\u0005 \u0000\u0000\u0122\u013b\u0003\u000e"+
		"\u0007\t\u0123\u0124\n\u0007\u0000\u0000\u0124\u0125\u0005!\u0000\u0000"+
		"\u0125\u013b\u0003\u000e\u0007\b\u0126\u0127\n\u0006\u0000\u0000\u0127"+
		"\u0128\u0005\"\u0000\u0000\u0128\u013b\u0003\u000e\u0007\u0007\u0129\u012a"+
		"\n\u0005\u0000\u0000\u012a\u012b\u0005#\u0000\u0000\u012b\u013b\u0003"+
		"\u000e\u0007\u0006\u012c\u012d\n\u0004\u0000\u0000\u012d\u012e\u0005$"+
		"\u0000\u0000\u012e\u013b\u0003\u000e\u0007\u0005\u012f\u0130\n\u0003\u0000"+
		"\u0000\u0130\u0131\u0005%\u0000\u0000\u0131\u0132\u0003\u000e\u0007\u0000"+
		"\u0132\u0133\u0005&\u0000\u0000\u0133\u0134\u0003\u000e\u0007\u0003\u0134"+
		"\u013b\u0001\u0000\u0000\u0000\u0135\u0136\n\u0002\u0000\u0000\u0136\u0137"+
		"\u0005\b\u0000\u0000\u0137\u013b\u0003\u000e\u0007\u0002\u0138\u0139\n"+
		"\u0011\u0000\u0000\u0139\u013b\u0007\u0000\u0000\u0000\u013a\u010e\u0001"+
		"\u0000\u0000\u0000\u013a\u0111\u0001\u0000\u0000\u0000\u013a\u0114\u0001"+
		"\u0000\u0000\u0000\u013a\u0117\u0001\u0000\u0000\u0000\u013a\u011a\u0001"+
		"\u0000\u0000\u0000\u013a\u011d\u0001\u0000\u0000\u0000\u013a\u0120\u0001"+
		"\u0000\u0000\u0000\u013a\u0123\u0001\u0000\u0000\u0000\u013a\u0126\u0001"+
		"\u0000\u0000\u0000\u013a\u0129\u0001\u0000\u0000\u0000\u013a\u012c\u0001"+
		"\u0000\u0000\u0000\u013a\u012f\u0001\u0000\u0000\u0000\u013a\u0135\u0001"+
		"\u0000\u0000\u0000\u013a\u0138\u0001\u0000\u0000\u0000\u013b\u013e\u0001"+
		"\u0000\u0000\u0000\u013c\u013a\u0001\u0000\u0000\u0000\u013c\u013d\u0001"+
		"\u0000\u0000\u0000\u013d\u000f\u0001\u0000\u0000\u0000\u013e\u013c\u0001"+
		"\u0000\u0000\u0000\u013f\u0140\u0007\u0007\u0000\u0000\u0140\u0011\u0001"+
		"\u0000\u0000\u0000\u0141\u0147\u0003\u0010\b\u0000\u0142\u0144\u0005\r"+
		"\u0000\u0000\u0143\u0145\u0005\'\u0000\u0000\u0144\u0143\u0001\u0000\u0000"+
		"\u0000\u0144\u0145\u0001\u0000\u0000\u0000\u0145\u0146\u0001\u0000\u0000"+
		"\u0000\u0146\u0148\u0005\u000e\u0000\u0000\u0147\u0142\u0001\u0000\u0000"+
		"\u0000\u0148\u0149\u0001\u0000\u0000\u0000\u0149\u0147\u0001\u0000\u0000"+
		"\u0000\u0149\u014a\u0001\u0000\u0000\u0000\u014a\u0013\u0001\u0000\u0000"+
		"\u0000\u014b\u014e\u0003\u0010\b\u0000\u014c\u014e\u0003\u0012\t\u0000"+
		"\u014d\u014b\u0001\u0000\u0000\u0000\u014d\u014c\u0001\u0000\u0000\u0000"+
		"\u014e\u0015\u0001\u0000\u0000\u0000\u014f\u0156\u0005\'\u0000\u0000\u0150"+
		"\u0156\u0005(\u0000\u0000\u0151\u0156\u00050\u0000\u0000\u0152\u0156\u0005"+
		"1\u0000\u0000\u0153\u0156\u0005/\u0000\u0000\u0154\u0156\u0003\u0018\f"+
		"\u0000\u0155\u014f\u0001\u0000\u0000\u0000\u0155\u0150\u0001\u0000\u0000"+
		"\u0000\u0155\u0151\u0001\u0000\u0000\u0000\u0155\u0152\u0001\u0000\u0000"+
		"\u0000\u0155\u0153\u0001\u0000\u0000\u0000\u0155\u0154\u0001\u0000\u0000"+
		"\u0000\u0156\u0017\u0001\u0000\u0000\u0000\u0157\u0160\u0005\u0006\u0000"+
		"\u0000\u0158\u015d\u0003\u0016\u000b\u0000\u0159\u015a\u0005\u0003\u0000"+
		"\u0000\u015a\u015c\u0003\u0016\u000b\u0000\u015b\u0159\u0001\u0000\u0000"+
		"\u0000\u015c\u015f\u0001\u0000\u0000\u0000\u015d\u015b\u0001\u0000\u0000"+
		"\u0000\u015d\u015e\u0001\u0000\u0000\u0000\u015e\u0161\u0001\u0000\u0000"+
		"\u0000\u015f\u015d\u0001\u0000\u0000\u0000\u0160\u0158\u0001\u0000\u0000"+
		"\u0000\u0160\u0161\u0001\u0000\u0000\u0000\u0161\u0162\u0001\u0000\u0000"+
		"\u0000\u0162\u0163\u0005\u000b\u0000\u0000\u0163\u0019\u0001\u0000\u0000"+
		"\u0000-\u001d %)0<BLNTXZ^djnx|\u008d\u0092\u0094\u0099\u009d\u00a1\u00a6"+
		"\u00b4\u00b7\u00c5\u00ce\u00d4\u00db\u00e4\u00f0\u00f6\u00fb\u0102\u010c"+
		"\u013a\u013c\u0144\u0149\u014d\u0155\u015d\u0160";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}