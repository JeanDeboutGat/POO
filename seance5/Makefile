CC = javac
EXE = java
CLASSES = classes

.PHONY: all docs tests jar clean

all: classes docs tests jar 

classes:
	cd src && $(CC) -d ../classes battleship/*.java
	cd src && $(CC) -d ../classes battleship/util/*.java

docs:
	 cd src && javadoc -d ../docs *

tests:
	$(CC) -cp test-1.7.jar test/SeaTest.java ;
	$(EXE) -jar test-1.7.jar SeaTest &

jar:
	cd $(CLASSES) && jar -cvfm ../pfc.jar ../manifest battleship;

clean:
	rm -rf classes && rm -rf docs && rm -rf test/*.class && rm -rf */*.class

