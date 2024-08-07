package src.AST.Expr;

import src.utils.type.Type;

public class VarExpr extends Expr {
    public String varName;
    public Type type;

    public VarExpr(String v, Type t) {
        varName = v;
        type = t;
    }

    @Override
    public void accept(src.AST.ASTVisitor v) {
        v.visit(this);
    }
}
