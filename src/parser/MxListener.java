// Generated from F:/vscode/antlr-demo/compiler-2024/src/parser/Mx.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Mx}.
 */
public interface MxListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Mx#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(Mx.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link Mx#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(Mx.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link Mx#def}.
	 * @param ctx the parse tree
	 */
	void enterDef(Mx.DefContext ctx);
	/**
	 * Exit a parse tree produced by {@link Mx#def}.
	 * @param ctx the parse tree
	 */
	void exitDef(Mx.DefContext ctx);
	/**
	 * Enter a parse tree produced by {@link Mx#funcdef}.
	 * @param ctx the parse tree
	 */
	void enterFuncdef(Mx.FuncdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link Mx#funcdef}.
	 * @param ctx the parse tree
	 */
	void exitFuncdef(Mx.FuncdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link Mx#classdef}.
	 * @param ctx the parse tree
	 */
	void enterClassdef(Mx.ClassdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link Mx#classdef}.
	 * @param ctx the parse tree
	 */
	void exitClassdef(Mx.ClassdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link Mx#vardef}.
	 * @param ctx the parse tree
	 */
	void enterVardef(Mx.VardefContext ctx);
	/**
	 * Exit a parse tree produced by {@link Mx#vardef}.
	 * @param ctx the parse tree
	 */
	void exitVardef(Mx.VardefContext ctx);
	/**
	 * Enter a parse tree produced by {@link Mx#stmts}.
	 * @param ctx the parse tree
	 */
	void enterStmts(Mx.StmtsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Mx#stmts}.
	 * @param ctx the parse tree
	 */
	void exitStmts(Mx.StmtsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Mx#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(Mx.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Mx#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(Mx.StmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Constant}
	 * labeled alternative in {@link Mx#expr}.
	 * @param ctx the parse tree
	 */
	void enterConstant(Mx.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Constant}
	 * labeled alternative in {@link Mx#expr}.
	 * @param ctx the parse tree
	 */
	void exitConstant(Mx.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarAccess}
	 * labeled alternative in {@link Mx#expr}.
	 * @param ctx the parse tree
	 */
	void enterVarAccess(Mx.VarAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarAccess}
	 * labeled alternative in {@link Mx#expr}.
	 * @param ctx the parse tree
	 */
	void exitVarAccess(Mx.VarAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MemberFuncAccess}
	 * labeled alternative in {@link Mx#expr}.
	 * @param ctx the parse tree
	 */
	void enterMemberFuncAccess(Mx.MemberFuncAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MemberFuncAccess}
	 * labeled alternative in {@link Mx#expr}.
	 * @param ctx the parse tree
	 */
	void exitMemberFuncAccess(Mx.MemberFuncAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MemberObjAccess}
	 * labeled alternative in {@link Mx#expr}.
	 * @param ctx the parse tree
	 */
	void enterMemberObjAccess(Mx.MemberObjAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MemberObjAccess}
	 * labeled alternative in {@link Mx#expr}.
	 * @param ctx the parse tree
	 */
	void exitMemberObjAccess(Mx.MemberObjAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ThisPointer}
	 * labeled alternative in {@link Mx#expr}.
	 * @param ctx the parse tree
	 */
	void enterThisPointer(Mx.ThisPointerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ThisPointer}
	 * labeled alternative in {@link Mx#expr}.
	 * @param ctx the parse tree
	 */
	void exitThisPointer(Mx.ThisPointerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinaryExp}
	 * labeled alternative in {@link Mx#expr}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExp(Mx.BinaryExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinaryExp}
	 * labeled alternative in {@link Mx#expr}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExp(Mx.BinaryExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FuncCall}
	 * labeled alternative in {@link Mx#expr}.
	 * @param ctx the parse tree
	 */
	void enterFuncCall(Mx.FuncCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FuncCall}
	 * labeled alternative in {@link Mx#expr}.
	 * @param ctx the parse tree
	 */
	void exitFuncCall(Mx.FuncCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignExp}
	 * labeled alternative in {@link Mx#expr}.
	 * @param ctx the parse tree
	 */
	void enterAssignExp(Mx.AssignExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignExp}
	 * labeled alternative in {@link Mx#expr}.
	 * @param ctx the parse tree
	 */
	void exitAssignExp(Mx.AssignExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NewArray}
	 * labeled alternative in {@link Mx#expr}.
	 * @param ctx the parse tree
	 */
	void enterNewArray(Mx.NewArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NewArray}
	 * labeled alternative in {@link Mx#expr}.
	 * @param ctx the parse tree
	 */
	void exitNewArray(Mx.NewArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TernaryExp}
	 * labeled alternative in {@link Mx#expr}.
	 * @param ctx the parse tree
	 */
	void enterTernaryExp(Mx.TernaryExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TernaryExp}
	 * labeled alternative in {@link Mx#expr}.
	 * @param ctx the parse tree
	 */
	void exitTernaryExp(Mx.TernaryExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayAccess}
	 * labeled alternative in {@link Mx#expr}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess(Mx.ArrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayAccess}
	 * labeled alternative in {@link Mx#expr}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess(Mx.ArrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PostSelf}
	 * labeled alternative in {@link Mx#expr}.
	 * @param ctx the parse tree
	 */
	void enterPostSelf(Mx.PostSelfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PostSelf}
	 * labeled alternative in {@link Mx#expr}.
	 * @param ctx the parse tree
	 */
	void exitPostSelf(Mx.PostSelfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryExp}
	 * labeled alternative in {@link Mx#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExp(Mx.UnaryExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryExp}
	 * labeled alternative in {@link Mx#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExp(Mx.UnaryExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FormatString}
	 * labeled alternative in {@link Mx#expr}.
	 * @param ctx the parse tree
	 */
	void enterFormatString(Mx.FormatStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FormatString}
	 * labeled alternative in {@link Mx#expr}.
	 * @param ctx the parse tree
	 */
	void exitFormatString(Mx.FormatStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NewClass}
	 * labeled alternative in {@link Mx#expr}.
	 * @param ctx the parse tree
	 */
	void enterNewClass(Mx.NewClassContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NewClass}
	 * labeled alternative in {@link Mx#expr}.
	 * @param ctx the parse tree
	 */
	void exitNewClass(Mx.NewClassContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parentheses}
	 * labeled alternative in {@link Mx#expr}.
	 * @param ctx the parse tree
	 */
	void enterParentheses(Mx.ParenthesesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parentheses}
	 * labeled alternative in {@link Mx#expr}.
	 * @param ctx the parse tree
	 */
	void exitParentheses(Mx.ParenthesesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PreSelf}
	 * labeled alternative in {@link Mx#expr}.
	 * @param ctx the parse tree
	 */
	void enterPreSelf(Mx.PreSelfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PreSelf}
	 * labeled alternative in {@link Mx#expr}.
	 * @param ctx the parse tree
	 */
	void exitPreSelf(Mx.PreSelfContext ctx);
	/**
	 * Enter a parse tree produced by {@link Mx#rowexpr}.
	 * @param ctx the parse tree
	 */
	void enterRowexpr(Mx.RowexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Mx#rowexpr}.
	 * @param ctx the parse tree
	 */
	void exitRowexpr(Mx.RowexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link Mx#indbrackets}.
	 * @param ctx the parse tree
	 */
	void enterIndbrackets(Mx.IndbracketsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Mx#indbrackets}.
	 * @param ctx the parse tree
	 */
	void exitIndbrackets(Mx.IndbracketsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Mx#type}.
	 * @param ctx the parse tree
	 */
	void enterType(Mx.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Mx#type}.
	 * @param ctx the parse tree
	 */
	void exitType(Mx.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Mx#atomtype}.
	 * @param ctx the parse tree
	 */
	void enterAtomtype(Mx.AtomtypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Mx#atomtype}.
	 * @param ctx the parse tree
	 */
	void exitAtomtype(Mx.AtomtypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Mx#arraytype}.
	 * @param ctx the parse tree
	 */
	void enterArraytype(Mx.ArraytypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Mx#arraytype}.
	 * @param ctx the parse tree
	 */
	void exitArraytype(Mx.ArraytypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Mx#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(Mx.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link Mx#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(Mx.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link Mx#arrayliteral}.
	 * @param ctx the parse tree
	 */
	void enterArrayliteral(Mx.ArrayliteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link Mx#arrayliteral}.
	 * @param ctx the parse tree
	 */
	void exitArrayliteral(Mx.ArrayliteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link Mx#fmtstr}.
	 * @param ctx the parse tree
	 */
	void enterFmtstr(Mx.FmtstrContext ctx);
	/**
	 * Exit a parse tree produced by {@link Mx#fmtstr}.
	 * @param ctx the parse tree
	 */
	void exitFmtstr(Mx.FmtstrContext ctx);
}