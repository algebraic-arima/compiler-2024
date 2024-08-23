package src.IR.IRInst;

import src.IR.IRNode;
import src.utils.Entity.Register;

public abstract class IRInst extends IRNode {

    public Register dest;

    abstract public void print();
}
