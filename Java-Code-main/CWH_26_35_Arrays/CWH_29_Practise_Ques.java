package CWH_26_35_Arrays;

import java.util.Scanner;

public class CWH_29_Practise_Ques {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        {
            // Ques 1 -----
            System.out.println("Ques 1:- Find Sum of all floating integers in an array :- ");
            float[] nums = {23.4f, 45.6f, 56.5f, 43.5f, 45.6f};
            float sum = 0;
            // by using for each loop instead of for loop
            for (float store : nums) {
                sum = sum + store;
            }
            System.out.println("Sum is :- " + sum);


            // Ques 2-----
            System.out.println("\nQues 2:- To check weather the value given is present in array or not :- ");
            float search = 45.6f;
            boolean isinarray = false;
            for (float element : nums) {
                if (search == element) {
                    isinarray = true;
                    break;
                }
            }
            if (isinarray) {
                System.out.println("Present");
            } else {
                System.out.println("Not Present");
            }

            // Ques 3 -----
            System.out.println("\nQues 3:- Addition of Two matrices 2*3 :- ");
            int mat1[][] = {{1, 2, 3}, {4, 5, 6}};
            int mat2[][] = {{1, 2, 3}, {4, 5, 6}};
            int result[][] = {{0, 0, 0}, {0, 0, 0}};

            for (int i = 0; i < mat1.length; i++)   // row k lie 2 bar chlega
            {
                for (int j = 0; j < mat1[i].length; j++)  // har row ki length k lie 3 bar chlega as a column iterator
                {
                    result[i][j] = mat1[i][j] + mat2[i][j]; // result 0,0
                }
            }
            for (int i = 0; i < mat1.length; i++) {
                for (int j = 0; j < mat1[i].length; j++) {
                    System.out.print(result[i][j] + " ");
                }
                System.out.println(" ");
            }

            // Ques 4 -----
            System.out.println("\nQues 4 :- To find maximum element in an array :- ");
            int[] maxx = {3,4,5,6,7,23,9,0};
            int number =0 ;
            for(int ele:maxx)
            {
                if(ele>number) // 3>0
                {
                  number = ele;
                }
            }
            System.out.println("Max element is :- " + number);

            // Ques 5 -----
            System.out.println("\nQues 5 :- Reversing of an array :- ");
            Scanner p = new Scanner(System.in);
            System.out.println("Enter the size of array:-");
            int lngth = p.nextInt();

            int[] x = new int[lngth];
            System.out.println("Enter all the digits that are to be printed:-");
            for(int i=0;i<x.length;i++)
            {
                 x[i] = p.nextInt();
            }

            int half = lngth/2;     //  instead of this you can write Math.floorDiv(l,2)
            int temp;
//            System.out.println(half);
            for(int i=0;i<half;i++)
            {
                temp = x[i];
                x[i] = x[lngth - i-1];  // x[0] <= x[6-0-1] , 0 <= 5 replace them
                x[lngth - i-1] = temp;
            }
            System.out.println("Reverse of the above given arrays are :-");
            for(int i=0;i<x.length;i++)
            {
                System.out.print(x[i]+ " ");
            }

        }
    }
}
