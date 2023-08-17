package CWH_26_35_Arrays;

public class CWH_35_Fibonacci {

        // Fibonacci series -- 0,1,1,2,3,5,8,13,21,34

        /*  tree  for             z =5
                            /                \
        *               f(4)                   f(3)
                      /        \             /       \
        *         f(3)          f(2)       f(2)       f(1)
                 /    \         /    \     /   \        \
        *      f(2)   f(1)   f(1)    f(0) f(1)  f(0)     1
             /    \
           f(1)     f(0)
        */
        public static int Fibonacci(int v) {

//        if (v == 1)    // index 1st =0
//        {
//            System.out.println(0);
//        } else if (v==2) {     // index 2 nd = 1
//            System.out.println(1);
//        }

            // above statement can be written as

        if (v == 0 || v == 1) {
            return (v);
        } else {
            return Fibonacci(v - 1) + Fibonacci((v - 2));  // f(5-1) + f(5-2) , 4 + 3 ,
        }
    }

    public static int Fib_Iteration(int w)
    {
        if(w <=0 )
            return 0;
        if (w==1)
        {
            return  1;
        }
        int first =0;
        int second =1;

        for(int i=2;i<=w;i++)
        {
       int next = first +second;
            first=second;
            second=next;

        }
        return second;
    }

    public static void main(String args[]) {
        // Fibonacci series using recursion -- 0,1,1,2,3,5,8,13,21,34
        int z = 5;
        System.out.println("The result of Fibonacci series using recursion is : " + Fibonacci(z));

        // Fibonacci series using Iteration
        int num = 8;   //21
        System.out.println("The result of Fibonacci series using iteration is : " + Fib_Iteration(num));
    }
}
