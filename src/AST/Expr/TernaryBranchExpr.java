package src.AST.Expr;

import src.AST.ASTVisitor;
import src.utils.pos.Position;

public class TernaryBranchExpr extends Expr {

    public Expr cond, trueBranch, falseBranch;

    public TernaryBranchExpr(Position p, Expr c, Expr t, Expr f) {
        super(p);
        cond = c;
        trueBranch = t;
        falseBranch = f;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
