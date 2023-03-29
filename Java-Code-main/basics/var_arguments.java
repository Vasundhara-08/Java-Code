package basics;

import java.util.Scanner;

public class var_arguments {

//    static int sum(int a,int b){
//        return a+b;
//    }
//    static int sum(int a,int b,int c){
//        return a+b+c;
//    }
//    static int sum(int a,int b,int c,int d){
//        return a+b+c+d;
//    }

    /* instead of using the above statement and making same function again and again
    * we take the help of variable arguments and it is represented by ... */

    static int sum(int ...arg)          // this is an empty array means u can add or not add arguments
    {
        int sum =0;
        for(int a :arg){
        sum = sum + a;}
        return sum;
    }

    static int multiply(int x ,int...argh)           // int x means here one argument is mandatory
    {
        int multiply =1;
        for(int a :argh){
            multiply = multiply * a;}
        return multiply;
    }
    public static void main(String[] args) {
        System.out.println("here we will do the sum of all numbers");
        System.out.println("sum of a and b = " + sum(4,8));
        System.out.println("sum of a and b = " + sum(4,8,7));
        System.out.println("sum of a and b = " + sum(4,8,7,2));

        // this will show an error becz we need to add one argument which is compulsion
      //  System.out.println("multiply of a and b = " + multiply());
        System.out.println("multiply of a and b = " + multiply(4,8,7));
        System.out.println("multiply of a and b = " + multiply(4,8,7,2));

    }
}
