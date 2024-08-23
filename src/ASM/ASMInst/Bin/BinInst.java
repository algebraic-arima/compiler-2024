package src.ASM.ASMInst.Bin;

import src.ASM.ASMInst.ASMInst;
import src.ASM.Operand.Imm;
import src.ASM.Operand.Operand;
import src.ASM.Operand.PhyReg;

public class BinInst extends ASMInst {
    public Operand lhs, rhs, dest;

    public BinInst(String lhs_, String rhs_, String dest_) {
        lhs = new PhyReg(lhs_);
        rhs = new PhyReg(rhs_);
        dest = new PhyReg(dest_);
    }

    public BinInst(String lhs_, long rhs_, String dest_) {
        lhs = new PhyReg(lhs_);
        rhs = new Imm(rhs_);
        dest = new PhyReg(dest_);
    }

    @Override
    public void print() {
    }
}
