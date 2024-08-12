package src.AST.Expr;

import src.utils.pos.Position;

public class NewArrayInitExpr extends Expr{
    public ArrayLiteralExpr init;

    public NewArrayInitExpr(Position p) {
        super(p);
    }

    @Override
    public void accept(src.AST.ASTVisitor v) {
        v.visit(this);
    }
}
