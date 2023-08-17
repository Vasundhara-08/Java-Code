// developed by james gosling
// java is compiled to > bytecode it is then > interpreted > to machine code
// (jdk - ((jre + compilers + debuggers)- (jvm + libraries)))

package CWH_01_24_basics;

public class CWH_01_hello_world {
    public static void main(String[] args) {
        System.out.println(123);
        System.out.println("Hello World");
    }
}

//1. public - access modifier allows to access class from anywhere
//2. class - grp of object,function and properties
//3.  hello world - name of class and file
//4.  public in second line allow program to access main func from anywhere
//5.  static :- It is a keyword which helps the main method to run without using objects.
//    "static" means the method belongs to the class rather than an instance of the class.
//6.  void :- It is a keyword used when we do not want to return anything from a method/function
//7.  main :- It is the name of method.
//8. String [] args :- It is a command line argument of string type array.
 //   Note :- string -predefined classs name ,args - variable name
//9. System:- It is a final class defined in java.lang package.
//10. out :- It is a variable of PrintStream type which is public and static member field of the System class.
//11. println :- It is a method of PrintStream class, It prints the arguments passed to it and adds a new line.
//    print can also be used here,but it prints only arguments passed to it. It does not add a new line


// note When you run a Java program, the JVM looks for the main method in the specified class and executes it.
// Without the static keyword, the JVM wouldn't be able to find the main method because it expects the method
// to be available at the class level, not at the instance level.

