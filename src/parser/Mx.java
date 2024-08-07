// Generated from F:/vscode/antlr-demo/compiler-2024/src/parser/Mx.g4 by ANTLR 4.13.1

    package src.parser;

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
		RULE_singlevardef = 5, RULE_constructor = 6, RULE_stmts = 7, RULE_jmpstmt = 8, 
		RULE_lpstmt = 9, RULE_stmt = 10, RULE_expr = 11, RULE_rowexpr = 12, RULE_type = 13, 
		RULE_singletype = 14, RULE_arraytype = 15, RULE_literal = 16, RULE_arrayliteral = 17, 
		RULE_fmtstr = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "def", "funcdef", "classdef", "vardef", "singlevardef", "constructor", 
			"stmts", "jmpstmt", "lpstmt", "stmt", "expr", "rowexpr", "type", "singletype", 
			"arraytype", "literal", "arrayliteral", "fmtstr"
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
			setState(39); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(38);
				def();
				}
				}
				setState(41); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1152921504606847070L) != 0) );
			setState(44);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(43);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefContext def() throws RecognitionException {
		DefContext _localctx = new DefContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_def);
		try {
			setState(49);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				funcdef();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				classdef();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(48);
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
			setState(51);
			type();
			setState(52);
			match(ID);
			setState(53);
			match(LPAR);
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1152921504606847006L) != 0)) {
				{
				setState(54);
				type();
				setState(55);
				match(ID);
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(56);
					match(COMMA);
					setState(57);
					type();
					setState(58);
					match(ID);
					}
					}
					setState(64);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(67);
			match(RPAR);
			setState(68);
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
		public TerminalNode ID() { return getToken(Mx.ID, 0); }
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
		public ConstructorContext constructor() {
			return getRuleContext(ConstructorContext.class,0);
		}
		public ClassdefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classdef; }
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
			setState(70);
			match(CLASS);
			setState(71);
			match(ID);
			setState(72);
			match(LBCE);
			setState(77);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(75);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						setState(73);
						vardef();
						}
						break;
					case 2:
						{
						setState(74);
						funcdef();
						}
						break;
					}
					} 
				}
				setState(79);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(80);
				constructor();
				}
				break;
			}
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1152921504606847006L) != 0)) {
				{
				setState(85);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(83);
					vardef();
					}
					break;
				case 2:
					{
					setState(84);
					funcdef();
					}
					break;
				}
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(90);
			match(RBCE);
			setState(91);
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
		public List<SinglevardefContext> singlevardef() {
			return getRuleContexts(SinglevardefContext.class);
		}
		public SinglevardefContext singlevardef(int i) {
			return getRuleContext(SinglevardefContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(Mx.SEMI, 0); }
		public List<TerminalNode> COMMA() { return getTokens(Mx.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Mx.COMMA, i);
		}
		public VardefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardef; }
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
			setState(93);
			type();
			setState(94);
			singlevardef();
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(95);
				match(COMMA);
				setState(96);
				singlevardef();
				}
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(102);
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
	public static class SinglevardefContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Mx.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(Mx.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SinglevardefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singlevardef; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitSinglevardef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SinglevardefContext singlevardef() throws RecognitionException {
		SinglevardefContext _localctx = new SinglevardefContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_singlevardef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(ID);
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(105);
				match(ASSIGN);
				setState(106);
				expr(0);
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
	public static class ConstructorContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Mx.ID, 0); }
		public TerminalNode LPAR() { return getToken(Mx.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(Mx.RPAR, 0); }
		public StmtsContext stmts() {
			return getRuleContext(StmtsContext.class,0);
		}
		public ConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorContext constructor() throws RecognitionException {
		ConstructorContext _localctx = new ConstructorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_constructor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(ID);
			setState(110);
			match(LPAR);
			setState(111);
			match(RPAR);
			setState(112);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitStmts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtsContext stmts() throws RecognitionException {
		StmtsContext _localctx = new StmtsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_stmts);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(LBCE);
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1862810194398146494L) != 0)) {
				{
				{
				setState(115);
				stmt();
				}
				}
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(121);
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
	public static class JmpstmtContext extends ParserRuleContext {
		public JmpstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jmpstmt; }
	 
		public JmpstmtContext() { }
		public void copyFrom(JmpstmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ContinueStmtContext extends JmpstmtContext {
		public TerminalNode CONTINUE() { return getToken(Mx.CONTINUE, 0); }
		public TerminalNode SEMI() { return getToken(Mx.SEMI, 0); }
		public ContinueStmtContext(JmpstmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitContinueStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfStmtContext extends JmpstmtContext {
		public TerminalNode IF() { return getToken(Mx.IF, 0); }
		public TerminalNode LPAR() { return getToken(Mx.LPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(Mx.RPAR, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(Mx.ELSE, 0); }
		public IfStmtContext(JmpstmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BreakStmtContext extends JmpstmtContext {
		public TerminalNode BREAK() { return getToken(Mx.BREAK, 0); }
		public TerminalNode SEMI() { return getToken(Mx.SEMI, 0); }
		public BreakStmtContext(JmpstmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitBreakStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStmtContext extends JmpstmtContext {
		public TerminalNode RETURN() { return getToken(Mx.RETURN, 0); }
		public TerminalNode SEMI() { return getToken(Mx.SEMI, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnStmtContext(JmpstmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitReturnStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JmpstmtContext jmpstmt() throws RecognitionException {
		JmpstmtContext _localctx = new JmpstmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_jmpstmt);
		int _la;
		try {
			setState(141);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				_localctx = new IfStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
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
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
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
			case BREAK:
				_localctx = new BreakStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				match(BREAK);
				setState(133);
				match(SEMI);
				}
				break;
			case CONTINUE:
				_localctx = new ContinueStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(134);
				match(CONTINUE);
				setState(135);
				match(SEMI);
				}
				break;
			case RETURN:
				_localctx = new ReturnStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(136);
				match(RETURN);
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1862810194129455008L) != 0)) {
					{
					setState(137);
					expr(0);
					}
				}

				setState(140);
				match(SEMI);
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
	public static class LpstmtContext extends ParserRuleContext {
		public LpstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lpstmt; }
	 
		public LpstmtContext() { }
		public void copyFrom(LpstmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileStmtContext extends LpstmtContext {
		public TerminalNode WHILE() { return getToken(Mx.WHILE, 0); }
		public TerminalNode LPAR() { return getToken(Mx.LPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(Mx.RPAR, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public WhileStmtContext(LpstmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitWhileStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForStmtContext extends LpstmtContext {
		public TerminalNode FOR() { return getToken(Mx.FOR, 0); }
		public TerminalNode LPAR() { return getToken(Mx.LPAR, 0); }
		public List<TerminalNode> SEMI() { return getTokens(Mx.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(Mx.SEMI, i);
		}
		public TerminalNode RPAR() { return getToken(Mx.RPAR, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ForStmtContext(LpstmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitForStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LpstmtContext lpstmt() throws RecognitionException {
		LpstmtContext _localctx = new LpstmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_lpstmt);
		int _la;
		try {
			setState(164);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				_localctx = new ForStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				match(FOR);
				setState(144);
				match(LPAR);
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1862810194129455008L) != 0)) {
					{
					setState(145);
					expr(0);
					}
				}

				setState(148);
				match(SEMI);
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1862810194129455008L) != 0)) {
					{
					setState(149);
					expr(0);
					}
				}

				setState(152);
				match(SEMI);
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1862810194129455008L) != 0)) {
					{
					setState(153);
					expr(0);
					}
				}

				setState(156);
				match(RPAR);
				setState(157);
				stmt();
				}
				break;
			case WHILE:
				_localctx = new WhileStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				match(WHILE);
				setState(159);
				match(LPAR);
				setState(160);
				expr(0);
				setState(161);
				match(RPAR);
				setState(162);
				stmt();
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
		public StmtsContext stmts() {
			return getRuleContext(StmtsContext.class,0);
		}
		public VardefContext vardef() {
			return getRuleContext(VardefContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Mx.SEMI, 0); }
		public LpstmtContext lpstmt() {
			return getRuleContext(LpstmtContext.class,0);
		}
		public JmpstmtContext jmpstmt() {
			return getRuleContext(JmpstmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_stmt);
		try {
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				stmts();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				vardef();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(168);
				expr(0);
				setState(169);
				match(SEMI);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(171);
				lpstmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(172);
				jmpstmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(173);
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
	public static class MemberFuncCallContext extends ExprContext {
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
		public MemberFuncCallContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitMemberFuncCall(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RUnaryExpContext extends ExprContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SDEC() { return getToken(Mx.SDEC, 0); }
		public TerminalNode SINC() { return getToken(Mx.SINC, 0); }
		public RUnaryExpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitRUnaryExp(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitVarAccess(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitMemberObjAccess(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitBinaryExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ThisPtrContext extends ExprContext {
		public TerminalNode THIS() { return getToken(Mx.THIS, 0); }
		public ThisPtrContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitThisPtr(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitAssignExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NewArrayContext extends ExprContext {
		public TerminalNode NEW() { return getToken(Mx.NEW, 0); }
		public SingletypeContext singletype() {
			return getRuleContext(SingletypeContext.class,0);
		}
		public List<TerminalNode> LBKT() { return getTokens(Mx.LBKT); }
		public TerminalNode LBKT(int i) {
			return getToken(Mx.LBKT, i);
		}
		public List<TerminalNode> RBKT() { return getTokens(Mx.RBKT); }
		public TerminalNode RBKT(int i) {
			return getToken(Mx.RBKT, i);
		}
		public ArrayliteralContext arrayliteral() {
			return getRuleContext(ArrayliteralContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public NewArrayContext(ExprContext ctx) { copyFrom(ctx); }
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitArrayAccess(this);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitFormatString(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LUnaryExpContext extends ExprContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SDEC() { return getToken(Mx.SDEC, 0); }
		public TerminalNode SINC() { return getToken(Mx.SINC, 0); }
		public TerminalNode SUB() { return getToken(Mx.SUB, 0); }
		public TerminalNode NOT() { return getToken(Mx.NOT, 0); }
		public TerminalNode BNOT() { return getToken(Mx.BNOT, 0); }
		public LUnaryExpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitLUnaryExp(this);
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
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				_localctx = new ParenthesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(177);
				match(LPAR);
				setState(178);
				expr(0);
				setState(179);
				match(RPAR);
				}
				break;
			case 2:
				{
				_localctx = new FuncCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(181);
				match(ID);
				setState(182);
				match(LPAR);
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1862810194129455008L) != 0)) {
					{
					setState(183);
					rowexpr();
					}
				}

				setState(186);
				match(RPAR);
				}
				break;
			case 3:
				{
				_localctx = new LUnaryExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(187);
				((LUnaryExpContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==SINC || _la==SDEC) ) {
					((LUnaryExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(188);
				expr(21);
				}
				break;
			case 4:
				{
				_localctx = new LUnaryExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(189);
				((LUnaryExpContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 571748193927168L) != 0)) ) {
					((LUnaryExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(190);
				expr(20);
				}
				break;
			case 5:
				{
				_localctx = new NewArrayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(191);
				match(NEW);
				setState(192);
				singletype();
				setState(200);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(193);
						match(LBKT);
						setState(195);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1862810194129455008L) != 0)) {
							{
							setState(194);
							expr(0);
							}
						}

						setState(197);
						match(RBKT);
						}
						} 
					}
					setState(202);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				}
				setState(207);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(203);
						match(LBKT);
						setState(204);
						match(RBKT);
						}
						} 
					}
					setState(209);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				}
				setState(211);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(210);
					arrayliteral();
					}
					break;
				}
				}
				break;
			case 6:
				{
				_localctx = new NewClassContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(213);
				match(NEW);
				setState(214);
				match(ID);
				setState(217);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(215);
					match(LPAR);
					setState(216);
					match(RPAR);
					}
					break;
				}
				}
				break;
			case 7:
				{
				_localctx = new ThisPtrContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(219);
				match(THIS);
				}
				break;
			case 8:
				{
				_localctx = new VarAccessContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(220);
				match(ID);
				}
				break;
			case 9:
				{
				_localctx = new ConstantContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(221);
				literal();
				}
				break;
			case 10:
				{
				_localctx = new FormatStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(222);
				fmtstr();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(287);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(285);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryExpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(225);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(226);
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
						setState(227);
						expr(20);
						}
						break;
					case 2:
						{
						_localctx = new BinaryExpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(228);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(229);
						((BinaryExpContext)_localctx).op = match(MOD);
						setState(230);
						expr(19);
						}
						break;
					case 3:
						{
						_localctx = new BinaryExpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(231);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(232);
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
						setState(233);
						expr(18);
						}
						break;
					case 4:
						{
						_localctx = new BinaryExpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(234);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(235);
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
						setState(236);
						expr(17);
						}
						break;
					case 5:
						{
						_localctx = new BinaryExpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(237);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(238);
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
						setState(239);
						expr(16);
						}
						break;
					case 6:
						{
						_localctx = new BinaryExpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(240);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(241);
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
						setState(242);
						expr(15);
						}
						break;
					case 7:
						{
						_localctx = new BinaryExpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(243);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(244);
						((BinaryExpContext)_localctx).op = match(BAND);
						setState(245);
						expr(14);
						}
						break;
					case 8:
						{
						_localctx = new BinaryExpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(246);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(247);
						((BinaryExpContext)_localctx).op = match(BXOR);
						setState(248);
						expr(13);
						}
						break;
					case 9:
						{
						_localctx = new BinaryExpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(249);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(250);
						((BinaryExpContext)_localctx).op = match(BOR);
						setState(251);
						expr(12);
						}
						break;
					case 10:
						{
						_localctx = new BinaryExpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(252);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(253);
						((BinaryExpContext)_localctx).op = match(AND);
						setState(254);
						expr(11);
						}
						break;
					case 11:
						{
						_localctx = new BinaryExpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(255);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(256);
						((BinaryExpContext)_localctx).op = match(OR);
						setState(257);
						expr(10);
						}
						break;
					case 12:
						{
						_localctx = new TernaryExpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(258);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(259);
						((TernaryExpContext)_localctx).op = match(QUES);
						setState(260);
						expr(0);
						setState(261);
						((TernaryExpContext)_localctx).op = match(COLON);
						setState(262);
						expr(8);
						}
						break;
					case 13:
						{
						_localctx = new AssignExpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(264);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(265);
						((AssignExpContext)_localctx).op = match(ASSIGN);
						setState(266);
						expr(7);
						}
						break;
					case 14:
						{
						_localctx = new MemberFuncCallContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(267);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(268);
						match(MEMB);
						setState(269);
						match(ID);
						setState(270);
						match(LPAR);
						setState(272);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1862810194129455008L) != 0)) {
							{
							setState(271);
							rowexpr();
							}
						}

						setState(274);
						match(RPAR);
						}
						break;
					case 15:
						{
						_localctx = new MemberObjAccessContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(275);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(276);
						match(MEMB);
						setState(277);
						match(ID);
						}
						break;
					case 16:
						{
						_localctx = new ArrayAccessContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(278);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(279);
						match(LBKT);
						setState(280);
						expr(0);
						setState(281);
						match(RBKT);
						}
						break;
					case 17:
						{
						_localctx = new RUnaryExpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(283);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(284);
						((RUnaryExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==SINC || _la==SDEC) ) {
							((RUnaryExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
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
				setState(289);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitRowexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowexprContext rowexpr() throws RecognitionException {
		RowexprContext _localctx = new RowexprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_rowexpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			expr(0);
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(291);
				match(COMMA);
				setState(292);
				expr(0);
				}
				}
				setState(297);
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
	public static class TypeContext extends ParserRuleContext {
		public SingletypeContext singletype() {
			return getRuleContext(SingletypeContext.class,0);
		}
		public ArraytypeContext arraytype() {
			return getRuleContext(ArraytypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_type);
		try {
			setState(300);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(298);
				singletype();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(299);
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
	public static class SingletypeContext extends ParserRuleContext {
		public SingletypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singletype; }
	 
		public SingletypeContext() { }
		public void copyFrom(SingletypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BaseTypeContext extends SingletypeContext {
		public TerminalNode BOOL() { return getToken(Mx.BOOL, 0); }
		public TerminalNode INT() { return getToken(Mx.INT, 0); }
		public TerminalNode STRING() { return getToken(Mx.STRING, 0); }
		public TerminalNode VOID() { return getToken(Mx.VOID, 0); }
		public BaseTypeContext(SingletypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitBaseType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassTypeContext extends SingletypeContext {
		public TerminalNode ID() { return getToken(Mx.ID, 0); }
		public ClassTypeContext(SingletypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitClassType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingletypeContext singletype() throws RecognitionException {
		SingletypeContext _localctx = new SingletypeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_singletype);
		int _la;
		try {
			setState(304);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
			case BOOL:
			case INT:
			case STRING:
				_localctx = new BaseTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(302);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 30L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case ID:
				_localctx = new ClassTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(303);
				match(ID);
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
	public static class ArraytypeContext extends ParserRuleContext {
		public SingletypeContext singletype() {
			return getRuleContext(SingletypeContext.class,0);
		}
		public List<TerminalNode> LBKT() { return getTokens(Mx.LBKT); }
		public TerminalNode LBKT(int i) {
			return getToken(Mx.LBKT, i);
		}
		public List<TerminalNode> RBKT() { return getTokens(Mx.RBKT); }
		public TerminalNode RBKT(int i) {
			return getToken(Mx.RBKT, i);
		}
		public ArraytypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arraytype; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitArraytype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArraytypeContext arraytype() throws RecognitionException {
		ArraytypeContext _localctx = new ArraytypeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_arraytype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			singletype();
			setState(309); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(307);
				match(LBKT);
				setState(308);
				match(RBKT);
				}
				}
				setState(311); 
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_literal);
		int _la;
		try {
			setState(318);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTCONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(313);
				match(INTCONST);
				}
				break;
			case STRINGCONST:
				enterOuterAlt(_localctx, 2);
				{
				setState(314);
				match(STRINGCONST);
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(315);
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
				setState(316);
				match(NULL);
				}
				break;
			case LBCE:
				enterOuterAlt(_localctx, 5);
				{
				setState(317);
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
		public RowexprContext rowexpr() {
			return getRuleContext(RowexprContext.class,0);
		}
		public ArrayliteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayliteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitArrayliteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayliteralContext arrayliteral() throws RecognitionException {
		ArrayliteralContext _localctx = new ArrayliteralContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_arrayliteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			match(LBCE);
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1862810194129455008L) != 0)) {
				{
				setState(321);
				rowexpr();
				}
			}

			setState(324);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitFmtstr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FmtstrContext fmtstr() throws RecognitionException {
		FmtstrContext _localctx = new FmtstrContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_fmtstr);
		int _la;
		try {
			setState(338);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FMTSTRBGN:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(326);
				match(FMTSTRBGN);
				{
				setState(327);
				expr(0);
				setState(332);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==FMTSTRBODY) {
					{
					{
					setState(328);
					match(FMTSTRBODY);
					setState(329);
					expr(0);
					}
					}
					setState(334);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(335);
				match(FMTSTREND);
				}
				}
				break;
			case FMTSTRPURE:
				enterOuterAlt(_localctx, 2);
				{
				setState(337);
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
		case 11:
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
		"\u0004\u0001<\u0155\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0001\u0000\u0004\u0000(\b\u0000\u000b\u0000\f\u0000)\u0001\u0000\u0003"+
		"\u0000-\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u00012\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002=\b\u0002\n\u0002\f\u0002"+
		"@\t\u0002\u0003\u0002B\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003L\b"+
		"\u0003\n\u0003\f\u0003O\t\u0003\u0001\u0003\u0003\u0003R\b\u0003\u0001"+
		"\u0003\u0001\u0003\u0005\u0003V\b\u0003\n\u0003\f\u0003Y\t\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0005\u0004b\b\u0004\n\u0004\f\u0004e\t\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005l\b\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0005\u0007u\b\u0007\n\u0007\f\u0007x\t\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b"+
		"\u0083\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u008b"+
		"\b\b\u0001\b\u0003\b\u008e\b\b\u0001\t\u0001\t\u0001\t\u0003\t\u0093\b"+
		"\t\u0001\t\u0001\t\u0003\t\u0097\b\t\u0001\t\u0001\t\u0003\t\u009b\b\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\t\u00a5\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0003\n\u00af\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00b9\b\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00c4\b\u000b\u0001\u000b\u0005"+
		"\u000b\u00c7\b\u000b\n\u000b\f\u000b\u00ca\t\u000b\u0001\u000b\u0001\u000b"+
		"\u0005\u000b\u00ce\b\u000b\n\u000b\f\u000b\u00d1\t\u000b\u0001\u000b\u0003"+
		"\u000b\u00d4\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003"+
		"\u000b\u00da\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003"+
		"\u000b\u00e0\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0003\u000b\u0111\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0005\u000b\u011e\b\u000b\n\u000b\f\u000b\u0121\t\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0005\f\u0126\b\f\n\f\f\f\u0129\t\f\u0001\r\u0001"+
		"\r\u0003\r\u012d\b\r\u0001\u000e\u0001\u000e\u0003\u000e\u0131\b\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0004\u000f\u0136\b\u000f\u000b\u000f"+
		"\f\u000f\u0137\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u013f\b\u0010\u0001\u0011\u0001\u0011\u0003\u0011\u0143\b"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0005\u0012\u014b\b\u0012\n\u0012\f\u0012\u014e\t\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0003\u0012\u0153\b\u0012\u0001\u0012\u0000\u0001"+
		"\u0016\u0013\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$\u0000\t\u0001\u000034\u0003\u0000\u001f\u001f"+
		"++11\u0001\u0000 !\u0001\u0000\u001e\u001f\u0001\u0000,-\u0001\u0000#"+
		"&\u0001\u0000\'(\u0001\u0000\u0001\u0004\u0001\u0000\b\t\u0189\u0000\'"+
		"\u0001\u0000\u0000\u0000\u00021\u0001\u0000\u0000\u0000\u00043\u0001\u0000"+
		"\u0000\u0000\u0006F\u0001\u0000\u0000\u0000\b]\u0001\u0000\u0000\u0000"+
		"\nh\u0001\u0000\u0000\u0000\fm\u0001\u0000\u0000\u0000\u000er\u0001\u0000"+
		"\u0000\u0000\u0010\u008d\u0001\u0000\u0000\u0000\u0012\u00a4\u0001\u0000"+
		"\u0000\u0000\u0014\u00ae\u0001\u0000\u0000\u0000\u0016\u00df\u0001\u0000"+
		"\u0000\u0000\u0018\u0122\u0001\u0000\u0000\u0000\u001a\u012c\u0001\u0000"+
		"\u0000\u0000\u001c\u0130\u0001\u0000\u0000\u0000\u001e\u0132\u0001\u0000"+
		"\u0000\u0000 \u013e\u0001\u0000\u0000\u0000\"\u0140\u0001\u0000\u0000"+
		"\u0000$\u0152\u0001\u0000\u0000\u0000&(\u0003\u0002\u0001\u0000\'&\u0001"+
		"\u0000\u0000\u0000()\u0001\u0000\u0000\u0000)\'\u0001\u0000\u0000\u0000"+
		")*\u0001\u0000\u0000\u0000*,\u0001\u0000\u0000\u0000+-\u0005\u0000\u0000"+
		"\u0001,+\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000-\u0001\u0001"+
		"\u0000\u0000\u0000.2\u0003\u0004\u0002\u0000/2\u0003\u0006\u0003\u0000"+
		"02\u0003\b\u0004\u00001.\u0001\u0000\u0000\u00001/\u0001\u0000\u0000\u0000"+
		"10\u0001\u0000\u0000\u00002\u0003\u0001\u0000\u0000\u000034\u0003\u001a"+
		"\r\u000045\u0005<\u0000\u00005A\u0005\u0014\u0000\u000067\u0003\u001a"+
		"\r\u00007>\u0005<\u0000\u000089\u0005\u001d\u0000\u00009:\u0003\u001a"+
		"\r\u0000:;\u0005<\u0000\u0000;=\u0001\u0000\u0000\u0000<8\u0001\u0000"+
		"\u0000\u0000=@\u0001\u0000\u0000\u0000><\u0001\u0000\u0000\u0000>?\u0001"+
		"\u0000\u0000\u0000?B\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000\u0000"+
		"A6\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000"+
		"\u0000CD\u0005\u0015\u0000\u0000DE\u0003\u000e\u0007\u0000E\u0005\u0001"+
		"\u0000\u0000\u0000FG\u0005\u0006\u0000\u0000GH\u0005<\u0000\u0000HM\u0005"+
		"\u0018\u0000\u0000IL\u0003\b\u0004\u0000JL\u0003\u0004\u0002\u0000KI\u0001"+
		"\u0000\u0000\u0000KJ\u0001\u0000\u0000\u0000LO\u0001\u0000\u0000\u0000"+
		"MK\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000NQ\u0001\u0000\u0000"+
		"\u0000OM\u0001\u0000\u0000\u0000PR\u0003\f\u0006\u0000QP\u0001\u0000\u0000"+
		"\u0000QR\u0001\u0000\u0000\u0000RW\u0001\u0000\u0000\u0000SV\u0003\b\u0004"+
		"\u0000TV\u0003\u0004\u0002\u0000US\u0001\u0000\u0000\u0000UT\u0001\u0000"+
		"\u0000\u0000VY\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000WX\u0001"+
		"\u0000\u0000\u0000XZ\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000"+
		"Z[\u0005\u0019\u0000\u0000[\\\u0005\u001c\u0000\u0000\\\u0007\u0001\u0000"+
		"\u0000\u0000]^\u0003\u001a\r\u0000^c\u0003\n\u0005\u0000_`\u0005\u001d"+
		"\u0000\u0000`b\u0003\n\u0005\u0000a_\u0001\u0000\u0000\u0000be\u0001\u0000"+
		"\u0000\u0000ca\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000df\u0001"+
		"\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000fg\u0005\u001c\u0000\u0000"+
		"g\t\u0001\u0000\u0000\u0000hk\u0005<\u0000\u0000ij\u00052\u0000\u0000"+
		"jl\u0003\u0016\u000b\u0000ki\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000"+
		"\u0000l\u000b\u0001\u0000\u0000\u0000mn\u0005<\u0000\u0000no\u0005\u0014"+
		"\u0000\u0000op\u0005\u0015\u0000\u0000pq\u0003\u000e\u0007\u0000q\r\u0001"+
		"\u0000\u0000\u0000rv\u0005\u0018\u0000\u0000su\u0003\u0014\n\u0000ts\u0001"+
		"\u0000\u0000\u0000ux\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000"+
		"vw\u0001\u0000\u0000\u0000wy\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000"+
		"\u0000yz\u0005\u0019\u0000\u0000z\u000f\u0001\u0000\u0000\u0000{|\u0005"+
		"\u000b\u0000\u0000|}\u0005\u0014\u0000\u0000}~\u0003\u0016\u000b\u0000"+
		"~\u007f\u0005\u0015\u0000\u0000\u007f\u0082\u0003\u0014\n\u0000\u0080"+
		"\u0081\u0005\f\u0000\u0000\u0081\u0083\u0003\u0014\n\u0000\u0082\u0080"+
		"\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u008e"+
		"\u0001\u0000\u0000\u0000\u0084\u0085\u0005\u000f\u0000\u0000\u0085\u008e"+
		"\u0005\u001c\u0000\u0000\u0086\u0087\u0005\u0010\u0000\u0000\u0087\u008e"+
		"\u0005\u001c\u0000\u0000\u0088\u008a\u0005\u0011\u0000\u0000\u0089\u008b"+
		"\u0003\u0016\u000b\u0000\u008a\u0089\u0001\u0000\u0000\u0000\u008a\u008b"+
		"\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u008e"+
		"\u0005\u001c\u0000\u0000\u008d{\u0001\u0000\u0000\u0000\u008d\u0084\u0001"+
		"\u0000\u0000\u0000\u008d\u0086\u0001\u0000\u0000\u0000\u008d\u0088\u0001"+
		"\u0000\u0000\u0000\u008e\u0011\u0001\u0000\u0000\u0000\u008f\u0090\u0005"+
		"\r\u0000\u0000\u0090\u0092\u0005\u0014\u0000\u0000\u0091\u0093\u0003\u0016"+
		"\u000b\u0000\u0092\u0091\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000"+
		"\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000\u0094\u0096\u0005\u001c"+
		"\u0000\u0000\u0095\u0097\u0003\u0016\u000b\u0000\u0096\u0095\u0001\u0000"+
		"\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000"+
		"\u0000\u0000\u0098\u009a\u0005\u001c\u0000\u0000\u0099\u009b\u0003\u0016"+
		"\u000b\u0000\u009a\u0099\u0001\u0000\u0000\u0000\u009a\u009b\u0001\u0000"+
		"\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u009d\u0005\u0015"+
		"\u0000\u0000\u009d\u00a5\u0003\u0014\n\u0000\u009e\u009f\u0005\u000e\u0000"+
		"\u0000\u009f\u00a0\u0005\u0014\u0000\u0000\u00a0\u00a1\u0003\u0016\u000b"+
		"\u0000\u00a1\u00a2\u0005\u0015\u0000\u0000\u00a2\u00a3\u0003\u0014\n\u0000"+
		"\u00a3\u00a5\u0001\u0000\u0000\u0000\u00a4\u008f\u0001\u0000\u0000\u0000"+
		"\u00a4\u009e\u0001\u0000\u0000\u0000\u00a5\u0013\u0001\u0000\u0000\u0000"+
		"\u00a6\u00af\u0003\u000e\u0007\u0000\u00a7\u00af\u0003\b\u0004\u0000\u00a8"+
		"\u00a9\u0003\u0016\u000b\u0000\u00a9\u00aa\u0005\u001c\u0000\u0000\u00aa"+
		"\u00af\u0001\u0000\u0000\u0000\u00ab\u00af\u0003\u0012\t\u0000\u00ac\u00af"+
		"\u0003\u0010\b\u0000\u00ad\u00af\u0005\u001c\u0000\u0000\u00ae\u00a6\u0001"+
		"\u0000\u0000\u0000\u00ae\u00a7\u0001\u0000\u0000\u0000\u00ae\u00a8\u0001"+
		"\u0000\u0000\u0000\u00ae\u00ab\u0001\u0000\u0000\u0000\u00ae\u00ac\u0001"+
		"\u0000\u0000\u0000\u00ae\u00ad\u0001\u0000\u0000\u0000\u00af\u0015\u0001"+
		"\u0000\u0000\u0000\u00b0\u00b1\u0006\u000b\uffff\uffff\u0000\u00b1\u00b2"+
		"\u0005\u0014\u0000\u0000\u00b2\u00b3\u0003\u0016\u000b\u0000\u00b3\u00b4"+
		"\u0005\u0015\u0000\u0000\u00b4\u00e0\u0001\u0000\u0000\u0000\u00b5\u00b6"+
		"\u0005<\u0000\u0000\u00b6\u00b8\u0005\u0014\u0000\u0000\u00b7\u00b9\u0003"+
		"\u0018\f\u0000\u00b8\u00b7\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000"+
		"\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba\u00e0\u0005\u0015"+
		"\u0000\u0000\u00bb\u00bc\u0007\u0000\u0000\u0000\u00bc\u00e0\u0003\u0016"+
		"\u000b\u0015\u00bd\u00be\u0007\u0001\u0000\u0000\u00be\u00e0\u0003\u0016"+
		"\u000b\u0014\u00bf\u00c0\u0005\u0005\u0000\u0000\u00c0\u00c8\u0003\u001c"+
		"\u000e\u0000\u00c1\u00c3\u0005\u0016\u0000\u0000\u00c2\u00c4\u0003\u0016"+
		"\u000b\u0000\u00c3\u00c2\u0001\u0000\u0000\u0000\u00c3\u00c4\u0001\u0000"+
		"\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5\u00c7\u0005\u0017"+
		"\u0000\u0000\u00c6\u00c1\u0001\u0000\u0000\u0000\u00c7\u00ca\u0001\u0000"+
		"\u0000\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001\u0000"+
		"\u0000\u0000\u00c9\u00cf\u0001\u0000\u0000\u0000\u00ca\u00c8\u0001\u0000"+
		"\u0000\u0000\u00cb\u00cc\u0005\u0016\u0000\u0000\u00cc\u00ce\u0005\u0017"+
		"\u0000\u0000\u00cd\u00cb\u0001\u0000\u0000\u0000\u00ce\u00d1\u0001\u0000"+
		"\u0000\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001\u0000"+
		"\u0000\u0000\u00d0\u00d3\u0001\u0000\u0000\u0000\u00d1\u00cf\u0001\u0000"+
		"\u0000\u0000\u00d2\u00d4\u0003\"\u0011\u0000\u00d3\u00d2\u0001\u0000\u0000"+
		"\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000\u00d4\u00e0\u0001\u0000\u0000"+
		"\u0000\u00d5\u00d6\u0005\u0005\u0000\u0000\u00d6\u00d9\u0005<\u0000\u0000"+
		"\u00d7\u00d8\u0005\u0014\u0000\u0000\u00d8\u00da\u0005\u0015\u0000\u0000"+
		"\u00d9\u00d7\u0001\u0000\u0000\u0000\u00d9\u00da\u0001\u0000\u0000\u0000"+
		"\u00da\u00e0\u0001\u0000\u0000\u0000\u00db\u00e0\u0005\n\u0000\u0000\u00dc"+
		"\u00e0\u0005<\u0000\u0000\u00dd\u00e0\u0003 \u0010\u0000\u00de\u00e0\u0003"+
		"$\u0012\u0000\u00df\u00b0\u0001\u0000\u0000\u0000\u00df\u00b5\u0001\u0000"+
		"\u0000\u0000\u00df\u00bb\u0001\u0000\u0000\u0000\u00df\u00bd\u0001\u0000"+
		"\u0000\u0000\u00df\u00bf\u0001\u0000\u0000\u0000\u00df\u00d5\u0001\u0000"+
		"\u0000\u0000\u00df\u00db\u0001\u0000\u0000\u0000\u00df\u00dc\u0001\u0000"+
		"\u0000\u0000\u00df\u00dd\u0001\u0000\u0000\u0000\u00df\u00de\u0001\u0000"+
		"\u0000\u0000\u00e0\u011f\u0001\u0000\u0000\u0000\u00e1\u00e2\n\u0013\u0000"+
		"\u0000\u00e2\u00e3\u0007\u0002\u0000\u0000\u00e3\u011e\u0003\u0016\u000b"+
		"\u0014\u00e4\u00e5\n\u0012\u0000\u0000\u00e5\u00e6\u0005\"\u0000\u0000"+
		"\u00e6\u011e\u0003\u0016\u000b\u0013\u00e7\u00e8\n\u0011\u0000\u0000\u00e8"+
		"\u00e9\u0007\u0003\u0000\u0000\u00e9\u011e\u0003\u0016\u000b\u0012\u00ea"+
		"\u00eb\n\u0010\u0000\u0000\u00eb\u00ec\u0007\u0004\u0000\u0000\u00ec\u011e"+
		"\u0003\u0016\u000b\u0011\u00ed\u00ee\n\u000f\u0000\u0000\u00ee\u00ef\u0007"+
		"\u0005\u0000\u0000\u00ef\u011e\u0003\u0016\u000b\u0010\u00f0\u00f1\n\u000e"+
		"\u0000\u0000\u00f1\u00f2\u0007\u0006\u0000\u0000\u00f2\u011e\u0003\u0016"+
		"\u000b\u000f\u00f3\u00f4\n\r\u0000\u0000\u00f4\u00f5\u0005.\u0000\u0000"+
		"\u00f5\u011e\u0003\u0016\u000b\u000e\u00f6\u00f7\n\f\u0000\u0000\u00f7"+
		"\u00f8\u00050\u0000\u0000\u00f8\u011e\u0003\u0016\u000b\r\u00f9\u00fa"+
		"\n\u000b\u0000\u0000\u00fa\u00fb\u0005/\u0000\u0000\u00fb\u011e\u0003"+
		"\u0016\u000b\f\u00fc\u00fd\n\n\u0000\u0000\u00fd\u00fe\u0005)\u0000\u0000"+
		"\u00fe\u011e\u0003\u0016\u000b\u000b\u00ff\u0100\n\t\u0000\u0000\u0100"+
		"\u0101\u0005*\u0000\u0000\u0101\u011e\u0003\u0016\u000b\n\u0102\u0103"+
		"\n\b\u0000\u0000\u0103\u0104\u0005\u001a\u0000\u0000\u0104\u0105\u0003"+
		"\u0016\u000b\u0000\u0105\u0106\u0005\u001b\u0000\u0000\u0106\u0107\u0003"+
		"\u0016\u000b\b\u0107\u011e\u0001\u0000\u0000\u0000\u0108\u0109\n\u0007"+
		"\u0000\u0000\u0109\u010a\u00052\u0000\u0000\u010a\u011e\u0003\u0016\u000b"+
		"\u0007\u010b\u010c\n\u001a\u0000\u0000\u010c\u010d\u00055\u0000\u0000"+
		"\u010d\u010e\u0005<\u0000\u0000\u010e\u0110\u0005\u0014\u0000\u0000\u010f"+
		"\u0111\u0003\u0018\f\u0000\u0110\u010f\u0001\u0000\u0000\u0000\u0110\u0111"+
		"\u0001\u0000\u0000\u0000\u0111\u0112\u0001\u0000\u0000\u0000\u0112\u011e"+
		"\u0005\u0015\u0000\u0000\u0113\u0114\n\u0019\u0000\u0000\u0114\u0115\u0005"+
		"5\u0000\u0000\u0115\u011e\u0005<\u0000\u0000\u0116\u0117\n\u0018\u0000"+
		"\u0000\u0117\u0118\u0005\u0016\u0000\u0000\u0118\u0119\u0003\u0016\u000b"+
		"\u0000\u0119\u011a\u0005\u0017\u0000\u0000\u011a\u011e\u0001\u0000\u0000"+
		"\u0000\u011b\u011c\n\u0016\u0000\u0000\u011c\u011e\u0007\u0000\u0000\u0000"+
		"\u011d\u00e1\u0001\u0000\u0000\u0000\u011d\u00e4\u0001\u0000\u0000\u0000"+
		"\u011d\u00e7\u0001\u0000\u0000\u0000\u011d\u00ea\u0001\u0000\u0000\u0000"+
		"\u011d\u00ed\u0001\u0000\u0000\u0000\u011d\u00f0\u0001\u0000\u0000\u0000"+
		"\u011d\u00f3\u0001\u0000\u0000\u0000\u011d\u00f6\u0001\u0000\u0000\u0000"+
		"\u011d\u00f9\u0001\u0000\u0000\u0000\u011d\u00fc\u0001\u0000\u0000\u0000"+
		"\u011d\u00ff\u0001\u0000\u0000\u0000\u011d\u0102\u0001\u0000\u0000\u0000"+
		"\u011d\u0108\u0001\u0000\u0000\u0000\u011d\u010b\u0001\u0000\u0000\u0000"+
		"\u011d\u0113\u0001\u0000\u0000\u0000\u011d\u0116\u0001\u0000\u0000\u0000"+
		"\u011d\u011b\u0001\u0000\u0000\u0000\u011e\u0121\u0001\u0000\u0000\u0000"+
		"\u011f\u011d\u0001\u0000\u0000\u0000\u011f\u0120\u0001\u0000\u0000\u0000"+
		"\u0120\u0017\u0001\u0000\u0000\u0000\u0121\u011f\u0001\u0000\u0000\u0000"+
		"\u0122\u0127\u0003\u0016\u000b\u0000\u0123\u0124\u0005\u001d\u0000\u0000"+
		"\u0124\u0126\u0003\u0016\u000b\u0000\u0125\u0123\u0001\u0000\u0000\u0000"+
		"\u0126\u0129\u0001\u0000\u0000\u0000\u0127\u0125\u0001\u0000\u0000\u0000"+
		"\u0127\u0128\u0001\u0000\u0000\u0000\u0128\u0019\u0001\u0000\u0000\u0000"+
		"\u0129\u0127\u0001\u0000\u0000\u0000\u012a\u012d\u0003\u001c\u000e\u0000"+
		"\u012b\u012d\u0003\u001e\u000f\u0000\u012c\u012a\u0001\u0000\u0000\u0000"+
		"\u012c\u012b\u0001\u0000\u0000\u0000\u012d\u001b\u0001\u0000\u0000\u0000"+
		"\u012e\u0131\u0007\u0007\u0000\u0000\u012f\u0131\u0005<\u0000\u0000\u0130"+
		"\u012e\u0001\u0000\u0000\u0000\u0130\u012f\u0001\u0000\u0000\u0000\u0131"+
		"\u001d\u0001\u0000\u0000\u0000\u0132\u0135\u0003\u001c\u000e\u0000\u0133"+
		"\u0134\u0005\u0016\u0000\u0000\u0134\u0136\u0005\u0017\u0000\u0000\u0135"+
		"\u0133\u0001\u0000\u0000\u0000\u0136\u0137\u0001\u0000\u0000\u0000\u0137"+
		"\u0135\u0001\u0000\u0000\u0000\u0137\u0138\u0001\u0000\u0000\u0000\u0138"+
		"\u001f\u0001\u0000\u0000\u0000\u0139\u013f\u00056\u0000\u0000\u013a\u013f"+
		"\u00057\u0000\u0000\u013b\u013f\u0007\b\u0000\u0000\u013c\u013f\u0005"+
		"\u0007\u0000\u0000\u013d\u013f\u0003\"\u0011\u0000\u013e\u0139\u0001\u0000"+
		"\u0000\u0000\u013e\u013a\u0001\u0000\u0000\u0000\u013e\u013b\u0001\u0000"+
		"\u0000\u0000\u013e\u013c\u0001\u0000\u0000\u0000\u013e\u013d\u0001\u0000"+
		"\u0000\u0000\u013f!\u0001\u0000\u0000\u0000\u0140\u0142\u0005\u0018\u0000"+
		"\u0000\u0141\u0143\u0003\u0018\f\u0000\u0142\u0141\u0001\u0000\u0000\u0000"+
		"\u0142\u0143\u0001\u0000\u0000\u0000\u0143\u0144\u0001\u0000\u0000\u0000"+
		"\u0144\u0145\u0005\u0019\u0000\u0000\u0145#\u0001\u0000\u0000\u0000\u0146"+
		"\u0147\u0005;\u0000\u0000\u0147\u014c\u0003\u0016\u000b\u0000\u0148\u0149"+
		"\u0005:\u0000\u0000\u0149\u014b\u0003\u0016\u000b\u0000\u014a\u0148\u0001"+
		"\u0000\u0000\u0000\u014b\u014e\u0001\u0000\u0000\u0000\u014c\u014a\u0001"+
		"\u0000\u0000\u0000\u014c\u014d\u0001\u0000\u0000\u0000\u014d\u014f\u0001"+
		"\u0000\u0000\u0000\u014e\u014c\u0001\u0000\u0000\u0000\u014f\u0150\u0005"+
		"9\u0000\u0000\u0150\u0153\u0001\u0000\u0000\u0000\u0151\u0153\u00058\u0000"+
		"\u0000\u0152\u0146\u0001\u0000\u0000\u0000\u0152\u0151\u0001\u0000\u0000"+
		"\u0000\u0153%\u0001\u0000\u0000\u0000\'),1>AKMQUWckv\u0082\u008a\u008d"+
		"\u0092\u0096\u009a\u00a4\u00ae\u00b8\u00c3\u00c8\u00cf\u00d3\u00d9\u00df"+
		"\u0110\u011d\u011f\u0127\u012c\u0130\u0137\u013e\u0142\u014c\u0152";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}