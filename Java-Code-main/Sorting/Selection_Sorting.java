package Sorting;

public class Selection_Sorting {
    static void selection_sort(int arr[], int n) {
        for (int i = 0; i < n - 1; i++) {
            int minimum = i;   // 13 index 1
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minimum])   // is 46<13 , we consider 9 true
                {
                    minimum = j;    // index 5 of j given to minimum
                }
            }
                // swap
                int temp = arr[minimum];    // index 5 to temp now min empty , so on min we will put value of index 1
                arr[minimum] = arr[i];   // 13 put on empty array and arr[i] now empty
                arr[i] = temp;
            }


        // statement
        System.out.println("After selection sort :- ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public static void main(String args[]) {
        int arr[] = {13, 46, 24, 52, 20, 9};
        int n = arr.length;
        System.out.println("Before selection sort :- ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        selection_sort(arr, n);
    }
}
