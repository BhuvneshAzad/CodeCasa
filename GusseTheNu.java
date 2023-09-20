import java.util.Random;
import java.util.Scanner;
class Program{
    public void guess(){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int lowerBound = 1;
        int upperBound = 100;
        int targetNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        int maxAttempts = 10;
        int attempts = 0;
        int score = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between " + lowerBound + " and " + upperBound + ". Can you guess it?");

        while (attempts < maxAttempts){
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            attempts++;

            if (userGuess == targetNumber) {
                System.out.println("Congratulations! You guessed the number correctly in " + attempts + " attempts.");
                score += maxAttempts - attempts + 1;
                break;
            } else if (userGuess < targetNumber) {
                System.out.println("Try a higher number.");
            } else {
                System.out.println("Try a lower number.");
            }
        }

        if (attempts == maxAttempts) {
            System.out.println("Sorry, you've reached the maximum number of attempts. The correct number was: " + targetNumber);
        }

        System.out.println("Your score: " + score);

        scanner.close();
    }
}
public class GusseTheNu {
    
    public static void main(String[] args) {
        Program g1=new Program();
        g1.guess();
    }
}

