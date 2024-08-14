package src.AST.Expr;

import src.AST.__ASTVisitor;
import src.utils.pos.Position;

public class MemberFuncCallExpr extends Expr {
    public Expr obj;
    public String funcName;
    public RowExpr args;

    public MemberFuncCallExpr(Position p, Expr o, String f) {
        super(p);
        obj = o;
        funcName = f;
    }

    @Override
    public void accept(__ASTVisitor v) {
        v.visit(this);
    }
}
