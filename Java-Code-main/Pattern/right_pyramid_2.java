package Pattern;

public class right_pyramid_2 {
    public static void main(String args[])
    {
        int n=6;
        for(int i=1;i<=n;i++)    //  i=6;6>1;5;  i=5;5>1;4
        {
          for(int j=n;j>=i;j--)   //
          {
              System.out.print("*");
          }
            System.out.println();
        }

    }
}
