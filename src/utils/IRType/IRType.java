package src.utils.IRType;

import src.utils.type.Type;

public class IRType {
    public String typeName;
    public int size = 0;// bit

    public IRType() {
        typeName = "void";
        size = -1;
    }

    public IRType(Type t) {
        if (t.dim >= 1) {
            typeName = "ptr";
            size = 32;
        } else {
            switch (t.atomType) {
                case INT:
                    typeName = "i32";
                    size = 32;
                    break;
                case BOOL:
                    typeName = "i1";
                    size = 1;
                    break;
                case STRING:
                    typeName = "ptr";
                    size = 32;
                    break;
                case VOID:
                    typeName = "void";
                    size = -1;
                    break;
                case CLASS:
                    typeName = "%Class-" + t.typeName;
                    size = 0;
                    break;
            }
        }

    }
}
