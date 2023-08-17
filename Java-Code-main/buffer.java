import java.util.Scanner;
// here is an example of a basics.buffer keyword
public class buffer {
    public static void main( String[] args){
        Scanner Data = new Scanner(System.in);
        int  integer = Data.nextInt();
        Double dbl = Data.nextDouble();

   //  after every int or double here in input we need to press enter to take the next value
        //  "so in case ofstring when we press enter it take it as a string and comes out of
        //  the input and does not print anything "this is known as basics.buffer to remove this we
        //  print two times the above command so that enter problem do not occur and our next
        //  line get printed //

        Data.nextLine();
        String str = Data.nextLine();

        System.out.println("String: " + str);
        System.out.println("Double: " + dbl);
        System.out.println("Int: " + integer);
    }


}
