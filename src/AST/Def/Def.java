package src.AST.Def;

import src.AST.ASTVisitor;
import src.AST.BaseASTNode;
import src.utils.pos.Position;

public abstract class Def extends BaseASTNode {

    public Def(Position p) {
        super(p);
    }

    abstract public void accept(ASTVisitor v);

}