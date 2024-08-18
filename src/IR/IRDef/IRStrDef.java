package src.IR.IRDef;

import java.util.LinkedHashMap;
import java.util.Map;

public class IRStrDef extends IRDef {

    public LinkedHashMap<String, Integer> strMap;

    public IRStrDef() {
        strMap = new LinkedHashMap<>();
    }

    public String push(String s) {
        if (strMap.containsKey((s))) {
            return null;
        } else {
            strMap.put(s, strMap.size());
            return "@constStr-" + (strMap.size() - 1);
        }
    }

    @Override
    public void print() {
        for (Map.Entry<String, Integer> e : strMap.entrySet()) {
            System.out.print("@constStr-");
            System.out.print(e.getValue());
            System.out.print(" = private unnamed_addr constant [");
            System.out.print(e.getKey().length()+1);
            System.out.print(" x i8] c\"");
            System.out.print(e.getValue());
            /// todo: translate \n to \0A, \ to \\, \" to \22
            System.out.print("\\00\"\n");
        }
    }
}
