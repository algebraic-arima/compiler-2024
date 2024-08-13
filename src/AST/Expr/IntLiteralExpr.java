package src.AST.Expr;

import src.utils.pos.Position;
import src.utils.type.Type;

import src.utils.error.error;

public class IntLiteralExpr extends Expr {
    public Long value;

    public IntLiteralExpr(Position p, Long v, Type t) {
        super(p);
        type = t;
        value = v;
        if (v > 2147483648L) {
            throw new error("Integer out of bound", pos);
        }
    }

    @Override
    public void accept(src.AST.ASTVisitor v) {
        v.visit(this);
    }
}
