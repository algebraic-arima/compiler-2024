JAVA_SRC = $(shell find src -name '*.java')

ANTLR_JAR = /ulib/antlr-4.13.1-complete.jar

MAIN_CLASS = src.Main

.PHONY: build
build:
	javac -d bin $(JAVA_SRC) -cp $(ANTLR_JAR)

.PHONY: run
run:
	java -cp $(ANTLR_JAR):bin $(MAIN_CLASS)

.PHONY: clean
clean:
	find bin -name '*.class' -or -name '*.jar' | xargs rm -f
