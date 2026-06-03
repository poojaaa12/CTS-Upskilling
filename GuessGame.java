import java.util.Scanner;
import java.util.Random;

public class GuessGame {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random randomGenerator = new Random();

        int targetNumber = randomGenerator.nextInt(100) + 1;
        int userGuess;

        do {
            System.out.print("Enter guess: ");
            userGuess = input.nextInt();

            if(userGuess > targetNumber)
                System.out.println("Too High");
            else if(userGuess < targetNumber)
                System.out.println("Too Low");
            else
                System.out.println("Correct!");
        } while(userGuess != targetNumber);
    }
}
