package Pattern;

public class right_pyramid_1 {
    public static void main(String[] args) {
        int n =5;
        for(int i=1;i<=n;i++)     // i=1,2,3,4,5
        {
            for(int j=1;j<=i;j++)     // j=1 value *,j=2 value **
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        System.out.println();
    }
}
