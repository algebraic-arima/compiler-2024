package src.IR.IRInst;

import src.utils.Entity.Constant;
import src.utils.Entity.Entity;
import src.utils.Entity.Register;

public class Binary extends Inst {

    public Register dest;
    public Entity lhs, rhs;
    public String op;


    public Binary(String op){
        this.op=switch (op){
            case "+"->"add";
            case "-"->"sub";
            case "*"->"mul";
            case "/"->"sdiv";
            case "%"->"srem";
            case "<<"->"shl";
            case ">>"->"ashr";
            case "&"->"and";
            case "|"->"or";
            case "^"->"xor";
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

    @Override
    public String str() {
        return "";
    }
}
