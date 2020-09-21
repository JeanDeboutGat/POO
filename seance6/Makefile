CC = javac
EXE = java
CLASSES = classes

.PHONY: all docs tests jar clean

all: classes docs tests jar 

classes:
	cd src && $(CC) -d ../classes pfc/*.java
	cd src && $(CC) -d ../classes pfc/strategy/*.java

docs:
	 cd src && javadoc -d ../docs *

tests:
	$(CC) -cp test-1.7.jar test/pfc/MainPFCTest.java ;
	$(EXE) -jar test-1.7.jar pfc.MainPFCTest &

jar:
	cd $(CLASSES) && jar -cvfm ../pfc.jar ../manifest pfc;

clean:
	rm -rf classes && rm -rf docs && rm -rf test/*.class && rm -rf */*.class

