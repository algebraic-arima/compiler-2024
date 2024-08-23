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
		public TerminalNode SEMI() { return getToken(Mx.SEMI, 0); }
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
			setState(51);
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
				{
				setState(48);
				vardef();
				setState(49);
				match(SEMI);
				}
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
			setState(53);
			type();
			setState(54);
			match(ID);
			setState(55);
			match(LPAR);
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1152921504606847006L) != 0)) {
				{
				setState(56);
				type();
				setState(57);
				match(ID);
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(58);
					match(COMMA);
					setState(59);
					type();
					setState(60);
					match(ID);
					}
					}
					setState(66);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(69);
			match(RPAR);
			setState(70);
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
		public List<TerminalNode> SEMI() { return getTokens(Mx.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(Mx.SEMI, i);
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
		public List<VardefContext> vardef() {
			return getRuleContexts(VardefContext.class);
		}
		public VardefContext vardef(int i) {
			return getRuleContext(VardefContext.class,i);
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
			setState(72);
			match(CLASS);
			setState(73);
			match(ID);
			setState(74);
			match(LBCE);
			setState(81);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(79);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						{
						setState(75);
						vardef();
						setState(76);
						match(SEMI);
						}
						}
						break;
					case 2:
						{
						setState(78);
						funcdef();
						}
						break;
					}
					} 
				}
				setState(83);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(85);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(84);
				constructor();
				}
				break;
			}
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1152921504606847006L) != 0)) {
				{
				setState(91);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					{
					setState(87);
					vardef();
					setState(88);
					match(SEMI);
					}
					}
					break;
				case 2:
					{
					setState(90);
					funcdef();
					}
					break;
				}
				}
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(96);
			match(RBCE);
			setState(97);
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
			setState(99);
			type();
			setState(100);
			singlevardef();
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(101);
				match(COMMA);
				setState(102);
				singlevardef();
				}
				}
				setState(107);
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
			setState(108);
			match(ID);
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(109);
				match(ASSIGN);
				setState(110);
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
			setState(113);
			match(ID);
			setState(114);
			match(LPAR);
			setState(115);
			match(RPAR);
			setState(116);
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
			setState(118);
			match(LBCE);
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1862810194398146494L) != 0)) {
				{
				{
				setState(119);
				stmt();
				}
				}
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(125);
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
		public StmtContext truestmt;
		public StmtContext falsestmt;
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
			setState(145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				_localctx = new IfStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				match(IF);
				setState(128);
				match(LPAR);
				setState(129);
				expr(0);
				setState(130);
				match(RPAR);
				setState(131);
				((IfStmtContext)_localctx).truestmt = stmt();
				setState(134);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(132);
					match(ELSE);
					setState(133);
					((IfStmtContext)_localctx).falsestmt = stmt();
					}
					break;
				}
				}
				break;
			case BREAK:
				_localctx = new BreakStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				match(BREAK);
				setState(137);
				match(SEMI);
				}
				break;
			case CONTINUE:
				_localctx = new ContinueStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(138);
				match(CONTINUE);
				setState(139);
				match(SEMI);
				}
				break;
			case RETURN:
				_localctx = new ReturnStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(140);
				match(RETURN);
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1862810194129455008L) != 0)) {
					{
					setState(141);
					expr(0);
					}
				}

				setState(144);
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
		public ExprContext cond;
		public ExprContext update;
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
		public RowexprContext rowexpr() {
			return getRuleContext(RowexprContext.class,0);
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
			setState(169);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				_localctx = new ForStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				match(FOR);
				setState(148);
				match(LPAR);
				setState(151);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(149);
					rowexpr();
					}
					break;
				case 2:
					{
					setState(150);
					vardef();
					}
					break;
				}
				setState(153);
				match(SEMI);
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1862810194129455008L) != 0)) {
					{
					setState(154);
					((ForStmtContext)_localctx).cond = expr(0);
					}
				}

				setState(157);
				match(SEMI);
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1862810194129455008L) != 0)) {
					{
					setState(158);
					((ForStmtContext)_localctx).update = expr(0);
					}
				}

				setState(161);
				match(RPAR);
				setState(162);
				stmt();
				}
				break;
			case WHILE:
				_localctx = new WhileStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				match(WHILE);
				setState(164);
				match(LPAR);
				setState(165);
				expr(0);
				setState(166);
				match(RPAR);
				setState(167);
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
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	 
		public StmtContext() { }
		public void copyFrom(StmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarDefStmtContext extends StmtContext {
		public VardefContext vardef() {
			return getRuleContext(VardefContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Mx.SEMI, 0); }
		public VarDefStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitVarDefStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprStmtContext extends StmtContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Mx.SEMI, 0); }
		public ExprStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitExprStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LoopStmtContext extends StmtContext {
		public LpstmtContext lpstmt() {
			return getRuleContext(LpstmtContext.class,0);
		}
		public LoopStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitLoopStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JumpStmtContext extends StmtContext {
		public JmpstmtContext jmpstmt() {
			return getRuleContext(JmpstmtContext.class,0);
		}
		public JumpStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitJumpStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlockStmtContext extends StmtContext {
		public StmtsContext stmts() {
			return getRuleContext(StmtsContext.class,0);
		}
		public BlockStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitBlockStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EmptyStmtContext extends StmtContext {
		public TerminalNode SEMI() { return getToken(Mx.SEMI, 0); }
		public EmptyStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitEmptyStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_stmt);
		try {
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				_localctx = new BlockStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				stmts();
				}
				break;
			case 2:
				_localctx = new VarDefStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(172);
				vardef();
				setState(173);
				match(SEMI);
				}
				}
				break;
			case 3:
				_localctx = new ExprStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(175);
				expr(0);
				setState(176);
				match(SEMI);
				}
				break;
			case 4:
				_localctx = new LoopStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(178);
				lpstmt();
				}
				break;
			case 5:
				_localctx = new JumpStmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(179);
				jmpstmt();
				}
				break;
			case 6:
				_localctx = new EmptyStmtContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(180);
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
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> RBKT() { return getTokens(Mx.RBKT); }
		public TerminalNode RBKT(int i) {
			return getToken(Mx.RBKT, i);
		}
		public ArrayliteralContext arrayliteral() {
			return getRuleContext(ArrayliteralContext.class,0);
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
			setState(229);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				_localctx = new ParenthesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(184);
				match(LPAR);
				setState(185);
				expr(0);
				setState(186);
				match(RPAR);
				}
				break;
			case 2:
				{
				_localctx = new FuncCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(188);
				match(ID);
				setState(189);
				match(LPAR);
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1862810194129455008L) != 0)) {
					{
					setState(190);
					rowexpr();
					}
				}

				setState(193);
				match(RPAR);
				}
				break;
			case 3:
				{
				_localctx = new LUnaryExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(194);
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
				setState(195);
				expr(20);
				}
				break;
			case 4:
				{
				_localctx = new LUnaryExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(196);
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
				setState(197);
				expr(19);
				}
				break;
			case 5:
				{
				_localctx = new NewArrayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(198);
				match(NEW);
				setState(199);
				singletype();
				setState(206);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(200);
						match(LBKT);
						setState(201);
						expr(0);
						setState(202);
						match(RBKT);
						}
						} 
					}
					setState(208);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				}
				setState(213);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(209);
						match(LBKT);
						setState(210);
						match(RBKT);
						}
						} 
					}
					setState(215);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				}
				setState(217);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(216);
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
				setState(219);
				match(NEW);
				setState(220);
				match(ID);
				setState(223);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(221);
					match(LPAR);
					setState(222);
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
				setState(225);
				match(THIS);
				}
				break;
			case 8:
				{
				_localctx = new VarAccessContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(226);
				match(ID);
				}
				break;
			case 9:
				{
				_localctx = new ConstantContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(227);
				literal();
				}
				break;
			case 10:
				{
				_localctx = new FormatStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(228);
				fmtstr();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(290);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(288);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryExpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(231);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(232);
						((BinaryExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 30064771072L) != 0)) ) {
							((BinaryExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(233);
						expr(19);
						}
						break;
					case 2:
						{
						_localctx = new BinaryExpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(234);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(235);
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
						setState(236);
						expr(18);
						}
						break;
					case 3:
						{
						_localctx = new BinaryExpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(237);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(238);
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
						setState(239);
						expr(17);
						}
						break;
					case 4:
						{
						_localctx = new BinaryExpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(240);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(241);
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
						setState(242);
						expr(16);
						}
						break;
					case 5:
						{
						_localctx = new BinaryExpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(243);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(244);
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
						setState(245);
						expr(15);
						}
						break;
					case 6:
						{
						_localctx = new BinaryExpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(246);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(247);
						((BinaryExpContext)_localctx).op = match(BAND);
						setState(248);
						expr(14);
						}
						break;
					case 7:
						{
						_localctx = new BinaryExpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(249);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(250);
						((BinaryExpContext)_localctx).op = match(BXOR);
						setState(251);
						expr(13);
						}
						break;
					case 8:
						{
						_localctx = new BinaryExpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(252);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(253);
						((BinaryExpContext)_localctx).op = match(BOR);
						setState(254);
						expr(12);
						}
						break;
					case 9:
						{
						_localctx = new BinaryExpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(255);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(256);
						((BinaryExpContext)_localctx).op = match(AND);
						setState(257);
						expr(11);
						}
						break;
					case 10:
						{
						_localctx = new BinaryExpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(258);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(259);
						((BinaryExpContext)_localctx).op = match(OR);
						setState(260);
						expr(10);
						}
						break;
					case 11:
						{
						_localctx = new TernaryExpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(261);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(262);
						((TernaryExpContext)_localctx).op = match(QUES);
						setState(263);
						expr(0);
						setState(264);
						((TernaryExpContext)_localctx).op = match(COLON);
						setState(265);
						expr(8);
						}
						break;
					case 12:
						{
						_localctx = new AssignExpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(267);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(268);
						((AssignExpContext)_localctx).op = match(ASSIGN);
						setState(269);
						expr(7);
						}
						break;
					case 13:
						{
						_localctx = new MemberFuncCallContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(270);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(271);
						match(MEMB);
						setState(272);
						match(ID);
						setState(273);
						match(LPAR);
						setState(275);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1862810194129455008L) != 0)) {
							{
							setState(274);
							rowexpr();
							}
						}

						setState(277);
						match(RPAR);
						}
						break;
					case 14:
						{
						_localctx = new MemberObjAccessContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(278);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(279);
						match(MEMB);
						setState(280);
						match(ID);
						}
						break;
					case 15:
						{
						_localctx = new ArrayAccessContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(281);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(282);
						match(LBKT);
						setState(283);
						expr(0);
						setState(284);
						match(RBKT);
						}
						break;
					case 16:
						{
						_localctx = new RUnaryExpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(286);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(287);
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
				setState(292);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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
			setState(293);
			expr(0);
			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(294);
				match(COMMA);
				setState(295);
				expr(0);
				}
				}
				setState(300);
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
			setState(303);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(301);
				singletype();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(302);
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
			setState(307);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
			case BOOL:
			case INT:
			case STRING:
				_localctx = new BaseTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(305);
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
				setState(306);
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
			setState(309);
			singletype();
			setState(312); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(310);
				match(LBKT);
				setState(311);
				match(RBKT);
				}
				}
				setState(314); 
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
			setState(321);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTCONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(316);
				match(INTCONST);
				}
				break;
			case STRINGCONST:
				enterOuterAlt(_localctx, 2);
				{
				setState(317);
				match(STRINGCONST);
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(318);
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
				setState(319);
				match(NULL);
				}
				break;
			case LBCE:
				enterOuterAlt(_localctx, 5);
				{
				setState(320);
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
			setState(323);
			match(LBCE);
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1862810194129455008L) != 0)) {
				{
				setState(324);
				rowexpr();
				}
			}

			setState(327);
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
			setState(341);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FMTSTRBGN:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(329);
				match(FMTSTRBGN);
				{
				setState(330);
				expr(0);
				setState(335);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==FMTSTRBODY) {
					{
					{
					setState(331);
					match(FMTSTRBODY);
					setState(332);
					expr(0);
					}
					}
					setState(337);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(338);
				match(FMTSTREND);
				}
				}
				break;
			case FMTSTRPURE:
				enterOuterAlt(_localctx, 2);
				{
				setState(340);
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
			return precpred(_ctx, 18);
		case 1:
			return precpred(_ctx, 17);
		case 2:
			return precpred(_ctx, 16);
		case 3:
			return precpred(_ctx, 15);
		case 4:
			return precpred(_ctx, 14);
		case 5:
			return precpred(_ctx, 13);
		case 6:
			return precpred(_ctx, 12);
		case 7:
			return precpred(_ctx, 11);
		case 8:
			return precpred(_ctx, 10);
		case 9:
			return precpred(_ctx, 9);
		case 10:
			return precpred(_ctx, 8);
		case 11:
			return precpred(_ctx, 7);
		case 12:
			return precpred(_ctx, 25);
		case 13:
			return precpred(_ctx, 24);
		case 14:
			return precpred(_ctx, 23);
		case 15:
			return precpred(_ctx, 21);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001<\u0158\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0001\u0000\u0004\u0000(\b\u0000\u000b\u0000\f\u0000)\u0001\u0000\u0003"+
		"\u0000-\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u00014\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005"+
		"\u0002?\b\u0002\n\u0002\f\u0002B\t\u0002\u0003\u0002D\b\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003P\b\u0003\n\u0003\f\u0003"+
		"S\t\u0003\u0001\u0003\u0003\u0003V\b\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0005\u0003\\\b\u0003\n\u0003\f\u0003_\t\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0005\u0004h\b\u0004\n\u0004\f\u0004k\t\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005p\b\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0005\u0007y\b"+
		"\u0007\n\u0007\f\u0007|\t\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u0087\b\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u008f\b\b\u0001\b\u0003\b\u0092"+
		"\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u0098\b\t\u0001\t\u0001\t"+
		"\u0003\t\u009c\b\t\u0001\t\u0001\t\u0003\t\u00a0\b\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00aa\b\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003"+
		"\n\u00b6\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00c0\b\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00cd\b\u000b"+
		"\n\u000b\f\u000b\u00d0\t\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00d4"+
		"\b\u000b\n\u000b\f\u000b\u00d7\t\u000b\u0001\u000b\u0003\u000b\u00da\b"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00e0"+
		"\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00e6"+
		"\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0114\b\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u0121\b\u000b\n"+
		"\u000b\f\u000b\u0124\t\u000b\u0001\f\u0001\f\u0001\f\u0005\f\u0129\b\f"+
		"\n\f\f\f\u012c\t\f\u0001\r\u0001\r\u0003\r\u0130\b\r\u0001\u000e\u0001"+
		"\u000e\u0003\u000e\u0134\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0004"+
		"\u000f\u0139\b\u000f\u000b\u000f\f\u000f\u013a\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0142\b\u0010\u0001\u0011"+
		"\u0001\u0011\u0003\u0011\u0146\b\u0011\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u014e\b\u0012\n\u0012"+
		"\f\u0012\u0151\t\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012"+
		"\u0156\b\u0012\u0001\u0012\u0000\u0001\u0016\u0013\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$\u0000"+
		"\t\u0001\u000034\u0003\u0000\u001f\u001f++11\u0001\u0000 \"\u0001\u0000"+
		"\u001e\u001f\u0001\u0000,-\u0001\u0000#&\u0001\u0000\'(\u0001\u0000\u0001"+
		"\u0004\u0001\u0000\b\t\u018b\u0000\'\u0001\u0000\u0000\u0000\u00023\u0001"+
		"\u0000\u0000\u0000\u00045\u0001\u0000\u0000\u0000\u0006H\u0001\u0000\u0000"+
		"\u0000\bc\u0001\u0000\u0000\u0000\nl\u0001\u0000\u0000\u0000\fq\u0001"+
		"\u0000\u0000\u0000\u000ev\u0001\u0000\u0000\u0000\u0010\u0091\u0001\u0000"+
		"\u0000\u0000\u0012\u00a9\u0001\u0000\u0000\u0000\u0014\u00b5\u0001\u0000"+
		"\u0000\u0000\u0016\u00e5\u0001\u0000\u0000\u0000\u0018\u0125\u0001\u0000"+
		"\u0000\u0000\u001a\u012f\u0001\u0000\u0000\u0000\u001c\u0133\u0001\u0000"+
		"\u0000\u0000\u001e\u0135\u0001\u0000\u0000\u0000 \u0141\u0001\u0000\u0000"+
		"\u0000\"\u0143\u0001\u0000\u0000\u0000$\u0155\u0001\u0000\u0000\u0000"+
		"&(\u0003\u0002\u0001\u0000\'&\u0001\u0000\u0000\u0000()\u0001\u0000\u0000"+
		"\u0000)\'\u0001\u0000\u0000\u0000)*\u0001\u0000\u0000\u0000*,\u0001\u0000"+
		"\u0000\u0000+-\u0005\u0000\u0000\u0001,+\u0001\u0000\u0000\u0000,-\u0001"+
		"\u0000\u0000\u0000-\u0001\u0001\u0000\u0000\u0000.4\u0003\u0004\u0002"+
		"\u0000/4\u0003\u0006\u0003\u000001\u0003\b\u0004\u000012\u0005\u001c\u0000"+
		"\u000024\u0001\u0000\u0000\u00003.\u0001\u0000\u0000\u00003/\u0001\u0000"+
		"\u0000\u000030\u0001\u0000\u0000\u00004\u0003\u0001\u0000\u0000\u0000"+
		"56\u0003\u001a\r\u000067\u0005<\u0000\u00007C\u0005\u0014\u0000\u0000"+
		"89\u0003\u001a\r\u00009@\u0005<\u0000\u0000:;\u0005\u001d\u0000\u0000"+
		";<\u0003\u001a\r\u0000<=\u0005<\u0000\u0000=?\u0001\u0000\u0000\u0000"+
		">:\u0001\u0000\u0000\u0000?B\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000"+
		"\u0000@A\u0001\u0000\u0000\u0000AD\u0001\u0000\u0000\u0000B@\u0001\u0000"+
		"\u0000\u0000C8\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000DE\u0001"+
		"\u0000\u0000\u0000EF\u0005\u0015\u0000\u0000FG\u0003\u000e\u0007\u0000"+
		"G\u0005\u0001\u0000\u0000\u0000HI\u0005\u0006\u0000\u0000IJ\u0005<\u0000"+
		"\u0000JQ\u0005\u0018\u0000\u0000KL\u0003\b\u0004\u0000LM\u0005\u001c\u0000"+
		"\u0000MP\u0001\u0000\u0000\u0000NP\u0003\u0004\u0002\u0000OK\u0001\u0000"+
		"\u0000\u0000ON\u0001\u0000\u0000\u0000PS\u0001\u0000\u0000\u0000QO\u0001"+
		"\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000RU\u0001\u0000\u0000\u0000"+
		"SQ\u0001\u0000\u0000\u0000TV\u0003\f\u0006\u0000UT\u0001\u0000\u0000\u0000"+
		"UV\u0001\u0000\u0000\u0000V]\u0001\u0000\u0000\u0000WX\u0003\b\u0004\u0000"+
		"XY\u0005\u001c\u0000\u0000Y\\\u0001\u0000\u0000\u0000Z\\\u0003\u0004\u0002"+
		"\u0000[W\u0001\u0000\u0000\u0000[Z\u0001\u0000\u0000\u0000\\_\u0001\u0000"+
		"\u0000\u0000][\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^`\u0001"+
		"\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000`a\u0005\u0019\u0000\u0000"+
		"ab\u0005\u001c\u0000\u0000b\u0007\u0001\u0000\u0000\u0000cd\u0003\u001a"+
		"\r\u0000di\u0003\n\u0005\u0000ef\u0005\u001d\u0000\u0000fh\u0003\n\u0005"+
		"\u0000ge\u0001\u0000\u0000\u0000hk\u0001\u0000\u0000\u0000ig\u0001\u0000"+
		"\u0000\u0000ij\u0001\u0000\u0000\u0000j\t\u0001\u0000\u0000\u0000ki\u0001"+
		"\u0000\u0000\u0000lo\u0005<\u0000\u0000mn\u00052\u0000\u0000np\u0003\u0016"+
		"\u000b\u0000om\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000p\u000b"+
		"\u0001\u0000\u0000\u0000qr\u0005<\u0000\u0000rs\u0005\u0014\u0000\u0000"+
		"st\u0005\u0015\u0000\u0000tu\u0003\u000e\u0007\u0000u\r\u0001\u0000\u0000"+
		"\u0000vz\u0005\u0018\u0000\u0000wy\u0003\u0014\n\u0000xw\u0001\u0000\u0000"+
		"\u0000y|\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000z{\u0001\u0000"+
		"\u0000\u0000{}\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000}~\u0005"+
		"\u0019\u0000\u0000~\u000f\u0001\u0000\u0000\u0000\u007f\u0080\u0005\u000b"+
		"\u0000\u0000\u0080\u0081\u0005\u0014\u0000\u0000\u0081\u0082\u0003\u0016"+
		"\u000b\u0000\u0082\u0083\u0005\u0015\u0000\u0000\u0083\u0086\u0003\u0014"+
		"\n\u0000\u0084\u0085\u0005\f\u0000\u0000\u0085\u0087\u0003\u0014\n\u0000"+
		"\u0086\u0084\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000"+
		"\u0087\u0092\u0001\u0000\u0000\u0000\u0088\u0089\u0005\u000f\u0000\u0000"+
		"\u0089\u0092\u0005\u001c\u0000\u0000\u008a\u008b\u0005\u0010\u0000\u0000"+
		"\u008b\u0092\u0005\u001c\u0000\u0000\u008c\u008e\u0005\u0011\u0000\u0000"+
		"\u008d\u008f\u0003\u0016\u000b\u0000\u008e\u008d\u0001\u0000\u0000\u0000"+
		"\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000"+
		"\u0090\u0092\u0005\u001c\u0000\u0000\u0091\u007f\u0001\u0000\u0000\u0000"+
		"\u0091\u0088\u0001\u0000\u0000\u0000\u0091\u008a\u0001\u0000\u0000\u0000"+
		"\u0091\u008c\u0001\u0000\u0000\u0000\u0092\u0011\u0001\u0000\u0000\u0000"+
		"\u0093\u0094\u0005\r\u0000\u0000\u0094\u0097\u0005\u0014\u0000\u0000\u0095"+
		"\u0098\u0003\u0018\f\u0000\u0096\u0098\u0003\b\u0004\u0000\u0097\u0095"+
		"\u0001\u0000\u0000\u0000\u0097\u0096\u0001\u0000\u0000\u0000\u0097\u0098"+
		"\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u009b"+
		"\u0005\u001c\u0000\u0000\u009a\u009c\u0003\u0016\u000b\u0000\u009b\u009a"+
		"\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u009d"+
		"\u0001\u0000\u0000\u0000\u009d\u009f\u0005\u001c\u0000\u0000\u009e\u00a0"+
		"\u0003\u0016\u000b\u0000\u009f\u009e\u0001\u0000\u0000\u0000\u009f\u00a0"+
		"\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1\u00a2"+
		"\u0005\u0015\u0000\u0000\u00a2\u00aa\u0003\u0014\n\u0000\u00a3\u00a4\u0005"+
		"\u000e\u0000\u0000\u00a4\u00a5\u0005\u0014\u0000\u0000\u00a5\u00a6\u0003"+
		"\u0016\u000b\u0000\u00a6\u00a7\u0005\u0015\u0000\u0000\u00a7\u00a8\u0003"+
		"\u0014\n\u0000\u00a8\u00aa\u0001\u0000\u0000\u0000\u00a9\u0093\u0001\u0000"+
		"\u0000\u0000\u00a9\u00a3\u0001\u0000\u0000\u0000\u00aa\u0013\u0001\u0000"+
		"\u0000\u0000\u00ab\u00b6\u0003\u000e\u0007\u0000\u00ac\u00ad\u0003\b\u0004"+
		"\u0000\u00ad\u00ae\u0005\u001c\u0000\u0000\u00ae\u00b6\u0001\u0000\u0000"+
		"\u0000\u00af\u00b0\u0003\u0016\u000b\u0000\u00b0\u00b1\u0005\u001c\u0000"+
		"\u0000\u00b1\u00b6\u0001\u0000\u0000\u0000\u00b2\u00b6\u0003\u0012\t\u0000"+
		"\u00b3\u00b6\u0003\u0010\b\u0000\u00b4\u00b6\u0005\u001c\u0000\u0000\u00b5"+
		"\u00ab\u0001\u0000\u0000\u0000\u00b5\u00ac\u0001\u0000\u0000\u0000\u00b5"+
		"\u00af\u0001\u0000\u0000\u0000\u00b5\u00b2\u0001\u0000\u0000\u0000\u00b5"+
		"\u00b3\u0001\u0000\u0000\u0000\u00b5\u00b4\u0001\u0000\u0000\u0000\u00b6"+
		"\u0015\u0001\u0000\u0000\u0000\u00b7\u00b8\u0006\u000b\uffff\uffff\u0000"+
		"\u00b8\u00b9\u0005\u0014\u0000\u0000\u00b9\u00ba\u0003\u0016\u000b\u0000"+
		"\u00ba\u00bb\u0005\u0015\u0000\u0000\u00bb\u00e6\u0001\u0000\u0000\u0000"+
		"\u00bc\u00bd\u0005<\u0000\u0000\u00bd\u00bf\u0005\u0014\u0000\u0000\u00be"+
		"\u00c0\u0003\u0018\f\u0000\u00bf\u00be\u0001\u0000\u0000\u0000\u00bf\u00c0"+
		"\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1\u00e6"+
		"\u0005\u0015\u0000\u0000\u00c2\u00c3\u0007\u0000\u0000\u0000\u00c3\u00e6"+
		"\u0003\u0016\u000b\u0014\u00c4\u00c5\u0007\u0001\u0000\u0000\u00c5\u00e6"+
		"\u0003\u0016\u000b\u0013\u00c6\u00c7\u0005\u0005\u0000\u0000\u00c7\u00ce"+
		"\u0003\u001c\u000e\u0000\u00c8\u00c9\u0005\u0016\u0000\u0000\u00c9\u00ca"+
		"\u0003\u0016\u000b\u0000\u00ca\u00cb\u0005\u0017\u0000\u0000\u00cb\u00cd"+
		"\u0001\u0000\u0000\u0000\u00cc\u00c8\u0001\u0000\u0000\u0000\u00cd\u00d0"+
		"\u0001\u0000\u0000\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000\u00ce\u00cf"+
		"\u0001\u0000\u0000\u0000\u00cf\u00d5\u0001\u0000\u0000\u0000\u00d0\u00ce"+
		"\u0001\u0000\u0000\u0000\u00d1\u00d2\u0005\u0016\u0000\u0000\u00d2\u00d4"+
		"\u0005\u0017\u0000\u0000\u00d3\u00d1\u0001\u0000\u0000\u0000\u00d4\u00d7"+
		"\u0001\u0000\u0000\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d5\u00d6"+
		"\u0001\u0000\u0000\u0000\u00d6\u00d9\u0001\u0000\u0000\u0000\u00d7\u00d5"+
		"\u0001\u0000\u0000\u0000\u00d8\u00da\u0003\"\u0011\u0000\u00d9\u00d8\u0001"+
		"\u0000\u0000\u0000\u00d9\u00da\u0001\u0000\u0000\u0000\u00da\u00e6\u0001"+
		"\u0000\u0000\u0000\u00db\u00dc\u0005\u0005\u0000\u0000\u00dc\u00df\u0005"+
		"<\u0000\u0000\u00dd\u00de\u0005\u0014\u0000\u0000\u00de\u00e0\u0005\u0015"+
		"\u0000\u0000\u00df\u00dd\u0001\u0000\u0000\u0000\u00df\u00e0\u0001\u0000"+
		"\u0000\u0000\u00e0\u00e6\u0001\u0000\u0000\u0000\u00e1\u00e6\u0005\n\u0000"+
		"\u0000\u00e2\u00e6\u0005<\u0000\u0000\u00e3\u00e6\u0003 \u0010\u0000\u00e4"+
		"\u00e6\u0003$\u0012\u0000\u00e5\u00b7\u0001\u0000\u0000\u0000\u00e5\u00bc"+
		"\u0001\u0000\u0000\u0000\u00e5\u00c2\u0001\u0000\u0000\u0000\u00e5\u00c4"+
		"\u0001\u0000\u0000\u0000\u00e5\u00c6\u0001\u0000\u0000\u0000\u00e5\u00db"+
		"\u0001\u0000\u0000\u0000\u00e5\u00e1\u0001\u0000\u0000\u0000\u00e5\u00e2"+
		"\u0001\u0000\u0000\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e5\u00e4"+
		"\u0001\u0000\u0000\u0000\u00e6\u0122\u0001\u0000\u0000\u0000\u00e7\u00e8"+
		"\n\u0012\u0000\u0000\u00e8\u00e9\u0007\u0002\u0000\u0000\u00e9\u0121\u0003"+
		"\u0016\u000b\u0013\u00ea\u00eb\n\u0011\u0000\u0000\u00eb\u00ec\u0007\u0003"+
		"\u0000\u0000\u00ec\u0121\u0003\u0016\u000b\u0012\u00ed\u00ee\n\u0010\u0000"+
		"\u0000\u00ee\u00ef\u0007\u0004\u0000\u0000\u00ef\u0121\u0003\u0016\u000b"+
		"\u0011\u00f0\u00f1\n\u000f\u0000\u0000\u00f1\u00f2\u0007\u0005\u0000\u0000"+
		"\u00f2\u0121\u0003\u0016\u000b\u0010\u00f3\u00f4\n\u000e\u0000\u0000\u00f4"+
		"\u00f5\u0007\u0006\u0000\u0000\u00f5\u0121\u0003\u0016\u000b\u000f\u00f6"+
		"\u00f7\n\r\u0000\u0000\u00f7\u00f8\u0005.\u0000\u0000\u00f8\u0121\u0003"+
		"\u0016\u000b\u000e\u00f9\u00fa\n\f\u0000\u0000\u00fa\u00fb\u00050\u0000"+
		"\u0000\u00fb\u0121\u0003\u0016\u000b\r\u00fc\u00fd\n\u000b\u0000\u0000"+
		"\u00fd\u00fe\u0005/\u0000\u0000\u00fe\u0121\u0003\u0016\u000b\f\u00ff"+
		"\u0100\n\n\u0000\u0000\u0100\u0101\u0005)\u0000\u0000\u0101\u0121\u0003"+
		"\u0016\u000b\u000b\u0102\u0103\n\t\u0000\u0000\u0103\u0104\u0005*\u0000"+
		"\u0000\u0104\u0121\u0003\u0016\u000b\n\u0105\u0106\n\b\u0000\u0000\u0106"+
		"\u0107\u0005\u001a\u0000\u0000\u0107\u0108\u0003\u0016\u000b\u0000\u0108"+
		"\u0109\u0005\u001b\u0000\u0000\u0109\u010a\u0003\u0016\u000b\b\u010a\u0121"+
		"\u0001\u0000\u0000\u0000\u010b\u010c\n\u0007\u0000\u0000\u010c\u010d\u0005"+
		"2\u0000\u0000\u010d\u0121\u0003\u0016\u000b\u0007\u010e\u010f\n\u0019"+
		"\u0000\u0000\u010f\u0110\u00055\u0000\u0000\u0110\u0111\u0005<\u0000\u0000"+
		"\u0111\u0113\u0005\u0014\u0000\u0000\u0112\u0114\u0003\u0018\f\u0000\u0113"+
		"\u0112\u0001\u0000\u0000\u0000\u0113\u0114\u0001\u0000\u0000\u0000\u0114"+
		"\u0115\u0001\u0000\u0000\u0000\u0115\u0121\u0005\u0015\u0000\u0000\u0116"+
		"\u0117\n\u0018\u0000\u0000\u0117\u0118\u00055\u0000\u0000\u0118\u0121"+
		"\u0005<\u0000\u0000\u0119\u011a\n\u0017\u0000\u0000\u011a\u011b\u0005"+
		"\u0016\u0000\u0000\u011b\u011c\u0003\u0016\u000b\u0000\u011c\u011d\u0005"+
		"\u0017\u0000\u0000\u011d\u0121\u0001\u0000\u0000\u0000\u011e\u011f\n\u0015"+
		"\u0000\u0000\u011f\u0121\u0007\u0000\u0000\u0000\u0120\u00e7\u0001\u0000"+
		"\u0000\u0000\u0120\u00ea\u0001\u0000\u0000\u0000\u0120\u00ed\u0001\u0000"+
		"\u0000\u0000\u0120\u00f0\u0001\u0000\u0000\u0000\u0120\u00f3\u0001\u0000"+
		"\u0000\u0000\u0120\u00f6\u0001\u0000\u0000\u0000\u0120\u00f9\u0001\u0000"+
		"\u0000\u0000\u0120\u00fc\u0001\u0000\u0000\u0000\u0120\u00ff\u0001\u0000"+
		"\u0000\u0000\u0120\u0102\u0001\u0000\u0000\u0000\u0120\u0105\u0001\u0000"+
		"\u0000\u0000\u0120\u010b\u0001\u0000\u0000\u0000\u0120\u010e\u0001\u0000"+
		"\u0000\u0000\u0120\u0116\u0001\u0000\u0000\u0000\u0120\u0119\u0001\u0000"+
		"\u0000\u0000\u0120\u011e\u0001\u0000\u0000\u0000\u0121\u0124\u0001\u0000"+
		"\u0000\u0000\u0122\u0120\u0001\u0000\u0000\u0000\u0122\u0123\u0001\u0000"+
		"\u0000\u0000\u0123\u0017\u0001\u0000\u0000\u0000\u0124\u0122\u0001\u0000"+
		"\u0000\u0000\u0125\u012a\u0003\u0016\u000b\u0000\u0126\u0127\u0005\u001d"+
		"\u0000\u0000\u0127\u0129\u0003\u0016\u000b\u0000\u0128\u0126\u0001\u0000"+
		"\u0000\u0000\u0129\u012c\u0001\u0000\u0000\u0000\u012a\u0128\u0001\u0000"+
		"\u0000\u0000\u012a\u012b\u0001\u0000\u0000\u0000\u012b\u0019\u0001\u0000"+
		"\u0000\u0000\u012c\u012a\u0001\u0000\u0000\u0000\u012d\u0130\u0003\u001c"+
		"\u000e\u0000\u012e\u0130\u0003\u001e\u000f\u0000\u012f\u012d\u0001\u0000"+
		"\u0000\u0000\u012f\u012e\u0001\u0000\u0000\u0000\u0130\u001b\u0001\u0000"+
		"\u0000\u0000\u0131\u0134\u0007\u0007\u0000\u0000\u0132\u0134\u0005<\u0000"+
		"\u0000\u0133\u0131\u0001\u0000\u0000\u0000\u0133\u0132\u0001\u0000\u0000"+
		"\u0000\u0134\u001d\u0001\u0000\u0000\u0000\u0135\u0138\u0003\u001c\u000e"+
		"\u0000\u0136\u0137\u0005\u0016\u0000\u0000\u0137\u0139\u0005\u0017\u0000"+
		"\u0000\u0138\u0136\u0001\u0000\u0000\u0000\u0139\u013a\u0001\u0000\u0000"+
		"\u0000\u013a\u0138\u0001\u0000\u0000\u0000\u013a\u013b\u0001\u0000\u0000"+
		"\u0000\u013b\u001f\u0001\u0000\u0000\u0000\u013c\u0142\u00056\u0000\u0000"+
		"\u013d\u0142\u00057\u0000\u0000\u013e\u0142\u0007\b\u0000\u0000\u013f"+
		"\u0142\u0005\u0007\u0000\u0000\u0140\u0142\u0003\"\u0011\u0000\u0141\u013c"+
		"\u0001\u0000\u0000\u0000\u0141\u013d\u0001\u0000\u0000\u0000\u0141\u013e"+
		"\u0001\u0000\u0000\u0000\u0141\u013f\u0001\u0000\u0000\u0000\u0141\u0140"+
		"\u0001\u0000\u0000\u0000\u0142!\u0001\u0000\u0000\u0000\u0143\u0145\u0005"+
		"\u0018\u0000\u0000\u0144\u0146\u0003\u0018\f\u0000\u0145\u0144\u0001\u0000"+
		"\u0000\u0000\u0145\u0146\u0001\u0000\u0000\u0000\u0146\u0147\u0001\u0000"+
		"\u0000\u0000\u0147\u0148\u0005\u0019\u0000\u0000\u0148#\u0001\u0000\u0000"+
		"\u0000\u0149\u014a\u0005;\u0000\u0000\u014a\u014f\u0003\u0016\u000b\u0000"+
		"\u014b\u014c\u0005:\u0000\u0000\u014c\u014e\u0003\u0016\u000b\u0000\u014d"+
		"\u014b\u0001\u0000\u0000\u0000\u014e\u0151\u0001\u0000\u0000\u0000\u014f"+
		"\u014d\u0001\u0000\u0000\u0000\u014f\u0150\u0001\u0000\u0000\u0000\u0150"+
		"\u0152\u0001\u0000\u0000\u0000\u0151\u014f\u0001\u0000\u0000\u0000\u0152"+
		"\u0153\u00059\u0000\u0000\u0153\u0156\u0001\u0000\u0000\u0000\u0154\u0156"+
		"\u00058\u0000\u0000\u0155\u0149\u0001\u0000\u0000\u0000\u0155\u0154\u0001"+
		"\u0000\u0000\u0000\u0156%\u0001\u0000\u0000\u0000&),3@COQU[]ioz\u0086"+
		"\u008e\u0091\u0097\u009b\u009f\u00a9\u00b5\u00bf\u00ce\u00d5\u00d9\u00df"+
		"\u00e5\u0113\u0120\u0122\u012a\u012f\u0133\u013a\u0141\u0145\u014f\u0155";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}