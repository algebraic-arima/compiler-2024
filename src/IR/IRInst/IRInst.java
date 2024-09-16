package src.IR.IRInst;

import src.IR.IRNode;
import src.utils.Entity.Register;

import java.util.HashSet;

public abstract class IRInst extends IRNode {

    public Register dest;
    public HashSet<String> liveIn=new HashSet<>();
    public HashSet<String> liveOut=new HashSet<>();


    abstract public void print();
}
