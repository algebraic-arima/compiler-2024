package src.AST.Expr;

import src.AST.__ASTVisitor;
import src.utils.pos.Position;

public class NullExpr extends Expr{

    public NullExpr(Position p) {
        super(p);
        type=null;
    }
    @Override
    public void accept(__ASTVisitor v) {
        v.visit(this);
    }
}
