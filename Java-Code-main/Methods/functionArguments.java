package Methods;

import java.util.Scanner;

public class functionArguments
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        float answer = multiply1(3, 4);    // calling function without making object so we used static here
        System.out.println(answer);              // printing answer


        functionArguments obj = new functionArguments();       // making objects in class(object creation)
        float vasu = obj.multiply1(6,7);                 // calling objects
        System.out.println(vasu);
    }

        // passing the value or arguments of members when you are calling the function
        static float multiply1(float a,float b)
        {
            float multiply = a * b;
            return multiply;

        }
    }

