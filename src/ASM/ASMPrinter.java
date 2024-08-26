package src.ASM;

public class ASMPrinter {

    ASMProg prog;

    public ASMPrinter(ASMProg prog) {
        this.prog = prog;
    }

    public void print() {
        prog.print();
    }

}
