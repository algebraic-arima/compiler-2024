package src.AST.Def;

import src.AST.ASTVisitor;
import src.AST.__ASTVisitor;
import src.AST.Expr.Expr;
import src.utils.pos.Position;
import src.utils.type.Type;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class VarDef extends Def{

    public Type type;
    public LinkedHashMap<String,Expr> initVals;


    public VarDef(Position p) {
        super(p);
        initVals = new LinkedHashMap<>();
    }

    @Override
    public void accept(__ASTVisitor v) {
        v.visit(this);
    }

    @Override
    public <T> T accept(ASTVisitor<T> v) {
        return v.visit(this);
    }
}
