// Generated from MxParser.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MxParserParser}.
 */
public interface MxParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MxParserParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(MxParserParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParserParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(MxParserParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParserParser#def}.
	 * @param ctx the parse tree
	 */
	void enterDef(MxParserParser.DefContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParserParser#def}.
	 * @param ctx the parse tree
	 */
	void exitDef(MxParserParser.DefContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParserParser#funcdef}.
	 * @param ctx the parse tree
	 */
	void enterFuncdef(MxParserParser.FuncdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParserParser#funcdef}.
	 * @param ctx the parse tree
	 */
	void exitFuncdef(MxParserParser.FuncdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParserParser#classdef}.
	 * @param ctx the parse tree
	 */
	void enterClassdef(MxParserParser.ClassdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParserParser#classdef}.
	 * @param ctx the parse tree
	 */
	void exitClassdef(MxParserParser.ClassdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParserParser#vardef}.
	 * @param ctx the parse tree
	 */
	void enterVardef(MxParserParser.VardefContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParserParser#vardef}.
	 * @param ctx the parse tree
	 */
	void exitVardef(MxParserParser.VardefContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParserParser#stmts}.
	 * @param ctx the parse tree
	 */
	void enterStmts(MxParserParser.StmtsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParserParser#stmts}.
	 * @param ctx the parse tree
	 */
	void exitStmts(MxParserParser.StmtsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParserParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(MxParserParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParserParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(MxParserParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Constant}
	 * labeled alternative in {@link MxParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterConstant(MxParserParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Constant}
	 * labeled alternative in {@link MxParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitConstant(MxParserParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarAccess}
	 * labeled alternative in {@link MxParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVarAccess(MxParserParser.VarAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarAccess}
	 * labeled alternative in {@link MxParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVarAccess(MxParserParser.VarAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MemberFuncAccess}
	 * labeled alternative in {@link MxParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMemberFuncAccess(MxParserParser.MemberFuncAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MemberFuncAccess}
	 * labeled alternative in {@link MxParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMemberFuncAccess(MxParserParser.MemberFuncAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MemberObjAccess}
	 * labeled alternative in {@link MxParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMemberObjAccess(MxParserParser.MemberObjAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MemberObjAccess}
	 * labeled alternative in {@link MxParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMemberObjAccess(MxParserParser.MemberObjAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ThisPointer}
	 * labeled alternative in {@link MxParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterThisPointer(MxParserParser.ThisPointerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ThisPointer}
	 * labeled alternative in {@link MxParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitThisPointer(MxParserParser.ThisPointerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinaryExp}
	 * labeled alternative in {@link MxParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExp(MxParserParser.BinaryExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinaryExp}
	 * labeled alternative in {@link MxParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExp(MxParserParser.BinaryExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FuncCall}
	 * labeled alternative in {@link MxParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFuncCall(MxParserParser.FuncCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FuncCall}
	 * labeled alternative in {@link MxParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFuncCall(MxParserParser.FuncCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignExp}
	 * labeled alternative in {@link MxParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAssignExp(MxParserParser.AssignExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignExp}
	 * labeled alternative in {@link MxParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAssignExp(MxParserParser.AssignExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NewArray}
	 * labeled alternative in {@link MxParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNewArray(MxParserParser.NewArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NewArray}
	 * labeled alternative in {@link MxParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNewArray(MxParserParser.NewArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TernaryExp}
	 * labeled alternative in {@link MxParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterTernaryExp(MxParserParser.TernaryExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TernaryExp}
	 * labeled alternative in {@link MxParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitTernaryExp(MxParserParser.TernaryExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayAccess}
	 * labeled alternative in {@link MxParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess(MxParserParser.ArrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayAccess}
	 * labeled alternative in {@link MxParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess(MxParserParser.ArrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PostSelf}
	 * labeled alternative in {@link MxParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPostSelf(MxParserParser.PostSelfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PostSelf}
	 * labeled alternative in {@link MxParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPostSelf(MxParserParser.PostSelfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryExp}
	 * labeled alternative in {@link MxParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExp(MxParserParser.UnaryExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryExp}
	 * labeled alternative in {@link MxParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExp(MxParserParser.UnaryExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FormatString}
	 * labeled alternative in {@link MxParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFormatString(MxParserParser.FormatStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FormatString}
	 * labeled alternative in {@link MxParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFormatString(MxParserParser.FormatStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NewClass}
	 * labeled alternative in {@link MxParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNewClass(MxParserParser.NewClassContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NewClass}
	 * labeled alternative in {@link MxParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNewClass(MxParserParser.NewClassContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parentheses}
	 * labeled alternative in {@link MxParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParentheses(MxParserParser.ParenthesesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parentheses}
	 * labeled alternative in {@link MxParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParentheses(MxParserParser.ParenthesesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PreSelf}
	 * labeled alternative in {@link MxParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPreSelf(MxParserParser.PreSelfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PreSelf}
	 * labeled alternative in {@link MxParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPreSelf(MxParserParser.PreSelfContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParserParser#rowexpr}.
	 * @param ctx the parse tree
	 */
	void enterRowexpr(MxParserParser.RowexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParserParser#rowexpr}.
	 * @param ctx the parse tree
	 */
	void exitRowexpr(MxParserParser.RowexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParserParser#indbrackets}.
	 * @param ctx the parse tree
	 */
	void enterIndbrackets(MxParserParser.IndbracketsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParserParser#indbrackets}.
	 * @param ctx the parse tree
	 */
	void exitIndbrackets(MxParserParser.IndbracketsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParserParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(MxParserParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParserParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(MxParserParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParserParser#atomtype}.
	 * @param ctx the parse tree
	 */
	void enterAtomtype(MxParserParser.AtomtypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParserParser#atomtype}.
	 * @param ctx the parse tree
	 */
	void exitAtomtype(MxParserParser.AtomtypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParserParser#arraytype}.
	 * @param ctx the parse tree
	 */
	void enterArraytype(MxParserParser.ArraytypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParserParser#arraytype}.
	 * @param ctx the parse tree
	 */
	void exitArraytype(MxParserParser.ArraytypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParserParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(MxParserParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParserParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(MxParserParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParserParser#arrayliteral}.
	 * @param ctx the parse tree
	 */
	void enterArrayliteral(MxParserParser.ArrayliteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParserParser#arrayliteral}.
	 * @param ctx the parse tree
	 */
	void exitArrayliteral(MxParserParser.ArrayliteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParserParser#fmtstr}.
	 * @param ctx the parse tree
	 */
	void enterFmtstr(MxParserParser.FmtstrContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParserParser#fmtstr}.
	 * @param ctx the parse tree
	 */
	void exitFmtstr(MxParserParser.FmtstrContext ctx);
}