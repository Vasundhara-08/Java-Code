package Pattern;

public class right_pyramid_with_number {
    public static void main(String[] args) {
        int n =5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
//                for(int k=j;k<=j;k++) {
//                    System.out.print(k + " ");
//                }

            }
            System.out.println();
        }
    }
}
