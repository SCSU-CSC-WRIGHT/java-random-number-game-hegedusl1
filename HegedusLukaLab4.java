import java.util.Random;
import java.util.Scanner;

public class HegedusLukaLab4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Guess the Number Game");
        System.out.println("Select Difficulty: 1 (Easy), 2 (Medium), 3 (Hard)");
 int difficulty = scanner.nextInt();
        int maxNumber;
        int maxAttempts;
        if (difficulty == 1) {
            maxNumber = 50;
            maxAttempts = 8;
        } else if (difficulty == 2) {
            maxNumber = 100;
            maxAttempts = 6;
        } else {
            maxNumber = 500;
            maxAttempts = 4;
        }
        int randomNumber = random.nextInt(maxNumber) + 1;

        System.out.println(" A number has been picked between 1 and " + maxNumber + ". Try to guess it");
        for (int attempts = 1; attempts <= maxAttempts; attempts++) {
            System.out.print("Your guess: ");
            int guess = scanner.nextInt();
            if (guess == randomNumber) {
                System.out.println("You got it in " + attempts + " tries");
                return;
            } else if (guess > randomNumber) {
                System.out.println("Too high");
            } else {
                System.out.println("Too low");
            }
            System.out.println("Attempts left: " + (maxAttempts - attempts));
        }
        System.out.println("Out of attempts The number was: " + randomNumber);
    }
}