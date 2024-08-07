package src.AST.Expr;

import src.utils.type.Type;

public class NewTypeExpr extends Expr{
    public Type typeName;

    public NewTypeExpr(Type t) {
        typeName = t;
    }

    @Override
    public void accept(src.AST.ASTVisitor v) {
        v.visit(this);
    }
}
