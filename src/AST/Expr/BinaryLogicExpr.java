package src.AST.Expr;

import src.AST.ASTVisitor;

public class BinaryLogicExpr extends Expr {

    public enum BLogicOp {
        EQ, NE, LT, GT, LE, GE, AND, OR
    }

    public Expr lhs, rhs;
    public BLogicOp op;

    @Override
    public void accept(ASTVisitor v) {

    }
}
