
find src -name '*.java' | xargs javac -d bin -cp /home/limike/Git/antlr-4.13.2-complete.jar

/home/limike/Git/compiler-2024/src/testcases/codegen/scripts/test_llvm_ir.bash 'java -cp /home/limike/Git/antlr-4.13.2-complete.jar:bin src.Main -emit-llvm' /home/limike/Git/compiler-2024/src/testcases/codegen/constarray/ca1.mx /home/limike/Git/compiler-2024/src/builtin/builtin.ll

/home/limike/Git/compiler-2024/src/testcases/codegen/scripts/test_llvm_ir_all.bash 'java -cp /home/limike/Git/antlr-4.13.2-complete.jar:bin src.Main -emit-llvm' /home/limike/Git/compiler-2024/src/testcases/codegen/ /home/limike/Git/compiler-2024/src/builtin/builtin.ll
