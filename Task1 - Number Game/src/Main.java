import java.util.Locale;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       int min = 1;
       int max = 100;
       boolean nextRound = true;
       int maximumAttempt = 5;
       int score = 0;

        System.out.println("<------Welcome to the Number Guessing Game------>");
        System.out.println("<-----You have to guess a number between 1 and 100----->");

        while(nextRound) {

            Random random = new Random();
            int randomNumber = random.nextInt((max - min) + 1) + min;
            System.out.println("You have " + maximumAttempt + " attempts to guess a number");
            

            int attempt = 0;

            while (attempt < maximumAttempt) {
                System.out.println("Enter your guess number: ");
                int userNum = scanner.nextInt();

                attempt++;

                if (userNum == randomNumber) {
                    System.out.println("Congratulations! you have guessed the number in   " + attempt + " attempts");
                    score++;
                    break;
                } else if (userNum < randomNumber) {
                    System.out.println("Your guess is too low, Try Again");
                    System.out.println("Attempts remaining " + (5-attempt));
                } else {
                    System.out.println("Your guess is too high, Try Again");
                    System.out.println("Attempts remaining " + (5-attempt));
                }

            }

            if (attempt == maximumAttempt) {
                System.out.println("You have used all your attempts");
                System.out.println("The correct number was " + randomNumber);
            }

            System.out.println("Your Score is: " + score);

            System.out.println("Do you want to play another round? (Y/N): ");
            String answer = scanner.next().toLowerCase();
            if (answer.equals("y")) {
                nextRound = true;
            } else {
                nextRound = false;
            }


        }

        System.out.println("Thanks for playing");
        System.out.println("Your final score is " + score);

        scanner.close();
    }
}
