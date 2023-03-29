package Methods;// Overloading allows different methods to have the same name, but different parameters where the
// parameters can differ by the number of input parameters or type of input parameters or both

public class Func_Overloading {

    static void foo()
        {
            System.out.println("Hello everyone");
        }
    static void foo(int a)
    {
        System.out.println("Hello everyone " + a);
    }
    static void foo(int a,int b)
    {
        System.out.println(b + " Hello everyone " + a);
    }

    public static void main(String[] args) {
    foo();
    foo(300 );
    foo(400 , 900);
    }
}
