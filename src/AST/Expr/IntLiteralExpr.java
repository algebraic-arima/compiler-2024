package src.AST.Expr;

import src.utils.pos.Position;

public class IntLiteralExpr extends Expr {
    public Integer value;

    public IntLiteralExpr(Position p, Integer v) {
        super(p);
        value = v;
    }

    @Override
    public void accept(src.AST.ASTVisitor v) {
        v.visit(this);
    }
}
