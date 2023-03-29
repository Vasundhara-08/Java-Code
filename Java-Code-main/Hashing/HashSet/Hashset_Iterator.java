package Hashing.HashSet;
import java.util.HashSet;
import java.util.Iterator;
public class Hashset_Iterator {
    public static void main(String[] args) {
    HashSet <Integer> set1 = new HashSet<>();
    set1.add(40);
    set1.add(70);
    set1.add(90);
    set1.add(30);
    set1.add(40);

        System.out.println(set1);

        // to iterate the above elements in java we use iterator
        // set1 include method iterator that tells how to traverse set and the values of set1 are
        // returned by type Iterator that is stored in variable 'it'  . it has two functions next(),hasNext()

        // for eg :- it.next() -- 40, it.next() -- 70 and so on and hasNext() returns
        //          true or false depending on weather set1 contain further value or not

        Iterator it = set1.iterator();

        // we will run until the end of the elements in the set
        while(it.hasNext())
        {
            // for iterating over next element we used next()
            System.out.println(it.next());
//            System.out.println(it.hasNext() + " , ");
        }
    }
}
