package src.AST.Expr;

import src.AST.__ASTVisitor;
import src.utils.pos.Position;

public class ArrayAccessExpr extends Expr {
    public Expr array;
    public Expr index;

    public ArrayAccessExpr(Position p, Expr a, Expr i) {
        super(p);
        array = a;
        index = i;
    }

    @Override
    public void accept(__ASTVisitor v) {
        v.visit(this);
    }
}
