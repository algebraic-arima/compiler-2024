package src.IR;

import src.IR.IRInst.Inst;
import src.IR.IRInst.Label;
import src.IR.IRInst.terminalInst;

import java.util.ArrayList;

public class IRBlock {
    public Label label = null;
    public ArrayList<Inst> insts = new ArrayList<>();
    public terminalInst tInst = null;

    public IRBlock(String s) {
        label = new Label(s);
    }
}
