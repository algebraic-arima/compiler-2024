package src.AST.Def;

import src.AST.__ASTVisitor;
import src.AST.BaseASTNode;
import src.utils.pos.Position;

public abstract class Def extends BaseASTNode {

    public Def(Position p) {
        super(p);
    }

    abstract public void accept(__ASTVisitor v);

    abstract public <T> T accept(src.AST.ASTVisitor<T> v);

}