package src.AST.Expr;

import src.utils.pos.Position;
import src.utils.type.Type;

public class BinaryArithExpr extends Expr {

    public enum BArithOp {
        ADD, SUB, MUL, DIV, MOD, BLS, BRS, BAND, BOR, BXOR
    }

    public Expr lhs, rhs;
    public BArithOp op;

    public BinaryArithExpr(Position p, Expr lhs, Expr rhs,Type intT, String op) {
        super(p);
        this.lhs = lhs;
        this.rhs = rhs;
        type = intT;
        switch (op) {
            case "+":
                this.op = BArithOp.ADD;
                break;
            case "-":
                this.op = BArithOp.SUB;
                break;
            case "*":
                this.op = BArithOp.MUL;
                break;
            case "/":
                this.op = BArithOp.DIV;
                break;
            case "%":
                this.op = BArithOp.MOD;
                break;
            case "<<":
                this.op = BArithOp.BLS;
                break;
            case ">>":
                this.op = BArithOp.BRS;
                break;
            case "&":
                this.op = BArithOp.BAND;
                break;
            case "|":
                this.op = BArithOp.BOR;
                break;
            case "^":
                this.op = BArithOp.BXOR;
                break;

        }
    }

    public void accept(src.AST.ASTVisitor v) {
        v.visit(this);
    }
}
