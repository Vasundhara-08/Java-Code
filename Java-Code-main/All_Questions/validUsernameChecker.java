package All_Questions;

import java.util.Scanner;

public class validUsernameChecker {
    public static void main(String[] args) {
        Scanner output = new Scanner(System.in);
        String username= output.next();
       int a = username.length();
       String b = "^[aA-zZ][[0-9]|[_]|[aA-zZ]]{7,29}";

        //int b = username.subSequence(a-z);
//        String b ="a-zA-Z0-9";
//        Pattern c = Pattern.compile(b);
//        Matcher d = c.matcher(username);
        if (a>=8 && a<=30  ) {
           System.out.println("valid");
       }
           else
       {
           System.out.println("invalid");
       }




    }
}

