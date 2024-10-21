# Mx* Compiler

## Tasks

- [x] AST build 2024.08.09
- [x] semantic check 2024.08.13
- [x] LLVM IR generation 2024.08.22
- [x] code generation 2024.08.27
- [x] 08.29-09.07 a short vacation (?)
- [x] Mem2Reg 2024.09.10
- [x] RegAlloc 2024.10.11
- [ ] inline, SCCP, ADCE, MCE ...

## Usage

```bash
find src -name '*.java' | xargs javac -d bin -cp /usr/local/bin/antlr-4.13.2-complete.jar
# for single test
${YOUR_PRIJECT_DIR}/test_asm_reimu.bash 'java -cp ${ANTLR_DIR}:bin src.Main -S' ${TESTCASE} ${BUILTIN}
# for efficient test
${YOUR_PROJECT_DIR}/test_asm_all_reimu.bash 'java -cp ${ANTLR_DIR}:bin src.Main -S' ${TESTCASE_DIR} ${BUILTIN}
```

```bash
~/Git/compiler-2024/test_asm_reimu.bash 'java -cp /usr/local/bin/antlr-4.13.2-complete.jar:bin src.Main -S' testcases/codegen/optim/efficiency.mx src/builtin/builtin.s
```

```bash
~/Git/compiler-2024/test_asm_all_reimu.bash 'java -cp /usr/local/bin/antlr-4.13.2-complete.jar:bin src.Main -S' testcases/codegen src/builtin/builtin.s
```

```bash
~/Git/compiler-2024/testcases/codegen/scripts/test_llvm_ir.bash 'java -cp /usr/local/bin/antlr-4.13.2-complete.jar:bin src.Main -S' testcases/codegen/optim/efficiency.mx src/builtin/builtin.ll

~/Git/compiler-2024/testcases/codegen/scripts/test_llvm_ir_all.bash 'java -cp /usr/local/bin/antlr-4.13.2-complete.jar:bin src.Main -S' testcases/codegen src/builtin/builtin.ll
```