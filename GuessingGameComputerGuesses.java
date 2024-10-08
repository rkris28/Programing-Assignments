import java.util.Scanner;

class GuessingGameComputerGuesses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for input

        System.out.println("Think of a number between 1 and 100 and keep it secret.");
        System.out.println("I will try to guess it. Please respond with 'h' for high, 'l' for low, and 'c' for correct.");

        int low = 1; // Lower bound of the guessing range
        int high = 100; // Upper bound of the guessing range
        int numberOfGuesses = 0; // Counter for the number of guesses made
        boolean hasGuessedCorrectly = false; // Flag to check if the guess is correct

        // Loop until the computer guesses the number correctly
        while (!hasGuessedCorrectly) {
            numberOfGuesses++; // Increment the guess counter

            // Compute the middle of the current range
            int computerGuess = (low + high) / 2;
            System.out.println("Is the number " + computerGuess + "?");

            // Get feedback from the user
            String feedback = scanner.nextLine().toLowerCase();

            if (feedback.equals("h")) {
                System.out.println("Too high! I will try again.");
                high = computerGuess - 1; // Adjust the upper bound
            } else if (feedback.equals("l")) {
                System.out.println("Too low! I will try again.");
                low = computerGuess + 1; // Adjust the lower bound
            } else if (feedback.equals("c")) {
                hasGuessedCorrectly = true; // Set the flag to true since the guess is correct
                System.out.println("Hooray! I guessed the number " + computerGuess + " correctly!");
            } else {
                System.out.println("Please respond with 'h', 'l', or 'c'.");
                numberOfGuesses--; // Do not count invalid guesses
            }

            // Check if the guessing range is valid
            if (low > high) {
            System.out.println("It seems there was a mistake. The number is out of range.");
                break;
            }
        }

        // Display the total number of guesses made
        if (hasGuessedCorrectly) {
            System.out.println("It took me " + numberOfGuesses + " guesses to find your number.");
        }

        scanner.close();
    }
}
