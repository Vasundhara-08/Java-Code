package CWH_64_100_Oops_part2;

import java.util.Scanner;

// Exception class has following important methods
// 1. String toString() :- executed when sout(e) runs
// 2. void printStackTrace() :- print stack trace
// 3. String get Message() :- prints the exception message

class myException extends Exception{
    public String toString()
    {
        return  "I am toString  -- using tostring";
    }

   public String getMessage()
   {
       return  "I am giving a Message  -- using getmessage";
   }
}
public class CWH_83_Exception_Class {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :- ");
        int p = sc.nextInt();
        if(p<90)
        try
        {

            // throw keyword is used to throw an exception expicitly by the programmer
            throw new myException();
            // here we can also write any other exception
//            throw new ArithmeticException("Exception occured -- using throw keyword");
        }
        catch(Exception e){
            // these all act as a custom exceptions that u create your own
            System.out.println(e.getMessage());
            System.out.println(e); // here to string will run when u simply print e only
            System.out.println(e.toString());

            // this doesn't throw an error it tell at which line error is , and which function was run
            e.printStackTrace();
        }
        System.out.println("Finished");
    }
}
