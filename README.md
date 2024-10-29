# A Fake Mx* Compiler

*Make it till you fake it.*

<font size=2>\* One Sunday afternoon, it dawns on me that I have faked through the project until I complete it.</font>


## Tasks

- [x] AST build 2024.08.09
- [x] semantic check 2024.08.13
- [x] LLVM IR generation 2024.08.22
- [x] code generation 2024.08.27
- [x] 08.29-09.07 a short vacation (?)
- [x] Mem2Reg 2024.09.10
- [x] RegAlloc 2024.10.11
- [x] inline
- [x] DCE
- [x] SCCP
- [x] Tail Call
- [x] Global variable localization
- [ ] CSE
- [ ] Loop Invariant

[//]: # (## Scores)

[//]: # ()
[//]: # (- Mem2Reg+RegAlloc ~58pts)

[//]: # (- Inline ~62pts)

[//]: # (- Dead Code Elimination ~63pts)

[//]: # (- SCCP ~64pts)

[//]: # (- Tail Calling ~70pts)

[//]: # (- Global2Local ~76pts)

[//]: # (- Down Code Elimination ~81pts &#40;including mul->sll in getelementptr&#41;)

## Usage

Place `utils.bash` under the same directory before running the bash.

```bash
find src -name '*.java' | xargs javac -d bin -cp /usr/local/bin/antlr-4.13.2-complete.jar
# for single test
${YOUR_PRIJECT_DIR}/test_asm_reimu.bash 'java -cp ${ANTLR_DIR}:bin src.Main -S' ${TESTCASE} ${BUILTIN}
# for efficient test
${YOUR_PROJECT_DIR}/test_asm_all_reimu.bash 'java -cp ${ANTLR_DIR}:bin src.Main -S' ${TESTCASE_DIR} ${BUILTIN}
```

Example
```bash
~/Git/compiler-2024/test_asm_reimu.bash 'java -cp /usr/local/bin/antlr-4.13.2-complete.jar:bin src.Main -S' testcases/codegen/optim/binary_tree.mx src/builtin/builtin.s
```

```bash
~/Git/compiler-2024/test_asm_all_reimu.bash 'java -cp /usr/local/bin/antlr-4.13.2-complete.jar:bin src.Main -S' testcases/codegen src/builtin/builtin.s
```

```bash
~/Git/compiler-2024/testcases/codegen/scripts/test_llvm_ir.bash 'java -cp /usr/local/bin/antlr-4.13.2-complete.jar:bin src.Main -S' testcases/codegen/optim/binary_tree.mx src/builtin/builtin.ll
```

```bash
~/Git/compiler-2024/testcases/codegen/scripts/test_llvm_ir_all.bash 'java -cp /usr/local/bin/antlr-4.13.2-complete.jar:bin src.Main -S' testcases/codegen src/builtin/builtin.ll
```


[//]: # (## References)

[//]: # ()
[//]: # ([DragonBook]&#40;https://suif.stanford.edu/dragonbook/&#41;)

[//]: # ()
[//]: # ([TigerBook]&#40;https://www.cambridge.org/core/books/modern-compiler-implementation-in-c/0F85704413FC010C1D1C691C4D2A0865/listing&#41;)

[//]: # ()
[//]: # ([]&#40;&#41;)
