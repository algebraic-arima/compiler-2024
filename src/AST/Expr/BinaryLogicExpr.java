package src.AST.Expr;

import src.AST.ASTVisitor;
import src.utils.pos.Position;

public class BinaryLogicExpr extends Expr {

    public enum BLogicOp {
        EQ, NE, LT, GT, LE, GE, AND, OR
    }

    public Expr lhs, rhs;
    public BLogicOp op;

    public BinaryLogicExpr(Position p, Expr lhs, Expr rhs, String op) {
        this.lhs = lhs;
        this.rhs = rhs;
        switch(op){
            case "==":
                this.op = BLogicOp.EQ;
                break;
            case "!=":
                this.op = BLogicOp.NE;
                break;
            case "<":
                this.op = BLogicOp.LT;
                break;
            case ">":
                this.op = BLogicOp.GT;
                break;
            case "<=":
                this.op = BLogicOp.LE;
                break;
            case ">=":
                this.op = BLogicOp.GE;
                break;
            case "&&":
                this.op = BLogicOp.AND;
                break;
            case "||":
                this.op = BLogicOp.OR;
                break;
        }
    }

    @Override
    public void accept(ASTVisitor v) {

    }
}
