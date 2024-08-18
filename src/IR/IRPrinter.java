package src.IR;

public class IRPrinter {

    public IRProg irProgram;

    public IRPrinter(IRProg irProgram) {
        this.irProgram = irProgram;
    }

    public void print() {
        printOut("declare void @print(ptr)\n",
                "declare void @println(ptr)\n",
                "declare void @printInt(i32)\n",
                "declare void @printlnInt(i32)\n",
                "declare ptr @getString()\n",
                "declare i32 @getInt()\n",
                "declare ptr @toString(i32)\n",
                "declare i32 @string.length(ptr)\n",
                "declare ptr @string.substring(ptr,i32,i32)\n",
                "declare i32 @string.parseInt(ptr)\n",
                "declare i32 @string.ord(ptr,i32)\n",
                "declare ptr @string.add(ptr,ptr)\n",
                "declare i1 @string.eq(ptr,ptr)\n",
                "declare i1 @string.ne(ptr,ptr)\n",
                "declare i1 @string.lt(ptr,ptr)\n",
                "declare i1 @string.le(ptr,ptr)\n",
                "declare i1 @string.gt(ptr,ptr)\n",
                "declare i1 @string.ge(ptr,ptr)\n",
                "declare i32 @array.size(ptr)\n",
                "declare ptr @.malloc(i32)\n\n");
        irProgram.print();
    }

    public void printOut(String... strings) {
        for (String string : strings) {
            System.out.print(string);
        }
    }

}
