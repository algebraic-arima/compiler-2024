package src.ASM.ASMDef;

import src.ASM.ASMNode;

import java.util.ArrayList;

public class ASMFuncDef extends ASMNode {

    public String name;
    public ArrayList<ASMBlock> blocks;

    @Override
    public void print() {
        System.out.println("  .section .text");
        System.out.println("  .globl " + name);
        System.out.println("  .type " + name + ", @function");
        System.out.println(name + ":");
        blocks.forEach(ASMBlock::print);
    }
}
