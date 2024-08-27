# Mx* Compiler

## Tasks

- [x] AST build 2024.08.09
- [x] semantic check 2024.08.13
- [x] LLVM IR generation 2024.08.22
- [x] code generation 2024.08.27
- [ ] optim

## Usage

```bash
find src -name '*.java' | xargs javac -d bin -cp /home/limike/Git/antlr-4.13.2-complete.jar
# for single test
${YOUR_PRIJECT_DIR}/test_asm_reimu.bash 'java -cp ${ANTLR_DIR}:bin src.Main -S' ${TESTCASE} ${BUILTIN}
# for efficient test
${YOUR_PROJECT_DIR}/test_asm_all_reimu.bash 'java -cp ${ANTLR_DIR}:bin src.Main -S' ${TESTCASE_DIR} ${BUILTIN}
```