package CWH_38_61_Oops_part1;

import java.util.Random;
import java.util.Scanner;

class Game {
    public int random_no;
    public int user_input;
    public int no_of_guesses = 0;

    public int getNo_of_guesses() {
        return no_of_guesses;
    }

    public void setNo_of_guesses(int no_of_guesses) {
        this.no_of_guesses = no_of_guesses;
    }

    Game() {
        Random rm = new Random();
        random_no = rm.nextInt(100);
    }

    void take_user_input() {
        System.out.println("Guess your number :- ");
        Scanner sc = new Scanner(System.in);
        user_input = sc.nextInt();

    }

    boolean isCorrectNumber() {
        no_of_guesses++;
        if (random_no == user_input) {
            System.out.println("Yes you guessed it right!!!");
            System.out.format("The number computer guessed was %d .\nYou guessed it in %d attempts ", random_no, no_of_guesses);
            return true;
        } else if (random_no > user_input) {
            System.out.println("Too low...");
        } else if (random_no < user_input) {
            System.out.println("Too high...");
        }
        return false;
    }
}

public class CWH_50_Guess_num_Ques {
    public static void main(String[] args) {
        /*
            Create a class Game, which allows a user to play "Guess the Number"
            game once. Game should have the following methods:
            1. Constructor to generate the random number
            2. takeUserInput() to take a user input of number
            3. isCorrectNumber() to detect whether the number entered by the user is true
            4. getter and setter for noOfGuesses
            Use properties such as noOfGuesses(int), etc to get this task done!
         */
        Game gm = new Game();
        boolean z = false;
        while (!z) {
            gm.take_user_input();
            z = gm.isCorrectNumber();
        }


    }
}


