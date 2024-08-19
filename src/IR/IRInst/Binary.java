package src.IR.IRInst;

import src.AST.Expr.BinaryArithExpr;
import src.utils.Entity.Constant;
import src.utils.Entity.Entity;
import src.utils.Entity.Register;

public class Binary extends Inst {

    public Entity lhs, rhs;
    public String op;

    public Binary(BinaryArithExpr.BArithOp op) {
        this.op = switch (op) {
            case ADD -> "add";
            case SUB -> "sub";
            case MUL -> "mul";
            case DIV -> "sdiv";
            case MOD -> "srem";
            case BLS -> "shl";
            case BRS -> "ashr";
            case BAND -> "and";
            case BOR -> "or";
            case BXOR -> "xor";
            default -> null;
        };
    }


    public Binary(String op) {
        this.op = switch (op) {
            case "+" -> "add";
            case "-" -> "sub";
            case "*" -> "mul";
            case "/" -> "sdiv";
            case "%" -> "srem";
            case "<<" -> "shl";
            case ">>" -> "ashr";
            case "&" -> "and";
            case "|" -> "or";
            case "^" -> "xor";
            default -> null;
        };
    }

    public void setLhs(long value) {
        this.lhs = new Constant(value);
    }

    public void setLhs(Register register) {
        this.lhs = register;
    }

    public void setRhs(long value) {
        this.rhs = new Constant(value);
    }

    public void setRhs(Register register) {
        this.rhs = register;
    }

    public void setLhs(Entity entity) {
        this.lhs = entity;
    }

    public void setRhs(Entity entity) {
        this.rhs = entity;
    }

    @Override
    public void print() {
        System.out.print("  " + dest.name + " = " + op + " i32 ");
        lhs.print();
        System.out.print(", ");
        rhs.print();
        System.out.print("\n");
    }


}
