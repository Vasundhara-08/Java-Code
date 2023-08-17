package CWH_01_24_basics;
import java.util.Random;
import java.util.Scanner;

public class CWH_20_Rock_paper_ques {
    public static void main(String[] args) {

        // 0 for rock
        // 1 for paper
        // 2 for scissor

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any one digit out of ( 0,1 or 2 ) ");
        System.out.println("\nUser chosses :- ");
        int userinput = sc.nextInt();

        Random num = new Random();
        int randomnum = num.nextInt(3); // this computer will simulate accordingly
        System.out.println("Computer chooses number :- " + randomnum);
        switch(randomnum)
        {
            case 0:
                System.out.println("0 = rock");
                break;
            case 1:
                System.out.println("1 = paper");
                break;
            case 2:
                System.out.println("2 = Scissor");
                break;
            default:
                System.out.println("Invalid number");
        }

        if (userinput==randomnum)
        {
            System.out.println("The match is draw");
        }
        else if (userinput==0 && randomnum==2 || userinput==1 && randomnum==0 ||userinput==2 && randomnum==1 )
        {
            System.out.println("User wins");
        }
        else
        {
            System.out.println("Computer wins");
        }


    }
}
