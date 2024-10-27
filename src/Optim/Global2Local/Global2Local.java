package src.Optim.Global2Local;

import src.IR.IRBuilder;
import src.IR.IRDef.IRBlock;
import src.IR.IRDef.IRFuncDef;
import src.IR.IRDef.IRGlobalVarDef;
import src.IR.IRInst.*;
import src.IR.IRProg;
import src.utils.Entity.AnonReg;
import src.utils.Entity.Register;
import src.utils.IRType.IRType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Global2Local {

    public IRProg prog;
    public HashMap<String, IRType> globalVarList = new HashMap<>();
    public HashMap<String, HashSet<String>> useList = new HashMap<>();
    public HashSet<IRFuncDef> localizeList = new HashSet<>();

    public Global2Local(IRProg prog) {
        this.prog = prog;
        collectGlobal();
        localizeList.forEach(this::localize);
    }

    public void collectGlobal() {
        for (IRGlobalVarDef v : prog.gVarDefs) {
            globalVarList.put(v.name.substring(1), v.irType);
        }
        for (IRFuncDef f : prog.funcDefs) {
            HashSet<String> uses = new HashSet<>();
            useList.put(f.name, uses);
            int callCnt = 0;
            for (IRBlock b : f.blocks) {
                for (IRInst i : b.IRInsts) {
                    if (i instanceof Load l && l.src.name.startsWith("@")) {
                        uses.add(l.src.name.substring(1));
                    } else if (i instanceof Store s && s.dest.name.startsWith("@")) {
                        uses.add(s.dest.name.substring(1));
                    } else if (i instanceof Call) {
                        ++callCnt;
                    }
                }
            }
            if (uses.size() > callCnt) {
                localizeList.add(f);
            }
        }
    }

    public void localize(IRFuncDef func) {
        HashSet<String> uses = useList.get(func.name);
        for (String s : uses) {
            IRType t = globalVarList.get(s);
            Register dest = Register.newReg(t, "%" + s + "." + func.name.substring(1));
            func.regCollector.IRInsts.add(new Alloca(t, dest));
        }
        for (IRBlock b : func.blocks) {
            ArrayList<IRInst> tmp = new ArrayList<>();
            if (b.label.equals("entry")) {
                for (String s : uses) {
                    IRType t = globalVarList.get(s);
                    Register src = Register.newReg(t, "@" + s);
                    Register dest = Register.newReg(t, "%" + s + "." + func.name.substring(1));
                    Register tempReg = new AnonReg(t);
                    tmp.add(new Load(t, src, tempReg));
                    tmp.add(new Store(t, tempReg, dest));
                }
            }
            for (IRInst i : b.IRInsts) {
                if (i instanceof Load l && l.src.name.startsWith("@")) {
                    String s = l.src.name.substring(1);
                    IRType t = globalVarList.get(s);
                    l.src = Register.newReg(t, "%" + s + "." + func.name.substring(1));
                    tmp.add(l);
                } else if (i instanceof Store s && s.dest.name.startsWith("@")) {
                    String str = s.dest.name.substring(1);
                    IRType t = globalVarList.get(str);
                    s.dest = Register.newReg(t, "%" + str + "." + func.name.substring(1));
                    tmp.add(s);
                } else if ((i instanceof Call c && !IRBuilder.builtinFunc.contains(c.funcName)) || i instanceof Ret || i instanceof Tail) {
                    for (String s : uses) {
                        IRType t = globalVarList.get(s);
                        Register dest = Register.newReg(t, "@" + s);
                        Register src = Register.newReg(t, "%" + s + "." + func.name.substring(1));
                        Register tempReg = new AnonReg(t);
                        tmp.add(new Load(t, src, tempReg));
                        tmp.add(new Store(t, tempReg, dest));
                    }
                    tmp.add(i);
                } else {
                    tmp.add(i);
                }
            }
            b.IRInsts = tmp;
        }
    }
}
