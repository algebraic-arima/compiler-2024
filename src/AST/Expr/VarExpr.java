package src.AST.Expr;

import src.AST.__ASTVisitor;
import src.utils.pos.Position;

public class VarExpr extends Expr {
    public String varName;
//    public Type type;

    public VarExpr(Position p, String v) {
        super(p);
        varName = v;
//        type = t;
    }

    @Override
    public void accept(__ASTVisitor v) {
        v.visit(this);
    }
}
