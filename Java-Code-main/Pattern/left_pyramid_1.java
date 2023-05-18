package Pattern;
// most important question
public class left_pyramid_1 {
    public static void main(String[] args) {
        int a=4;
        for(int i=1;i<=a;i++)  // 1,2,3,4
        {
            // for spaces
            for(int j=1;j<=a-i;j++)   //  for 1 (3,2,1);for 2(2,1);for 3(1);for 4()
            {
                System.out.print(" ");
            }
            // for star
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
