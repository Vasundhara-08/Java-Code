package CWH_01_24_basics;

public class CWH_24_Break_Continue {
    public static void main(String[] args) {

//        // 1. For loop using break

//        for (int i = 0; i <= 5; i++) {
//            System.out.println("Print the statement " + i);
//            if (i == 3) {
//                System.out.println("End the statement");
//                break;    // come out of the loop
//            }
//        }
//        System.out.println("\nWill definately print becz out of loop");


//        // 2. while loop as an alternative to for loop
//        int j = 0;
//        while (j < 4)
//        {
//            System.out.println(j);
//            System.out.println("While loop prints :- ");
//            if(j==3)
//            {
//                System.out.println("end it !!");
//                break;
//            }
//            j++;
//
//        }

        // 3. do while loop as an alternative to for loop

//        int k = 0;
//        do {
//            System.out.println(k);
//            System.out.println("While loop prints :- ");
//            if (k == 3) {
//                System.out.println("end it !!");
//                break;
//            }
//            k++;
//        }
//        while (k < 4);
//        {
//            System.out.println("loop ends here");
//
//        }

        // 4. for loop using continue

//        int n=0;
//        for(int i=0;i<5;i++)
//        {
//            if(i==3) {
//                System.out.println("we get index 3");
//                // we use continue so that loop for 3rd index stops here and next goes for 4th index
//                continue;
//            }
//            System.out.println(i);
//            System.out.println("use of continue" );
//        }

        // 5. do while loop where we used continue

        int m =1 ;
        do {
            m++;
            if (m == 3) {
                System.out.println("do while + continue");
                continue;
            }
            System.out.println(m);
            System.out.println("continueddddd");

        }
        while(m<6);
        {
            System.out.println("Loop ends here");
        }

    }
}

