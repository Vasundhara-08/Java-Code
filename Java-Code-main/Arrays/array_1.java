package Arrays;

import java.util.Scanner;

public class array_1 {
    public static void main(String[] args) {
        /* syntax */

        // TYPE 1 beginners method or step by step by giving index for each value

        int[] number = new int[5];
        number[0] = 37;
        number[1] = 48;
        number[2] = 50;
        number[3] = 67;
        number[4] = 80;
        System.out.println(number[4]);
        System.out.println(number.length);  //5
        System.out.println(number[number.length-1]); // value at index 4

        // TYPE 2  by direct approach
        // datatype[] variable_name = {enter the input}
        // dataType[] arrayname = new dataType[size] OR u can write it as dataType arrayname[] = new dataType[size]

        int[] number2 = {3, 4, 5, 6, 7};
        int numberss[] = {5,7,6,6,5,};
        System.out.println(number2[4]);
        System.out.println(numberss[2]);

        /* explanation */

        // 1.     int[] a;         // declaration of array ,a variable shows that the data type is getting defined in stack
        // this runs at a compiled time
        // 2.     a = new int[5];  //initialization of array , here the object is created in the heap memory
        // a here also known as reference variable
        // this runs at a run time(Dynamic memory allocation)

        /* TYPE 3 for basics.loops in array for inputting */
        Scanner sc = new Scanner(System.in);
        int[] n = new int[4];
        for (int i = 0; i < n.length; i++) {
            n[i] = sc.nextInt();    // inserting the values here
        }

        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + " "); // printed horizontally
        }


        // 1 D ARRAY with functions
        //        int[] nums = {4, 5, 7, 9};
//        System.out.println(Arrays.toString(nums));
//        change(nums);
//        System.out.println(Arrays.toString(nums));
//    }
//    public static void change(int[] val) {
//        val[0] = 99;}
    }
}