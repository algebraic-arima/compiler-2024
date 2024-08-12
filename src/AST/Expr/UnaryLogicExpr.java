package src.AST.Expr;

import src.utils.pos.Position;

public class UnaryLogicExpr extends Expr{

    public enum ULogicOp {
        NOT
    }

    public Expr expr;
    public ULogicOp op;

    public UnaryLogicExpr(Position p, Expr e) {
        super(p);
        expr = e;
        op = ULogicOp.NOT;
    }

    @Override
    public void accept(src.AST.ASTVisitor v) {
        v.visit(this);
    }
}
