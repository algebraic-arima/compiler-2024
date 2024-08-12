package src.utils.error;

import src.utils.pos.Position;

public class UndefinedIdentifier extends error {
    public UndefinedIdentifier(Position p) {
        super("Multiple Definitions", p);
    }
}
