package Hashing.HasMap;
import java.util.HashMap;
public class HasMap {
    public static void main(String[] args) {
        // declaration of Hashmap consist of Integer(key),String(value)
        HashMap <Integer,String> table = new HashMap<>();

        // inserting elements in map
        table.put(1,"Vasundhara");
        table.put(2,"Saksham");
        table.put(3,"Riya");
        table.put(4,"Jaidev");
        //duplicates are allowed but are not printed in table
        table.put(1,"Vasundhara");

        //two values cannot have same key value ,it will show error
        //table.put(1,Vasu);

        System.out.println(table);

                             //---  Searching operation  -----


        //1.  Fetch value with use of key
        //    this will chk the value is present or not in your table
        System.out.println(table.get(0));
        System.out.println(table.get(4));

        //2. To verify only for the key value
        if(table.containsKey(3))
        {
            System.out.println("The key is present in the table");
        }
        else
        {
            System.out.println("The key is not present in the table");
        }



    }
}
