import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int numberToGuess = rand.nextInt(100) + 1; // 1–100
        Scanner sc = new Scanner(System.in);
        int guess;
        int attempts = 0;
        int maxAttempts = 5;

        System.out.println("Guess a number between 1 and 100 (Max " + maxAttempts + " attempts):");

        do {
            guess = sc.nextInt();
            attempts++;

            if (guess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (guess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Correct! You guessed it in " + attempts + " tries.");
                return; // End the game
            }

        } while (attempts < maxAttempts);

        System.out.println("Out of attempts! The correct number was: " + numberToGuess);
    }
}
