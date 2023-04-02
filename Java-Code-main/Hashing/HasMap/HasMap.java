package Hashing.HasMap;
import java.util.HashMap;
public class HasMap {
    public static void main(String[] args) {
        // declaration of Hashmap consist of Integer(key),String(value)
        HashMap <Integer,String> table = new HashMap<>();

        // inserting elements in map
        System.out.println("1. Insertion of eleements in HashMap");
        table.put(1,"Vasundhara");
        table.put(2,"Saksham");
        table.put(3,"Riya");
        table.put(4,"Jaidev");
        //duplicates are allowed but are not printed in table
        table.put(1,"Vasundhara");

        //two values cannot have same key value ,it will show error
        //table.put(1,Vasu);

        System.out.println(table);
        System.out.println();

                             //---  Searching operation  -----


        //1.  Fetch value with use of key
        //    this will chk the value is present or not in your table
        System.out.println( "2. Fetch value with use of key");
        System.out.println(table.get(0));
        System.out.println(table.get(4));
        System.out.println();


        //2. To verify only for the key value
        System.out.println("3. to verify weather the value is present in Hashset or not");
        if(table.containsKey(3))
        {
            System.out.println("The key is present in the table");
        }
        else
        {
            System.out.println("The key is not present in the table");
        }

        System.out.println();
        // removing an entry from hashmap using key bvalue
        System.out.println("4. To Remove entry  from Hashmap using key value");
        table.remove(1);
        System.out.println(table);


    }
}
