package src.AST.Expr;

public class UnaryArithExpr extends Expr {

    public enum UArithOp {
        NEG, BNOT, LINC, RINC, LDEC, RDEC
    }

    public Expr expr;
    public UArithOp op;

    public UnaryArithExpr(Expr e, UArithOp o) {
        expr = e;
        op = o;
    }

    @Override
    public void accept(src.AST.ASTVisitor v) {
        v.visit(this);
    }
}
