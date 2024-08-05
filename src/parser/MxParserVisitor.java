// Generated from MxParser.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MxParserParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MxParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MxParserParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(MxParserParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxParserParser#def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef(MxParserParser.DefContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxParserParser#funcdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncdef(MxParserParser.FuncdefContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxParserParser#classdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassdef(MxParserParser.ClassdefContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxParserParser#vardef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVardef(MxParserParser.VardefContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxParserParser#stmts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmts(MxParserParser.StmtsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxParserParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(MxParserParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Constant}
	 * labeled alternative in {@link MxParserParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(MxParserParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarAccess}
	 * labeled alternative in {@link MxParserParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarAccess(MxParserParser.VarAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MemberFuncAccess}
	 * labeled alternative in {@link MxParserParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberFuncAccess(MxParserParser.MemberFuncAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MemberObjAccess}
	 * labeled alternative in {@link MxParserParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberObjAccess(MxParserParser.MemberObjAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ThisPointer}
	 * labeled alternative in {@link MxParserParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisPointer(MxParserParser.ThisPointerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinaryExp}
	 * labeled alternative in {@link MxParserParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExp(MxParserParser.BinaryExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FuncCall}
	 * labeled alternative in {@link MxParserParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCall(MxParserParser.FuncCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignExp}
	 * labeled alternative in {@link MxParserParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignExp(MxParserParser.AssignExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NewArray}
	 * labeled alternative in {@link MxParserParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewArray(MxParserParser.NewArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TernaryExp}
	 * labeled alternative in {@link MxParserParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTernaryExp(MxParserParser.TernaryExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayAccess}
	 * labeled alternative in {@link MxParserParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess(MxParserParser.ArrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PostSelf}
	 * labeled alternative in {@link MxParserParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostSelf(MxParserParser.PostSelfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryExp}
	 * labeled alternative in {@link MxParserParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExp(MxParserParser.UnaryExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FormatString}
	 * labeled alternative in {@link MxParserParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormatString(MxParserParser.FormatStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NewClass}
	 * labeled alternative in {@link MxParserParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewClass(MxParserParser.NewClassContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parentheses}
	 * labeled alternative in {@link MxParserParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentheses(MxParserParser.ParenthesesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PreSelf}
	 * labeled alternative in {@link MxParserParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreSelf(MxParserParser.PreSelfContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxParserParser#rowexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowexpr(MxParserParser.RowexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxParserParser#indbrackets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndbrackets(MxParserParser.IndbracketsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxParserParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(MxParserParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxParserParser#atomtype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomtype(MxParserParser.AtomtypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxParserParser#arraytype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArraytype(MxParserParser.ArraytypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxParserParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(MxParserParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxParserParser#arrayliteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayliteral(MxParserParser.ArrayliteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxParserParser#fmtstr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFmtstr(MxParserParser.FmtstrContext ctx);
}