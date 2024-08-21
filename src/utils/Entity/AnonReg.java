package src.utils.Entity;

import src.utils.IRType.IRType;

public class AnonReg extends Register {
    public static int cnt = 0;

    public AnonReg(IRType type) {
        super("%." + String.valueOf(cnt));
        this.type = type;
        ++cnt;
    }
}
