package src.Semantic;

import src.AST.ASTVisitor;
import src.AST.Def.ClassDef;
import src.AST.Def.Constructor;
import src.AST.Def.FuncDef;
import src.AST.Def.VarDef;
import src.AST.Expr.Expr;
import src.AST.Prog;
import src.AST.Stmt.Stmt;
import src.utils.Scope.GlobalScope;

public class SemanticChecker implements ASTVisitor {

    GlobalScope gScope;

    public SemanticChecker(GlobalScope g) {
        gScope = g;
    }

    @Override
    public void visit(Prog node) {
        node.defs.forEach(d -> d.accept(this));
    }

    @Override
    public void visit(FuncDef node) {

    }

    @Override
    public void visit(ClassDef node) {

    }

    @Override
    public void visit(VarDef node) {

    }

    @Override
    public void visit(Constructor node) {

    }

    @Override
    public void visit(Expr node) {

    }

    @Override
    public void visit(Stmt node) {

    }
}
