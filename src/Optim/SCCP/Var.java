package src.Optim.SCCP;

import src.IR.IRInst.IRInst;

import java.util.HashSet;

public class Var extends SCCPNode {
    static int M = 2;
    static int C = 1;
    static int U = 0;

    public String name;
    public int type = U;
    public long value;
    public HashSet<IRInst> use = new HashSet<>();

    public Var(String s){
        name=s;
    }
}
