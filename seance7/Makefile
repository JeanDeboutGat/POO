CC = javac
EXE = java
CLASSES = classes

.PHONY: all docs tests jar clean

all: classes docs tests jar 

classes:
	cd src && $(CC) -d ../classes rental/*.java

docs:
	 cd src && javadoc -d ../docs *

tests:
	$(CC) -cp test-1.7.jar test/rental/RentalAgencyTest.java ;
	$(EXE) -jar test-1.7.jar rental.RentalAgencyTest &

jar:
	cd $(CLASSES) && jar -cvfm ../rental.jar ../manifest rental;

clean:
	rm -rf classes && rm -rf docs && rm -rf test/*.class && rm -rf */*.class

