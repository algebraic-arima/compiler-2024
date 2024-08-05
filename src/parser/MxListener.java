// Generated from Mx.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MxParser}.
 */
public interface MxListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MxParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(MxParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(MxParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#def}.
	 * @param ctx the parse tree
	 */
	void enterDef(MxParser.DefContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#def}.
	 * @param ctx the parse tree
	 */
	void exitDef(MxParser.DefContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#funcdef}.
	 * @param ctx the parse tree
	 */
	void enterFuncdef(MxParser.FuncdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#funcdef}.
	 * @param ctx the parse tree
	 */
	void exitFuncdef(MxParser.FuncdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#classdef}.
	 * @param ctx the parse tree
	 */
	void enterClassdef(MxParser.ClassdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#classdef}.
	 * @param ctx the parse tree
	 */
	void exitClassdef(MxParser.ClassdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#vardef}.
	 * @param ctx the parse tree
	 */
	void enterVardef(MxParser.VardefContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#vardef}.
	 * @param ctx the parse tree
	 */
	void exitVardef(MxParser.VardefContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#stmts}.
	 * @param ctx the parse tree
	 */
	void enterStmts(MxParser.StmtsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#stmts}.
	 * @param ctx the parse tree
	 */
	void exitStmts(MxParser.StmtsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(MxParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(MxParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Constant}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterConstant(MxParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Constant}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitConstant(MxParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarAccess}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVarAccess(MxParser.VarAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarAccess}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVarAccess(MxParser.VarAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MemberFuncAccess}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMemberFuncAccess(MxParser.MemberFuncAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MemberFuncAccess}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMemberFuncAccess(MxParser.MemberFuncAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MemberObjAccess}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMemberObjAccess(MxParser.MemberObjAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MemberObjAccess}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMemberObjAccess(MxParser.MemberObjAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ThisPointer}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterThisPointer(MxParser.ThisPointerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ThisPointer}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitThisPointer(MxParser.ThisPointerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinaryExp}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExp(MxParser.BinaryExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinaryExp}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExp(MxParser.BinaryExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FuncCall}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFuncCall(MxParser.FuncCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FuncCall}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFuncCall(MxParser.FuncCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignExp}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAssignExp(MxParser.AssignExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignExp}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAssignExp(MxParser.AssignExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NewArray}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNewArray(MxParser.NewArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NewArray}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNewArray(MxParser.NewArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TernaryExp}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterTernaryExp(MxParser.TernaryExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TernaryExp}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitTernaryExp(MxParser.TernaryExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayAccess}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess(MxParser.ArrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayAccess}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess(MxParser.ArrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PostSelf}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPostSelf(MxParser.PostSelfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PostSelf}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPostSelf(MxParser.PostSelfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryExp}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExp(MxParser.UnaryExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryExp}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExp(MxParser.UnaryExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FormatString}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFormatString(MxParser.FormatStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FormatString}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFormatString(MxParser.FormatStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NewClass}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNewClass(MxParser.NewClassContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NewClass}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNewClass(MxParser.NewClassContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parentheses}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParentheses(MxParser.ParenthesesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parentheses}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParentheses(MxParser.ParenthesesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PreSelf}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPreSelf(MxParser.PreSelfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PreSelf}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPreSelf(MxParser.PreSelfContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#rowexpr}.
	 * @param ctx the parse tree
	 */
	void enterRowexpr(MxParser.RowexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#rowexpr}.
	 * @param ctx the parse tree
	 */
	void exitRowexpr(MxParser.RowexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#indbrackets}.
	 * @param ctx the parse tree
	 */
	void enterIndbrackets(MxParser.IndbracketsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#indbrackets}.
	 * @param ctx the parse tree
	 */
	void exitIndbrackets(MxParser.IndbracketsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(MxParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(MxParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#atomtype}.
	 * @param ctx the parse tree
	 */
	void enterAtomtype(MxParser.AtomtypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#atomtype}.
	 * @param ctx the parse tree
	 */
	void exitAtomtype(MxParser.AtomtypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#arraytype}.
	 * @param ctx the parse tree
	 */
	void enterArraytype(MxParser.ArraytypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#arraytype}.
	 * @param ctx the parse tree
	 */
	void exitArraytype(MxParser.ArraytypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(MxParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(MxParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#arrayliteral}.
	 * @param ctx the parse tree
	 */
	void enterArrayliteral(MxParser.ArrayliteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#arrayliteral}.
	 * @param ctx the parse tree
	 */
	void exitArrayliteral(MxParser.ArrayliteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxParser#fmtstr}.
	 * @param ctx the parse tree
	 */
	void enterFmtstr(MxParser.FmtstrContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#fmtstr}.
	 * @param ctx the parse tree
	 */
	void exitFmtstr(MxParser.FmtstrContext ctx);
}