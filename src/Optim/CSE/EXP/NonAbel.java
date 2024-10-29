package src.Optim.CSE.EXP;

import src.utils.Entity.Entity;

public class NonAbel extends EXP {

    String op;
    Entity lhs, rhs;

    public NonAbel(String op, Entity lhs, Entity rhs) {
        this.op = op;
        this.lhs = lhs;
        this.rhs = rhs;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof NonAbel a) {
            return a.op.equals(op) && (lhs.equals(a.lhs) && rhs.equals(a.rhs));
        }
        return false;
    }
}
