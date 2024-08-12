package src.AST.Expr;

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
    public void accept(src.AST.ASTVisitor v) {
        v.visit(this);
    }
}
