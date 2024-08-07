package src.AST.Expr;

import java.util.ArrayList;

public class MemberFuncExpr extends Expr {
    public Expr obj;
    public String funcName;
    public ArrayList<Expr> args;

    public MemberFuncExpr(Expr o, String f) {
        obj = o;
        funcName = f;
        args = new ArrayList<>();
    }

    @Override
    public void accept(src.AST.ASTVisitor v) {
        v.visit(this);
    }
}
