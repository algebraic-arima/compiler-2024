package src.AST.Expr;

import src.utils.pos.Position;
import src.utils.type.Type;

public class NewTypeExpr extends Expr{

    public NewTypeExpr(Position p, Type t) {
        super(p);
        type = t;
    }

    @Override
    public void accept(src.AST.ASTVisitor v) {
        v.visit(this);
    }
}
