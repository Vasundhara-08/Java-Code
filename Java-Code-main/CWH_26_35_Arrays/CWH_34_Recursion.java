package CWH_26_35_Arrays;

public class CWH_34_Recursion
{

    public static int factorial(int a) {
        if (a == 0 || a == 1) {
            return 1;
        } else {
            // a * factorial(a-1)
            // 3 * 2 * factorial(2)
            // 3 * 2 * 1 * factorial(1)
            // 3 * 2 * 1 * factorial(0)

            return a * factorial(a - 1);
        }
    }

    public static int Iterative(int num) {
        int product = 1;
        for (int j = 1; j <= num; j++) {
            product *= j;
        }
        return product;
    }

    public static void pattern_triangle(int n)
    {
        //base condition
        if (n>0)
        {
            // then for recursive approach it will check weather go to n-1
            pattern_triangle(n-1);
            for (int i=0;i<n;i++)
            {
                System.out.print("*");;
            }
            System.out.println(" ");
        }

    }

    public static void main(String args[]) {
        // Factorial approach using direct formula
        int x = 6;
        System.out.println("The value of factorial is :- " + factorial(x));

        // Iterative approach
        int y = 7;
        System.out.println("The value of facctorial using iterative approach is :- " + Iterative(y));

        // pattern question of half left triangle using recursion
        int z=3;
        System.out.println("Pattern Question using recursion : "  );
        pattern_triangle(z);
    }

}
