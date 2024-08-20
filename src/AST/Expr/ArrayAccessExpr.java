package src.AST.Expr;

import src.AST.ASTVisitor;
import src.AST.__ASTVisitor;
import src.utils.Entity.Register;
import src.utils.pos.Position;

public class ArrayAccessExpr extends Expr {
    public Expr array;
    public Expr index;
    public Register addr;


    public ArrayAccessExpr(Position p, Expr a, Expr i) {
        super(p);
        array = a;
        index = i;
    }

    @Override
    public void accept(__ASTVisitor v) {
        v.visit(this);
    }

    @Override
    public <T> T accept(ASTVisitor<T> v) {
        return v.visit(this);
    }
}
