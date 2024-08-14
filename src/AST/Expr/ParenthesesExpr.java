package src.AST.Expr;

import src.AST.__ASTVisitor;
import src.utils.pos.Position;

public class ParenthesesExpr extends Expr {

    public Expr exp;

    public ParenthesesExpr(Position p, Expr e) {
        super(p);
        exp = e;
    }

    @Override
    public void accept(__ASTVisitor v) {
        v.visit(this);
    }
}
