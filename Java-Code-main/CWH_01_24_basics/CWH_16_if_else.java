package CWH_01_24_basics;

import java.util.Scanner;

public class CWH_16_if_else {
    public static void main(String[] args) {

        // 1. if else
        int salary = 78900;
        if (salary > 2000) {
            salary += 4000;  // salary = salary + 4000
        } else if (salary >= 20000) {    // second is also true, but it goes if 1st condition becomes false
            salary += 8000;  // salary = salary + 8000
        } else {
            salary += 23000;  // salary = salary + 23000
        }
        System.out.println(salary);

        // 2. if-else practise question

//        Scanner mks = new Scanner(System.in);
//        int marks1, marks2, marks3;
//
//        System.out.println("Enter marks of 1st subject :- ");
//        marks1 = mks.nextInt();
//        System.out.println("Enter marks of 2nd subject :- ");
//        marks2 = mks.nextInt();
//        System.out.println("Enter marks of 3rd subject :- ");
//        marks3 = mks.nextInt();
//
//        int sum = marks1 + marks2 + marks3;
//        int percentage = sum *100 /300;
//
//        if (percentage > 40 && marks1 > 33 && marks2 > 33 && marks3 > 33)
//            System.out.println("Pass");
//        else
//            System.out.println("Fail");

        // 3. The Java program to determine whether a given year is a leap year or not
        // Hint :- A leap year is a year that is divisible by 4 but not divisible by 100,
        // except for years that are divisible by 400.

        System.out.println("Enter the year to be checked");
        Scanner s=new Scanner(System.in);
        int yr= s.nextInt();

        if((yr%4==0 && yr%100!=0)|| yr%400==0)
            System.out.println("Leap year");
        else
            System.out.println("Not a leap year");
    }
}




