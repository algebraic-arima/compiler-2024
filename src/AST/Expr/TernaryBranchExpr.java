package src.AST.Expr;

import src.AST.ASTVisitor;

public class TernaryBranchExpr extends Expr {

    public Expr cond, trueBranch, falseBranch;

    public TernaryBranchExpr(Expr c, Expr t, Expr f) {
        cond = c;
        trueBranch = t;
        falseBranch = f;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
