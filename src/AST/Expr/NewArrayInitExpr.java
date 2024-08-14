package src.AST.Expr;

import src.AST.__ASTVisitor;
import src.utils.pos.Position;

public class NewArrayInitExpr extends Expr{
    public ArrayLiteralExpr init;

    public NewArrayInitExpr(Position p) {
        super(p);
    }

    @Override
    public void accept(__ASTVisitor v) {
        v.visit(this);
    }
}
