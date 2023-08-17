package CWH_26_35_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CWH_26_array_1D {
    public static void main(String[] args) {
        /* syntax */

        // TYPE 1 beginners method or step by step by giving index for each value

        int[] number = new int[5]; // NUMBER -> reference , INT -> object
        number[0] = 37;    // retrieving of array elements
        number[1] = 48;
        number[2] = 50;
        number[3] = 67;
        number[4] = 80;
        System.out.println("Type 1 :-----");
        System.out.println("\nPrint number at index 4 :- " + number[4]);
        System.out.println("Length of type 1 [number] : -" + number.length);  //5
        System.out.println("Value at index 4 :-" + number[number.length-1]); // value at index 4

        // TYPE 2  by direct approach
        // datatype[] variable_name = {enter the input}
        // dataType[] arrayname = new dataType[size] OR u can write it as dataType arrayname[] = new dataType[size]

        int[] number2 = {3, 4, 5, 6, 7};
        int numberss[] = {5,7,6,6,5,};
        System.out.println("\nType 2 :-----");
        System.out.println("\nBy direct approach number present at index 4 :- " + number2[4]);
        System.out.println("By direct approach number present at index 2 :- " + numberss[2]);

        /* explanation */

        // 1.     int[] a;         // declaration of array ,a variable shows that the data type is getting defined in stack
        // this runs at a compiled time
        // 2.     a = new int[5];  //initialization of array , here the object is created in the heap memory
        // a here also known as reference variable
        // this runs at a run time(Dynamic memory allocation)

        /* TYPE 3 for basics.loops in array for inputting */
        System.out.println("\nType 3 :-----");
        Scanner sc = new Scanner(System.in);
        int[] n = new int[4];
        System.out.print("\nEnter the value of array [n] :- ");
        for (int i = 0; i < n.length; i++) {
            n[i] = sc.nextInt();    // inserting the values here
            System.out.println("Using for loop :- " + n[i]);
        }
        // 1 D ARRAY with functions
        System.out.println(Arrays.toString(n));


        /* TYPE 4 for each loop in java*/
        System.out.println("\nTYPE 4 :-----");
        int[] each = new int[4];
        System.out.print("\nEnter the value of array [each] :- ");
        for(int j =0;j<4;j++)
        {
          each[j]= sc.nextInt();
        }
        System.out.println("for each loop"); // is used for displaying the array
        for(int j  : each )
        {
            System.out.print(j + " ");
        }

    }
}