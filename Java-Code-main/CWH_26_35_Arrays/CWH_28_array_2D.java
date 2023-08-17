package CWH_26_35_Arrays;               // 2 D ARRAY  //

import java.util.Scanner;
public class CWH_28_array_2D
{
    public static void main(String[] args) {

// TYPE 1
// PRINTING 2D ARRAY ELEMENTS

        final int[][] matrix = {
                {2, 3, 4, 6},
                {4, 5, 6, 7},
                {7, 8, 2, 4}
        };
        System.out.println("Type 1 : - Printing by direct Arrays ");
        for (int i = 0; i < matrix.length; i++) //this equals to the row in our matrix.
        {
            for (int j = 0; j < matrix[i].length; j++) //this equals to the column in each row.
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(""); //change line on console as row comes to end in the matrix.
        }

 // TYPE 2
 // INPUTTING 2D ARRAYS
        System.out.println("\nType 2 : - Printing by giving inpus to Array ");
        Scanner sc = new Scanner(System.in);
        int value[][] = new int[3][3];
        System.out.println("Enter values in array of 3 *3 :-");
        for(int k=0;k<value.length;k++) {
            for (int j = 0; j < value[k].length; j++)
            {
                value[k][j] = sc.nextInt();
                System.out.print(value[k][j] + " ");
            }

            System.out.println("");
        }
    }
}

