package src.ASM.ASMDef;

import src.ASM.ASMBuilder;
import src.ASM.ASMInst.J;
import src.ASM.ASMNode;

import java.util.ArrayList;

public class ASMFuncDef extends ASMNode {

    public String name;
    public ArrayList<ASMBlock> blocks;
    public int stackSize; // in byte

    public ASMFuncDef(String name) {
        this.name = name;
        blocks = new ArrayList<>();
    }

    @Override
    public void print() {
        System.out.println("  .globl " + name);
        System.out.println("  .type " + name + ", @function");
        blocks.forEach(ASMBlock::print);
    }

    public void reformat() {
        for (int i = 0; i < blocks.size() - 1; ++i) {
            ASMBlock b = blocks.get(i);
            ASMBlock bn = blocks.get(i + 1);
            if (b.insts.getLast() instanceof J j && j.toLabel.equals(bn.label)) {
                b.insts.removeLast();
            }
        }
    }
}
