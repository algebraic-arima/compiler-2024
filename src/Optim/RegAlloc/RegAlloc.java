package src.Optim.RegAlloc;


import src.ASM.ASMInst.LI;
import src.IR.IRDef.IRFuncDef;
import src.IR.IRProg;

import java.util.HashMap;

public class RegAlloc {

    public HashMap<String, Liveness> r;

    public RegAlloc(IRProg prog) {
        r = new HashMap<>();
        for (IRFuncDef func : prog.funcDefs) {
            Liveness l = new Liveness(func);
            r.put(func.name, l);
            func.regNum = l.rig.colors.size();
        }
    }

}
