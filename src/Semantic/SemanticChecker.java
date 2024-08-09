package src.Semantic;

import src.AST.ASTVisitor;
import src.AST.Def.*;
import src.AST.Expr.*;
import src.AST.Prog;
import src.AST.Stmt.*;
import src.AST.Stmt.JumpStmt.*;
import src.AST.Stmt.LoopStmt.*;
import src.utils.Scope.*;
import src.utils.error.error;
import src.utils.type.Type;

import java.util.Map;

public class SemanticChecker implements ASTVisitor {

    public Scope curScope;
    public GlobalScope gScope;

    public void RollBack() {
        if (curScope.parent == null) return;
        curScope.VarList = null;
        curScope.FuncList = null;
        curScope = curScope.parent;
    }

    public SemanticChecker(GlobalScope g) {
        gScope = g;
        curScope = gScope;
    }

    @Override
    public void visit(Prog node) {
        node.defs.forEach(d -> d.accept(this));
    }

    @Override
    public void visit(FuncDef node) {
        curScope = new Scope(curScope);
        curScope.VarList = curScope.getFunc(node.funcName).args;
        node.funcBody.accept(this);
    }

    @Override
    public void visit(ClassDef node) {
        curScope = new Scope(curScope);
        curScope.VarList = gScope.getClass(node.className).fields;
        curScope.addVar("this", new Type(node.className), node.pos);
        curScope.FuncList = gScope.getClass(node.className).methods;
        node.constructor.accept(this);
        node.classFunc.forEach(d -> d.accept(this));
        curScope.FuncList = null;
        curScope.VarList = null;
        curScope = curScope.parent;
//leak?
    }

    @Override
    public void visit(VarDef node) {
        for (Map.Entry<String, Expr> entry : node.initVals.entrySet()) {
            if (curScope.getVar(entry.getKey()) == null) {
                curScope.addVar(entry.getKey(), node.type, node.pos);
            }
            if (entry.getValue() != null) {
                entry.getValue().accept(this);
            }
        }
    }

    @Override
    public void visit(Constructor node) {
        // check whether constructor name is the same as class name
        curScope = new Scope(curScope);
        node.funcBody.accept(this);
        curScope.VarList = null;
        curScope = curScope.parent;
    }

    @Override
    public void visit(BreakStmt node) {
        if (!curScope.isLOOP) {
            throw new error("Break not in loop", node.pos);
        }
    }

    @Override
    public void visit(ContinueStmt node) {
        if (!curScope.isLOOP) {
            throw new error("Continue not in loop", node.pos);
        }
    }

    @Override
    public void visit(ReturnStmt node) {

    }

    @Override
    public void visit(IfStmt node) {
        node.condition.accept(this);

        curScope = new Scope(curScope);
        node.trueStmt.accept(this);

        RollBack();

        curScope = new Scope(curScope);
        node.falseStmt.accept(this);

        RollBack();
    }

    @Override
    public void visit(WhileStmt node) {
        node.cond.accept(this);
        curScope = new Scope(curScope);
        curScope.isLOOP = true;
        node.body.accept(this);
        RollBack();
    }

    @Override
    public void visit(ForStmt node) {
        curScope=new Scope(curScope);
        curScope.isLOOP=true;
        node.init.accept(this);
        node.cond.accept(this);
        node.update.accept(this);
        node.body.accept(this);
        RollBack();
    }

    @Override
    public void visit(VarDefStmt node) {
        node.varDef.accept(this);
    }

    @Override
    public void visit(ExprStmt node) {
        node.expr.accept(this);
    }

    @Override
    public void visit(BlockStmt node) {
        curScope = new Scope(curScope);
        node.stmts.forEach(d -> d.accept(this));
        RollBack();
    }

    @Override
    public void visit(ArrayAccessExpr node) {

    }

    @Override
    public void visit(ArrayLiteralExpr node) {

    }

    @Override
    public void visit(AssignExpr node) {

    }

    @Override
    public void visit(BinaryArithExpr node) {

    }

    @Override
    public void visit(BinaryLogicExpr node) {

    }

    @Override
    public void visit(BoolLiteralExpr node) {

    }

    @Override
    public void visit(FmtStrLiteralExpr node) {

    }

    @Override
    public void visit(FuncCallExpr node) {

    }

    @Override
    public void visit(IntLiteralExpr node) {

    }

    @Override
    public void visit(MemberFuncCallExpr node) {

    }

    @Override
    public void visit(MemberObjAccessExpr node) {

    }

    @Override
    public void visit(NewArrayExpr node) {

    }

    @Override
    public void visit(NewArrayInitExpr node) {

    }

    @Override
    public void visit(NewTypeExpr node) {

    }

    @Override
    public void visit(NullExpr node) {

    }

    @Override
    public void visit(RowExpr node) {

    }

    @Override
    public void visit(StringLiteralExpr node) {

    }

    @Override
    public void visit(TernaryBranchExpr node) {

    }

    @Override
    public void visit(ThisPtrExpr node) {

    }

    @Override
    public void visit(UnaryArithExpr node) {

    }

    @Override
    public void visit(UnaryLogicExpr node) {

    }

    @Override
    public void visit(VarExpr node) {

    }

}
