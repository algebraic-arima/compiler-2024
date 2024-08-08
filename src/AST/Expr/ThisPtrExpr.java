package src.AST.Expr;

import src.utils.pos.Position;

public class ThisPtrExpr extends Expr {
    public ThisPtrExpr(Position p) {
        super(p);
    }

    @Override
    public void accept(src.AST.ASTVisitor v) {
        v.visit(this);
    }
}
