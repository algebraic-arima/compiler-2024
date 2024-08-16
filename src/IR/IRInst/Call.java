package src.IR.IRInst;

import src.utils.Entity.Entity;
import src.utils.Entity.Register;
import src.utils.IRType.IRType;

import java.util.ArrayList;

public class Call extends Inst {

    public Register dest;
    public IRType retType;
    public String funcName;
    public ArrayList<Entity> args;

    public Call(){
        args = new ArrayList<>();
    }

}
