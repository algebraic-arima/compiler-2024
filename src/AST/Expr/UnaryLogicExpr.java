package src.AST.Expr;

public class UnaryLogicExpr extends Expr{

    public enum ULogicOp {
        NOT
    }

    public Expr expr;
    public ULogicOp op;

    public UnaryLogicExpr(Expr e, ULogicOp o) {
        expr = e;
        op = o;
    }

    @Override
    public void accept(src.AST.ASTVisitor v) {
        v.visit(this);
    }
}
