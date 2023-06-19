import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class HighorLow {
    public static void main(String[] args) {
        Random generator = new Random();
        Scanner in = new Scanner(System.in);
        int val = generator.nextInt(10) + 1; //vsl is 1 to 10
        int userGuess = 0;
        String trash = "";
        boolean done = false;
        do {
            System.out.println("Guess the number (between 1 and 10): ");
            if(in.hasNextInt()) {
                userGuess = in.nextInt();
                in.nextLine();
                if (userGuess >= 1 && userGuess <= 10){done = true;}
                else {
                    System.out.println("Invalid guess. Please enter a number [1-10].");
                }
            }
            else {
                trash = in.nextLine();
                System.out.println("You must enter a valid number [1-10] not:  " + trash);
            }
        }
        while (!done);
        if (userGuess < val){
            System.out.println("The random number was: " + val);
            System.out.println("Too low!");
        }
        else if (userGuess > val){
            System.out.println("The random number was: " + val);
            System.out.println("Too high!");
        }
        else {
            System.out.println("The random number was: " + val);
            System.out.println("On the money!");
        }
    }
}