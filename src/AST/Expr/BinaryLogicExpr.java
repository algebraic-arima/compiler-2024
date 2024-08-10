package src.AST.Expr;

import src.AST.ASTVisitor;
import src.utils.pos.Position;
import src.utils.type.Type;

public class BinaryLogicExpr extends Expr {

    public enum BLogicOp {
        AND, OR
    }

    public Expr lhs, rhs;
    public BLogicOp op;

    public BinaryLogicExpr(Position p, Expr lhs, Expr rhs, String op) {
        super(p);
        this.lhs = lhs;
        this.rhs = rhs;
        switch (op) {
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
        v.visit(this);
    }
}