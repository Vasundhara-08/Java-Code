package All_Questions;

import java.util.Scanner;

public class practise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=0;i<a;i++)
       {
        int b = sc.nextInt();   // 9
        int c = sc.nextInt();   // 3
        double equal = b%c;     // 0
        double even = b/c;      // 3

        if (equal == 0 && even%2 == 0)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
       }
    }
}
