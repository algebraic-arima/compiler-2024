find src -name '*.java' | xargs javac -d bin -cp /home/limike/Git/antlr-4.13.2-complete.jar

/home/limike/Git/compiler-2024/src/testcases/codegen/scripts/test_asm.bash 'java -cp /home/limike/Git/antlr-4.13.2-complete.jar:bin src.Main -S' /home/limike/Git/compiler-2024/src/testcases/codegen/test/t29.mx /home/limike/Git/compiler-2024/src/builtin/builtin.s

/home/limike/Git/compiler-2024/src/testcases/codegen/scripts/test_asm_all.bash 'java -cp /home/limike/Git/antlr-4.13.2-complete.jar:bin src.Main -S' /home/limike/Git/compiler-2024/src/testcases/codegen/ /home/limike/Git/compiler-2024/src/builtin/builtin.s
