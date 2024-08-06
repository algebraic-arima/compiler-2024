package src.AST.Expr;

import src.AST.ASTVisitor;

public class AssignExpr extends Expr{
    public String varName;
    public Expr value;

    public AssignExpr(String v, Expr va) {
        varName = v;
        value = va;
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
