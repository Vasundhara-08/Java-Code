package Hashing.HasMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap_Iterator {
    public static void main(String[] args) {

        int arr[] = {5,8,9};

       // type 1 ---- iterator method (basic for loop)
        System.out.println("1. Iterating using simple for loop");
        for(int i=0;i<3;i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();


        // type 2 ---- iterator method
        // this shows that arr is a collection containing various elements
        // so one by one value will be stored in val variable
        System.out.println("2. Iterating by making collection and key elements in val");
        for(int val : arr)
        {
            System.out.print(val + " ");
        }
        System.out.println();


        // type 3 ---- iterator using hashmap
        System.out.println("3. Iterating using entry set");
        HashMap <Integer,String> obj =new HashMap<>();
        obj.put( 9,"aa");
        obj.put( 10,"ab");
        obj.put( 90,"bb");
        obj.put( 0,"cc");

        // in last ex- we had => for(int val : arr)
        // obj.entryset means we made set of all the entries
        for(Map.Entry<Integer,String> e : obj.entrySet() )
        {
            System.out.print(e.getKey() + " ");
            System.out.println(e.getValue());
        }


        // type 4 ---- second method of iterator using key values
        System.out.println("4. iterating using keyset");
        Set<Integer> keys = obj.keySet();
        for(Integer key : keys)
        {
            System.out.println(key + " " + obj.get(key));
        }

    }
}
