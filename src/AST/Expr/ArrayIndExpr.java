package src.AST.Expr;

public class ArrayIndExpr extends Expr {
    public Expr array;
    public Expr index;

    public ArrayIndExpr(Expr a, Expr i) {
        array = a;
        index = i;
    }

    @Override
    public void accept(src.AST.ASTVisitor v) {
        v.visit(this);
    }
}
