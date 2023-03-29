package Hashing.HashSet;

import com.sun.deploy.net.MessageHeader;

import java.util.ArrayList;
import java.util.HashSet;

public class Hashset_collections {
    public static void main(String[] args) {
        HashSet<ArrayList> obj = new HashSet<>();

        // create arraylist list1
        ArrayList<Integer> list1 = new ArrayList<>();
        // create arraylist list2
        ArrayList<Integer> list2 = new ArrayList<>();

        // add elements in both the list

        list1.add(0);
        list1.add(6);
        list2.add(0);
        list2.add(6);

        // here if list 1 and list 2 have same elements and with same order then size will consider only 1
        // but if list 1 and list 2 have unique elements then it wil consider size as 2 (list1+list2)
        obj.add(list1);
        obj.add(list2);

        System.out.println(obj.size());
        System.out.println(list2);
        System.out.println(list1);

    }
}
