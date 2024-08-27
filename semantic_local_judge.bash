find src -name '*.java' | xargs javac -d bin -cp /home/limike/Git/antlr-4.13.2-complete.jar

src/testcases/sema/scripts/test.bash 'java -cp /home/limike/Git/antlr-4.13.2-complete.jar:bin src.Main -fsyntax-only' src/testcases/sema/basic-package/basic-59.mx

src/testcases/sema/scripts/test_all.bash 'java -cp /home/limike/Git/antlr-4.13.2-complete.jar:bin src.Main -fsyntax-only' src/testcases/sema/ > sem.txt