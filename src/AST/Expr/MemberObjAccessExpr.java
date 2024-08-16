package src.AST.Expr;

import src.AST.ASTVisitor;
import src.AST.__ASTVisitor;
import src.utils.pos.Position;

public class MemberObjAccessExpr extends Expr{
    public Expr obj;
    public String member;

    public MemberObjAccessExpr(Position p, Expr o, String m) {
        super(p);
        obj = o;
        member = m;
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
