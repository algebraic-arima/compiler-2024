package src.IR.IRInst;

import src.utils.Entity.Constant;
import src.utils.Entity.Entity;
import src.utils.Entity.Register;
import src.utils.IRType.IRType;

public class Icmp extends Inst {
    public String op;
    public IRType type;
    public Entity lhs, rhs;
    public Register dest;

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

}

