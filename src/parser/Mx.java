// Generated from F:/vscode/antlr-demo/compiler-2024/src/parser/Mx.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class Mx extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		VOID=1, BOOL=2, INT=3, STRING=4, NEW=5, CLASS=6, NULL=7, TRUE=8, FALSE=9, 
		THIS=10, IF=11, ELSE=12, FOR=13, WHILE=14, BREAK=15, CONTINUE=16, RETURN=17, 
		WS=18, CMT=19, LPAR=20, RPAR=21, LBKT=22, RBKT=23, LBCE=24, RBCE=25, QUES=26, 
		COLON=27, SEMI=28, COMMA=29, ADD=30, SUB=31, MUL=32, DIV=33, MOD=34, LT=35, 
		GT=36, LEQ=37, GEQ=38, EQ=39, NEQ=40, AND=41, OR=42, NOT=43, BLS=44, BRS=45, 
		BAND=46, BOR=47, BXOR=48, BNOT=49, ASSIGN=50, SINC=51, SDEC=52, MEMB=53, 
		INTCONST=54, STRINGCONST=55, FMTSTRPURE=56, FMTSTREND=57, FMTSTRBODY=58, 
		FMTSTRBGN=59, ID=60;
	public static final int
		RULE_prog = 0, RULE_def = 1, RULE_funcdef = 2, RULE_classdef = 3, RULE_vardef = 4, 
		RULE_stmts = 5, RULE_stmt = 6, RULE_expr = 7, RULE_rowexpr = 8, RULE_indbrackets = 9, 
		RULE_type = 10, RULE_atomtype = 11, RULE_arraytype = 12, RULE_literal = 13, 
		RULE_arrayliteral = 14, RULE_fmtstr = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "def", "funcdef", "classdef", "vardef", "stmts", "stmt", "expr", 
			"rowexpr", "indbrackets", "type", "atomtype", "arraytype", "literal", 
			"arrayliteral", "fmtstr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'void'", "'bool'", "'int'", "'string'", "'new'", "'class'", "'null'", 
			"'true'", "'false'", "'this'", "'if'", "'else'", "'for'", "'while'", 
			"'break'", "'continue'", "'return'", null, null, "'('", "')'", "'['", 
			"']'", "'{'", "'}'", "'?'", "':'", "';'", "','", "'+'", "'-'", "'*'", 
			"'/'", "'%'", "'<'", "'>'", "'<='", "'>='", "'=='", "'!='", "'&&'", "'||'", 
			"'!'", "'<<'", "'>>'", "'&'", "'|'", "'^'", "'~'", "'='", "'++'", "'--'", 
			"'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "VOID", "BOOL", "INT", "STRING", "NEW", "CLASS", "NULL", "TRUE", 
			"FALSE", "THIS", "IF", "ELSE", "FOR", "WHILE", "BREAK", "CONTINUE", "RETURN", 
			"WS", "CMT", "LPAR", "RPAR", "LBKT", "RBKT", "LBCE", "RBCE", "QUES", 
			"COLON", "SEMI", "COMMA", "ADD", "SUB", "MUL", "DIV", "MOD", "LT", "GT", 
			"LEQ", "GEQ", "EQ", "NEQ", "AND", "OR", "NOT", "BLS", "BRS", "BAND", 
			"BOR", "BXOR", "BNOT", "ASSIGN", "SINC", "SDEC", "MEMB", "INTCONST", 
			"STRINGCONST", "FMTSTRPURE", "FMTSTREND", "FMTSTRBODY", "FMTSTRBGN", 
			"ID"
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

	public Mx(TokenStream input) {
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
		public TerminalNode EOF() { return getToken(Mx.EOF, 0); }
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
			setState(33); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(32);
				def();
				}
				}
				setState(35); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1152921504606847070L) != 0) );
			setState(38);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(37);
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
			setState(43);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				funcdef();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				classdef();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(42);
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
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(Mx.ID); }
		public TerminalNode ID(int i) {
			return getToken(Mx.ID, i);
		}
		public TerminalNode LPAR() { return getToken(Mx.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(Mx.RPAR, 0); }
		public StmtsContext stmts() {
			return getRuleContext(StmtsContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(Mx.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Mx.COMMA, i);
		}
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
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			type();
			setState(46);
			match(ID);
			setState(47);
			match(LPAR);
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1152921504606847006L) != 0)) {
				{
				setState(48);
				type();
				setState(49);
				match(ID);
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(50);
					match(COMMA);
					setState(51);
					type();
					setState(52);
					match(ID);
					}
					}
					setState(58);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(61);
			match(RPAR);
			setState(62);
			stmts();
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
		public TerminalNode CLASS() { return getToken(Mx.CLASS, 0); }
		public List<TerminalNode> ID() { return getTokens(Mx.ID); }
		public TerminalNode ID(int i) {
			return getToken(Mx.ID, i);
		}
		public TerminalNode LBCE() { return getToken(Mx.LBCE, 0); }
		public TerminalNode RBCE() { return getToken(Mx.RBCE, 0); }
		public TerminalNode SEMI() { return getToken(Mx.SEMI, 0); }
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
		public TerminalNode LPAR() { return getToken(Mx.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(Mx.RPAR, 0); }
		public StmtsContext stmts() {
			return getRuleContext(StmtsContext.class,0);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(CLASS);
			setState(65);
			match(ID);
			setState(66);
			match(LBCE);
			setState(71);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(69);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						setState(67);
						vardef();
						}
						break;
					case 2:
						{
						setState(68);
						funcdef();
						}
						break;
					}
					} 
				}
				setState(73);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(74);
				match(ID);
				setState(75);
				match(LPAR);
				setState(76);
				match(RPAR);
				setState(77);
				stmts();
				}
				break;
			}
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1152921504606847006L) != 0)) {
				{
				setState(82);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(80);
					vardef();
					}
					break;
				case 2:
					{
					setState(81);
					funcdef();
					}
					break;
				}
				}
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(87);
			match(RBCE);
			setState(88);
			match(SEMI);
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
		public List<TerminalNode> ID() { return getTokens(Mx.ID); }
		public TerminalNode ID(int i) {
			return getToken(Mx.ID, i);
		}
		public TerminalNode SEMI() { return getToken(Mx.SEMI, 0); }
		public List<TerminalNode> ASSIGN() { return getTokens(Mx.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(Mx.ASSIGN, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Mx.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Mx.COMMA, i);
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
			setState(90);
			type();
			setState(91);
			match(ID);
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(92);
				match(ASSIGN);
				setState(93);
				expr(0);
				}
			}

			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(96);
				match(COMMA);
				setState(97);
				match(ID);
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(98);
					match(ASSIGN);
					setState(99);
					expr(0);
					}
				}

				}
				}
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(107);
			match(SEMI);
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
	public static class StmtsContext extends ParserRuleContext {
		public TerminalNode LBCE() { return getToken(Mx.LBCE, 0); }
		public TerminalNode RBCE() { return getToken(Mx.RBCE, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public StmtsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterStmts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitStmts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitStmts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtsContext stmts() throws RecognitionException {
		StmtsContext _localctx = new StmtsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_stmts);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(LBCE);
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1862810194398146494L) != 0)) {
				{
				{
				setState(110);
				stmt();
				}
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(116);
			match(RBCE);
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
		public StmtsContext stmts() {
			return getRuleContext(StmtsContext.class,0);
		}
		public VardefContext vardef() {
			return getRuleContext(VardefContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(Mx.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(Mx.SEMI, i);
		}
		public TerminalNode IF() { return getToken(Mx.IF, 0); }
		public TerminalNode LPAR() { return getToken(Mx.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(Mx.RPAR, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(Mx.ELSE, 0); }
		public TerminalNode FOR() { return getToken(Mx.FOR, 0); }
		public TerminalNode WHILE() { return getToken(Mx.WHILE, 0); }
		public TerminalNode BREAK() { return getToken(Mx.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(Mx.CONTINUE, 0); }
		public TerminalNode RETURN() { return getToken(Mx.RETURN, 0); }
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
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				stmts();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				vardef();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(120);
				expr(0);
				setState(121);
				match(SEMI);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(123);
				match(IF);
				setState(124);
				match(LPAR);
				setState(125);
				expr(0);
				setState(126);
				match(RPAR);
				setState(127);
				stmt();
				setState(130);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(128);
					match(ELSE);
					setState(129);
					stmt();
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(132);
				match(FOR);
				setState(133);
				match(LPAR);
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1862810194129455008L) != 0)) {
					{
					setState(134);
					expr(0);
					}
				}

				setState(137);
				match(SEMI);
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1862810194129455008L) != 0)) {
					{
					setState(138);
					expr(0);
					}
				}

				setState(141);
				match(SEMI);
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1862810194129455008L) != 0)) {
					{
					setState(142);
					expr(0);
					}
				}

				setState(145);
				match(RPAR);
				setState(148);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(146);
					stmt();
					}
					break;
				case 2:
					{
					setState(147);
					stmts();
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(150);
				match(WHILE);
				setState(151);
				match(LPAR);
				setState(152);
				expr(0);
				setState(153);
				match(RPAR);
				setState(156);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(154);
					stmt();
					}
					break;
				case 2:
					{
					setState(155);
					stmts();
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(158);
				match(BREAK);
				setState(159);
				match(SEMI);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(160);
				match(CONTINUE);
				setState(161);
				match(SEMI);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(162);
				match(RETURN);
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1862810194129455008L) != 0)) {
					{
					setState(163);
					expr(0);
					}
				}

				setState(166);
				match(SEMI);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(167);
				match(SEMI);
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
	public static class VarAccessContext extends ExprContext {
		public TerminalNode ID() { return getToken(Mx.ID, 0); }
		public VarAccessContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterVarAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitVarAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitVarAccess(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MemberFuncAccessContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode MEMB() { return getToken(Mx.MEMB, 0); }
		public TerminalNode ID() { return getToken(Mx.ID, 0); }
		public TerminalNode LPAR() { return getToken(Mx.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(Mx.RPAR, 0); }
		public RowexprContext rowexpr() {
			return getRuleContext(RowexprContext.class,0);
		}
		public MemberFuncAccessContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterMemberFuncAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitMemberFuncAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitMemberFuncAccess(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MemberObjAccessContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode MEMB() { return getToken(Mx.MEMB, 0); }
		public TerminalNode ID() { return getToken(Mx.ID, 0); }
		public MemberObjAccessContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterMemberObjAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitMemberObjAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitMemberObjAccess(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ThisPointerContext extends ExprContext {
		public TerminalNode THIS() { return getToken(Mx.THIS, 0); }
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
	public static class BinaryExpContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode DIV() { return getToken(Mx.DIV, 0); }
		public TerminalNode MUL() { return getToken(Mx.MUL, 0); }
		public TerminalNode MOD() { return getToken(Mx.MOD, 0); }
		public TerminalNode ADD() { return getToken(Mx.ADD, 0); }
		public TerminalNode SUB() { return getToken(Mx.SUB, 0); }
		public TerminalNode BLS() { return getToken(Mx.BLS, 0); }
		public TerminalNode BRS() { return getToken(Mx.BRS, 0); }
		public TerminalNode LT() { return getToken(Mx.LT, 0); }
		public TerminalNode GT() { return getToken(Mx.GT, 0); }
		public TerminalNode LEQ() { return getToken(Mx.LEQ, 0); }
		public TerminalNode GEQ() { return getToken(Mx.GEQ, 0); }
		public TerminalNode EQ() { return getToken(Mx.EQ, 0); }
		public TerminalNode NEQ() { return getToken(Mx.NEQ, 0); }
		public TerminalNode BAND() { return getToken(Mx.BAND, 0); }
		public TerminalNode BXOR() { return getToken(Mx.BXOR, 0); }
		public TerminalNode BOR() { return getToken(Mx.BOR, 0); }
		public TerminalNode AND() { return getToken(Mx.AND, 0); }
		public TerminalNode OR() { return getToken(Mx.OR, 0); }
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
	public static class FuncCallContext extends ExprContext {
		public TerminalNode ID() { return getToken(Mx.ID, 0); }
		public TerminalNode LPAR() { return getToken(Mx.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(Mx.RPAR, 0); }
		public RowexprContext rowexpr() {
			return getRuleContext(RowexprContext.class,0);
		}
		public FuncCallContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterFuncCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitFuncCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitFuncCall(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignExpContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(Mx.ASSIGN, 0); }
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
	public static class NewArrayContext extends ExprContext {
		public TerminalNode NEW() { return getToken(Mx.NEW, 0); }
		public AtomtypeContext atomtype() {
			return getRuleContext(AtomtypeContext.class,0);
		}
		public List<IndbracketsContext> indbrackets() {
			return getRuleContexts(IndbracketsContext.class);
		}
		public IndbracketsContext indbrackets(int i) {
			return getRuleContext(IndbracketsContext.class,i);
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
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode QUES() { return getToken(Mx.QUES, 0); }
		public TerminalNode COLON() { return getToken(Mx.COLON, 0); }
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
	public static class ArrayAccessContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LBKT() { return getToken(Mx.LBKT, 0); }
		public TerminalNode RBKT() { return getToken(Mx.RBKT, 0); }
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
	public static class PostSelfContext extends ExprContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SDEC() { return getToken(Mx.SDEC, 0); }
		public TerminalNode SINC() { return getToken(Mx.SINC, 0); }
		public PostSelfContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterPostSelf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitPostSelf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitPostSelf(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryExpContext extends ExprContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SUB() { return getToken(Mx.SUB, 0); }
		public TerminalNode NOT() { return getToken(Mx.NOT, 0); }
		public TerminalNode BNOT() { return getToken(Mx.BNOT, 0); }
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
	public static class FormatStringContext extends ExprContext {
		public FmtstrContext fmtstr() {
			return getRuleContext(FmtstrContext.class,0);
		}
		public FormatStringContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterFormatString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitFormatString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitFormatString(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NewClassContext extends ExprContext {
		public TerminalNode NEW() { return getToken(Mx.NEW, 0); }
		public TerminalNode ID() { return getToken(Mx.ID, 0); }
		public TerminalNode LPAR() { return getToken(Mx.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(Mx.RPAR, 0); }
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
		public TerminalNode LPAR() { return getToken(Mx.LPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(Mx.RPAR, 0); }
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
	@SuppressWarnings("CheckReturnValue")
	public static class PreSelfContext extends ExprContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SDEC() { return getToken(Mx.SDEC, 0); }
		public TerminalNode SINC() { return getToken(Mx.SINC, 0); }
		public PreSelfContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterPreSelf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitPreSelf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitPreSelf(this);
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
			setState(202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				_localctx = new ParenthesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(171);
				match(LPAR);
				setState(172);
				expr(0);
				setState(173);
				match(RPAR);
				}
				break;
			case 2:
				{
				_localctx = new FuncCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(175);
				match(ID);
				setState(176);
				match(LPAR);
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1862810194129455008L) != 0)) {
					{
					setState(177);
					rowexpr();
					}
				}

				setState(180);
				match(RPAR);
				}
				break;
			case 3:
				{
				_localctx = new PostSelfContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(181);
				((PostSelfContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==SINC || _la==SDEC) ) {
					((PostSelfContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(182);
				expr(21);
				}
				break;
			case 4:
				{
				_localctx = new UnaryExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(183);
				((UnaryExpContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 571748193927168L) != 0)) ) {
					((UnaryExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(184);
				expr(20);
				}
				break;
			case 5:
				{
				_localctx = new NewArrayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(185);
				match(NEW);
				setState(186);
				atomtype();
				setState(188); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(187);
						indbrackets();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(190); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 6:
				{
				_localctx = new NewClassContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(192);
				match(NEW);
				setState(193);
				match(ID);
				setState(196);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(194);
					match(LPAR);
					setState(195);
					match(RPAR);
					}
					break;
				}
				}
				break;
			case 7:
				{
				_localctx = new ThisPointerContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(198);
				match(THIS);
				}
				break;
			case 8:
				{
				_localctx = new VarAccessContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(199);
				match(ID);
				}
				break;
			case 9:
				{
				_localctx = new ConstantContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(200);
				literal();
				}
				break;
			case 10:
				{
				_localctx = new FormatStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(201);
				fmtstr();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(266);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(264);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryExpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(204);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(205);
						((BinaryExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((BinaryExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(206);
						expr(20);
						}
						break;
					case 2:
						{
						_localctx = new BinaryExpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(207);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(208);
						((BinaryExpContext)_localctx).op = match(MOD);
						setState(209);
						expr(19);
						}
						break;
					case 3:
						{
						_localctx = new BinaryExpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(210);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(211);
						((BinaryExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((BinaryExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(212);
						expr(18);
						}
						break;
					case 4:
						{
						_localctx = new BinaryExpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(213);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(214);
						((BinaryExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==BLS || _la==BRS) ) {
							((BinaryExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(215);
						expr(17);
						}
						break;
					case 5:
						{
						_localctx = new BinaryExpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(216);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(217);
						((BinaryExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 515396075520L) != 0)) ) {
							((BinaryExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(218);
						expr(16);
						}
						break;
					case 6:
						{
						_localctx = new BinaryExpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(219);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(220);
						((BinaryExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQ || _la==NEQ) ) {
							((BinaryExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(221);
						expr(15);
						}
						break;
					case 7:
						{
						_localctx = new BinaryExpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(222);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(223);
						((BinaryExpContext)_localctx).op = match(BAND);
						setState(224);
						expr(14);
						}
						break;
					case 8:
						{
						_localctx = new BinaryExpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(225);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(226);
						((BinaryExpContext)_localctx).op = match(BXOR);
						setState(227);
						expr(13);
						}
						break;
					case 9:
						{
						_localctx = new BinaryExpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(228);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(229);
						((BinaryExpContext)_localctx).op = match(BOR);
						setState(230);
						expr(12);
						}
						break;
					case 10:
						{
						_localctx = new BinaryExpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(231);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(232);
						((BinaryExpContext)_localctx).op = match(AND);
						setState(233);
						expr(11);
						}
						break;
					case 11:
						{
						_localctx = new BinaryExpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(234);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(235);
						((BinaryExpContext)_localctx).op = match(OR);
						setState(236);
						expr(10);
						}
						break;
					case 12:
						{
						_localctx = new TernaryExpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(237);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(238);
						((TernaryExpContext)_localctx).op = match(QUES);
						setState(239);
						expr(0);
						setState(240);
						((TernaryExpContext)_localctx).op = match(COLON);
						setState(241);
						expr(8);
						}
						break;
					case 13:
						{
						_localctx = new AssignExpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(243);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(244);
						((AssignExpContext)_localctx).op = match(ASSIGN);
						setState(245);
						expr(7);
						}
						break;
					case 14:
						{
						_localctx = new MemberFuncAccessContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(246);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(247);
						match(MEMB);
						setState(248);
						match(ID);
						setState(249);
						match(LPAR);
						setState(251);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1862810194129455008L) != 0)) {
							{
							setState(250);
							rowexpr();
							}
						}

						setState(253);
						match(RPAR);
						}
						break;
					case 15:
						{
						_localctx = new MemberObjAccessContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(254);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(255);
						match(MEMB);
						setState(256);
						match(ID);
						}
						break;
					case 16:
						{
						_localctx = new ArrayAccessContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(257);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(258);
						match(LBKT);
						setState(259);
						expr(0);
						setState(260);
						match(RBKT);
						}
						break;
					case 17:
						{
						_localctx = new PreSelfContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(262);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(263);
						((PreSelfContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==SINC || _la==SDEC) ) {
							((PreSelfContext)_localctx).op = (Token)_errHandler.recoverInline(this);
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
				setState(268);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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
	public static class RowexprContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Mx.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Mx.COMMA, i);
		}
		public RowexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterRowexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitRowexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitRowexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowexprContext rowexpr() throws RecognitionException {
		RowexprContext _localctx = new RowexprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_rowexpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			expr(0);
			setState(274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(270);
				match(COMMA);
				setState(271);
				expr(0);
				}
				}
				setState(276);
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
	public static class IndbracketsContext extends ParserRuleContext {
		public TerminalNode LBKT() { return getToken(Mx.LBKT, 0); }
		public TerminalNode RBKT() { return getToken(Mx.RBKT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IndbracketsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indbrackets; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterIndbrackets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitIndbrackets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitIndbrackets(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndbracketsContext indbrackets() throws RecognitionException {
		IndbracketsContext _localctx = new IndbracketsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_indbrackets);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(LBKT);
			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1862810194129455008L) != 0)) {
				{
				setState(278);
				expr(0);
				}
			}

			setState(281);
			match(RBKT);
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
			setState(285);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(283);
				atomtype();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(284);
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
	public static class AtomtypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(Mx.INT, 0); }
		public TerminalNode BOOL() { return getToken(Mx.BOOL, 0); }
		public TerminalNode STRING() { return getToken(Mx.STRING, 0); }
		public TerminalNode ID() { return getToken(Mx.ID, 0); }
		public TerminalNode VOID() { return getToken(Mx.VOID, 0); }
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
		enterRule(_localctx, 22, RULE_atomtype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1152921504606847006L) != 0)) ) {
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
		public List<TerminalNode> LBKT() { return getTokens(Mx.LBKT); }
		public TerminalNode LBKT(int i) {
			return getToken(Mx.LBKT, i);
		}
		public List<TerminalNode> RBKT() { return getTokens(Mx.RBKT); }
		public TerminalNode RBKT(int i) {
			return getToken(Mx.RBKT, i);
		}
		public List<TerminalNode> INTCONST() { return getTokens(Mx.INTCONST); }
		public TerminalNode INTCONST(int i) {
			return getToken(Mx.INTCONST, i);
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
		enterRule(_localctx, 24, RULE_arraytype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			atomtype();
			setState(295); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(290);
				match(LBKT);
				setState(292);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INTCONST) {
					{
					setState(291);
					match(INTCONST);
					}
				}

				setState(294);
				match(RBKT);
				}
				}
				setState(297); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LBKT );
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
		public TerminalNode INTCONST() { return getToken(Mx.INTCONST, 0); }
		public TerminalNode STRINGCONST() { return getToken(Mx.STRINGCONST, 0); }
		public TerminalNode TRUE() { return getToken(Mx.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(Mx.FALSE, 0); }
		public TerminalNode NULL() { return getToken(Mx.NULL, 0); }
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
		enterRule(_localctx, 26, RULE_literal);
		int _la;
		try {
			setState(304);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTCONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(299);
				match(INTCONST);
				}
				break;
			case STRINGCONST:
				enterOuterAlt(_localctx, 2);
				{
				setState(300);
				match(STRINGCONST);
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(301);
				_la = _input.LA(1);
				if ( !(_la==TRUE || _la==FALSE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 4);
				{
				setState(302);
				match(NULL);
				}
				break;
			case LBCE:
				enterOuterAlt(_localctx, 5);
				{
				setState(303);
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
		public TerminalNode LBCE() { return getToken(Mx.LBCE, 0); }
		public TerminalNode RBCE() { return getToken(Mx.RBCE, 0); }
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Mx.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Mx.COMMA, i);
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
		enterRule(_localctx, 28, RULE_arrayliteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(LBCE);
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 54043195545224064L) != 0)) {
				{
				setState(307);
				literal();
				setState(312);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(308);
					match(COMMA);
					setState(309);
					literal();
					}
					}
					setState(314);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(317);
			match(RBCE);
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
	public static class FmtstrContext extends ParserRuleContext {
		public TerminalNode FMTSTRBGN() { return getToken(Mx.FMTSTRBGN, 0); }
		public TerminalNode FMTSTREND() { return getToken(Mx.FMTSTREND, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> FMTSTRBODY() { return getTokens(Mx.FMTSTRBODY); }
		public TerminalNode FMTSTRBODY(int i) {
			return getToken(Mx.FMTSTRBODY, i);
		}
		public TerminalNode FMTSTRPURE() { return getToken(Mx.FMTSTRPURE, 0); }
		public FmtstrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fmtstr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).enterFmtstr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxListener ) ((MxListener)listener).exitFmtstr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitFmtstr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FmtstrContext fmtstr() throws RecognitionException {
		FmtstrContext _localctx = new FmtstrContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_fmtstr);
		int _la;
		try {
			setState(331);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FMTSTRBGN:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(319);
				match(FMTSTRBGN);
				{
				setState(320);
				expr(0);
				setState(325);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==FMTSTRBODY) {
					{
					{
					setState(321);
					match(FMTSTRBODY);
					setState(322);
					expr(0);
					}
					}
					setState(327);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(328);
				match(FMTSTREND);
				}
				}
				break;
			case FMTSTRPURE:
				enterOuterAlt(_localctx, 2);
				{
				setState(330);
				match(FMTSTRPURE);
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
			return precpred(_ctx, 19);
		case 1:
			return precpred(_ctx, 18);
		case 2:
			return precpred(_ctx, 17);
		case 3:
			return precpred(_ctx, 16);
		case 4:
			return precpred(_ctx, 15);
		case 5:
			return precpred(_ctx, 14);
		case 6:
			return precpred(_ctx, 13);
		case 7:
			return precpred(_ctx, 12);
		case 8:
			return precpred(_ctx, 11);
		case 9:
			return precpred(_ctx, 10);
		case 10:
			return precpred(_ctx, 9);
		case 11:
			return precpred(_ctx, 8);
		case 12:
			return precpred(_ctx, 7);
		case 13:
			return precpred(_ctx, 26);
		case 14:
			return precpred(_ctx, 25);
		case 15:
			return precpred(_ctx, 24);
		case 16:
			return precpred(_ctx, 22);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001<\u014e\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0001\u0000\u0004\u0000\"\b\u0000\u000b\u0000\f\u0000#\u0001\u0000\u0003"+
		"\u0000\'\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001,\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u00027\b\u0002\n\u0002\f\u0002"+
		":\t\u0002\u0003\u0002<\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003F\b"+
		"\u0003\n\u0003\f\u0003I\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003O\b\u0003\u0001\u0003\u0001\u0003\u0005\u0003S\b\u0003"+
		"\n\u0003\f\u0003V\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004_\b\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004e\b\u0004\u0005\u0004"+
		"g\b\u0004\n\u0004\f\u0004j\t\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0005\u0005p\b\u0005\n\u0005\f\u0005s\t\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006\u0083\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006\u0088\b\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u008c\b"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0090\b\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006\u0095\b\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u009d\b\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006\u00a5\b\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00a9\b\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007\u00b3\b\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0004\u0007\u00bd\b\u0007\u000b\u0007\f\u0007\u00be\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00c5\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00cb\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00fc\b\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u0109"+
		"\b\u0007\n\u0007\f\u0007\u010c\t\u0007\u0001\b\u0001\b\u0001\b\u0005\b"+
		"\u0111\b\b\n\b\f\b\u0114\t\b\u0001\t\u0001\t\u0003\t\u0118\b\t\u0001\t"+
		"\u0001\t\u0001\n\u0001\n\u0003\n\u011e\b\n\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0003\f\u0125\b\f\u0001\f\u0004\f\u0128\b\f\u000b\f"+
		"\f\f\u0129\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u0131\b\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u0137\b\u000e\n"+
		"\u000e\f\u000e\u013a\t\u000e\u0003\u000e\u013c\b\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u0144"+
		"\b\u000f\n\u000f\f\u000f\u0147\t\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0003\u000f\u014c\b\u000f\u0001\u000f\u0000\u0001\u000e\u0010\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		"\u0000\t\u0001\u000034\u0003\u0000\u001f\u001f++11\u0001\u0000 !\u0001"+
		"\u0000\u001e\u001f\u0001\u0000,-\u0001\u0000#&\u0001\u0000\'(\u0002\u0000"+
		"\u0001\u0004<<\u0001\u0000\b\t\u0187\u0000!\u0001\u0000\u0000\u0000\u0002"+
		"+\u0001\u0000\u0000\u0000\u0004-\u0001\u0000\u0000\u0000\u0006@\u0001"+
		"\u0000\u0000\u0000\bZ\u0001\u0000\u0000\u0000\nm\u0001\u0000\u0000\u0000"+
		"\f\u00a8\u0001\u0000\u0000\u0000\u000e\u00ca\u0001\u0000\u0000\u0000\u0010"+
		"\u010d\u0001\u0000\u0000\u0000\u0012\u0115\u0001\u0000\u0000\u0000\u0014"+
		"\u011d\u0001\u0000\u0000\u0000\u0016\u011f\u0001\u0000\u0000\u0000\u0018"+
		"\u0121\u0001\u0000\u0000\u0000\u001a\u0130\u0001\u0000\u0000\u0000\u001c"+
		"\u0132\u0001\u0000\u0000\u0000\u001e\u014b\u0001\u0000\u0000\u0000 \""+
		"\u0003\u0002\u0001\u0000! \u0001\u0000\u0000\u0000\"#\u0001\u0000\u0000"+
		"\u0000#!\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000$&\u0001\u0000"+
		"\u0000\u0000%\'\u0005\u0000\u0000\u0001&%\u0001\u0000\u0000\u0000&\'\u0001"+
		"\u0000\u0000\u0000\'\u0001\u0001\u0000\u0000\u0000(,\u0003\u0004\u0002"+
		"\u0000),\u0003\u0006\u0003\u0000*,\u0003\b\u0004\u0000+(\u0001\u0000\u0000"+
		"\u0000+)\u0001\u0000\u0000\u0000+*\u0001\u0000\u0000\u0000,\u0003\u0001"+
		"\u0000\u0000\u0000-.\u0003\u0014\n\u0000./\u0005<\u0000\u0000/;\u0005"+
		"\u0014\u0000\u000001\u0003\u0014\n\u000018\u0005<\u0000\u000023\u0005"+
		"\u001d\u0000\u000034\u0003\u0014\n\u000045\u0005<\u0000\u000057\u0001"+
		"\u0000\u0000\u000062\u0001\u0000\u0000\u00007:\u0001\u0000\u0000\u0000"+
		"86\u0001\u0000\u0000\u000089\u0001\u0000\u0000\u00009<\u0001\u0000\u0000"+
		"\u0000:8\u0001\u0000\u0000\u0000;0\u0001\u0000\u0000\u0000;<\u0001\u0000"+
		"\u0000\u0000<=\u0001\u0000\u0000\u0000=>\u0005\u0015\u0000\u0000>?\u0003"+
		"\n\u0005\u0000?\u0005\u0001\u0000\u0000\u0000@A\u0005\u0006\u0000\u0000"+
		"AB\u0005<\u0000\u0000BG\u0005\u0018\u0000\u0000CF\u0003\b\u0004\u0000"+
		"DF\u0003\u0004\u0002\u0000EC\u0001\u0000\u0000\u0000ED\u0001\u0000\u0000"+
		"\u0000FI\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000GH\u0001\u0000"+
		"\u0000\u0000HN\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000JK\u0005"+
		"<\u0000\u0000KL\u0005\u0014\u0000\u0000LM\u0005\u0015\u0000\u0000MO\u0003"+
		"\n\u0005\u0000NJ\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000OT\u0001"+
		"\u0000\u0000\u0000PS\u0003\b\u0004\u0000QS\u0003\u0004\u0002\u0000RP\u0001"+
		"\u0000\u0000\u0000RQ\u0001\u0000\u0000\u0000SV\u0001\u0000\u0000\u0000"+
		"TR\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000UW\u0001\u0000\u0000"+
		"\u0000VT\u0001\u0000\u0000\u0000WX\u0005\u0019\u0000\u0000XY\u0005\u001c"+
		"\u0000\u0000Y\u0007\u0001\u0000\u0000\u0000Z[\u0003\u0014\n\u0000[^\u0005"+
		"<\u0000\u0000\\]\u00052\u0000\u0000]_\u0003\u000e\u0007\u0000^\\\u0001"+
		"\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_h\u0001\u0000\u0000\u0000"+
		"`a\u0005\u001d\u0000\u0000ad\u0005<\u0000\u0000bc\u00052\u0000\u0000c"+
		"e\u0003\u000e\u0007\u0000db\u0001\u0000\u0000\u0000de\u0001\u0000\u0000"+
		"\u0000eg\u0001\u0000\u0000\u0000f`\u0001\u0000\u0000\u0000gj\u0001\u0000"+
		"\u0000\u0000hf\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000ik\u0001"+
		"\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000kl\u0005\u001c\u0000\u0000"+
		"l\t\u0001\u0000\u0000\u0000mq\u0005\u0018\u0000\u0000np\u0003\f\u0006"+
		"\u0000on\u0001\u0000\u0000\u0000ps\u0001\u0000\u0000\u0000qo\u0001\u0000"+
		"\u0000\u0000qr\u0001\u0000\u0000\u0000rt\u0001\u0000\u0000\u0000sq\u0001"+
		"\u0000\u0000\u0000tu\u0005\u0019\u0000\u0000u\u000b\u0001\u0000\u0000"+
		"\u0000v\u00a9\u0003\n\u0005\u0000w\u00a9\u0003\b\u0004\u0000xy\u0003\u000e"+
		"\u0007\u0000yz\u0005\u001c\u0000\u0000z\u00a9\u0001\u0000\u0000\u0000"+
		"{|\u0005\u000b\u0000\u0000|}\u0005\u0014\u0000\u0000}~\u0003\u000e\u0007"+
		"\u0000~\u007f\u0005\u0015\u0000\u0000\u007f\u0082\u0003\f\u0006\u0000"+
		"\u0080\u0081\u0005\f\u0000\u0000\u0081\u0083\u0003\f\u0006\u0000\u0082"+
		"\u0080\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083"+
		"\u00a9\u0001\u0000\u0000\u0000\u0084\u0085\u0005\r\u0000\u0000\u0085\u0087"+
		"\u0005\u0014\u0000\u0000\u0086\u0088\u0003\u000e\u0007\u0000\u0087\u0086"+
		"\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088\u0089"+
		"\u0001\u0000\u0000\u0000\u0089\u008b\u0005\u001c\u0000\u0000\u008a\u008c"+
		"\u0003\u000e\u0007\u0000\u008b\u008a\u0001\u0000\u0000\u0000\u008b\u008c"+
		"\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d\u008f"+
		"\u0005\u001c\u0000\u0000\u008e\u0090\u0003\u000e\u0007\u0000\u008f\u008e"+
		"\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u0091"+
		"\u0001\u0000\u0000\u0000\u0091\u0094\u0005\u0015\u0000\u0000\u0092\u0095"+
		"\u0003\f\u0006\u0000\u0093\u0095\u0003\n\u0005\u0000\u0094\u0092\u0001"+
		"\u0000\u0000\u0000\u0094\u0093\u0001\u0000\u0000\u0000\u0095\u00a9\u0001"+
		"\u0000\u0000\u0000\u0096\u0097\u0005\u000e\u0000\u0000\u0097\u0098\u0005"+
		"\u0014\u0000\u0000\u0098\u0099\u0003\u000e\u0007\u0000\u0099\u009c\u0005"+
		"\u0015\u0000\u0000\u009a\u009d\u0003\f\u0006\u0000\u009b\u009d\u0003\n"+
		"\u0005\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009c\u009b\u0001\u0000"+
		"\u0000\u0000\u009d\u00a9\u0001\u0000\u0000\u0000\u009e\u009f\u0005\u000f"+
		"\u0000\u0000\u009f\u00a9\u0005\u001c\u0000\u0000\u00a0\u00a1\u0005\u0010"+
		"\u0000\u0000\u00a1\u00a9\u0005\u001c\u0000\u0000\u00a2\u00a4\u0005\u0011"+
		"\u0000\u0000\u00a3\u00a5\u0003\u000e\u0007\u0000\u00a4\u00a3\u0001\u0000"+
		"\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000"+
		"\u0000\u0000\u00a6\u00a9\u0005\u001c\u0000\u0000\u00a7\u00a9\u0005\u001c"+
		"\u0000\u0000\u00a8v\u0001\u0000\u0000\u0000\u00a8w\u0001\u0000\u0000\u0000"+
		"\u00a8x\u0001\u0000\u0000\u0000\u00a8{\u0001\u0000\u0000\u0000\u00a8\u0084"+
		"\u0001\u0000\u0000\u0000\u00a8\u0096\u0001\u0000\u0000\u0000\u00a8\u009e"+
		"\u0001\u0000\u0000\u0000\u00a8\u00a0\u0001\u0000\u0000\u0000\u00a8\u00a2"+
		"\u0001\u0000\u0000\u0000\u00a8\u00a7\u0001\u0000\u0000\u0000\u00a9\r\u0001"+
		"\u0000\u0000\u0000\u00aa\u00ab\u0006\u0007\uffff\uffff\u0000\u00ab\u00ac"+
		"\u0005\u0014\u0000\u0000\u00ac\u00ad\u0003\u000e\u0007\u0000\u00ad\u00ae"+
		"\u0005\u0015\u0000\u0000\u00ae\u00cb\u0001\u0000\u0000\u0000\u00af\u00b0"+
		"\u0005<\u0000\u0000\u00b0\u00b2\u0005\u0014\u0000\u0000\u00b1\u00b3\u0003"+
		"\u0010\b\u0000\u00b2\u00b1\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000"+
		"\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4\u00cb\u0005\u0015"+
		"\u0000\u0000\u00b5\u00b6\u0007\u0000\u0000\u0000\u00b6\u00cb\u0003\u000e"+
		"\u0007\u0015\u00b7\u00b8\u0007\u0001\u0000\u0000\u00b8\u00cb\u0003\u000e"+
		"\u0007\u0014\u00b9\u00ba\u0005\u0005\u0000\u0000\u00ba\u00bc\u0003\u0016"+
		"\u000b\u0000\u00bb\u00bd\u0003\u0012\t\u0000\u00bc\u00bb\u0001\u0000\u0000"+
		"\u0000\u00bd\u00be\u0001\u0000\u0000\u0000\u00be\u00bc\u0001\u0000\u0000"+
		"\u0000\u00be\u00bf\u0001\u0000\u0000\u0000\u00bf\u00cb\u0001\u0000\u0000"+
		"\u0000\u00c0\u00c1\u0005\u0005\u0000\u0000\u00c1\u00c4\u0005<\u0000\u0000"+
		"\u00c2\u00c3\u0005\u0014\u0000\u0000\u00c3\u00c5\u0005\u0015\u0000\u0000"+
		"\u00c4\u00c2\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000"+
		"\u00c5\u00cb\u0001\u0000\u0000\u0000\u00c6\u00cb\u0005\n\u0000\u0000\u00c7"+
		"\u00cb\u0005<\u0000\u0000\u00c8\u00cb\u0003\u001a\r\u0000\u00c9\u00cb"+
		"\u0003\u001e\u000f\u0000\u00ca\u00aa\u0001\u0000\u0000\u0000\u00ca\u00af"+
		"\u0001\u0000\u0000\u0000\u00ca\u00b5\u0001\u0000\u0000\u0000\u00ca\u00b7"+
		"\u0001\u0000\u0000\u0000\u00ca\u00b9\u0001\u0000\u0000\u0000\u00ca\u00c0"+
		"\u0001\u0000\u0000\u0000\u00ca\u00c6\u0001\u0000\u0000\u0000\u00ca\u00c7"+
		"\u0001\u0000\u0000\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000\u00ca\u00c9"+
		"\u0001\u0000\u0000\u0000\u00cb\u010a\u0001\u0000\u0000\u0000\u00cc\u00cd"+
		"\n\u0013\u0000\u0000\u00cd\u00ce\u0007\u0002\u0000\u0000\u00ce\u0109\u0003"+
		"\u000e\u0007\u0014\u00cf\u00d0\n\u0012\u0000\u0000\u00d0\u00d1\u0005\""+
		"\u0000\u0000\u00d1\u0109\u0003\u000e\u0007\u0013\u00d2\u00d3\n\u0011\u0000"+
		"\u0000\u00d3\u00d4\u0007\u0003\u0000\u0000\u00d4\u0109\u0003\u000e\u0007"+
		"\u0012\u00d5\u00d6\n\u0010\u0000\u0000\u00d6\u00d7\u0007\u0004\u0000\u0000"+
		"\u00d7\u0109\u0003\u000e\u0007\u0011\u00d8\u00d9\n\u000f\u0000\u0000\u00d9"+
		"\u00da\u0007\u0005\u0000\u0000\u00da\u0109\u0003\u000e\u0007\u0010\u00db"+
		"\u00dc\n\u000e\u0000\u0000\u00dc\u00dd\u0007\u0006\u0000\u0000\u00dd\u0109"+
		"\u0003\u000e\u0007\u000f\u00de\u00df\n\r\u0000\u0000\u00df\u00e0\u0005"+
		".\u0000\u0000\u00e0\u0109\u0003\u000e\u0007\u000e\u00e1\u00e2\n\f\u0000"+
		"\u0000\u00e2\u00e3\u00050\u0000\u0000\u00e3\u0109\u0003\u000e\u0007\r"+
		"\u00e4\u00e5\n\u000b\u0000\u0000\u00e5\u00e6\u0005/\u0000\u0000\u00e6"+
		"\u0109\u0003\u000e\u0007\f\u00e7\u00e8\n\n\u0000\u0000\u00e8\u00e9\u0005"+
		")\u0000\u0000\u00e9\u0109\u0003\u000e\u0007\u000b\u00ea\u00eb\n\t\u0000"+
		"\u0000\u00eb\u00ec\u0005*\u0000\u0000\u00ec\u0109\u0003\u000e\u0007\n"+
		"\u00ed\u00ee\n\b\u0000\u0000\u00ee\u00ef\u0005\u001a\u0000\u0000\u00ef"+
		"\u00f0\u0003\u000e\u0007\u0000\u00f0\u00f1\u0005\u001b\u0000\u0000\u00f1"+
		"\u00f2\u0003\u000e\u0007\b\u00f2\u0109\u0001\u0000\u0000\u0000\u00f3\u00f4"+
		"\n\u0007\u0000\u0000\u00f4\u00f5\u00052\u0000\u0000\u00f5\u0109\u0003"+
		"\u000e\u0007\u0007\u00f6\u00f7\n\u001a\u0000\u0000\u00f7\u00f8\u00055"+
		"\u0000\u0000\u00f8\u00f9\u0005<\u0000\u0000\u00f9\u00fb\u0005\u0014\u0000"+
		"\u0000\u00fa\u00fc\u0003\u0010\b\u0000\u00fb\u00fa\u0001\u0000\u0000\u0000"+
		"\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc\u00fd\u0001\u0000\u0000\u0000"+
		"\u00fd\u0109\u0005\u0015\u0000\u0000\u00fe\u00ff\n\u0019\u0000\u0000\u00ff"+
		"\u0100\u00055\u0000\u0000\u0100\u0109\u0005<\u0000\u0000\u0101\u0102\n"+
		"\u0018\u0000\u0000\u0102\u0103\u0005\u0016\u0000\u0000\u0103\u0104\u0003"+
		"\u000e\u0007\u0000\u0104\u0105\u0005\u0017\u0000\u0000\u0105\u0109\u0001"+
		"\u0000\u0000\u0000\u0106\u0107\n\u0016\u0000\u0000\u0107\u0109\u0007\u0000"+
		"\u0000\u0000\u0108\u00cc\u0001\u0000\u0000\u0000\u0108\u00cf\u0001\u0000"+
		"\u0000\u0000\u0108\u00d2\u0001\u0000\u0000\u0000\u0108\u00d5\u0001\u0000"+
		"\u0000\u0000\u0108\u00d8\u0001\u0000\u0000\u0000\u0108\u00db\u0001\u0000"+
		"\u0000\u0000\u0108\u00de\u0001\u0000\u0000\u0000\u0108\u00e1\u0001\u0000"+
		"\u0000\u0000\u0108\u00e4\u0001\u0000\u0000\u0000\u0108\u00e7\u0001\u0000"+
		"\u0000\u0000\u0108\u00ea\u0001\u0000\u0000\u0000\u0108\u00ed\u0001\u0000"+
		"\u0000\u0000\u0108\u00f3\u0001\u0000\u0000\u0000\u0108\u00f6\u0001\u0000"+
		"\u0000\u0000\u0108\u00fe\u0001\u0000\u0000\u0000\u0108\u0101\u0001\u0000"+
		"\u0000\u0000\u0108\u0106\u0001\u0000\u0000\u0000\u0109\u010c\u0001\u0000"+
		"\u0000\u0000\u010a\u0108\u0001\u0000\u0000\u0000\u010a\u010b\u0001\u0000"+
		"\u0000\u0000\u010b\u000f\u0001\u0000\u0000\u0000\u010c\u010a\u0001\u0000"+
		"\u0000\u0000\u010d\u0112\u0003\u000e\u0007\u0000\u010e\u010f\u0005\u001d"+
		"\u0000\u0000\u010f\u0111\u0003\u000e\u0007\u0000\u0110\u010e\u0001\u0000"+
		"\u0000\u0000\u0111\u0114\u0001\u0000\u0000\u0000\u0112\u0110\u0001\u0000"+
		"\u0000\u0000\u0112\u0113\u0001\u0000\u0000\u0000\u0113\u0011\u0001\u0000"+
		"\u0000\u0000\u0114\u0112\u0001\u0000\u0000\u0000\u0115\u0117\u0005\u0016"+
		"\u0000\u0000\u0116\u0118\u0003\u000e\u0007\u0000\u0117\u0116\u0001\u0000"+
		"\u0000\u0000\u0117\u0118\u0001\u0000\u0000\u0000\u0118\u0119\u0001\u0000"+
		"\u0000\u0000\u0119\u011a\u0005\u0017\u0000\u0000\u011a\u0013\u0001\u0000"+
		"\u0000\u0000\u011b\u011e\u0003\u0016\u000b\u0000\u011c\u011e\u0003\u0018"+
		"\f\u0000\u011d\u011b\u0001\u0000\u0000\u0000\u011d\u011c\u0001\u0000\u0000"+
		"\u0000\u011e\u0015\u0001\u0000\u0000\u0000\u011f\u0120\u0007\u0007\u0000"+
		"\u0000\u0120\u0017\u0001\u0000\u0000\u0000\u0121\u0127\u0003\u0016\u000b"+
		"\u0000\u0122\u0124\u0005\u0016\u0000\u0000\u0123\u0125\u00056\u0000\u0000"+
		"\u0124\u0123\u0001\u0000\u0000\u0000\u0124\u0125\u0001\u0000\u0000\u0000"+
		"\u0125\u0126\u0001\u0000\u0000\u0000\u0126\u0128\u0005\u0017\u0000\u0000"+
		"\u0127\u0122\u0001\u0000\u0000\u0000\u0128\u0129\u0001\u0000\u0000\u0000"+
		"\u0129\u0127\u0001\u0000\u0000\u0000\u0129\u012a\u0001\u0000\u0000\u0000"+
		"\u012a\u0019\u0001\u0000\u0000\u0000\u012b\u0131\u00056\u0000\u0000\u012c"+
		"\u0131\u00057\u0000\u0000\u012d\u0131\u0007\b\u0000\u0000\u012e\u0131"+
		"\u0005\u0007\u0000\u0000\u012f\u0131\u0003\u001c\u000e\u0000\u0130\u012b"+
		"\u0001\u0000\u0000\u0000\u0130\u012c\u0001\u0000\u0000\u0000\u0130\u012d"+
		"\u0001\u0000\u0000\u0000\u0130\u012e\u0001\u0000\u0000\u0000\u0130\u012f"+
		"\u0001\u0000\u0000\u0000\u0131\u001b\u0001\u0000\u0000\u0000\u0132\u013b"+
		"\u0005\u0018\u0000\u0000\u0133\u0138\u0003\u001a\r\u0000\u0134\u0135\u0005"+
		"\u001d\u0000\u0000\u0135\u0137\u0003\u001a\r\u0000\u0136\u0134\u0001\u0000"+
		"\u0000\u0000\u0137\u013a\u0001\u0000\u0000\u0000\u0138\u0136\u0001\u0000"+
		"\u0000\u0000\u0138\u0139\u0001\u0000\u0000\u0000\u0139\u013c\u0001\u0000"+
		"\u0000\u0000\u013a\u0138\u0001\u0000\u0000\u0000\u013b\u0133\u0001\u0000"+
		"\u0000\u0000\u013b\u013c\u0001\u0000\u0000\u0000\u013c\u013d\u0001\u0000"+
		"\u0000\u0000\u013d\u013e\u0005\u0019\u0000\u0000\u013e\u001d\u0001\u0000"+
		"\u0000\u0000\u013f\u0140\u0005;\u0000\u0000\u0140\u0145\u0003\u000e\u0007"+
		"\u0000\u0141\u0142\u0005:\u0000\u0000\u0142\u0144\u0003\u000e\u0007\u0000"+
		"\u0143\u0141\u0001\u0000\u0000\u0000\u0144\u0147\u0001\u0000\u0000\u0000"+
		"\u0145\u0143\u0001\u0000\u0000\u0000\u0145\u0146\u0001\u0000\u0000\u0000"+
		"\u0146\u0148\u0001\u0000\u0000\u0000\u0147\u0145\u0001\u0000\u0000\u0000"+
		"\u0148\u0149\u00059\u0000\u0000\u0149\u014c\u0001\u0000\u0000\u0000\u014a"+
		"\u014c\u00058\u0000\u0000\u014b\u013f\u0001\u0000\u0000\u0000\u014b\u014a"+
		"\u0001\u0000\u0000\u0000\u014c\u001f\u0001\u0000\u0000\u0000\'#&+8;EG"+
		"NRT^dhq\u0082\u0087\u008b\u008f\u0094\u009c\u00a4\u00a8\u00b2\u00be\u00c4"+
		"\u00ca\u00fb\u0108\u010a\u0112\u0117\u011d\u0124\u0129\u0130\u0138\u013b"+
		"\u0145\u014b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}