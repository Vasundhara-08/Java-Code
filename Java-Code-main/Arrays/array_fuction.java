package Arrays;// note :-  in case of arrays , the refernce is passed in method.
//           same is in the case of object passing to method

public class array_fuction {

        static void change(int x)
        {
            x = 34;
        }

        static void change2(int arr[])
        {
            arr[1] = 90;
        }


    public static void main(String[] args) {
        // changing the integer in array but it will not change until we give the index of array
        int [] arr = {3,4,5,6};
        int a = 45;
        change(a);
        System.out.println("After using the integer changing option  " + a);

        // changing the value of array element by giving index
         change2(arr);
         // yha hamne reference pass kia hai  , object ki copy bnake pass nhi ki islie original value change hogi arr ki.
        System.out.println("after changing the index of 1st location of array " + arr[1]);
    }
}

