package src.IR.IRDef;

import src.IR.IRInst.*;
import src.IR.IRVisitor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class IRBlock {
    public Label label;
    public HashMap<String, Phi> phis = new HashMap<>();
    public ArrayList<IRInst> IRInsts = new ArrayList<>();
    public int index;
    static public int blockCnt;
    public int regNum = 0;
    public int funcParamMax = 0;
    public HashSet<String> liveIn;
    public HashSet<String> liveOut;
    public ArrayList<IRBlock> pred, succ;
    public ArrayList<IRInst> instList;

    public IRBlock(String s) {
        index = blockCnt;
        ++blockCnt;
        if (!s.equals("entry")) {
            s = "l-" + index + "-" + s;
        }
        label = new Label(s);
        liveIn = new HashSet<>();
        liveOut = new HashSet<>();
        pred = new ArrayList<>();
        succ = new ArrayList<>();
        instList = new ArrayList<>();
    }

    public void addInst(IRInst IRInst) {
        IRInsts.add(IRInst);
    }

    public void print() {
        System.out.print(label.label + ":\n");
        for (Phi p : phis.values()) {
            p.print();
        }
        for (IRInst i : IRInsts) {
            i.print();
        }
        System.out.print("\n");
    }

    public void reformat() {
        if (IRInsts.isEmpty()) return;
        ArrayList<IRInst> newIRInsts = new ArrayList<>();
        for (IRInst i : IRInsts) {
            newIRInsts.add(i);
            if (i instanceof Binary || i instanceof Select
                    || i instanceof Load || i instanceof GetElePtr
                    || i instanceof Icmp || i instanceof Phi) {
                regNum++;
            } else if (i instanceof Call c) {
                if (i.dest != null && !c.retType.typeName.equals("void")) {
                    regNum++;
                }
                if (c.args.size() > funcParamMax) {
                    funcParamMax = c.args.size();
                }
            } else if (i instanceof Alloca) {
                regNum += 2;
            }
            if (i instanceof terminalIRInst) {
                break;
            }
        }
        IRInsts = newIRInsts;
    }

    public void putPhi(String var, Phi p) {
        phis.put(var, p);
    }

    public void accept(IRVisitor visitor) {
        visitor.visit(this);
    }
}
