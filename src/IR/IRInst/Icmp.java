package src.IR.IRInst;

import src.AST.Expr.BinaryArithExpr;
import src.utils.Entity.Constant;
import src.utils.Entity.Entity;
import src.utils.Entity.Register;
import src.utils.IRType.IRType;

public class Icmp extends Inst {
    public String op;
    public IRType type;
    public Entity lhs = null, rhs = null;
    // null if ptr is compared to null in EQ, NE
    public Register dest;

    public Icmp(BinaryArithExpr.BArithOp op) {
        this.op = switch (op) {
            case EQ -> "eq";
            case NE -> "ne";
            case LT -> "slt";
            case GT -> "sgt";
            case LE -> "sle";
            case GE -> "sge";
            default -> null;
        };
    }

    public Icmp(String op) {
        this.op = switch (op) {
            case "<" -> "slt";
            case "<=" -> "sle";
            case ">" -> "sgt";
            case ">=" -> "sge";
            case "==" -> "eq";
            case "!=" -> "ne";
            default -> null;
        };
    }

    public void setLhs(Register register) {
        this.lhs = register;
    }

    public void setRhs(Register register) {
        this.rhs = register;
    }

    public void setLhs(long value) {
        this.lhs = new Constant(value);
    }

    public void setRhs(long value) {
        this.rhs = new Constant(value);
    }

    public void setLhs(Entity entity) {
        this.lhs = entity;
    }

    public void setRhs(Entity entity) {
        this.rhs = entity;
    }

    @Override
    public void print() {
        System.out.print("  ");
        dest.print();
        System.out.print(" = icmp " + op + " i32 ");
        lhs.print();
        System.out.print(", ");
        rhs.print();
        System.out.print("\n");
    }
}

