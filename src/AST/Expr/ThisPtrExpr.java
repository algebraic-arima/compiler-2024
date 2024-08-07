package src.AST.Expr;

public class ThisPtrExpr extends Expr {
    public ThisPtrExpr() {
        super();
    }

    @Override
    public void accept(src.AST.ASTVisitor v) {
        v.visit(this);
    }
}
