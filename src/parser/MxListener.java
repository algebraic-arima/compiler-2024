// Generated from Mx.g4 by ANTLR 4.13.1
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
	 * Enter a parse tree produced by {@link MxParser#stmtsuite}.
	 * @param ctx the parse tree
	 */
	void enterStmtsuite(MxParser.StmtsuiteContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxParser#stmtsuite}.
	 * @param ctx the parse tree
	 */
	void exitStmtsuite(MxParser.StmtsuiteContext ctx);
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
	 * Enter a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVariable(MxParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVariable(MxParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PostIncDec}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPostIncDec(MxParser.PostIncDecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PostIncDec}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPostIncDec(MxParser.PostIncDecContext ctx);
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
	 * Enter a parse tree produced by the {@code PreIncDec}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPreIncDec(MxParser.PreIncDecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PreIncDec}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPreIncDec(MxParser.PreIncDecContext ctx);
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
	 * Enter a parse tree produced by the {@code NewType}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNewType(MxParser.NewTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NewType}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNewType(MxParser.NewTypeContext ctx);
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
	 * Enter a parse tree produced by the {@code MemberAccess}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMemberAccess(MxParser.MemberAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MemberAccess}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMemberAccess(MxParser.MemberAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MemberFunctionCall}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMemberFunctionCall(MxParser.MemberFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MemberFunctionCall}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMemberFunctionCall(MxParser.MemberFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(MxParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(MxParser.FunctionCallContext ctx);
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
}