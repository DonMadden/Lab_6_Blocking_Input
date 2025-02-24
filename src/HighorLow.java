import java.util.Scanner;
import java.util.Random;

public class HighorLow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(10) + 1; // Random number between 1 and 10
        int userGuess;

        do {
            System.out.print("Guess the number (1-10): ");
            while (!scanner.hasNextInt() || (userGuess = scanner.nextInt()) < 1 || userGuess > 10) {
                System.out.println("Invalid input. Please enter an integer between 1 and 10.");
                scanner.nextLine();
            }
        } while (userGuess < 1 || userGuess > 10);

        System.out.println("The random number was: " + randomNumber);
        if (userGuess == randomNumber) {
            System.out.println("On the money! You guessed correctly.");
        } else if (userGuess > randomNumber) {
            System.out.println("Your guess was too high.");
        } else {
            System.out.println("Your guess was too low.");
        }
        scanner.close();
    }
}
