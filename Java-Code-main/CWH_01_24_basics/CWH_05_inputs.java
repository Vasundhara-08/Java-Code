package CWH_01_24_basics;

import java.util.Scanner;

public class CWH_05_inputs {
    public static void main(String[] args) {
        // Scanner is a class which is used to get user input
        // at the same time constructor of class is created with parameter system.in
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your roll_no here -");
        int roll_no = input.nextInt();
        System.out.println("your roll no. is = " + roll_no);

        // give the input in form of string
        //there are various input types for example input.next or next line

        String name = input.next();   // My Name
        String FullName = input.nextLine();
        System.out.println(name);
        System.out.println(FullName);

        // input in the form of boolean to check weather number u entered is int or not
        Boolean b1 = input.hasNext();    // 56
        System.out.println(b1);          // it return true
    }
}
