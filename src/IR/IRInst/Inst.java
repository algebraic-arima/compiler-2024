package src.IR.IRInst;

import src.IR.IRNode;
import src.utils.Entity.Register;

public abstract class Inst extends IRNode {

    public Register dest;

    abstract public void print();
}
