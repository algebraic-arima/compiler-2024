// Generated from Mx.g4 by ANTLR 4.7.1

package src.parser;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Mx extends Parser {
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
		INTCONST=54, STRINGCONST=55, FMTSTRPURE=56, FMTSTREND=57, FMTSTRBODY=58, 
		FMTSTRBGN=59, ID=60;
	public static final int
		RULE_prog = 0, RULE_def = 1, RULE_funcdef = 2, RULE_classdef = 3, RULE_vardef = 4, 
		RULE_stmts = 5, RULE_jmpstmt = 6, RULE_loopstmt = 7, RULE_branchstmt = 8, 
		RULE_stmt = 9, RULE_expr = 10, RULE_rowexpr = 11, RULE_indbrackets = 12, 
		RULE_type = 13, RULE_atomtype = 14, RULE_arraytype = 15, RULE_literal = 16, 
		RULE_arrayliteral = 17, RULE_fmtstr = 18;
	public static final String[] ruleNames = {
		"prog", "def", "funcdef", "classdef", "vardef", "stmts", "jmpstmt", "loopstmt", 
		"branchstmt", "stmt", "expr", "rowexpr", "indbrackets", "type", "atomtype", 
		"arraytype", "literal", "arrayliteral", "fmtstr"
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
		"FMTSTREND", "FMTSTRBODY", "FMTSTRBGN", "ID"
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
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOID) | (1L << BOOL) | (1L << INT) | (1L << STRING) | (1L << CLASS) | (1L << ID))) != 0) );
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
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOID) | (1L << BOOL) | (1L << INT) | (1L << STRING) | (1L << ID))) != 0)) {
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
			setState(84);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(80);
				match(ID);
				setState(81);
				match(LPAR);
				setState(82);
				match(RPAR);
				setState(83);
				stmts();
				}
				break;
			}
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOID) | (1L << BOOL) | (1L << INT) | (1L << STRING) | (1L << ID))) != 0)) {
				{
				setState(88);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
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
			match(RBCE);
			setState(94);
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

			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(102);
				match(COMMA);
				setState(103);
				match(ID);
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(104);
					match(ASSIGN);
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
		enterRule(_localctx, 10, RULE_stmts);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(LBCE);
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOID) | (1L << BOOL) | (1L << INT) | (1L << STRING) | (1L << NEW) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << THIS) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << BREAK) | (1L << CONTINUE) | (1L << RETURN) | (1L << LPAR) | (1L << LBCE) | (1L << SEMI) | (1L << SUB) | (1L << NOT) | (1L << BNOT) | (1L << SINC) | (1L << SDEC) | (1L << INTCONST) | (1L << STRINGCONST) | (1L << FMTSTRPURE) | (1L << FMTSTRBGN) | (1L << ID))) != 0)) {
				{
				{
				setState(116);
				stmt();
				}
				}
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(122);
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
		enterRule(_localctx, 12, RULE_jmpstmt);
		int _la;
		try {
			setState(133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BREAK:
				_localctx = new BreakStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				match(BREAK);
				setState(125);
				match(SEMI);
				}
				break;
			case CONTINUE:
				_localctx = new ContinueStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				match(CONTINUE);
				setState(127);
				match(SEMI);
				}
				break;
			case RETURN:
				_localctx = new ReturnStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(128);
				match(RETURN);
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << THIS) | (1L << LPAR) | (1L << LBCE) | (1L << SUB) | (1L << NOT) | (1L << BNOT) | (1L << SINC) | (1L << SDEC) | (1L << INTCONST) | (1L << STRINGCONST) | (1L << FMTSTRPURE) | (1L << FMTSTRBGN) | (1L << ID))) != 0)) {
					{
					setState(129);
					expr(0);
					}
				}

				setState(132);
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

	public static class LoopstmtContext extends ParserRuleContext {
		public LoopstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopstmt; }
	 
		public LoopstmtContext() { }
		public void copyFrom(LoopstmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WhileStmtContext extends LoopstmtContext {
		public TerminalNode WHILE() { return getToken(Mx.WHILE, 0); }
		public TerminalNode LPAR() { return getToken(Mx.LPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(Mx.RPAR, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public WhileStmtContext(LoopstmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitWhileStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForStmtContext extends LoopstmtContext {
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
		public List<RowexprContext> rowexpr() {
			return getRuleContexts(RowexprContext.class);
		}
		public RowexprContext rowexpr(int i) {
			return getRuleContext(RowexprContext.class,i);
		}
		public ForStmtContext(LoopstmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitForStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopstmtContext loopstmt() throws RecognitionException {
		LoopstmtContext _localctx = new LoopstmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_loopstmt);
		int _la;
		try {
			setState(156);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				_localctx = new ForStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				match(FOR);
				setState(136);
				match(LPAR);
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << THIS) | (1L << LPAR) | (1L << LBCE) | (1L << SUB) | (1L << NOT) | (1L << BNOT) | (1L << SINC) | (1L << SDEC) | (1L << INTCONST) | (1L << STRINGCONST) | (1L << FMTSTRPURE) | (1L << FMTSTRBGN) | (1L << ID))) != 0)) {
					{
					setState(137);
					rowexpr();
					}
				}

				setState(140);
				match(SEMI);
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << THIS) | (1L << LPAR) | (1L << LBCE) | (1L << SUB) | (1L << NOT) | (1L << BNOT) | (1L << SINC) | (1L << SDEC) | (1L << INTCONST) | (1L << STRINGCONST) | (1L << FMTSTRPURE) | (1L << FMTSTRBGN) | (1L << ID))) != 0)) {
					{
					setState(141);
					rowexpr();
					}
				}

				setState(144);
				match(SEMI);
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << THIS) | (1L << LPAR) | (1L << LBCE) | (1L << SUB) | (1L << NOT) | (1L << BNOT) | (1L << SINC) | (1L << SDEC) | (1L << INTCONST) | (1L << STRINGCONST) | (1L << FMTSTRPURE) | (1L << FMTSTRBGN) | (1L << ID))) != 0)) {
					{
					setState(145);
					rowexpr();
					}
				}

				setState(148);
				match(RPAR);
				setState(149);
				stmt();
				}
				break;
			case WHILE:
				_localctx = new WhileStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				match(WHILE);
				setState(151);
				match(LPAR);
				setState(152);
				expr(0);
				setState(153);
				match(RPAR);
				setState(154);
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

	public static class BranchstmtContext extends ParserRuleContext {
		public BranchstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_branchstmt; }
	 
		public BranchstmtContext() { }
		public void copyFrom(BranchstmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IfStmtContext extends BranchstmtContext {
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
		public IfStmtContext(BranchstmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BranchstmtContext branchstmt() throws RecognitionException {
		BranchstmtContext _localctx = new BranchstmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_branchstmt);
		try {
			_localctx = new IfStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(IF);
			setState(159);
			match(LPAR);
			setState(160);
			expr(0);
			setState(161);
			match(RPAR);
			setState(162);
			stmt();
			setState(165);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(163);
				match(ELSE);
				setState(164);
				stmt();
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

	public static class StmtContext extends ParserRuleContext {
		public StmtsContext stmts() {
			return getRuleContext(StmtsContext.class,0);
		}
		public VardefContext vardef() {
			return getRuleContext(VardefContext.class,0);
		}
		public RowexprContext rowexpr() {
			return getRuleContext(RowexprContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Mx.SEMI, 0); }
		public BranchstmtContext branchstmt() {
			return getRuleContext(BranchstmtContext.class,0);
		}
		public LoopstmtContext loopstmt() {
			return getRuleContext(LoopstmtContext.class,0);
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
		enterRule(_localctx, 18, RULE_stmt);
		try {
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				stmts();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				vardef();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(169);
				rowexpr();
				setState(170);
				match(SEMI);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(172);
				branchstmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(173);
				loopstmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(174);
				jmpstmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(175);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarAccessContext extends ExprContext {
		public TerminalNode ID() { return getToken(Mx.ID, 0); }
		public VarAccessContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitVarAccess(this);
			else return visitor.visitChildren(this);
		}
	}
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitMemberFuncAccess(this);
			else return visitor.visitChildren(this);
		}
	}
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
	public static class ThisPointerContext extends ExprContext {
		public TerminalNode THIS() { return getToken(Mx.THIS, 0); }
		public ThisPointerContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitThisPointer(this);
			else return visitor.visitChildren(this);
		}
	}
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitNewArray(this);
			else return visitor.visitChildren(this);
		}
	}
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
	public static class PostSelfContext extends ExprContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SDEC() { return getToken(Mx.SDEC, 0); }
		public TerminalNode SINC() { return getToken(Mx.SINC, 0); }
		public PostSelfContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitPostSelf(this);
			else return visitor.visitChildren(this);
		}
	}
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitUnaryExp(this);
			else return visitor.visitChildren(this);
		}
	}
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
	public static class PreSelfContext extends ExprContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SDEC() { return getToken(Mx.SDEC, 0); }
		public TerminalNode SINC() { return getToken(Mx.SINC, 0); }
		public PreSelfContext(ExprContext ctx) { copyFrom(ctx); }
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				_localctx = new ParenthesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(179);
				match(LPAR);
				setState(180);
				expr(0);
				setState(181);
				match(RPAR);
				}
				break;
			case 2:
				{
				_localctx = new FuncCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(183);
				match(ID);
				setState(184);
				match(LPAR);
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << THIS) | (1L << LPAR) | (1L << LBCE) | (1L << SUB) | (1L << NOT) | (1L << BNOT) | (1L << SINC) | (1L << SDEC) | (1L << INTCONST) | (1L << STRINGCONST) | (1L << FMTSTRPURE) | (1L << FMTSTRBGN) | (1L << ID))) != 0)) {
					{
					setState(185);
					rowexpr();
					}
				}

				setState(188);
				match(RPAR);
				}
				break;
			case 3:
				{
				_localctx = new PostSelfContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(189);
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
				setState(190);
				expr(21);
				}
				break;
			case 4:
				{
				_localctx = new UnaryExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(191);
				((UnaryExpContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUB) | (1L << NOT) | (1L << BNOT))) != 0)) ) {
					((UnaryExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(192);
				expr(20);
				}
				break;
			case 5:
				{
				_localctx = new NewArrayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(193);
				match(NEW);
				setState(194);
				atomtype();
				setState(196); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(195);
						indbrackets();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(198); 
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
				setState(200);
				match(NEW);
				setState(201);
				match(ID);
				setState(204);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(202);
					match(LPAR);
					setState(203);
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
				setState(206);
				match(THIS);
				}
				break;
			case 8:
				{
				_localctx = new VarAccessContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(207);
				match(ID);
				}
				break;
			case 9:
				{
				_localctx = new ConstantContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(208);
				literal();
				}
				break;
			case 10:
				{
				_localctx = new FormatStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(209);
				fmtstr();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(274);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(272);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryExpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(212);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(213);
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
						setState(214);
						expr(20);
						}
						break;
					case 2:
						{
						_localctx = new BinaryExpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(215);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(216);
						((BinaryExpContext)_localctx).op = match(MOD);
						setState(217);
						expr(19);
						}
						break;
					case 3:
						{
						_localctx = new BinaryExpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(218);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(219);
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
						setState(220);
						expr(18);
						}
						break;
					case 4:
						{
						_localctx = new BinaryExpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(221);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(222);
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
						setState(223);
						expr(17);
						}
						break;
					case 5:
						{
						_localctx = new BinaryExpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(224);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(225);
						((BinaryExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << GT) | (1L << LEQ) | (1L << GEQ))) != 0)) ) {
							((BinaryExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(226);
						expr(16);
						}
						break;
					case 6:
						{
						_localctx = new BinaryExpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(227);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(228);
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
						setState(229);
						expr(15);
						}
						break;
					case 7:
						{
						_localctx = new BinaryExpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(230);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(231);
						((BinaryExpContext)_localctx).op = match(BAND);
						setState(232);
						expr(14);
						}
						break;
					case 8:
						{
						_localctx = new BinaryExpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(233);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(234);
						((BinaryExpContext)_localctx).op = match(BXOR);
						setState(235);
						expr(13);
						}
						break;
					case 9:
						{
						_localctx = new BinaryExpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(236);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(237);
						((BinaryExpContext)_localctx).op = match(BOR);
						setState(238);
						expr(12);
						}
						break;
					case 10:
						{
						_localctx = new BinaryExpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(239);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(240);
						((BinaryExpContext)_localctx).op = match(AND);
						setState(241);
						expr(11);
						}
						break;
					case 11:
						{
						_localctx = new BinaryExpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(242);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(243);
						((BinaryExpContext)_localctx).op = match(OR);
						setState(244);
						expr(10);
						}
						break;
					case 12:
						{
						_localctx = new TernaryExpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(245);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(246);
						((TernaryExpContext)_localctx).op = match(QUES);
						setState(247);
						expr(0);
						setState(248);
						((TernaryExpContext)_localctx).op = match(COLON);
						setState(249);
						expr(8);
						}
						break;
					case 13:
						{
						_localctx = new AssignExpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(251);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(252);
						((AssignExpContext)_localctx).op = match(ASSIGN);
						setState(253);
						expr(7);
						}
						break;
					case 14:
						{
						_localctx = new MemberFuncAccessContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(254);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(255);
						match(MEMB);
						setState(256);
						match(ID);
						setState(257);
						match(LPAR);
						setState(259);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << THIS) | (1L << LPAR) | (1L << LBCE) | (1L << SUB) | (1L << NOT) | (1L << BNOT) | (1L << SINC) | (1L << SDEC) | (1L << INTCONST) | (1L << STRINGCONST) | (1L << FMTSTRPURE) | (1L << FMTSTRBGN) | (1L << ID))) != 0)) {
							{
							setState(258);
							rowexpr();
							}
						}

						setState(261);
						match(RPAR);
						}
						break;
					case 15:
						{
						_localctx = new MemberObjAccessContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(262);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(263);
						match(MEMB);
						setState(264);
						match(ID);
						}
						break;
					case 16:
						{
						_localctx = new ArrayAccessContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(265);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(266);
						match(LBKT);
						setState(267);
						expr(0);
						setState(268);
						match(RBKT);
						}
						break;
					case 17:
						{
						_localctx = new PreSelfContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(270);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(271);
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
				setState(276);
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
		enterRule(_localctx, 22, RULE_rowexpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			expr(0);
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(278);
				match(COMMA);
				setState(279);
				expr(0);
				}
				}
				setState(284);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitIndbrackets(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndbracketsContext indbrackets() throws RecognitionException {
		IndbracketsContext _localctx = new IndbracketsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_indbrackets);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(LBKT);
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << THIS) | (1L << LPAR) | (1L << LBCE) | (1L << SUB) | (1L << NOT) | (1L << BNOT) | (1L << SINC) | (1L << SDEC) | (1L << INTCONST) | (1L << STRINGCONST) | (1L << FMTSTRPURE) | (1L << FMTSTRBGN) | (1L << ID))) != 0)) {
				{
				setState(286);
				expr(0);
				}
			}

			setState(289);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_type);
		try {
			setState(293);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(291);
				atomtype();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(292);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxVisitor ) return ((MxVisitor<? extends T>)visitor).visitAtomtype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomtypeContext atomtype() throws RecognitionException {
		AtomtypeContext _localctx = new AtomtypeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_atomtype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
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
			setState(297);
			atomtype();
			setState(303); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(298);
				match(LBKT);
				setState(300);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INTCONST) {
					{
					setState(299);
					match(INTCONST);
					}
				}

				setState(302);
				match(RBKT);
				}
				}
				setState(305); 
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
			setState(312);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTCONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(307);
				match(INTCONST);
				}
				break;
			case STRINGCONST:
				enterOuterAlt(_localctx, 2);
				{
				setState(308);
				match(STRINGCONST);
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(309);
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
				setState(310);
				match(NULL);
				}
				break;
			case LBCE:
				enterOuterAlt(_localctx, 5);
				{
				setState(311);
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
			setState(314);
			match(LBCE);
			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << THIS) | (1L << LPAR) | (1L << LBCE) | (1L << SUB) | (1L << NOT) | (1L << BNOT) | (1L << SINC) | (1L << SDEC) | (1L << INTCONST) | (1L << STRINGCONST) | (1L << FMTSTRPURE) | (1L << FMTSTRBGN) | (1L << ID))) != 0)) {
				{
				setState(315);
				rowexpr();
				}
			}

			setState(318);
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
			setState(332);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FMTSTRBGN:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(320);
				match(FMTSTRBGN);
				{
				setState(321);
				expr(0);
				setState(326);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==FMTSTRBODY) {
					{
					{
					setState(322);
					match(FMTSTRBODY);
					setState(323);
					expr(0);
					}
					}
					setState(328);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(329);
				match(FMTSTREND);
				}
				}
				break;
			case FMTSTRPURE:
				enterOuterAlt(_localctx, 2);
				{
				setState(331);
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
		case 10:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3>\u0151\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\6\2*\n\2\r\2\16\2+\3\2\5\2/\n\2\3\3\3\3\3\3\5"+
		"\3\64\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4?\n\4\f\4\16\4B\13\4"+
		"\5\4D\n\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\7\5N\n\5\f\5\16\5Q\13\5\3\5"+
		"\3\5\3\5\3\5\5\5W\n\5\3\5\3\5\7\5[\n\5\f\5\16\5^\13\5\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\5\6g\n\6\3\6\3\6\3\6\3\6\5\6m\n\6\7\6o\n\6\f\6\16\6r\13\6"+
		"\3\6\3\6\3\7\3\7\7\7x\n\7\f\7\16\7{\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\5\b\u0085\n\b\3\b\5\b\u0088\n\b\3\t\3\t\3\t\5\t\u008d\n\t\3\t\3\t\5"+
		"\t\u0091\n\t\3\t\3\t\5\t\u0095\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t"+
		"\u009f\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00a8\n\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\5\13\u00b3\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\5\f\u00bd\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\6\f\u00c7\n\f\r\f"+
		"\16\f\u00c8\3\f\3\f\3\f\3\f\5\f\u00cf\n\f\3\f\3\f\3\f\3\f\5\f\u00d5\n"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0106\n\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u0113\n\f\f\f\16\f\u0116\13"+
		"\f\3\r\3\r\3\r\7\r\u011b\n\r\f\r\16\r\u011e\13\r\3\16\3\16\5\16\u0122"+
		"\n\16\3\16\3\16\3\17\3\17\5\17\u0128\n\17\3\20\3\20\3\21\3\21\3\21\5\21"+
		"\u012f\n\21\3\21\6\21\u0132\n\21\r\21\16\21\u0133\3\22\3\22\3\22\3\22"+
		"\3\22\5\22\u013b\n\22\3\23\3\23\5\23\u013f\n\23\3\23\3\23\3\24\3\24\3"+
		"\24\3\24\7\24\u0147\n\24\f\24\16\24\u014a\13\24\3\24\3\24\3\24\5\24\u014f"+
		"\n\24\3\24\2\3\26\25\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&\2\13"+
		"\3\2\65\66\5\2!!--\63\63\3\2\"#\3\2 !\3\2./\3\2%(\3\2)*\4\2\3\6>>\3\2"+
		"\n\13\2\u0184\2)\3\2\2\2\4\63\3\2\2\2\6\65\3\2\2\2\bH\3\2\2\2\nb\3\2\2"+
		"\2\fu\3\2\2\2\16\u0087\3\2\2\2\20\u009e\3\2\2\2\22\u00a0\3\2\2\2\24\u00b2"+
		"\3\2\2\2\26\u00d4\3\2\2\2\30\u0117\3\2\2\2\32\u011f\3\2\2\2\34\u0127\3"+
		"\2\2\2\36\u0129\3\2\2\2 \u012b\3\2\2\2\"\u013a\3\2\2\2$\u013c\3\2\2\2"+
		"&\u014e\3\2\2\2(*\5\4\3\2)(\3\2\2\2*+\3\2\2\2+)\3\2\2\2+,\3\2\2\2,.\3"+
		"\2\2\2-/\7\2\2\3.-\3\2\2\2./\3\2\2\2/\3\3\2\2\2\60\64\5\6\4\2\61\64\5"+
		"\b\5\2\62\64\5\n\6\2\63\60\3\2\2\2\63\61\3\2\2\2\63\62\3\2\2\2\64\5\3"+
		"\2\2\2\65\66\5\34\17\2\66\67\7>\2\2\67C\7\26\2\289\5\34\17\29@\7>\2\2"+
		":;\7\37\2\2;<\5\34\17\2<=\7>\2\2=?\3\2\2\2>:\3\2\2\2?B\3\2\2\2@>\3\2\2"+
		"\2@A\3\2\2\2AD\3\2\2\2B@\3\2\2\2C8\3\2\2\2CD\3\2\2\2DE\3\2\2\2EF\7\27"+
		"\2\2FG\5\f\7\2G\7\3\2\2\2HI\7\b\2\2IJ\7>\2\2JO\7\32\2\2KN\5\n\6\2LN\5"+
		"\6\4\2MK\3\2\2\2ML\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2PV\3\2\2\2QO\3"+
		"\2\2\2RS\7>\2\2ST\7\26\2\2TU\7\27\2\2UW\5\f\7\2VR\3\2\2\2VW\3\2\2\2W\\"+
		"\3\2\2\2X[\5\n\6\2Y[\5\6\4\2ZX\3\2\2\2ZY\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2"+
		"\\]\3\2\2\2]_\3\2\2\2^\\\3\2\2\2_`\7\33\2\2`a\7\36\2\2a\t\3\2\2\2bc\5"+
		"\34\17\2cf\7>\2\2de\7\64\2\2eg\5\26\f\2fd\3\2\2\2fg\3\2\2\2gp\3\2\2\2"+
		"hi\7\37\2\2il\7>\2\2jk\7\64\2\2km\5\26\f\2lj\3\2\2\2lm\3\2\2\2mo\3\2\2"+
		"\2nh\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2qs\3\2\2\2rp\3\2\2\2st\7\36"+
		"\2\2t\13\3\2\2\2uy\7\32\2\2vx\5\24\13\2wv\3\2\2\2x{\3\2\2\2yw\3\2\2\2"+
		"yz\3\2\2\2z|\3\2\2\2{y\3\2\2\2|}\7\33\2\2}\r\3\2\2\2~\177\7\21\2\2\177"+
		"\u0088\7\36\2\2\u0080\u0081\7\22\2\2\u0081\u0088\7\36\2\2\u0082\u0084"+
		"\7\23\2\2\u0083\u0085\5\26\f\2\u0084\u0083\3\2\2\2\u0084\u0085\3\2\2\2"+
		"\u0085\u0086\3\2\2\2\u0086\u0088\7\36\2\2\u0087~\3\2\2\2\u0087\u0080\3"+
		"\2\2\2\u0087\u0082\3\2\2\2\u0088\17\3\2\2\2\u0089\u008a\7\17\2\2\u008a"+
		"\u008c\7\26\2\2\u008b\u008d\5\30\r\2\u008c\u008b\3\2\2\2\u008c\u008d\3"+
		"\2\2\2\u008d\u008e\3\2\2\2\u008e\u0090\7\36\2\2\u008f\u0091\5\30\r\2\u0090"+
		"\u008f\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0094\7\36"+
		"\2\2\u0093\u0095\5\30\r\2\u0094\u0093\3\2\2\2\u0094\u0095\3\2\2\2\u0095"+
		"\u0096\3\2\2\2\u0096\u0097\7\27\2\2\u0097\u009f\5\24\13\2\u0098\u0099"+
		"\7\20\2\2\u0099\u009a\7\26\2\2\u009a\u009b\5\26\f\2\u009b\u009c\7\27\2"+
		"\2\u009c\u009d\5\24\13\2\u009d\u009f\3\2\2\2\u009e\u0089\3\2\2\2\u009e"+
		"\u0098\3\2\2\2\u009f\21\3\2\2\2\u00a0\u00a1\7\r\2\2\u00a1\u00a2\7\26\2"+
		"\2\u00a2\u00a3\5\26\f\2\u00a3\u00a4\7\27\2\2\u00a4\u00a7\5\24\13\2\u00a5"+
		"\u00a6\7\16\2\2\u00a6\u00a8\5\24\13\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8"+
		"\3\2\2\2\u00a8\23\3\2\2\2\u00a9\u00b3\5\f\7\2\u00aa\u00b3\5\n\6\2\u00ab"+
		"\u00ac\5\30\r\2\u00ac\u00ad\7\36\2\2\u00ad\u00b3\3\2\2\2\u00ae\u00b3\5"+
		"\22\n\2\u00af\u00b3\5\20\t\2\u00b0\u00b3\5\16\b\2\u00b1\u00b3\7\36\2\2"+
		"\u00b2\u00a9\3\2\2\2\u00b2\u00aa\3\2\2\2\u00b2\u00ab\3\2\2\2\u00b2\u00ae"+
		"\3\2\2\2\u00b2\u00af\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b1\3\2\2\2\u00b3"+
		"\25\3\2\2\2\u00b4\u00b5\b\f\1\2\u00b5\u00b6\7\26\2\2\u00b6\u00b7\5\26"+
		"\f\2\u00b7\u00b8\7\27\2\2\u00b8\u00d5\3\2\2\2\u00b9\u00ba\7>\2\2\u00ba"+
		"\u00bc\7\26\2\2\u00bb\u00bd\5\30\r\2\u00bc\u00bb\3\2\2\2\u00bc\u00bd\3"+
		"\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00d5\7\27\2\2\u00bf\u00c0\t\2\2\2\u00c0"+
		"\u00d5\5\26\f\27\u00c1\u00c2\t\3\2\2\u00c2\u00d5\5\26\f\26\u00c3\u00c4"+
		"\7\7\2\2\u00c4\u00c6\5\36\20\2\u00c5\u00c7\5\32\16\2\u00c6\u00c5\3\2\2"+
		"\2\u00c7\u00c8\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00d5"+
		"\3\2\2\2\u00ca\u00cb\7\7\2\2\u00cb\u00ce\7>\2\2\u00cc\u00cd\7\26\2\2\u00cd"+
		"\u00cf\7\27\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d5\3"+
		"\2\2\2\u00d0\u00d5\7\f\2\2\u00d1\u00d5\7>\2\2\u00d2\u00d5\5\"\22\2\u00d3"+
		"\u00d5\5&\24\2\u00d4\u00b4\3\2\2\2\u00d4\u00b9\3\2\2\2\u00d4\u00bf\3\2"+
		"\2\2\u00d4\u00c1\3\2\2\2\u00d4\u00c3\3\2\2\2\u00d4\u00ca\3\2\2\2\u00d4"+
		"\u00d0\3\2\2\2\u00d4\u00d1\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d3\3\2"+
		"\2\2\u00d5\u0114\3\2\2\2\u00d6\u00d7\f\25\2\2\u00d7\u00d8\t\4\2\2\u00d8"+
		"\u0113\5\26\f\26\u00d9\u00da\f\24\2\2\u00da\u00db\7$\2\2\u00db\u0113\5"+
		"\26\f\25\u00dc\u00dd\f\23\2\2\u00dd\u00de\t\5\2\2\u00de\u0113\5\26\f\24"+
		"\u00df\u00e0\f\22\2\2\u00e0\u00e1\t\6\2\2\u00e1\u0113\5\26\f\23\u00e2"+
		"\u00e3\f\21\2\2\u00e3\u00e4\t\7\2\2\u00e4\u0113\5\26\f\22\u00e5\u00e6"+
		"\f\20\2\2\u00e6\u00e7\t\b\2\2\u00e7\u0113\5\26\f\21\u00e8\u00e9\f\17\2"+
		"\2\u00e9\u00ea\7\60\2\2\u00ea\u0113\5\26\f\20\u00eb\u00ec\f\16\2\2\u00ec"+
		"\u00ed\7\62\2\2\u00ed\u0113\5\26\f\17\u00ee\u00ef\f\r\2\2\u00ef\u00f0"+
		"\7\61\2\2\u00f0\u0113\5\26\f\16\u00f1\u00f2\f\f\2\2\u00f2\u00f3\7+\2\2"+
		"\u00f3\u0113\5\26\f\r\u00f4\u00f5\f\13\2\2\u00f5\u00f6\7,\2\2\u00f6\u0113"+
		"\5\26\f\f\u00f7\u00f8\f\n\2\2\u00f8\u00f9\7\34\2\2\u00f9\u00fa\5\26\f"+
		"\2\u00fa\u00fb\7\35\2\2\u00fb\u00fc\5\26\f\n\u00fc\u0113\3\2\2\2\u00fd"+
		"\u00fe\f\t\2\2\u00fe\u00ff\7\64\2\2\u00ff\u0113\5\26\f\t\u0100\u0101\f"+
		"\34\2\2\u0101\u0102\7\67\2\2\u0102\u0103\7>\2\2\u0103\u0105\7\26\2\2\u0104"+
		"\u0106\5\30\r\2\u0105\u0104\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0107\3"+
		"\2\2\2\u0107\u0113\7\27\2\2\u0108\u0109\f\33\2\2\u0109\u010a\7\67\2\2"+
		"\u010a\u0113\7>\2\2\u010b\u010c\f\32\2\2\u010c\u010d\7\30\2\2\u010d\u010e"+
		"\5\26\f\2\u010e\u010f\7\31\2\2\u010f\u0113\3\2\2\2\u0110\u0111\f\30\2"+
		"\2\u0111\u0113\t\2\2\2\u0112\u00d6\3\2\2\2\u0112\u00d9\3\2\2\2\u0112\u00dc"+
		"\3\2\2\2\u0112\u00df\3\2\2\2\u0112\u00e2\3\2\2\2\u0112\u00e5\3\2\2\2\u0112"+
		"\u00e8\3\2\2\2\u0112\u00eb\3\2\2\2\u0112\u00ee\3\2\2\2\u0112\u00f1\3\2"+
		"\2\2\u0112\u00f4\3\2\2\2\u0112\u00f7\3\2\2\2\u0112\u00fd\3\2\2\2\u0112"+
		"\u0100\3\2\2\2\u0112\u0108\3\2\2\2\u0112\u010b\3\2\2\2\u0112\u0110\3\2"+
		"\2\2\u0113\u0116\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115"+
		"\27\3\2\2\2\u0116\u0114\3\2\2\2\u0117\u011c\5\26\f\2\u0118\u0119\7\37"+
		"\2\2\u0119\u011b\5\26\f\2\u011a\u0118\3\2\2\2\u011b\u011e\3\2\2\2\u011c"+
		"\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\31\3\2\2\2\u011e\u011c\3\2\2"+
		"\2\u011f\u0121\7\30\2\2\u0120\u0122\5\26\f\2\u0121\u0120\3\2\2\2\u0121"+
		"\u0122\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0124\7\31\2\2\u0124\33\3\2\2"+
		"\2\u0125\u0128\5\36\20\2\u0126\u0128\5 \21\2\u0127\u0125\3\2\2\2\u0127"+
		"\u0126\3\2\2\2\u0128\35\3\2\2\2\u0129\u012a\t\t\2\2\u012a\37\3\2\2\2\u012b"+
		"\u0131\5\36\20\2\u012c\u012e\7\30\2\2\u012d\u012f\78\2\2\u012e\u012d\3"+
		"\2\2\2\u012e\u012f\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0132\7\31\2\2\u0131"+
		"\u012c\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2"+
		"\2\2\u0134!\3\2\2\2\u0135\u013b\78\2\2\u0136\u013b\79\2\2\u0137\u013b"+
		"\t\n\2\2\u0138\u013b\7\t\2\2\u0139\u013b\5$\23\2\u013a\u0135\3\2\2\2\u013a"+
		"\u0136\3\2\2\2\u013a\u0137\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u0139\3\2"+
		"\2\2\u013b#\3\2\2\2\u013c\u013e\7\32\2\2\u013d\u013f\5\30\r\2\u013e\u013d"+
		"\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0141\7\33\2\2"+
		"\u0141%\3\2\2\2\u0142\u0143\7=\2\2\u0143\u0148\5\26\f\2\u0144\u0145\7"+
		"<\2\2\u0145\u0147\5\26\f\2\u0146\u0144\3\2\2\2\u0147\u014a\3\2\2\2\u0148"+
		"\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014b\3\2\2\2\u014a\u0148\3\2"+
		"\2\2\u014b\u014c\7;\2\2\u014c\u014f\3\2\2\2\u014d\u014f\7:\2\2\u014e\u0142"+
		"\3\2\2\2\u014e\u014d\3\2\2\2\u014f\'\3\2\2\2(+.\63@CMOVZ\\flpy\u0084\u0087"+
		"\u008c\u0090\u0094\u009e\u00a7\u00b2\u00bc\u00c8\u00ce\u00d4\u0105\u0112"+
		"\u0114\u011c\u0121\u0127\u012e\u0133\u013a\u013e\u0148\u014e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}