package src.AST.Expr;

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
    public void accept(src.AST.ASTVisitor v) {
        v.visit(this);
    }
}
