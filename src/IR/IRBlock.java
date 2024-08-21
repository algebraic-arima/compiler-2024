package src.IR;

import src.IR.IRInst.Inst;
import src.IR.IRInst.Label;
import src.IR.IRInst.terminalInst;

import java.util.ArrayList;

public class IRBlock {
    public Label label = null;
    public ArrayList<Inst> insts = new ArrayList<>();
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

    public void addInst(Inst inst) {
        insts.add(inst);
    }

    public void print() {
        if (insts.isEmpty()) return;
        StringBuilder s = new StringBuilder();
        s.append(label.label).append(":\n");
        insts.forEach(d -> s.append(d.str()));
//        s.append(tInst.str());
        s.append("\n");
        System.out.print(label.label + ":\n");
        for (Inst inst : insts) {
            inst.print();
            if (inst instanceof terminalInst) {
                break;
            }
        }
        // indent in inst::print()
//        tInst.print();
        System.out.print("\n");
    }
}
