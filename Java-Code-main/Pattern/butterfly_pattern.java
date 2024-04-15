package Pattern;

public class butterfly_pattern {
    public static void main(String[] args) {

        // for upper half
        int n = 4;
        for (int i = 1; i <= n; i++) {
            //for star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //for spaces
            for (int k = 1; k <= 2 * (n - i); k++) {
                System.out.print(" ");
            }
            // for same line next stars
            for (int l = 1; l <= i; l++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        // for second half
        for(int i =4;i>=1;i--)
        {
            //for star
            for(int j =1;j<=i;j++) {
                System.out.print("*");
            }

            // for spaces
            for(int k = 1;k<=2*(n-i);k++)
            {
                System.out.print(" ");
            }
            // for same line next stars
            for (int l = 1; l <= i; l++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
