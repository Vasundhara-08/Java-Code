// User defined package
package CWH_65_100_Oops_part2;
// User defined Subpacakge
//package Phone.smartphone;

// Pre defined package
// different ways to import scanner package

// import java.util.Scanner;  // Type 1 (import only Scanner class from this pacakage)
import java.util.*;   // Type 2 (Import everything from this package)

public class CWH_65_Packages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // Type 1
        java.util.Scanner sc1 = new java.util.Scanner(System.in);   // Type 2
        System.out.println("This is my scanner");
    }


}
