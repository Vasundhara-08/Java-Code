package Hashing.HashSet;
import java.util.HashSet;

public class Ques1_union_intersection {
    // union function
    public static int union(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);   // 3,4,5
        }
        for (int j = 0; j < arr2.length; j++) {
            set.add(arr2[j]);    // 6,7,8,3,4
        }
        return set.size();      // after removing duplicates we have 3,4,5,6,7,8
    }

    // intersection function
    public static int intersection(int[] arr1, int[] arr2) {
        HashSet<Integer> set2 = new HashSet<>();
        int count = 0;

        for (int i = 0; i < arr1.length; i++) {
            set2.add(arr1[i]);   //3,4,5
        }
        for (int j = 0; j < arr2.length; j++) {
            if (set2.contains(arr2[j])) {     // 6,7,8,3-repeated,4-repeated,5
                count++;                     // 3++,4++
                set2.remove(arr2[j]);        // now remove other elements from set2 that does not match
            }
        }
        return count;   //2
    }


    public static void main(String[] args) {
        int arr1[] = {3, 4, 5};
        int arr2[] = {6, 7, 8, 3, 4};
        System.out.println("Size of Union of Two array is :- ");
        System.out.println(union(arr1, arr2));

        System.out.println("Size of Intersection of two array is :- ");
        System.out.println(intersection(arr1, arr2));
    }
}
