package src.IR.IRDef;

import src.IR.IRInst.IRInst;
import src.IR.IRInst.Label;
import src.IR.IRInst.terminalIRInst;
import src.IR.IRVisitor;

import java.util.ArrayList;

public class IRBlock {
    public Label label = null;
    public ArrayList<IRInst> IRInsts = new ArrayList<>();
    public int index;
    static public int blockCnt;

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

    public void print() {
        if (IRInsts.isEmpty()) return;
        System.out.print(label.label + ":\n");
        ArrayList<IRInst> newIRInsts = new ArrayList<>();
        for (IRInst IRInst : IRInsts) {
            IRInst.print();
            newIRInsts.add(IRInst);
            if (IRInst instanceof terminalIRInst) {
                break;
            }
        }
        IRInsts = newIRInsts;
        // indent in inst::print()
//        tInst.print();
        System.out.print("\n");
    }

    public void accept(IRVisitor visitor) {
        visitor.visit(this);
    }
}
