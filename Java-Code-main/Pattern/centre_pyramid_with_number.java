package Pattern;

public class centre_pyramid_with_number {
    public static void main(String[] args) {
        int n =5;
        for(int i =1;i<=n;i++)
        {
            // for spaces
            for(int j=1;j<=(n-i);j++ )
            {
                System.out.print(" ");
            }

            // for same number with same row
            for(int k =1;k<=i;k++)
            {
                System.out.print(i +" ");
            }
            System.out.println(" ");
        }
    }
}
