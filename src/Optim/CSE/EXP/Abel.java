package src.Optim.CSE.EXP;

import src.utils.Entity.Entity;

public class Abel extends EXP {

    String op;
    Entity lhs, rhs;

    public Abel(String op, Entity lhs, Entity rhs) {
        this.op = op;
        this.lhs = lhs;
        this.rhs = rhs;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Abel a) {
            return a.op.equals(op) && ((lhs.equals(a.lhs) && rhs.equals(a.rhs))
                    || (lhs.equals(a.rhs) && rhs.equals(a.lhs)));
        }
        return false;
    }
}
