package src.ASM.Operand;

public class PhyReg extends Reg {
    public int index;
    public String name;

    public PhyReg(int index, String name) {
        this.index = index;
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    static public PhyReg zero = new PhyReg(0, "zero");
    static public PhyReg ra = new PhyReg(1, "ra");
    static public PhyReg sp = new PhyReg(2, "sp");
    static public PhyReg gp = new PhyReg(3, "gp");
    static public PhyReg tp = new PhyReg(4, "tp");
    static public PhyReg t0 = new PhyReg(5, "t0");
    static public PhyReg t1 = new PhyReg(6, "t1");
    static public PhyReg t2 = new PhyReg(7, "t2");
    static public PhyReg s0 = new PhyReg(8, "s0");
    static public PhyReg s1 = new PhyReg(9, "s1");
    static public PhyReg a0 = new PhyReg(10, "a0");
    static public PhyReg a1 = new PhyReg(11, "a1");
    static public PhyReg a2 = new PhyReg(12, "a2");
    static public PhyReg a3 = new PhyReg(13, "a3");
    static public PhyReg a4 = new PhyReg(14, "a4");
    static public PhyReg a5 = new PhyReg(15, "a5");
    static public PhyReg a6 = new PhyReg(16, "a6");
    static public PhyReg a7 = new PhyReg(17, "a7");
    static public PhyReg s2 = new PhyReg(18, "s2");
    static public PhyReg s3 = new PhyReg(19, "s3");
    static public PhyReg s4 = new PhyReg(20, "s4");
    static public PhyReg s5 = new PhyReg(21, "s5");
    static public PhyReg s6 = new PhyReg(22, "s6");
    static public PhyReg s7 = new PhyReg(23, "s7");
    static public PhyReg s8 = new PhyReg(24, "s8");
    static public PhyReg s9 = new PhyReg(25, "s9");
    static public PhyReg s10 = new PhyReg(26, "s10");
    static public PhyReg s11 = new PhyReg(27, "s11");
    static public PhyReg t3 = new PhyReg(28, "t3");
    static public PhyReg t4 = new PhyReg(29, "t4");
    static public PhyReg t5 = new PhyReg(30, "t5");
    static public PhyReg t6 = new PhyReg(31, "t6");

    static public PhyReg[] phyRegs = {
            zero, ra, sp, gp, tp, t0, t1, t2,
            s0, s1, a0, a1, a2, a3, a4, a5,
            a6, a7, s2, s3, s4, s5, s6, s7,
            s8, s9, s10, s11, t3, t4, t5, t6
    };

    static public String[] freeRegs = {
            "zer", "s0", "s1", "s2", "s3", "s4", "s5", "s6", "s7",
            "s8", "s9", "s10", "s11", "t3", "t4", "t5", "t6"
    };

    public PhyReg(int ind) {
        this.index = ind;
        this.name = phyRegs[ind].name;
    }

    public PhyReg(String str) {
        switch (str) {
            case "zero":
                this.index = 0;
                break;
            case "ra":
                this.index = 1;
                break;
            case "sp":
                this.index = 2;
                break;
            case "gp":
                this.index = 3;
                break;
            case "tp":
                this.index = 4;
                break;
            case "t0":
                this.index = 5;
                break;
            case "t1":
                this.index = 6;
                break;
            case "t2":
                this.index = 7;
                break;
            case "s0":
                this.index = 8;
                break;
            case "s1":
                this.index = 9;
                break;
            case "a0":
                this.index = 10;
                break;
            case "a1":
                this.index = 11;
                break;
            case "a2":
                this.index = 12;
                break;
            case "a3":
                this.index = 13;
                break;
            case "a4":
                this.index = 14;
                break;
            case "a5":
                this.index = 15;
                break;
            case "a6":
                this.index = 16;
                break;
            case "a7":
                this.index = 17;
                break;
            case "s2":
                this.index = 18;
                break;
            case "s3":
                this.index = 19;
                break;
            case "s4":
                this.index = 20;
                break;
            case "s5":
                this.index = 21;
                break;
            case "s6":
                this.index = 22;
                break;
            case "s7":
                this.index = 23;
                break;
            case "s8":
                this.index = 24;
                break;
            case "s9":
                this.index = 25;
                break;
            case "s10":
                this.index = 26;
                break;
            case "s11":
                this.index = 27;
                break;
            case "t3":
                this.index = 28;
                break;
            case "t4":
                this.index = 29;
                break;
            case "t5":
                this.index = 30;
                break;
            case "t6":
                this.index = 31;
                break;
            default:
                break;
        }
        this.name = phyRegs[this.index].name;
    }

}
