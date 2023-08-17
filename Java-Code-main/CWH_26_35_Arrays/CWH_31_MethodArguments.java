package CWH_26_35_Arrays;

import java.util.Scanner;

public class CWH_31_MethodArguments {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // calling function without making object so we used static for multiply1 method
        float answer = multiply1(3, 4);
        System.out.println("Multiplication of two numbers 3 and 4 are :-" + answer);   // printing answer

        // making objects in class(object creation)
        CWH_31_MethodArguments obj = new CWH_31_MethodArguments();
        float vasu = obj.multiply1(6, 7);              // calling objects if method is not static
        System.out.println("Multiplication of two numbers 6 and 7 are :-" + vasu);

        float addition = add(0, 23);
        System.out.println("Addition of two numbers 0 and 23 are :-" + addition);
    }

    // passing the value or arguments of members when you are calling the function
    static float multiply1(float a, float b)  // creating a function name multiply
    {
        float multiply = a * b;
        return multiply;

    }

    static float add(float x, float v) {    // creating a function name add
        float add1 = x + v;
        return add1;
    }
}

