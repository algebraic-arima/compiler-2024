package src.AST.Expr;

import src.utils.pos.Position;
import src.utils.type.Type;

public class NewArrayInitExpr extends Expr{
    public Type type;
    public int dim;
    public ArrayLiteralExpr init;

    public NewArrayInitExpr(Position p) {
        super(p);
    }

    @Override
    public void accept(src.AST.ASTVisitor v) {
        v.visit(this);
    }
}
