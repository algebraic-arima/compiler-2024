package src.IR.IRDef;

import src.IR.IRInst.*;
import src.IR.IRVisitor;

import java.util.ArrayList;

public class IRBlock {
    public Label label = null;
    public ArrayList<IRInst> IRInsts = new ArrayList<>();
    public int index;
    static public int blockCnt;
    public int regNum = 0;
    public int funcParamMax = 0;

    public IRBlock(String s) {
        index = blockCnt;
        ++blockCnt;
        if (!s.equals("entry")) {
            s = "l-" + index + "-" + s;
        }
        label = new Label(s);
    }

    public void addInst(IRInst IRInst) {
        IRInsts.add(IRInst);
    }

    public void print(boolean p) {
        if (IRInsts.isEmpty()) return;
        if (p) System.out.print(label.label + ":\n");
        ArrayList<IRInst> newIRInsts = new ArrayList<>();
        for (IRInst i : IRInsts) {
            if (p) i.print();
            newIRInsts.add(i);
            if (i instanceof Binary || i instanceof Select
                    || i instanceof Load || i instanceof GetElePtr
                    || i instanceof Icmp || i instanceof Phi) {
                regNum++;
            } else if (i instanceof Call) {
                if (i.dest != null && !((Call) i).retType.typeName.equals("void")) {
                    regNum++;
                }
                if (((Call) i).args.size() > funcParamMax) {
                    funcParamMax = ((Call) i).args.size();
                }
            } else if (i instanceof Alloca) {
                regNum += 2;
            }
            if (i instanceof terminalIRInst) {
                break;
            }
        }
        IRInsts = newIRInsts;
        // indent in inst::print()
//        tInst.print();
        if (p) System.out.print("\n");
    }

    public void accept(IRVisitor visitor) {
        visitor.visit(this);
    }
}
