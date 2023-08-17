package CWH_01_24_basics;

public class CWH_09_Oper_Prece {
    public static void main (String args[])
    {
       // here we check the operator with higher precedence that is multiply
        int b = 34*2-9/3;   // 68 - 3
        System.out.println(b);

        // here we will see precedence and associativity  becz divide and multiply have same precedence
        // so we will check the order (associativity) of particular symbol
        int a = 34/2-9*3;  // 17 - 27
        System.out.println(a);

        /*
        * 1. * , /  or + , -   .... left to right
        * 2. ++ ,  =           .... right to left
        *
        * 3. Highest precedence () [] . ->    left to right
        * 4. second precedence   ! - ++ -- & * size of    right to left
        * 5. mostly are left to right
        * 6. right to left are ? : = += *= etc
        *
        * */

        char x = 'f';
        short y = 8;  // 108
        char z = (char) (x+9);    // using char will give result in char terms
        System.out.println(z);


        // b + s = int , s + i = int, l + f = float ,i + f = float
        // l + d = double , f + d = double , c + s =int , c + i = int
    }
}
