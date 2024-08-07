package src.AST.Expr;

import src.AST.ASTVisitor;
import src.AST.BaseASTNode;
import src.utils.pos.Position;
import src.utils.type.Type;

public abstract class Expr extends BaseASTNode {

    public Type type;
    public boolean isLvalue = false;

    public Expr() {
        super();
    }

    public Expr(Position p) {
        super(p);
    }

    abstract public void accept(ASTVisitor v);
}
