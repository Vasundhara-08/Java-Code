package CWH_64_100_Oops_part2;

import java.util.Scanner;

public class CWH_79_Errors {
    public static void main(String[] args) {
        //  logic errors do not cause the program to crash or produce error messages. Instead, they
        //  cause the program to behave in unintended ways,leading to incorrect program behavior or results.

        //1. DEMO : LOGICAl ERRORS
        // Write a program to print all prime numbers between 1 to 10

        System.out.println(2);
        for(int i =0 ; i<5;i++)
        {
            System.out.println(2*i+1);
            // this will thrwo an error as 9 cannot be a prime number which is a logical error
        }

        //2. DEMO : COMPILE TIME  ERROR
        //Compile-Time Errors:
        //occur during the compilation phase of the Java program. are detected by the Java compiler .
        // Examples include syntax errors, missing semicolons, undefined variables or methods and more.

        // int a =0 // error : no semicolon
        // b = 90 ; // error : b is not declared

        //3. DEMO : RUNTIME ERROR (exceptions)
        //  occur while the program is executing.caused by a variety of factors, such as invalid input data,
        //  attempting to access an array element beyond its bounds, dividing by zero, and attempting to call
        //  a method on a null object reference.

        /* Common types of runtime exceptions include:

        NullPointerException: Occurs when trying to access a member (method or field) of a null object.
        ArrayIndexOutOfBoundsException: Occurs when trying to access an array element with an invalid index.
        ArithmeticException: Occurs when performing arithmetic operations like division by zero.
        ClassCastException: Occurs when attempting to cast an object to a type that it is not compatible with.*/

        // ---- if you put input as 0 then it cause arithmetic error---
        int k ;
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        System.out.println("Enter the number to be divide :- " + 1000/k);

        // Runtime Error (NullPointerException):
        String text = null;
        System.out.println(text.length());

        // Runtime Error (ArrayIndexOutOfBoundsException):
        int[] numbers = {1, 2, 3};
        System.out.println(numbers[5]);


    }
}
