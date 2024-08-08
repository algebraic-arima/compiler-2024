package src.AST.Expr;

import src.AST.ASTVisitor;
import src.utils.pos.Position;

import java.util.ArrayList;

public class ArrayLiteralExpr extends Expr {
    public ArrayList<Expr> elements;

    public ArrayLiteralExpr(Position p) {
        super(p);
        elements = new ArrayList<>();
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
