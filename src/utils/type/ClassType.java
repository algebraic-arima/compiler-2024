package src.utils.type;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class ClassType {
    public LinkedHashMap<String, Type> fields;
    public HashMap<String, FuncType> methods;

    public ClassType() {
        fields = new LinkedHashMap<>();
        methods = new HashMap<>();
    }

    public int getMemberOffset(String memberName) {
        int offset = 0;
        for (String key : fields.keySet()) {
            if (key.equals(memberName)) {
                return offset;
            }
            offset += 1;
        }
        return -1;
    }

}