package src.AST.Expr;

import src.utils.pos.Position;

import java.util.ArrayList;

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
    public void accept(src.AST.ASTVisitor v) {
        v.visit(this);
    }
}
