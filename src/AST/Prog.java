package src.AST;

import src.AST.Def.Def;
import src.utils.pos.Position;

import java.util.ArrayList;

public class Prog extends BaseASTNode {

    public ArrayList<Def> defs;

    public Prog(Position p) {
        super(p);
        defs = new ArrayList<>();
    }

    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}