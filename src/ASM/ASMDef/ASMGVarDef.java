package src.ASM.ASMDef;

import src.ASM.ASMNode;

public class ASMGVarDef extends ASMNode {

    public String name;
    public long value;

    @Override
    public void print() {
        System.out.println("  .section .data");
        System.out.println("  .globl " + name);
        System.out.println(name + ":");
        System.out.println("  .word " + value + "\n");
    }
}
