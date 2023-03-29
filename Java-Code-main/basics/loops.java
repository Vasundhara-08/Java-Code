package basics;

import java.util.Scanner;

public class loops {
    public static void main(String[] args) {


        // 1. if else loop
        int salary =78900;
        if (salary >2000){
            salary +=4000;  // salary = salary + 4000
        }
        else if (salary >=20000){
            salary +=8000;  // salary = salary + 8000
        }
        else {
            salary +=23000;  // salary = salary + 23000
        }
        System.out.println(salary);

        // 2. For loop
        /* format :-
            for(initialization;condition;increment/decrement)
            {
            body
            }
         */
        Scanner input = new Scanner(System.in);
        float variable = input.nextFloat();

        for( float i = 6.7f ; i <= variable;i++)
        {
            System.out.println(i + " increased by 1");
        }

        // 3. while loop
        int num = 7;         //initialization
        while (num != 13)    //condition
        {
            System.out.println("this is a while loop " + num);
            num++;         //iteration
        }


        // 4. Do while Loop
        int v =10 ;           //initialization
        do{
            System.out.println("this is do while loop " + v );
            v++;            //iteration
        }
        while (v <=11);


    }
}


/*Some important points

 * for loop is used when number of iterations are fixed and known eg :- print 1 to n
 * while loop is used when we do not how many times loop will move, it depends on user or boolean expression
 * do while loop executes a part of the programs at least once,and further it depend on user or boolean expression

 */
