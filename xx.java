import java.util.Random;
import java.util.Scanner;

class NumberGuessingGame {

    public static void main(String[] args) {
        // Generate a random number between 1 and 100
        Random random = new Random();
        int targetNumber = random.nextInt(100) + 1;

        // Initialize variables
        int userGuess;
        int numberOfGuesses = 0;
        boolean hasGuessedCorrectly = false;

        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Try to guess the number between 1 and 100.");

        // Main game loop
        while (!hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");
            
            // Read the user's guess
            userGuess = scanner.nextInt();
            numberOfGuesses++;

            // Check if the guess is correct
            if (userGuess == targetNumber) {
                hasGuessedCorrectly = true;
            } else if (userGuess < targetNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }

        // Display results
        System.out.println("Congratulations! You guessed the number in " + numberOfGuesses + " guesses.");
        
        // Close the scanner
        scanner.close();
    }
}
