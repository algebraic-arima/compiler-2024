package src.AST;

import java.util.ArrayList;
import java.util.List;

public class Prog extends BaseASTNode {



    public Prog() {
        super();
    }

    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}