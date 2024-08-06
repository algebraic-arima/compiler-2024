package src.AST.Expr;

import src.AST.BaseASTNode;
import src.utils.pos.Position;
import src.utils.type.Type;

public abstract class Expr extends BaseASTNode {

    public Type type;

    public Expr() {
        super();
    }

    public Expr(Position p) {
        super(p);
    }

    abstract public void accept(src.AST.ASTVisitor v);
}
