package src.IR;

import src.AST.Def.*;
import src.AST.Expr.*;
import src.AST.Prog;
import src.AST.Stmt.*;
import src.AST.Stmt.JumpStmt.*;
import src.AST.Stmt.LoopStmt.*;
import src.AST.Stmt.VarDefStmt;
import src.AST.ASTVisitor;
import src.utils.Scope.GlobalScope;
import src.utils.Scope.Scope;

public class IRBuilder implements ASTVisitor<IRNode> {

    IRNode IRroot, IRcur;
    GlobalScope gScope;
    Scope curScope;

    @Override
    public IRNode visit(Prog node) {
        return null;
    }

    @Override
    public IRNode visit(FuncDef node) {
        return null;
    }

    @Override
    public IRNode visit(ClassDef node) {
        return null;
    }

    @Override
    public IRNode visit(VarDef node) {
        return null;
    }

    @Override
    public IRNode visit(Constructor node) {
        return null;
    }

    @Override
    public IRNode visit(BreakStmt node) {
        return null;
    }

    @Override
    public IRNode visit(ContinueStmt node) {
        return null;
    }

    @Override
    public IRNode visit(ReturnStmt node) {
        return null;
    }

    @Override
    public IRNode visit(IfStmt node) {
        return null;
    }

    @Override
    public IRNode visit(WhileStmt node) {
        return null;
    }

    @Override
    public IRNode visit(ForStmt node) {
        return null;
    }

    @Override
    public IRNode visit(VarDefStmt node) {
        return null;
    }

    @Override
    public IRNode visit(ExprStmt node) {
        return null;
    }

    @Override
    public IRNode visit(BlockStmt node) {
        return null;
    }

    @Override
    public IRNode visit(EmptyStmt node) {
        return null;
    }

    @Override
    public IRNode visit(ArrayAccessExpr node) {
        return null;
    }

    @Override
    public IRNode visit(ArrayLiteralExpr node) {
        return null;
    }

    @Override
    public IRNode visit(AssignExpr node) {
        return null;
    }

    @Override
    public IRNode visit(BinaryArithExpr node) {
        return null;
    }

    @Override
    public IRNode visit(BinaryLogicExpr node) {
        return null;
    }

    @Override
    public IRNode visit(BoolLiteralExpr node) {
        return null;
    }

    @Override
    public IRNode visit(FmtStrLiteralExpr node) {
        return null;
    }

    @Override
    public IRNode visit(FuncCallExpr node) {
        return null;
    }

    @Override
    public IRNode visit(IntLiteralExpr node) {
        return null;
    }

    @Override
    public IRNode visit(MemberFuncCallExpr node) {
        return null;
    }

    @Override
    public IRNode visit(MemberObjAccessExpr node) {
        return null;
    }

    @Override
    public IRNode visit(NewArrayExpr node) {
        return null;
    }

    @Override
    public IRNode visit(NewArrayInitExpr node) {
        return null;
    }

    @Override
    public IRNode visit(NewTypeExpr node) {
        return null;
    }

    @Override
    public IRNode visit(NullExpr node) {
        return null;
    }

    @Override
    public IRNode visit(ParenthesesExpr node) {
        return null;
    }

    @Override
    public IRNode visit(RowExpr node) {
        return null;
    }

    @Override
    public IRNode visit(StringLiteralExpr node) {
        return null;
    }

    @Override
    public IRNode visit(TernaryBranchExpr node) {
        return null;
    }

    @Override
    public IRNode visit(ThisPtrExpr node) {
        return null;
    }

    @Override
    public IRNode visit(UnaryArithExpr node) {
        return null;
    }

    @Override
    public IRNode visit(UnaryLogicExpr node) {
        return null;
    }

    @Override
    public IRNode visit(VarExpr node) {
        return null;
    }
}
