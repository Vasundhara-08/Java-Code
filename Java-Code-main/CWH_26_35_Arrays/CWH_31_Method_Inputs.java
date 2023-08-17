package CWH_26_35_Arrays;

import java.util.Scanner;

public class CWH_31_Method_Inputs {
    public static void main(String[] args)
    {
        // direct printing value of sum without assigning to other variable
        sum();

        // return value of answer
        int answer = sum2();              // assign var
        System.out.println("answer = " + answer);    // print var

        // return value of string
        String note = message();
        System.out.println(note);

    }

    static void sum() {                   // using void no need to return
        Scanner sc = new Scanner(System.in);
        System.out.print("1st number = ");
        int num1 = sc.nextInt();
        System.out.print("2nd number = ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum of both number is : " + sum);
    }

    // Functions with the help of return and reference variable'

    static int sum2() {                       // here we use return
        Scanner sc = new Scanner(System.in);
        System.out.print("1st number = ");
        int num1 = sc.nextInt();
        System.out.print("2nd number = ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        return sum;

    }

    // return string with the help of function

    static String message(){
        String msg = "*** Code Executed ***";
        return msg;
    }
}
