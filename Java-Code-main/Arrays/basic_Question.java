package Arrays;
import java.util.Scanner;

// remove even integer in an array
public class basic_Question {
    public static int[] even(int[] box) {   // func with name even created
        Scanner sc = new Scanner(System.in);
        int n = box.length;           // eg :- length of array given is 6
        int new_evenvalue = 0;
        for (int i = 0; i < n; i++)          // it wil run upto 5th index
        {
            if (box[i] % 2 != 0) {
                new_evenvalue++;
            }
        }

        int[] final_result = new int[new_evenvalue];// created a new array in which index is the no. of new even values
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (box[i] % 2 != 0) {
                final_result[index] = box[i];
                index++;
            }
        }

        return final_result;

    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 7, 8, 9};
        even(arr);
        int[] final_result = even(arr);
        even(final_result);
    }
}
