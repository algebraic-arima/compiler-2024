package src.AST.Expr;

public class IntLiteralExpr extends Expr {
    public Integer value;

    public IntLiteralExpr(Integer v) {
        value = v;
    }

    @Override
    public void accept(src.AST.ASTVisitor v) {
        v.visit(this);
    }
}
