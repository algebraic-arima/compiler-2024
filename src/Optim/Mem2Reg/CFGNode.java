package src.Optim.Mem2Reg;

import src.IR.IRDef.IRBlock;
import src.IR.IRDef.IRFuncDef;
import src.IR.IRInst.IRInst;

import java.util.ArrayList;
import java.util.HashSet;

public class CFGNode {
    String label;
    public HashSet<CFGNode> dom;
    ArrayList<CFGNode> pred, succ;
    int predNum = 0, succNum = 0;
    CFGNode iDom;
    boolean vis = false;

    public CFGNode(String n) {
        label = n;
        dom = new HashSet<>();
        pred = new ArrayList<>();
        succ = new ArrayList<>();
        iDom = null;
    }

    public void setPred(CFGNode n) {
        pred.add(n);
        ++predNum;
    }

    public void setSucc(CFGNode n) {
        succ.add(n);
        ++succNum;
    }
}