# Day 3 - First Java Program

### Structure of a Java program

- Every Java program must have a class definition.
- The name of the class must match the name of the file.
- The class that has the file name must be a public class to access it across files.
- The class definition must have a main method.
- The main method is the entry point of the program.
- It is public to execute it from anywhere.
- It is static to execute it without creating an object of the class.
- void is the return type of the method. It does not return anything.
- String[] args is the parameter passed to the main method. It is the command line arguments passed to the program.
- `javac <filename>.java` to compile the java file.
- `java <filename>` to run the java program.
<!-- add a new line -->

### Point to know
- You can also change the path to the bytecode file using the `-d` flag.
- `javac -d <path> <filename>.java` to compile the java file and store it in the path specified.