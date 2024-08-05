// Generated from Mx.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MxParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MxVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MxParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(MxParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxParser#def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef(MxParser.DefContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxParser#funcdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncdef(MxParser.FuncdefContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxParser#classdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassdef(MxParser.ClassdefContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxParser#vardef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVardef(MxParser.VardefContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxParser#stmts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmts(MxParser.StmtsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(MxParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Constant}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(MxParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarAccess}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarAccess(MxParser.VarAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MemberFuncAccess}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberFuncAccess(MxParser.MemberFuncAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MemberObjAccess}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberObjAccess(MxParser.MemberObjAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ThisPointer}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisPointer(MxParser.ThisPointerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinaryExp}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExp(MxParser.BinaryExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FuncCall}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCall(MxParser.FuncCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignExp}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignExp(MxParser.AssignExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NewArray}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewArray(MxParser.NewArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TernaryExp}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTernaryExp(MxParser.TernaryExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayAccess}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess(MxParser.ArrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PostSelf}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostSelf(MxParser.PostSelfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryExp}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExp(MxParser.UnaryExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FormatString}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormatString(MxParser.FormatStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NewClass}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewClass(MxParser.NewClassContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parentheses}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentheses(MxParser.ParenthesesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PreSelf}
	 * labeled alternative in {@link MxParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreSelf(MxParser.PreSelfContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxParser#rowexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowexpr(MxParser.RowexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxParser#indbrackets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndbrackets(MxParser.IndbracketsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(MxParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxParser#atomtype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomtype(MxParser.AtomtypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxParser#arraytype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArraytype(MxParser.ArraytypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(MxParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxParser#arrayliteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayliteral(MxParser.ArrayliteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxParser#fmtstr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFmtstr(MxParser.FmtstrContext ctx);
}