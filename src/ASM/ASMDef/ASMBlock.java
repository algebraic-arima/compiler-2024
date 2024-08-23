package src.ASM.ASMDef;

import src.ASM.ASMInst.ASMInst;
import src.ASM.ASMNode;

import java.util.ArrayList;


public class ASMBlock extends ASMNode {

    public String label;
    public ArrayList<ASMInst> insts;

    public ASMBlock(){
        insts = new ArrayList<>();
    }

    @Override
    public void print(){
        System.out.println(label + ":");
        insts.forEach(ASMInst::print);
    }
}
