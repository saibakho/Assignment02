all: *.java
	javac *.java
	java Main
	del *.class