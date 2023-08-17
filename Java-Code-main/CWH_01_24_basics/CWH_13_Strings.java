package CWH_01_24_basics;

import java.util.Scanner;

public class CWH_13_Strings {

    public static void main(String[] args) {

        // to find length of the string
        Scanner str = new Scanner(System.in);
        System.out.println("Enter two Strings :- ");
        String A = str.next();               // hello
        String B = str.next();               // java
        System.out.print("Combined length of strings that you entered is :- ");
        System.out.println((A + B).length());  // 9

        // you can also use one more method of printing
        // %d for int , %f for float ,%c for char
        float num = 8.90f;
        System.out.printf("\nThe num number is being entered here %8.2f\n" , num); // 8 means 8 spaces and 2 means after decimal space
        System.out.printf("The alphabet %s and %s both are combined\n", A, B);
        System.out.format("The alphabet %s and %s both are combined\n", A, B);


        // lexicographically means for example if A is ravi and B is apreddy then the
        // difference between 'r' of ravi and 'a'of apreddy is 18-1=17 it means positive
        // value.so here it is positive result. hence B i.e,apreddy is lexicographically first.
        ///** this example contain length of str ,lexicographically first letter, and first letter uppercase **///

        System.out.println("\nString Methods");
        String name = new String("Vasundhara");
        String name2 = new String("     Spaces Removed      ");

        // 1. String is immutable means any method applied on string it does not change the original string
        System.out.println("Length of String :- " + name.length());
        System.out.println("String converted to uppercase :-" + name.toUpperCase() +"\n");

        // 2. String whitespaces can also be trimmed + substrings
        System.out.println("With Spaces :-" + name2);
        System.out.println("Without Spaces :- " + name2.trim());
        System.out.println("Substring :- " + name.substring(4));
        System.out.println("Substring start(included) and end(excluded) :- " + name.substring(3,5));
        System.out.println("If you want to replace the name :- " + name.replace('s','p'));
        System.out.println("If you want to replace the name with all char's shown :- " + name.replace("a","ppr"));

        // 3. Checks for given condition and replies in term of boolean
        System.out.println("\nDo your letter starts with Vas :- " + name.startsWith("Vas"));
        System.out.println("Do your letter ends with Vas :- " + name.endsWith("Vas"));
        System.out.println("At index value of 7 which char is present :- " + name.charAt(7));

        // 4. Indexing the substring
        System.out.println("\nIndex of particular char eg (a) is :- " + name.indexOf('a'));
        System.out.println("Index of ar and search should start after specified index :- " + name.indexOf("ar",5) );
        System.out.println("If no match found of any substring :- " + name.indexOf("e"));
        // Last index search from the last index
        System.out.println("To find Last index :- " + name.lastIndexOf('a'));
        System.out.println("To find index from right but searching after specific index :- " + name.lastIndexOf('a',5));

        // 5. equals method
        System.out.println("\nIs the given string equals to present string :- " + name.equals("Vasundhara"));
        System.out.println("Is the given string equals to present string ignoring upper lower case :- " + name.equalsIgnoreCase("VaSuNdhAra"));
    }

}
