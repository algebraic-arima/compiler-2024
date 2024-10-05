package src.IR.IRInst;

import src.ASM.Operand.Reg;
import src.IR.IRNode;
import src.utils.Entity.Register;

import java.util.HashSet;

public abstract class IRInst extends IRNode {

    public Register dest;
    public HashSet<Register> liveIn=new HashSet<>();
    public HashSet<Register> liveOut=new HashSet<>();
    public int omega;

    public void addOut(String c){
        liveOut.add(Register.registers.get(c));
    }

    public void addIn(String c){
        liveIn.add(Register.registers.get(c));
    }

    abstract public void print();
}
