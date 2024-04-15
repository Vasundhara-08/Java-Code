package CWH_64_100_Oops_part2;

public class upcasting {

    public void looparr(int[] arr)  // create a function
    {
        int tip = arr.length;      // give a input that shows the length of an array
        for(int i=0;i<tip;i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        upcasting funct = new upcasting();   // create an instance with name func
        funct.looparr(new int[] {1,3,5,6,8});
    }
}
