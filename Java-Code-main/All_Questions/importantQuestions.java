package All_Questions;                   /*  Question 1 ----> find second largest of the three given numbers */


import java.util.*;
import java.lang.*;


class importantQuestions {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        for(int i=0;i<x;i++)
        {
            int y =sc.nextInt();
            int z =sc.nextInt();
            int w =sc.nextInt();

            if(y>z && y<w || y<z && y>w)               // 120 11 400    // 11 13 10
                System.out.println(y);
            else if (y>z && w<z || y<z && w>z )        // 10213 312 10   // 10 34 456
                System.out.println(z);
            else if (w<y && w>z || w>y && w<z )         //  1100 3 10      // 30 110 89
                System.out.println(w);

        }
        sc.close();


        /*  Question 2 ----> Stop processing input after reading in the number 4242 */


//        while(true)
//        {
//            int n = sc.nextInt();
//            if (n == 42) {
//                break;
//            } else {
//                System.out.println(n);
//            }
//        }


        /*  Question 3 ----> YES if the number of sunny >  rainy days. given 7 days with 0 = rainy and sunny = 1*/


//        int n = sc.nextInt();
//        for (int i = 0; i < n; i++)         //this will run the no.of time u enter the digit
//        {
//            int s_count = 0, r_count = 0;
//            for (int j = 0; j < 7; j++)     //this will print 7 digits in a single line
//            {
//                int a = sc.nextInt();
//                if (a == 1)
//                    s_count++;
//                else
//                    r_count++;
//            }
//            if (s_count > r_count)
//                System.out.println("YES");
//            else
//                System.out.println("NO");
//        }



                   /*  Question 4 ----> print number lies in range eg:-byte<short<int<long */


//        int a = sc.nextInt();
//
//        for (int i = 0; i < a; i++) {
//            try {
//                long b = sc.nextLong();
//                System.out.println(b + " can be fitted in:");
//                if (b >= -128 && b <= 127)
//                    System.out.println("*byte");
//                if (b >= -Math.pow(2, 15) && b <= Math.pow(2, 15) - 1)
//                    System.out.println("*short");
//                if (b >= -Math.pow(2, 31) && b <= Math.pow(2, 31) - 1)
//                    System.out.println("*int");
//                if (b >= -Math.pow(2, 63) && b <= Math.pow(2, 63) - 1)
//                    System.out.println("*long");
//            } catch (Exception e) {
//
//                System.out.println(sc.next() + "can't be fitted anywhere.");
//            }
//        }




                   /*  Question 5 ----> show these in sequence:-
                                        ([A-Z])(.+)    ----> valid
                                        [AZ[a-z](a-z)  ----> invalid
                                        batcatpat(nat  ----> invalid      */

        // https://www.hackerrank.com/challenges/pattern-syntax-checker/problem?isFullScreen=true



    }
}