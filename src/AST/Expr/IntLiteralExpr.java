package src.AST.Expr;

import src.utils.pos.Position;
import src.utils.type.Type;

public class IntLiteralExpr extends Expr {
    public Integer value;

    public IntLiteralExpr(Position p, Integer v, Type t) {
        super(p);
        type=t;
        value = v;
    }

    @Override
    public void accept(src.AST.ASTVisitor v) {
        v.visit(this);
    }
}
