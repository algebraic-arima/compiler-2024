package src.AST.Expr;

import src.utils.pos.Position;

public class NullExpr extends Expr{

    public NullExpr(Position p) {
        super(p);
        type=null;
    }
    @Override
    public void accept(src.AST.ASTVisitor v) {
        v.visit(this);
    }
}
