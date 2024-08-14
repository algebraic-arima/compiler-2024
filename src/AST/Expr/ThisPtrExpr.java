package src.AST.Expr;

import src.AST.__ASTVisitor;
import src.utils.pos.Position;

public class ThisPtrExpr extends Expr {

    public String className;

    public ThisPtrExpr(Position p) {
        super(p);
    }

    @Override
    public void accept(__ASTVisitor v) {
        v.visit(this);
    }
}
