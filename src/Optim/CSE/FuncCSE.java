package src.Optim.CSE;

import src.IR.IRDef.IRBlock;
import src.IR.IRDef.IRFuncDef;
import src.IR.IRInst.*;
import src.Optim.CSE.EXP.*;
import src.utils.Entity.Register;

import java.util.HashMap;
import java.util.HashSet;

public class FuncCSE {

    public static HashSet<String> a, n;
    public HashMap<Register, Register> rename = new HashMap<>();

    static {
        a = new HashSet<>();
        a.add("add");
        a.add("mul");
        a.add("and");
        a.add("or");
        a.add("xor");
        a.add("eq");
        a.add("ne");

        n = new HashSet<>();
        n.add("sub");
        n.add("sdiv");
        n.add("srem");
        n.add("shl");
        n.add("ashr");
        n.add("slt");
        n.add("sgt");
        n.add("sle");
        n.add("sge");
    }

    public FuncCSE(IRFuncDef func) {
        func.blocks.forEach(this::scan);
    }

    public void scan(IRBlock b) {
        HashSet<EXP> expList = new HashSet<>();
        for (IRInst inst : b.IRInsts) {
            if (inst instanceof GetElePtr g) {
                Gep gep = new Gep(g.ptr, g.offset, g.fieldInd);
                expList.add(gep);
            } else if (inst instanceof Binary bi) {
                if (a.contains(bi.op)) {
                    Abel aa = new Abel(bi.op, bi.lhs, bi.rhs);
                    expList.add(aa);
                } else if (n.contains(bi.op)) {
                    NonAbel aa = new NonAbel(bi.op, bi.lhs, bi.rhs);
                    expList.add(aa);
                }
            } else if (inst instanceof Icmp bi) {
                if (a.contains(bi.op)) {
                    Abel aa = new Abel(bi.op, bi.lhs, bi.rhs);
                    expList.add(aa);
                } else if (n.contains(bi.op)) {
                    NonAbel aa = new NonAbel(bi.op, bi.lhs, bi.rhs);
                    expList.add(aa);
                }
            }
        }
    }
}
