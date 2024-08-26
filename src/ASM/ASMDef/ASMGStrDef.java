package src.ASM.ASMDef;

import src.ASM.ASMNode;

public class ASMGStrDef extends ASMNode {
    // use .ascii

    public String name;
    public String value;

    public ASMGStrDef(String name, String value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public void print() {
        System.out.println(name + ":");
        System.out.println("  .ascii \"" + value + "\"");
        System.out.println("  .size " + name + ", " + value.length() + "\n");
    }
}
