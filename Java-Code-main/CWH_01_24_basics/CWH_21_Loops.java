package CWH_01_24_basics;

import java.util.Scanner;

public class CWH_21_Loops {
    public static void main(String[] args) {


        // 1. For loop
        /* format :-
            for(initialization;condition;increment/decrement)
            {
            body
            }
         */
        System.out.println("Example of for loop :----");
        Scanner input = new Scanner(System.in);
        float variable = input.nextFloat();

        for (float i = 6.7f; i <= variable; i++) {
            System.out.println(i + " increased by 1");
        }

        // 2. while loop
        System.out.println("\nExample of while loop :----");
        int num = 7;         //initialization
        while (num != 13)    //condition
        {
            System.out.println("this is a while loop " + num);
            num++;         //iteration
        }


        // 3. Do while Loop
        System.out.println("\nExample of do-while loop :----");
        int v = 12;           //initialization
        do {
            System.out.println("this is do while loop " + v);
            v++;            //iteration
        }
        while (v <= 11);    // condition


    }
}

/*Some important points

 * for loop is used when number of iterations are fixed and known eg :- print 1 to n
 * while loop is used when we do not how many times loop will move, it depends on user or boolean expression
 * do while loop executes a part of the programs at least once,and further it depend on user or boolean expression

 */
