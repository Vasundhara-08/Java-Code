package All_Questions;        /* Question 6 :- in a cyclic distance find the shortest distance */

//    OUTPUT :- SUCH THAT FIRST IS THE START POINT AND SECOND IS THE END POINT AND LAST ONE THE TOTAL CyCLIC UNITS
//              AND WE HAVE TO FIND THE SHORTEST DISTANCE EITHER MOVING FORWARD OR BACKWARD
//       6
//        1 3 100
//        2
//        1 98 100
//        3
//        40 30 50
//        10
//        2 1 2
//        1
//        3 1 3
//        1
//        4 1 5
//        2

import java.util.*;
import java.lang.*;

public class importantQuestions2 {
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        for (int i = 0; i < a; i++)
        {
            int start = in.nextInt(); //4
            int end = in.nextInt();//1
            int distance = in.nextInt();//5

            if (start < end)
            {
                int d1 = end - start;
                int d2 = (distance + start) - end;
                if (d1 < d2) {
                    System.out.println(d1);
                } else {
                    System.out.println(d2);
                }
            }
            else
            {
                int d1 = start - end;
                int d2 = (distance - start) + end;
                if (d1 < d2) {
                    System.out.println(d1);
                } else {
                    System.out.println(d2);
                }
            }
        }
        in.close();
    }
}

