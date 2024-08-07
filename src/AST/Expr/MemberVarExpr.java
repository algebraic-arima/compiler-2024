package src.AST.Expr;

public class MemberVarExpr extends Expr{
    public Expr obj;
    public String member;

    public MemberVarExpr(Expr o, String m) {
        obj = o;
        member = m;
    }

    @Override
    public void accept(src.AST.ASTVisitor v) {
        v.visit(this);
    }
}
