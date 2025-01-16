import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        System.out.println("Think of a number between 1 and 100 and keep it in your mind.");
        System.out.println("The computer will try to guess your number.");
        System.out.println("Provide feedback: 'H' for high, 'L' for low, 'C' for correct.");

        playGame();
    }

    // Function to play the game
    public static void playGame() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int low = 1;
        int high = 100;
        boolean guessedCorrectly = false;

        while (!guessedCorrectly) {
            int guess = generateGuess(low, high, random);
            System.out.println("Computer guesses: " + guess);
            System.out.print("Is it high (H), low (L), or correct (C)? ");
            char feedback = scanner.next().toUpperCase().charAt(0);

            switch (feedback) {
                case 'H':
                    high = guess - 1; // Narrow the range by adjusting the upper bound
                    break;
                case 'L':
                    low = guess + 1; // Narrow the range by adjusting the lower bound
                    break;
                case 'C':
                    System.out.println("Hooray! The computer guessed your number: " + guess);
                    guessedCorrectly = true;
                    break;
                default:
                    System.out.println("Invalid input. Please enter 'H', 'L', or 'C'.");
                    break;
            }

            // Check if the range is invalid (user might have made a mistake)
            if (low > high) {
                System.out.println("Error: The range is inconsistent. Please restart the game.");
                break;
            }
        }
        scanner.close();
    }

    // Function to generate a guess
    public static int generateGuess(int low, int high, Random random) {
        return low + random.nextInt(high - low + 1);
    }
}
