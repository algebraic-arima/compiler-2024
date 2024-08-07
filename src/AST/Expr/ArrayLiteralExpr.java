package src.AST.Expr;

import src.AST.ASTVisitor;

import java.util.ArrayList;

public class ArrayLiteralExpr extends Expr {
    public ArrayList<Expr> elements;

    public ArrayLiteralExpr(ArrayList<Expr> e) {
        elements = e;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
