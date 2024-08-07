package src.AST.Expr;

public class NullExpr extends Expr{
    @Override
    public void accept(src.AST.ASTVisitor v) {
        v.visit(this);
    }
}
