package src.ASM;

import src.ASM.ASMDef.ASMFuncDef;
import src.ASM.ASMDef.ASMGStrDef;
import src.ASM.ASMDef.ASMGVarDef;

import java.util.ArrayList;

public class ASMProg extends ASMNode {

    ArrayList<ASMFuncDef> funcDefs;
    ArrayList<ASMGStrDef> gStrDefs;
    ArrayList<ASMGVarDef> gVarDefs;

    public ASMProg() {
        funcDefs = new ArrayList<>();
        gStrDefs = new ArrayList<>();
        gVarDefs = new ArrayList<>();
    }

    @Override
    public void print() {
        System.out.println("  .section .text");
        funcDefs.forEach(ASMFuncDef::print);
        System.out.println("\n  .section .data");
        gVarDefs.forEach(ASMGVarDef::print);
        System.out.println("\n  .section .rodata");
        gStrDefs.forEach(ASMGStrDef::print);
    }

    public void reformat() {
        funcDefs.forEach(ASMFuncDef::reformat);
    }
}
