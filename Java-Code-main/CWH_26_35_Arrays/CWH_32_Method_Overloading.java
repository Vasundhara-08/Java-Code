package CWH_26_35_Arrays;

// Overloading allows different methods to have the same name, but different parameters where the
// parameters can differ by the number of input parameters or type of input parameters or both

public class CWH_32_Method_Overloading {

    static void foo()
    {
        System.out.println("Hello everyone");
    }

    // int a here defined as parameter
    static void foo(int a)
    {
        System.out.println("Hello everyone " + a);
    }

    // you cannot change the return type in method overloading for eg:- static int foo() ...not applicable
    static void foo(int a, int b)
    {
        System.out.println(b + " Hello everyone " + a);
    }


    // The number will not get change as it is copy not the original value of int
    static void change_integer(int x)
    {
        int a =30;
        System.out.println("The number will remain same " + x);
    }

    static  void change_array(int[] arr)
    {
        arr[1] = 8;
        System.out.println("The number present at array index will change " +  arr[1] );
    }

    public static void main(String[] args) {
        foo();
        foo(300);  // 300 here is argument -- [ An argument is an actual value!!! ]
        foo(400, 900);


        // Changing the Integer
        // If int value is defined in main then it will remain same no matter if it is changed in the function above
        change_integer(20);

        // Changing the Array
        // (Bcz we had passed the reference of array so it will get changed rather than passing the copy of object)
        int marks[] ={3,4,5,6,7,9};
        change_array(marks);

    }
}
