package src.AST.Expr;

import src.AST.ASTVisitor;

public class IntegerLiteralExpr extends Expr {
    public int value;

    public IntegerLiteralExpr(int v) {
        value = v;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
