package src.IR;

import src.IR.IRInst.Inst;
import src.utils.Entity.Register;

import java.util.ArrayList;

public class IRFrag extends IRNode {

    public ArrayList<Inst> nodes = new ArrayList<>();

    public void addInst(Inst inst) {
        nodes.add(inst);
    }
    
}
