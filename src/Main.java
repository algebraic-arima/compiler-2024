package src;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import src.ASM.ASMBuilder;
import src.ASM.ASMPrinter;
import src.ASM.ASMProg;
import src.AST.ASTBuilder;
import src.AST.Prog;
import src.IR.IRBuilder;
import src.IR.IRPrinter;
import src.IR.IRProg;
import src.Optim.DCE.DCE;
import src.Optim.Mem2Reg.Mem2Reg;
import src.Optim.RegAlloc.RegAlloc;
import src.Optim.Inline.Inline;
import src.Optim.SCCP.SCCP;
import src.Semantic.*;
import src.parser.Lex;
import src.parser.Mx;
import src.utils.MxErrorListener;
import src.utils.Scope.GlobalScope;
import src.utils.error.error;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        SemanticJudge sj = new SemanticJudge();

        boolean fileIn = false;

        boolean printIR = false;
        boolean fileOutIR = false;

        boolean printInl = false;
        boolean fileOutInl = false;

        boolean printM2R = false;
        boolean fileOutM2R = false;

        boolean printSCCP = false;
        boolean fileOutSCCP = false;

        boolean printDCE = false;
        boolean fileOutDCE = false;

        boolean printDCE2 = false;
        boolean fileOutDCE2 = false;

        boolean printASM = true;
        boolean fileOutASM = false;
        try {
            InputStream in;
            if (fileIn) {
                String file = "/home/limike/Git/compiler-2024/testcases/codegen/optim/binary_tree.mx";
                in = new FileInputStream(file);
            } else {
                in = System.in;
            }
            Lex lexer = new Lex(CharStreams.fromStream(in));
            lexer.removeErrorListeners();
            lexer.addErrorListener(new MxErrorListener());
            Mx parser = new Mx(new CommonTokenStream(lexer));
            parser.removeErrorListeners();
            parser.addErrorListener(new MxErrorListener());
            Mx.ProgContext parseTreeRoot = parser.prog();
            ASTBuilder AST = new ASTBuilder();
            Prog ASTRoot = (Prog) AST.visit(parseTreeRoot);
            GlobalScope gScope = new GlobalScope();
            new SymbolCollector(gScope).visit(ASTRoot);
            SemanticChecker sc = new SemanticChecker(gScope);
            sc.visit(ASTRoot);


            IRBuilder irBuilder = new IRBuilder(gScope);
            IRProg irProg = irBuilder.build(ASTRoot);
            irProg.reformat();
            if (printIR) {
                IRPrinter irPrinter = new IRPrinter(irProg);
                if (fileOutIR) {
                    FileOutputStream fileOutputStream = new FileOutputStream("/home/limike/Git/compiler-2024/ir.ll");
                    PrintStream printStream = new PrintStream(fileOutputStream);
                    System.setOut(printStream);
                } else {
                    PrintStream consolePrintStream = new PrintStream(new FileOutputStream(FileDescriptor.out));
                    System.setOut(consolePrintStream);
                }
                irPrinter.print();
            }

            Inline inl = new Inline(irProg);
            Inline inl2 = new Inline(irProg);

            if (printInl) {
                IRPrinter irPrinter = new IRPrinter(irProg);
                if (fileOutInl) {
                    FileOutputStream fileOutputStream = new FileOutputStream("/home/limike/Git/compiler-2024/inl.ll");
                    PrintStream printStream = new PrintStream(fileOutputStream);
                    System.setOut(printStream);
                } else {
                    PrintStream consolePrintStream = new PrintStream(new FileOutputStream(FileDescriptor.out));
                    System.setOut(consolePrintStream);
                }
                irPrinter.print();
            }

            Mem2Reg m2r = new Mem2Reg(irProg);

            if (printM2R) {
                IRPrinter irPrinter = new IRPrinter(irProg);
                if (fileOutM2R) {
                    FileOutputStream fileOutputStream = new FileOutputStream("/home/limike/Git/compiler-2024/m2r.ll");
                    PrintStream printStream = new PrintStream(fileOutputStream);
                    System.setOut(printStream);
                } else {
                    PrintStream consolePrintStream = new PrintStream(new FileOutputStream(FileDescriptor.out));
                    System.setOut(consolePrintStream);
                }
                irPrinter.print();
            }

            SCCP sccp = new SCCP(irProg);

            if (printSCCP) {
                IRPrinter irPrinter = new IRPrinter(irProg);
                if (fileOutSCCP) {
                    FileOutputStream fileOutputStream = new FileOutputStream("/home/limike/Git/compiler-2024/sccp.ll");
                    PrintStream printStream = new PrintStream(fileOutputStream);
                    System.setOut(printStream);
                } else {
                    PrintStream consolePrintStream = new PrintStream(new FileOutputStream(FileDescriptor.out));
                    System.setOut(consolePrintStream);
                }
                irPrinter.print();
            }

            DCE dce = new DCE(irProg);

            if (printDCE) {
                IRPrinter irPrinter = new IRPrinter(irProg);
                if (fileOutDCE) {
                    FileOutputStream fileOutputStream = new FileOutputStream("/home/limike/Git/compiler-2024/hdce.ll");
                    PrintStream printStream = new PrintStream(fileOutputStream);
                    System.setOut(printStream);
                } else {
                    PrintStream consolePrintStream = new PrintStream(new FileOutputStream(FileDescriptor.out));
                    System.setOut(consolePrintStream);
                }
                irPrinter.print();
            }

            SCCP sccp2 = new SCCP(irProg);
            DCE dce2 = new DCE(irProg);

            if (printDCE2) {
                IRPrinter irPrinter = new IRPrinter(irProg);
                if (fileOutDCE2) {
                    FileOutputStream fileOutputStream = new FileOutputStream("/home/limike/Git/compiler-2024/hdce2.ll");
                    PrintStream printStream = new PrintStream(fileOutputStream);
                    System.setOut(printStream);
                } else {
                    PrintStream consolePrintStream = new PrintStream(new FileOutputStream(FileDescriptor.out));
                    System.setOut(consolePrintStream);
                }
                irPrinter.print();
            }

            RegAlloc ra = new RegAlloc(irProg);
            if (printASM) {
                ASMBuilder asmBuilder = new ASMBuilder(irBuilder.irProg, printIR);
                ASMProg asmProg = asmBuilder.asmProg;
                asmProg.reformat();
                ASMPrinter asmPrinter = new ASMPrinter(asmBuilder.asmProg);
                if (fileOutASM) {
                    FileOutputStream fileOutputStream1 = new FileOutputStream("/home/limike/Git/compiler-2024/test.s");
                    PrintStream printStream1 = new PrintStream(fileOutputStream1);
                    System.setOut(printStream1);
                } else {
                    PrintStream consolePrintStream = new PrintStream(new FileOutputStream(FileDescriptor.out));
                    System.setOut(consolePrintStream);
                }
                asmPrinter.print();
            }

            System.exit(0);
        } catch (error e) {
//            System.err.println(e.pos.row + ":" + e.pos.column + " " + e.message);
            sj.catPrint(e);
            System.exit(1); // if judge
        }
    }
}
