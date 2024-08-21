import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;
        int userGuess = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Try to guess the number between 1 and 100.");

        while (userGuess != numberToGuess) {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();

            if (userGuess < numberToGuess) {
                System.out.println("Try a higher number.");
            } else if (userGuess > numberToGuess) {
                System.out.println("Try a lower number.");
            }
        }

        System.out.println("Congratulations! You guessed the correct number.");
        scanner.close();

}
}