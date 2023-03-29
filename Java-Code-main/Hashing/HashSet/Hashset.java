package Hashing.HashSet;
import java.util.HashSet;

public class Hashset {
    public static void main(String[] args) {
        // creating hashset
        // H and S of HashSet must be greater
        // set does not have any index
        HashSet<Integer> set = new HashSet<>();

        // insertion of elements in hashset
        set.add(1);
        set.add(4);
        set.add(1);  // duplicates will automatically be removed
        set.add(5);  // bcz hashset does not contain duplicates
        System.out.println(set);

        // to print size of set
        System.out.println("size of set is " + set.size());

        // Searching of elements we use contains
        if(set.contains(5))
        {
            System.out.println("set contains element 5");
        }
        if(!set.contains(9))
        {
            System.out.println("does not contains 9");
        }

        // deletion of elements in hashset we use remove
        set.remove(1);
        if(!set.contains(1))
        {
            System.out.println("does not contain 1 ---> as we deleted 1");
        }


    }


}
