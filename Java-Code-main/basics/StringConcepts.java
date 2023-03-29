package basics;

import java.util.Scanner;

public class StringConcepts {
    ///** this example contain length of str ,lexicographically first letter, and first letter uppercase **///
public static void main(String[] args ){
    Scanner str = new Scanner(System.in);
    String A = str.next();               // hello
    String B = str.next();               // java
    System.out.println((A+B).length());  // 9

    // lexicographically means for example if A is ravi and B is apreddy then the
    // difference between 'r' of ravi and 'a'of apreddy is 18-1=17 it means positive
    // value.so here it is positive result. hence B i.e,apreddy is lexicographically first.


    int y = A.compareTo(B);
    if( y>0)
        System.out.println("yes");
    else
        System.out.println("no");    // no bcz h-j is negative


    System.out.print(A.substring(0,1).toUpperCase() + A.substring(1) + " " + B.substring(0,1).toUpperCase() + B.substring(1));
                    // Hello Java

                   /*              next conecpt            */


    String input = str.next();         //Vasundhara
    int start = str.nextInt();         // 3 (index)
    int end = str.nextInt();           // 7 (index)
    System.out.println(input.substring(start , end));   //undh
}

}
