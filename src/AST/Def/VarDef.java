package src.AST.Def;

import src.AST.ASTVisitor;
import src.AST.Expr.Expr;
import src.utils.pos.Position;
import src.utils.type.Type;

import java.util.ArrayList;
import java.util.HashMap;

public class VarDef extends Def{

    public Type type;
    public HashMap<String,Expr> initVals;


    public VarDef(Position p) {
        super(p);
        initVals = new HashMap<>();
    }

    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
