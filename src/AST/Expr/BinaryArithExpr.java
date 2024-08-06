package src.AST.Expr;

public class BinaryArithExpr extends Expr {

    public enum BArithOp {
        ADD, SUB, MUL, DIV, MOD, BLS, BRS, BAND, BOR, BXOR
    }

    public Expr lhs, rhs;
    public BArithOp op;

    public BinaryArithExpr(Expr lhs, Expr rhs, BArithOp op) {
        this.lhs = lhs;
        this.rhs = rhs;
        this.op = op;
    }

    public void accept(src.AST.ASTVisitor v) {
        v.visit(this);
    }
}
