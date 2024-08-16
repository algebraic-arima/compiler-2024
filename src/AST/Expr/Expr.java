package src.AST.Expr;

import src.AST.ASTVisitor;
import src.AST.__ASTVisitor;
import src.AST.BaseASTNode;
import src.utils.pos.Position;
import src.utils.type.Type;
import src.utils.Entity.Entity;

public abstract class Expr extends BaseASTNode {

    public Type type;
    public Entity entity;
    public boolean isLvalue = false;

    public Expr() {
        super();
    }

    public Type getType() {
        return type;
    }

    public Expr(Position p) {
        super(p);
    }

    abstract public void accept(__ASTVisitor v);

    abstract public <T> T accept(ASTVisitor<T> v);
}
