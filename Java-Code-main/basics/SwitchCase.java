package basics;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a valid number ");
        int number ;
        number = sc.nextInt();
        switch (number){
            case 18:
                System.out.println("u are teenager");
                break;
            case 22:
                System.out.println("u are adult");
                break;
            case 40:
                System.out.println("u are employee");
                break;
            default:
                System.out.println("stay happy :)");
        }
        System.out.println("\t code by vasu");
    }
}
