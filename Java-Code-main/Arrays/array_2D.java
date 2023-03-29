package Arrays;// 2 D ARRAY  //

import java.util.Scanner;
public class array_2D
{
    public static void main(String[] args) {

// TYPE 1
// PRINTING 2D ARRAY ELEMENTS

        final int[][] matrix = {
                {2, 3, 4, 6},
                {4, 5, 6, 7},
                {7, 8, 2, 4}
        };
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

        Scanner sc = new Scanner(System.in);
        int value[][] = new int[3][3];
        for(int k=0;k<value.length;k++) {
            value[3][3] = sc.nextInt();
            for (int j = 0; j < value[k].length; j++)
            {
                System.out.println(value[k][j] + " ");
            }
            System.out.println("");
        }
    }
}

