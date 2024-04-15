package CWH_64_100_Oops_part2;

import java.util.Scanner;

// exception are of two types

// 1. Checked exceptions :- are exceptions that are checked at compile time by the Java compiler.
//                          Checked exceptions are exceptions that are checked at compile time by the Java compiler.
//                          caught using a try-catch block or declared to be thrown using the throws clause

// 2. Unchecked Exceptions :- also known as runtime exceptions, are exceptions that occur at runtime and are not checked by the compiler.
//                            They are subclasses of java.lang.RuntimeException.
//                            Examples include NullPointerException, ArrayIndexOutOfBoundsException, ArithmeticException, etc.

public class CWH_80_Exception_Handling {
    public static void main(String[] args) {
        int a = 90;
        int b = 0;

        try {
            // try :- Code that might throw checked exceptions
            int divide = a / b;
            System.out.println(divide);
        }

        // exception is an object can be named with e,v,me etc. similar to func arguments
        catch (ArithmeticException e) {
            // Handle or log the exception
            System.out.println("Invalid input value . so we failed to divide ");
            System.out.println(e);
        }


        // pratise question

        int[] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array index");
        int ind = sc.nextInt();

        System.out.println("Enter the number you want to divide the value with");
        int number = sc.nextInt();
        try {
            System.out.println("The value at array index entered is: " + marks[ind]);
            System.out.println("The value of array-value/number is: " + marks[ind] / number);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException occured!");
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occured!");
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("Some other exception occured!");
            System.out.println(e);
        }
    }
}

