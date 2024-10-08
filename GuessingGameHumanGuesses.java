import java.util.Random;
import java.util.Scanner;

class GuessingGameHumanGuesses {
    public static void main(String[] args) {
        Random random = new Random(); // Create an instance of Random
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for input

        // The computer randomly selects a number between 1 and 100
        int numberToGuess = random.nextInt(100); // Generates a number from 1 to 100
        int numberOfGuesses = 0; // Counter for the number of guesses made
        boolean hasGuessedCorrectly = false;

        System.out.println("Welcome to the Guess the Number game!"); // Game introduction
        System.out.println("I've thought of a number between 1 and 100. Can you guess it?");

        // Loop until the player guesses the number correctly
        while (!hasGuessedCorrectly) {
            System.out.print("Enter your guess: "); // Prompt the player for a guess
            int playerGuess = scanner.nextInt(); // Read the player's guess
            numberOfGuesses++; // Increment the guess counter

            // Check if the guess is too low, too high, or correct
            if (playerGuess < numberToGuess) {
                System.out.println("Too low! Try again."); // Provide feedback if the guess is low
            } else if (playerGuess > numberToGuess) {
                System.out.println("Too high! Try again."); // Provide feedback if the guess is high
            } else {
                hasGuessedCorrectly = true; // Set the flag to true since the guess is correct
                System.out.println("Congratulations! You've guessed the number " + numberToGuess + "!"); // C
            }
        }

        // Display the total number of guesses made
        System.out.println("It took you " + numberOfGuesses + " guesses.");
        scanner.close(); // Close the scanner to prevent resource leaks
    }
}
