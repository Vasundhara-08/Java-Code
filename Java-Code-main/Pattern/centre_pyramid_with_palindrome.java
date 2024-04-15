package Pattern;

public class centre_pyramid_with_palindrome {
    public static void main(String[] args) {
        int n =5;
        for (int i=1;i<=n;i++){

            // for spaces
            for(int j=1;j<=(n-i);j++)   // or int j=5;j>=i;j--
            {
                System.out.print(" ");
            }

            // for palindrome numbers (first half)
            for(int j=i;j>=1;j--)
            {
                System.out.print(j);
            }

            // for palindrome numbers (second half)
            for(int k =2;k<=i;k++)
            {
                System.out.print(k);
            }

            System.out.println(" ");
        }
    }
}
