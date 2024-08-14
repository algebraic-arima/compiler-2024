package src.AST.Expr;

import src.AST.__ASTVisitor;
import src.utils.pos.Position;

import java.util.ArrayList;

public class ArrayLiteralExpr extends Expr {
    public ArrayList<Expr> elements;

    public ArrayLiteralExpr(Position p) {
        super(p);
        elements = new ArrayList<>();
    }

    @Override
    public void accept(__ASTVisitor v) {
        v.visit(this);
    }
}
