package src.AST.Expr;

import src.utils.pos.Position;

public class UnaryArithExpr extends Expr {

    public enum UArithOp {
        NEG, BNOT, LINC, RINC, LDEC, RDEC
    }

    public Expr expr;
    public UArithOp op;

    public UnaryArithExpr(Position p, Expr e, String o, boolean isLeft) {
        super(p);
        expr = e;
        switch (o) {
            case "-":
                op = UArithOp.NEG;
                break;
            case "~":
                op = UArithOp.BNOT;
                break;
            case "++":
                op = isLeft ? UArithOp.LINC : UArithOp.RINC;
                break;
            case "--":
                op = isLeft ? UArithOp.LDEC : UArithOp.RDEC;
                break;
        }
    }

    @Override
    public void accept(src.AST.ASTVisitor v) {
        v.visit(this);
    }
}
