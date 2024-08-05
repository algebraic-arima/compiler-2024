// Generated from MxParser.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MxParserParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

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
		INTCONST=54, STRINGCONST=55, FMTSTRPURE=56, FMTSTRBGN=57, FMTSTREND=58, 
		FMTSTRBODY=59, ID=60;
	public static final int
		RULE_prog = 0, RULE_def = 1, RULE_funcdef = 2, RULE_classdef = 3, RULE_vardef = 4, 
		RULE_stmts = 5, RULE_stmt = 6, RULE_expr = 7, RULE_rowexpr = 8, RULE_indbrackets = 9, 
		RULE_type = 10, RULE_atomtype = 11, RULE_arraytype = 12, RULE_literal = 13, 
		RULE_arrayliteral = 14, RULE_fmtstr = 15;
	public static final String[] ruleNames = {
		"prog", "def", "funcdef", "classdef", "vardef", "stmts", "stmt", "expr", 
		"rowexpr", "indbrackets", "type", "atomtype", "arraytype", "literal", 
		"arrayliteral", "fmtstr"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'void'", "'bool'", "'int'", "'string'", "'new'", "'class'", "'null'", 
		"'true'", "'false'", "'this'", "'if'", "'else'", "'for'", "'while'", "'break'", 
		"'continue'", "'return'", null, null, "'('", "')'", "'['", "']'", "'{'", 
		"'}'", "'?'", "':'", "';'", "','", "'+'", "'-'", "'*'", "'/'", "'%'", 
		"'<'", "'>'", "'<='", "'>='", "'=='", "'!='", "'&&'", "'||'", "'!'", "'<<'", 
		"'>>'", "'&'", "'|'", "'^'", "'~'", "'='", "'++'", "'--'", "'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "VOID", "BOOL", "INT", "STRING", "NEW", "CLASS", "NULL", "TRUE", 
		"FALSE", "THIS", "IF", "ELSE", "FOR", "WHILE", "BREAK", "CONTINUE", "RETURN", 
		"WS", "CMT", "LPAR", "RPAR", "LBKT", "RBKT", "LBCE", "RBCE", "QUES", "COLON", 
		"SEMI", "COMMA", "ADD", "SUB", "MUL", "DIV", "MOD", "LT", "GT", "LEQ", 
		"GEQ", "EQ", "NEQ", "AND", "OR", "NOT", "BLS", "BRS", "BAND", "BOR", "BXOR", 
		"BNOT", "ASSIGN", "SINC", "SDEC", "MEMB", "INTCONST", "STRINGCONST", "FMTSTRPURE", 
		"FMTSTRBGN", "FMTSTREND", "FMTSTRBODY", "ID"
	};
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
	public String getGrammarFileName() { return "MxParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MxParserParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public List<DefContext> def() {
			return getRuleContexts(DefContext.class);
		}
		public DefContext def(int i) {
			return getRuleContext(DefContext.class,i);
		}
		public TerminalNode EOF() { return getToken(MxParserParser.EOF, 0); }
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxParserVisitor ) return ((MxParserVisitor<? extends T>)visitor).visitProg(this);
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
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOID) | (1L << BOOL) | (1L << INT) | (1L << STRING) | (1L << CLASS) | (1L << ID))) != 0) );
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
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).enterDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).exitDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxParserVisitor ) return ((MxParserVisitor<? extends T>)visitor).visitDef(this);
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

	public static class FuncdefContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(MxParserParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MxParserParser.ID, i);
		}
		public TerminalNode LPAR() { return getToken(MxParserParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(MxParserParser.RPAR, 0); }
		public StmtsContext stmts() {
			return getRuleContext(StmtsContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(MxParserParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MxParserParser.COMMA, i);
		}
		public FuncdefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcdef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).enterFuncdef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).exitFuncdef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxParserVisitor ) return ((MxParserVisitor<? extends T>)visitor).visitFuncdef(this);
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
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOID) | (1L << BOOL) | (1L << INT) | (1L << STRING) | (1L << ID))) != 0)) {
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

	public static class ClassdefContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(MxParserParser.CLASS, 0); }
		public List<TerminalNode> ID() { return getTokens(MxParserParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MxParserParser.ID, i);
		}
		public TerminalNode LBCE() { return getToken(MxParserParser.LBCE, 0); }
		public TerminalNode RBCE() { return getToken(MxParserParser.RBCE, 0); }
		public TerminalNode SEMI() { return getToken(MxParserParser.SEMI, 0); }
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
		public TerminalNode LPAR() { return getToken(MxParserParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(MxParserParser.RPAR, 0); }
		public StmtsContext stmts() {
			return getRuleContext(StmtsContext.class,0);
		}
		public ClassdefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classdef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).enterClassdef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).exitClassdef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxParserVisitor ) return ((MxParserVisitor<? extends T>)visitor).visitClassdef(this);
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOID) | (1L << BOOL) | (1L << INT) | (1L << STRING) | (1L << ID))) != 0)) {
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

	public static class VardefContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(MxParserParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MxParserParser.ID, i);
		}
		public TerminalNode SEMI() { return getToken(MxParserParser.SEMI, 0); }
		public List<TerminalNode> ASSIGN() { return getTokens(MxParserParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(MxParserParser.ASSIGN, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MxParserParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MxParserParser.COMMA, i);
		}
		public VardefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).enterVardef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).exitVardef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxParserVisitor ) return ((MxParserVisitor<? extends T>)visitor).visitVardef(this);
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

	public static class StmtsContext extends ParserRuleContext {
		public TerminalNode LBCE() { return getToken(MxParserParser.LBCE, 0); }
		public TerminalNode RBCE() { return getToken(MxParserParser.RBCE, 0); }
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
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).enterStmts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).exitStmts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxParserVisitor ) return ((MxParserVisitor<? extends T>)visitor).visitStmts(this);
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOID) | (1L << BOOL) | (1L << INT) | (1L << STRING) | (1L << NEW) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << THIS) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << BREAK) | (1L << CONTINUE) | (1L << RETURN) | (1L << LPAR) | (1L << LBCE) | (1L << SEMI) | (1L << SUB) | (1L << NOT) | (1L << BNOT) | (1L << SINC) | (1L << SDEC) | (1L << INTCONST) | (1L << STRINGCONST) | (1L << FMTSTRPURE) | (1L << FMTSTRBGN) | (1L << ID))) != 0)) {
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
		public List<TerminalNode> SEMI() { return getTokens(MxParserParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(MxParserParser.SEMI, i);
		}
		public TerminalNode IF() { return getToken(MxParserParser.IF, 0); }
		public TerminalNode LPAR() { return getToken(MxParserParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(MxParserParser.RPAR, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(MxParserParser.ELSE, 0); }
		public TerminalNode FOR() { return getToken(MxParserParser.FOR, 0); }
		public TerminalNode WHILE() { return getToken(MxParserParser.WHILE, 0); }
		public TerminalNode BREAK() { return getToken(MxParserParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(MxParserParser.CONTINUE, 0); }
		public TerminalNode RETURN() { return getToken(MxParserParser.RETURN, 0); }
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxParserVisitor ) return ((MxParserVisitor<? extends T>)visitor).visitStmt(this);
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
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << THIS) | (1L << LPAR) | (1L << LBCE) | (1L << SUB) | (1L << NOT) | (1L << BNOT) | (1L << SINC) | (1L << SDEC) | (1L << INTCONST) | (1L << STRINGCONST) | (1L << FMTSTRPURE) | (1L << FMTSTRBGN) | (1L << ID))) != 0)) {
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
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << THIS) | (1L << LPAR) | (1L << LBCE) | (1L << SUB) | (1L << NOT) | (1L << BNOT) | (1L << SINC) | (1L << SDEC) | (1L << INTCONST) | (1L << STRINGCONST) | (1L << FMTSTRPURE) | (1L << FMTSTRBGN) | (1L << ID))) != 0)) {
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
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << THIS) | (1L << LPAR) | (1L << LBCE) | (1L << SUB) | (1L << NOT) | (1L << BNOT) | (1L << SINC) | (1L << SDEC) | (1L << INTCONST) | (1L << STRINGCONST) | (1L << FMTSTRPURE) | (1L << FMTSTRBGN) | (1L << ID))) != 0)) {
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
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << THIS) | (1L << LPAR) | (1L << LBCE) | (1L << SUB) | (1L << NOT) | (1L << BNOT) | (1L << SINC) | (1L << SDEC) | (1L << INTCONST) | (1L << STRINGCONST) | (1L << FMTSTRPURE) | (1L << FMTSTRBGN) | (1L << ID))) != 0)) {
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
	public static class ConstantContext extends ExprContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ConstantContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxParserVisitor ) return ((MxParserVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarAccessContext extends ExprContext {
		public TerminalNode ID() { return getToken(MxParserParser.ID, 0); }
		public VarAccessContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).enterVarAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).exitVarAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxParserVisitor ) return ((MxParserVisitor<? extends T>)visitor).visitVarAccess(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MemberFuncAccessContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode MEMB() { return getToken(MxParserParser.MEMB, 0); }
		public TerminalNode ID() { return getToken(MxParserParser.ID, 0); }
		public TerminalNode LPAR() { return getToken(MxParserParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(MxParserParser.RPAR, 0); }
		public RowexprContext rowexpr() {
			return getRuleContext(RowexprContext.class,0);
		}
		public MemberFuncAccessContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).enterMemberFuncAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).exitMemberFuncAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxParserVisitor ) return ((MxParserVisitor<? extends T>)visitor).visitMemberFuncAccess(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MemberObjAccessContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode MEMB() { return getToken(MxParserParser.MEMB, 0); }
		public TerminalNode ID() { return getToken(MxParserParser.ID, 0); }
		public MemberObjAccessContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).enterMemberObjAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).exitMemberObjAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxParserVisitor ) return ((MxParserVisitor<? extends T>)visitor).visitMemberObjAccess(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ThisPointerContext extends ExprContext {
		public TerminalNode THIS() { return getToken(MxParserParser.THIS, 0); }
		public ThisPointerContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).enterThisPointer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).exitThisPointer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxParserVisitor ) return ((MxParserVisitor<? extends T>)visitor).visitThisPointer(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinaryExpContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode DIV() { return getToken(MxParserParser.DIV, 0); }
		public TerminalNode MUL() { return getToken(MxParserParser.MUL, 0); }
		public TerminalNode MOD() { return getToken(MxParserParser.MOD, 0); }
		public TerminalNode ADD() { return getToken(MxParserParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(MxParserParser.SUB, 0); }
		public TerminalNode BLS() { return getToken(MxParserParser.BLS, 0); }
		public TerminalNode BRS() { return getToken(MxParserParser.BRS, 0); }
		public TerminalNode LT() { return getToken(MxParserParser.LT, 0); }
		public TerminalNode GT() { return getToken(MxParserParser.GT, 0); }
		public TerminalNode LEQ() { return getToken(MxParserParser.LEQ, 0); }
		public TerminalNode GEQ() { return getToken(MxParserParser.GEQ, 0); }
		public TerminalNode EQ() { return getToken(MxParserParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(MxParserParser.NEQ, 0); }
		public TerminalNode BAND() { return getToken(MxParserParser.BAND, 0); }
		public TerminalNode BXOR() { return getToken(MxParserParser.BXOR, 0); }
		public TerminalNode BOR() { return getToken(MxParserParser.BOR, 0); }
		public TerminalNode AND() { return getToken(MxParserParser.AND, 0); }
		public TerminalNode OR() { return getToken(MxParserParser.OR, 0); }
		public BinaryExpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).enterBinaryExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).exitBinaryExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxParserVisitor ) return ((MxParserVisitor<? extends T>)visitor).visitBinaryExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncCallContext extends ExprContext {
		public TerminalNode ID() { return getToken(MxParserParser.ID, 0); }
		public TerminalNode LPAR() { return getToken(MxParserParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(MxParserParser.RPAR, 0); }
		public RowexprContext rowexpr() {
			return getRuleContext(RowexprContext.class,0);
		}
		public FuncCallContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).enterFuncCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).exitFuncCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxParserVisitor ) return ((MxParserVisitor<? extends T>)visitor).visitFuncCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignExpContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(MxParserParser.ASSIGN, 0); }
		public AssignExpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).enterAssignExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).exitAssignExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxParserVisitor ) return ((MxParserVisitor<? extends T>)visitor).visitAssignExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NewArrayContext extends ExprContext {
		public TerminalNode NEW() { return getToken(MxParserParser.NEW, 0); }
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
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).enterNewArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).exitNewArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxParserVisitor ) return ((MxParserVisitor<? extends T>)visitor).visitNewArray(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TernaryExpContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode QUES() { return getToken(MxParserParser.QUES, 0); }
		public TerminalNode COLON() { return getToken(MxParserParser.COLON, 0); }
		public TernaryExpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).enterTernaryExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).exitTernaryExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxParserVisitor ) return ((MxParserVisitor<? extends T>)visitor).visitTernaryExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayAccessContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LBKT() { return getToken(MxParserParser.LBKT, 0); }
		public TerminalNode RBKT() { return getToken(MxParserParser.RBKT, 0); }
		public ArrayAccessContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).enterArrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).exitArrayAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxParserVisitor ) return ((MxParserVisitor<? extends T>)visitor).visitArrayAccess(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PostSelfContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SDEC() { return getToken(MxParserParser.SDEC, 0); }
		public TerminalNode SINC() { return getToken(MxParserParser.SINC, 0); }
		public PostSelfContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).enterPostSelf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).exitPostSelf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxParserVisitor ) return ((MxParserVisitor<? extends T>)visitor).visitPostSelf(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryExpContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SUB() { return getToken(MxParserParser.SUB, 0); }
		public TerminalNode NOT() { return getToken(MxParserParser.NOT, 0); }
		public TerminalNode BNOT() { return getToken(MxParserParser.BNOT, 0); }
		public UnaryExpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).enterUnaryExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).exitUnaryExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxParserVisitor ) return ((MxParserVisitor<? extends T>)visitor).visitUnaryExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FormatStringContext extends ExprContext {
		public FmtstrContext fmtstr() {
			return getRuleContext(FmtstrContext.class,0);
		}
		public FormatStringContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).enterFormatString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).exitFormatString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxParserVisitor ) return ((MxParserVisitor<? extends T>)visitor).visitFormatString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NewClassContext extends ExprContext {
		public TerminalNode NEW() { return getToken(MxParserParser.NEW, 0); }
		public TerminalNode ID() { return getToken(MxParserParser.ID, 0); }
		public TerminalNode LPAR() { return getToken(MxParserParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(MxParserParser.RPAR, 0); }
		public NewClassContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).enterNewClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).exitNewClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxParserVisitor ) return ((MxParserVisitor<? extends T>)visitor).visitNewClass(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesesContext extends ExprContext {
		public TerminalNode LPAR() { return getToken(MxParserParser.LPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(MxParserParser.RPAR, 0); }
		public ParenthesesContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).enterParentheses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).exitParentheses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxParserVisitor ) return ((MxParserVisitor<? extends T>)visitor).visitParentheses(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PreSelfContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SDEC() { return getToken(MxParserParser.SDEC, 0); }
		public TerminalNode SINC() { return getToken(MxParserParser.SINC, 0); }
		public PreSelfContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).enterPreSelf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).exitPreSelf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxParserVisitor ) return ((MxParserVisitor<? extends T>)visitor).visitPreSelf(this);
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
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << THIS) | (1L << LPAR) | (1L << LBCE) | (1L << SUB) | (1L << NOT) | (1L << BNOT) | (1L << SINC) | (1L << SDEC) | (1L << INTCONST) | (1L << STRINGCONST) | (1L << FMTSTRPURE) | (1L << FMTSTRBGN) | (1L << ID))) != 0)) {
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
				_la = _input.LA(1);
				if ( !(_la==SINC || _la==SDEC) ) {
				_errHandler.recoverInline(this);
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
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUB) | (1L << NOT) | (1L << BNOT))) != 0)) ) {
				_errHandler.recoverInline(this);
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
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
						_errHandler.recoverInline(this);
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
						match(MOD);
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
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
						_errHandler.recoverInline(this);
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
						_la = _input.LA(1);
						if ( !(_la==BLS || _la==BRS) ) {
						_errHandler.recoverInline(this);
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
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << GT) | (1L << LEQ) | (1L << GEQ))) != 0)) ) {
						_errHandler.recoverInline(this);
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
						_la = _input.LA(1);
						if ( !(_la==EQ || _la==NEQ) ) {
						_errHandler.recoverInline(this);
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
						match(BAND);
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
						match(BXOR);
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
						match(BOR);
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
						match(AND);
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
						match(OR);
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
						match(QUES);
						setState(239);
						expr(0);
						setState(240);
						match(COLON);
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
						match(ASSIGN);
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
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << THIS) | (1L << LPAR) | (1L << LBCE) | (1L << SUB) | (1L << NOT) | (1L << BNOT) | (1L << SINC) | (1L << SDEC) | (1L << INTCONST) | (1L << STRINGCONST) | (1L << FMTSTRPURE) | (1L << FMTSTRBGN) | (1L << ID))) != 0)) {
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
						_la = _input.LA(1);
						if ( !(_la==SINC || _la==SDEC) ) {
						_errHandler.recoverInline(this);
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

	public static class RowexprContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MxParserParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MxParserParser.COMMA, i);
		}
		public RowexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).enterRowexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).exitRowexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxParserVisitor ) return ((MxParserVisitor<? extends T>)visitor).visitRowexpr(this);
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

	public static class IndbracketsContext extends ParserRuleContext {
		public TerminalNode LBKT() { return getToken(MxParserParser.LBKT, 0); }
		public TerminalNode RBKT() { return getToken(MxParserParser.RBKT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IndbracketsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indbrackets; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).enterIndbrackets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).exitIndbrackets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxParserVisitor ) return ((MxParserVisitor<? extends T>)visitor).visitIndbrackets(this);
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
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << THIS) | (1L << LPAR) | (1L << LBCE) | (1L << SUB) | (1L << NOT) | (1L << BNOT) | (1L << SINC) | (1L << SDEC) | (1L << INTCONST) | (1L << STRINGCONST) | (1L << FMTSTRPURE) | (1L << FMTSTRBGN) | (1L << ID))) != 0)) {
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
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxParserVisitor ) return ((MxParserVisitor<? extends T>)visitor).visitType(this);
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

	public static class AtomtypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(MxParserParser.INT, 0); }
		public TerminalNode BOOL() { return getToken(MxParserParser.BOOL, 0); }
		public TerminalNode STRING() { return getToken(MxParserParser.STRING, 0); }
		public TerminalNode ID() { return getToken(MxParserParser.ID, 0); }
		public TerminalNode VOID() { return getToken(MxParserParser.VOID, 0); }
		public AtomtypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomtype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).enterAtomtype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).exitAtomtype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxParserVisitor ) return ((MxParserVisitor<? extends T>)visitor).visitAtomtype(this);
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
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOID) | (1L << BOOL) | (1L << INT) | (1L << STRING) | (1L << ID))) != 0)) ) {
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

	public static class ArraytypeContext extends ParserRuleContext {
		public AtomtypeContext atomtype() {
			return getRuleContext(AtomtypeContext.class,0);
		}
		public List<TerminalNode> LBKT() { return getTokens(MxParserParser.LBKT); }
		public TerminalNode LBKT(int i) {
			return getToken(MxParserParser.LBKT, i);
		}
		public List<TerminalNode> RBKT() { return getTokens(MxParserParser.RBKT); }
		public TerminalNode RBKT(int i) {
			return getToken(MxParserParser.RBKT, i);
		}
		public List<TerminalNode> INTCONST() { return getTokens(MxParserParser.INTCONST); }
		public TerminalNode INTCONST(int i) {
			return getToken(MxParserParser.INTCONST, i);
		}
		public ArraytypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arraytype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).enterArraytype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).exitArraytype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxParserVisitor ) return ((MxParserVisitor<? extends T>)visitor).visitArraytype(this);
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode INTCONST() { return getToken(MxParserParser.INTCONST, 0); }
		public TerminalNode STRINGCONST() { return getToken(MxParserParser.STRINGCONST, 0); }
		public TerminalNode TRUE() { return getToken(MxParserParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(MxParserParser.FALSE, 0); }
		public TerminalNode NULL() { return getToken(MxParserParser.NULL, 0); }
		public ArrayliteralContext arrayliteral() {
			return getRuleContext(ArrayliteralContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxParserVisitor ) return ((MxParserVisitor<? extends T>)visitor).visitLiteral(this);
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

	public static class ArrayliteralContext extends ParserRuleContext {
		public TerminalNode LBCE() { return getToken(MxParserParser.LBCE, 0); }
		public TerminalNode RBCE() { return getToken(MxParserParser.RBCE, 0); }
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MxParserParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MxParserParser.COMMA, i);
		}
		public ArrayliteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayliteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).enterArrayliteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).exitArrayliteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxParserVisitor ) return ((MxParserVisitor<? extends T>)visitor).visitArrayliteral(this);
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
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << LBCE) | (1L << INTCONST) | (1L << STRINGCONST))) != 0)) {
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

	public static class FmtstrContext extends ParserRuleContext {
		public TerminalNode FMTSTRBGN() { return getToken(MxParserParser.FMTSTRBGN, 0); }
		public TerminalNode FMTSTREND() { return getToken(MxParserParser.FMTSTREND, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> FMTSTRBODY() { return getTokens(MxParserParser.FMTSTRBODY); }
		public TerminalNode FMTSTRBODY(int i) {
			return getToken(MxParserParser.FMTSTRBODY, i);
		}
		public TerminalNode FMTSTRPURE() { return getToken(MxParserParser.FMTSTRPURE, 0); }
		public FmtstrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fmtstr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).enterFmtstr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxParserListener ) ((MxParserListener)listener).exitFmtstr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxParserVisitor ) return ((MxParserVisitor<? extends T>)visitor).visitFmtstr(this);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3>\u0150\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\6\2$\n"+
		"\2\r\2\16\2%\3\2\5\2)\n\2\3\3\3\3\3\3\5\3.\n\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\7\49\n\4\f\4\16\4<\13\4\5\4>\n\4\3\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\5\7\5H\n\5\f\5\16\5K\13\5\3\5\3\5\3\5\3\5\5\5Q\n\5\3\5\3\5\7\5"+
		"U\n\5\f\5\16\5X\13\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\5\6a\n\6\3\6\3\6\3\6"+
		"\3\6\5\6g\n\6\7\6i\n\6\f\6\16\6l\13\6\3\6\3\6\3\7\3\7\7\7r\n\7\f\7\16"+
		"\7u\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0085"+
		"\n\b\3\b\3\b\3\b\5\b\u008a\n\b\3\b\3\b\5\b\u008e\n\b\3\b\3\b\5\b\u0092"+
		"\n\b\3\b\3\b\3\b\5\b\u0097\n\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u009f\n\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\5\b\u00a7\n\b\3\b\3\b\5\b\u00ab\n\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\5\t\u00b5\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\6\t"+
		"\u00bf\n\t\r\t\16\t\u00c0\3\t\3\t\3\t\3\t\5\t\u00c7\n\t\3\t\3\t\3\t\3"+
		"\t\5\t\u00cd\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00fe"+
		"\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u010b\n\t\f\t\16"+
		"\t\u010e\13\t\3\n\3\n\3\n\7\n\u0113\n\n\f\n\16\n\u0116\13\n\3\13\3\13"+
		"\5\13\u011a\n\13\3\13\3\13\3\f\3\f\5\f\u0120\n\f\3\r\3\r\3\16\3\16\3\16"+
		"\5\16\u0127\n\16\3\16\6\16\u012a\n\16\r\16\16\16\u012b\3\17\3\17\3\17"+
		"\3\17\3\17\5\17\u0133\n\17\3\20\3\20\3\20\3\20\7\20\u0139\n\20\f\20\16"+
		"\20\u013c\13\20\5\20\u013e\n\20\3\20\3\20\3\21\3\21\3\21\3\21\7\21\u0146"+
		"\n\21\f\21\16\21\u0149\13\21\3\21\3\21\3\21\5\21\u014e\n\21\3\21\2\3\20"+
		"\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\13\3\2\65\66\5\2!!--\63"+
		"\63\3\2\"#\3\2 !\3\2./\3\2%(\3\2)*\4\2\3\6>>\3\2\n\13\2\u0189\2#\3\2\2"+
		"\2\4-\3\2\2\2\6/\3\2\2\2\bB\3\2\2\2\n\\\3\2\2\2\fo\3\2\2\2\16\u00aa\3"+
		"\2\2\2\20\u00cc\3\2\2\2\22\u010f\3\2\2\2\24\u0117\3\2\2\2\26\u011f\3\2"+
		"\2\2\30\u0121\3\2\2\2\32\u0123\3\2\2\2\34\u0132\3\2\2\2\36\u0134\3\2\2"+
		"\2 \u014d\3\2\2\2\"$\5\4\3\2#\"\3\2\2\2$%\3\2\2\2%#\3\2\2\2%&\3\2\2\2"+
		"&(\3\2\2\2\')\7\2\2\3(\'\3\2\2\2()\3\2\2\2)\3\3\2\2\2*.\5\6\4\2+.\5\b"+
		"\5\2,.\5\n\6\2-*\3\2\2\2-+\3\2\2\2-,\3\2\2\2.\5\3\2\2\2/\60\5\26\f\2\60"+
		"\61\7>\2\2\61=\7\26\2\2\62\63\5\26\f\2\63:\7>\2\2\64\65\7\37\2\2\65\66"+
		"\5\26\f\2\66\67\7>\2\2\679\3\2\2\28\64\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3"+
		"\2\2\2;>\3\2\2\2<:\3\2\2\2=\62\3\2\2\2=>\3\2\2\2>?\3\2\2\2?@\7\27\2\2"+
		"@A\5\f\7\2A\7\3\2\2\2BC\7\b\2\2CD\7>\2\2DI\7\32\2\2EH\5\n\6\2FH\5\6\4"+
		"\2GE\3\2\2\2GF\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JP\3\2\2\2KI\3\2\2"+
		"\2LM\7>\2\2MN\7\26\2\2NO\7\27\2\2OQ\5\f\7\2PL\3\2\2\2PQ\3\2\2\2QV\3\2"+
		"\2\2RU\5\n\6\2SU\5\6\4\2TR\3\2\2\2TS\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2"+
		"\2\2WY\3\2\2\2XV\3\2\2\2YZ\7\33\2\2Z[\7\36\2\2[\t\3\2\2\2\\]\5\26\f\2"+
		"]`\7>\2\2^_\7\64\2\2_a\5\20\t\2`^\3\2\2\2`a\3\2\2\2aj\3\2\2\2bc\7\37\2"+
		"\2cf\7>\2\2de\7\64\2\2eg\5\20\t\2fd\3\2\2\2fg\3\2\2\2gi\3\2\2\2hb\3\2"+
		"\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2km\3\2\2\2lj\3\2\2\2mn\7\36\2\2n\13"+
		"\3\2\2\2os\7\32\2\2pr\5\16\b\2qp\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2"+
		"tv\3\2\2\2us\3\2\2\2vw\7\33\2\2w\r\3\2\2\2x\u00ab\5\f\7\2y\u00ab\5\n\6"+
		"\2z{\5\20\t\2{|\7\36\2\2|\u00ab\3\2\2\2}~\7\r\2\2~\177\7\26\2\2\177\u0080"+
		"\5\20\t\2\u0080\u0081\7\27\2\2\u0081\u0084\5\16\b\2\u0082\u0083\7\16\2"+
		"\2\u0083\u0085\5\16\b\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085"+
		"\u00ab\3\2\2\2\u0086\u0087\7\17\2\2\u0087\u0089\7\26\2\2\u0088\u008a\5"+
		"\20\t\2\u0089\u0088\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\3\2\2\2\u008b"+
		"\u008d\7\36\2\2\u008c\u008e\5\20\t\2\u008d\u008c\3\2\2\2\u008d\u008e\3"+
		"\2\2\2\u008e\u008f\3\2\2\2\u008f\u0091\7\36\2\2\u0090\u0092\5\20\t\2\u0091"+
		"\u0090\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0096\7\27"+
		"\2\2\u0094\u0097\5\16\b\2\u0095\u0097\5\f\7\2\u0096\u0094\3\2\2\2\u0096"+
		"\u0095\3\2\2\2\u0097\u00ab\3\2\2\2\u0098\u0099\7\20\2\2\u0099\u009a\7"+
		"\26\2\2\u009a\u009b\5\20\t\2\u009b\u009e\7\27\2\2\u009c\u009f\5\16\b\2"+
		"\u009d\u009f\5\f\7\2\u009e\u009c\3\2\2\2\u009e\u009d\3\2\2\2\u009f\u00ab"+
		"\3\2\2\2\u00a0\u00a1\7\21\2\2\u00a1\u00ab\7\36\2\2\u00a2\u00a3\7\22\2"+
		"\2\u00a3\u00ab\7\36\2\2\u00a4\u00a6\7\23\2\2\u00a5\u00a7\5\20\t\2\u00a6"+
		"\u00a5\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00ab\7\36"+
		"\2\2\u00a9\u00ab\7\36\2\2\u00aax\3\2\2\2\u00aay\3\2\2\2\u00aaz\3\2\2\2"+
		"\u00aa}\3\2\2\2\u00aa\u0086\3\2\2\2\u00aa\u0098\3\2\2\2\u00aa\u00a0\3"+
		"\2\2\2\u00aa\u00a2\3\2\2\2\u00aa\u00a4\3\2\2\2\u00aa\u00a9\3\2\2\2\u00ab"+
		"\17\3\2\2\2\u00ac\u00ad\b\t\1\2\u00ad\u00ae\7\26\2\2\u00ae\u00af\5\20"+
		"\t\2\u00af\u00b0\7\27\2\2\u00b0\u00cd\3\2\2\2\u00b1\u00b2\7>\2\2\u00b2"+
		"\u00b4\7\26\2\2\u00b3\u00b5\5\22\n\2\u00b4\u00b3\3\2\2\2\u00b4\u00b5\3"+
		"\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00cd\7\27\2\2\u00b7\u00b8\t\2\2\2\u00b8"+
		"\u00cd\5\20\t\27\u00b9\u00ba\t\3\2\2\u00ba\u00cd\5\20\t\26\u00bb\u00bc"+
		"\7\7\2\2\u00bc\u00be\5\30\r\2\u00bd\u00bf\5\24\13\2\u00be\u00bd\3\2\2"+
		"\2\u00bf\u00c0\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00cd"+
		"\3\2\2\2\u00c2\u00c3\7\7\2\2\u00c3\u00c6\7>\2\2\u00c4\u00c5\7\26\2\2\u00c5"+
		"\u00c7\7\27\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00cd\3"+
		"\2\2\2\u00c8\u00cd\7\f\2\2\u00c9\u00cd\7>\2\2\u00ca\u00cd\5\34\17\2\u00cb"+
		"\u00cd\5 \21\2\u00cc\u00ac\3\2\2\2\u00cc\u00b1\3\2\2\2\u00cc\u00b7\3\2"+
		"\2\2\u00cc\u00b9\3\2\2\2\u00cc\u00bb\3\2\2\2\u00cc\u00c2\3\2\2\2\u00cc"+
		"\u00c8\3\2\2\2\u00cc\u00c9\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cb\3\2"+
		"\2\2\u00cd\u010c\3\2\2\2\u00ce\u00cf\f\25\2\2\u00cf\u00d0\t\4\2\2\u00d0"+
		"\u010b\5\20\t\26\u00d1\u00d2\f\24\2\2\u00d2\u00d3\7$\2\2\u00d3\u010b\5"+
		"\20\t\25\u00d4\u00d5\f\23\2\2\u00d5\u00d6\t\5\2\2\u00d6\u010b\5\20\t\24"+
		"\u00d7\u00d8\f\22\2\2\u00d8\u00d9\t\6\2\2\u00d9\u010b\5\20\t\23\u00da"+
		"\u00db\f\21\2\2\u00db\u00dc\t\7\2\2\u00dc\u010b\5\20\t\22\u00dd\u00de"+
		"\f\20\2\2\u00de\u00df\t\b\2\2\u00df\u010b\5\20\t\21\u00e0\u00e1\f\17\2"+
		"\2\u00e1\u00e2\7\60\2\2\u00e2\u010b\5\20\t\20\u00e3\u00e4\f\16\2\2\u00e4"+
		"\u00e5\7\62\2\2\u00e5\u010b\5\20\t\17\u00e6\u00e7\f\r\2\2\u00e7\u00e8"+
		"\7\61\2\2\u00e8\u010b\5\20\t\16\u00e9\u00ea\f\f\2\2\u00ea\u00eb\7+\2\2"+
		"\u00eb\u010b\5\20\t\r\u00ec\u00ed\f\13\2\2\u00ed\u00ee\7,\2\2\u00ee\u010b"+
		"\5\20\t\f\u00ef\u00f0\f\n\2\2\u00f0\u00f1\7\34\2\2\u00f1\u00f2\5\20\t"+
		"\2\u00f2\u00f3\7\35\2\2\u00f3\u00f4\5\20\t\n\u00f4\u010b\3\2\2\2\u00f5"+
		"\u00f6\f\t\2\2\u00f6\u00f7\7\64\2\2\u00f7\u010b\5\20\t\t\u00f8\u00f9\f"+
		"\34\2\2\u00f9\u00fa\7\67\2\2\u00fa\u00fb\7>\2\2\u00fb\u00fd\7\26\2\2\u00fc"+
		"\u00fe\5\22\n\2\u00fd\u00fc\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00ff\3"+
		"\2\2\2\u00ff\u010b\7\27\2\2\u0100\u0101\f\33\2\2\u0101\u0102\7\67\2\2"+
		"\u0102\u010b\7>\2\2\u0103\u0104\f\32\2\2\u0104\u0105\7\30\2\2\u0105\u0106"+
		"\5\20\t\2\u0106\u0107\7\31\2\2\u0107\u010b\3\2\2\2\u0108\u0109\f\30\2"+
		"\2\u0109\u010b\t\2\2\2\u010a\u00ce\3\2\2\2\u010a\u00d1\3\2\2\2\u010a\u00d4"+
		"\3\2\2\2\u010a\u00d7\3\2\2\2\u010a\u00da\3\2\2\2\u010a\u00dd\3\2\2\2\u010a"+
		"\u00e0\3\2\2\2\u010a\u00e3\3\2\2\2\u010a\u00e6\3\2\2\2\u010a\u00e9\3\2"+
		"\2\2\u010a\u00ec\3\2\2\2\u010a\u00ef\3\2\2\2\u010a\u00f5\3\2\2\2\u010a"+
		"\u00f8\3\2\2\2\u010a\u0100\3\2\2\2\u010a\u0103\3\2\2\2\u010a\u0108\3\2"+
		"\2\2\u010b\u010e\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d"+
		"\21\3\2\2\2\u010e\u010c\3\2\2\2\u010f\u0114\5\20\t\2\u0110\u0111\7\37"+
		"\2\2\u0111\u0113\5\20\t\2\u0112\u0110\3\2\2\2\u0113\u0116\3\2\2\2\u0114"+
		"\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115\23\3\2\2\2\u0116\u0114\3\2\2"+
		"\2\u0117\u0119\7\30\2\2\u0118\u011a\5\20\t\2\u0119\u0118\3\2\2\2\u0119"+
		"\u011a\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011c\7\31\2\2\u011c\25\3\2\2"+
		"\2\u011d\u0120\5\30\r\2\u011e\u0120\5\32\16\2\u011f\u011d\3\2\2\2\u011f"+
		"\u011e\3\2\2\2\u0120\27\3\2\2\2\u0121\u0122\t\t\2\2\u0122\31\3\2\2\2\u0123"+
		"\u0129\5\30\r\2\u0124\u0126\7\30\2\2\u0125\u0127\78\2\2\u0126\u0125\3"+
		"\2\2\2\u0126\u0127\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u012a\7\31\2\2\u0129"+
		"\u0124\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u0129\3\2\2\2\u012b\u012c\3\2"+
		"\2\2\u012c\33\3\2\2\2\u012d\u0133\78\2\2\u012e\u0133\79\2\2\u012f\u0133"+
		"\t\n\2\2\u0130\u0133\7\t\2\2\u0131\u0133\5\36\20\2\u0132\u012d\3\2\2\2"+
		"\u0132\u012e\3\2\2\2\u0132\u012f\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0131"+
		"\3\2\2\2\u0133\35\3\2\2\2\u0134\u013d\7\32\2\2\u0135\u013a\5\34\17\2\u0136"+
		"\u0137\7\37\2\2\u0137\u0139\5\34\17\2\u0138\u0136\3\2\2\2\u0139\u013c"+
		"\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013e\3\2\2\2\u013c"+
		"\u013a\3\2\2\2\u013d\u0135\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u013f\3\2"+
		"\2\2\u013f\u0140\7\33\2\2\u0140\37\3\2\2\2\u0141\u0142\7;\2\2\u0142\u0147"+
		"\5\20\t\2\u0143\u0144\7=\2\2\u0144\u0146\5\20\t\2\u0145\u0143\3\2\2\2"+
		"\u0146\u0149\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u014a"+
		"\3\2\2\2\u0149\u0147\3\2\2\2\u014a\u014b\7<\2\2\u014b\u014e\3\2\2\2\u014c"+
		"\u014e\7:\2\2\u014d\u0141\3\2\2\2\u014d\u014c\3\2\2\2\u014e!\3\2\2\2)"+
		"%(-:=GIPTV`fjs\u0084\u0089\u008d\u0091\u0096\u009e\u00a6\u00aa\u00b4\u00c0"+
		"\u00c6\u00cc\u00fd\u010a\u010c\u0114\u0119\u011f\u0126\u012b\u0132\u013a"+
		"\u013d\u0147\u014d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}