package src.ASM;

import src.ASM.ASMDef.ASMFuncDef;
import src.ASM.ASMDef.ASMGStrDef;
import src.ASM.ASMDef.ASMGVarDef;

import java.util.ArrayList;

public class ASMProg extends ASMNode{

    ArrayList<ASMFuncDef> funcDefs;
    ArrayList<ASMGStrDef> gStrDefs;
    ArrayList<ASMGVarDef> gVarDefs;

    @Override
    public void print() {
        funcDefs.forEach(ASMFuncDef::print);
        gStrDefs.forEach(ASMGStrDef::print);
        gVarDefs.forEach(ASMGVarDef::print);
    }
}
