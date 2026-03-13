import java.util.Random;
import java.util.Scanner;
public class GuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int totalRounds = 0;
        int totalAttempts = 0;
        int wins = 0;
        while (true) {
            System.out.println("number guessing game");
            System.out.println("-------------------------------");
            int numberToGuess = rand.nextInt(100) + 1;
            int attempts = 0;
            int maxAttempts = 6;

            while (attempts < maxAttempts) {
                System.out.print("Guess a number between 1 and 100: ");
                int userGuess = input.nextInt();
                attempts++;

                if (userGuess < 1 || userGuess > 100) {
                    System.out.println("Invalid . Please enter a no between 1 and 100");
                    continue;
                }

                if (userGuess == numberToGuess) {
                    System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                    wins++;
                    break;
                } 
else if (userGuess < numberToGuess) {
                    System.out.println("Too low! Try again. Attempts left: " + (maxAttempts - attempts));
                }
 else {
                    System.out.println("Too high! Try again. Attempts left: " + (maxAttempts - attempts));
                }
            }
if (attempts == maxAttempts)
 {
System.out.println("Game over and The number was " + numberToGuess);
            }

    totalRounds++;
    totalAttempts += attempts;
            System.out.print("Play again? (y/n): ");
            String response = input.next();
            if (!response.equals("y")) {
                break;
            }
        }
        System.out.println("Total Rounds: " + totalRounds);
        System.out.println("Total Attempts: " + totalAttempts);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + (totalRounds - wins));
        System.out.println("Average Attempts per Round: " + (totalAttempts / (double) totalRounds));
        System.out.println("Score: " + calculateScore(totalRounds, wins, totalAttempts));
        input.close();
    }
    public static double calculateScore(int totalRounds, int wins, int totalAttempts) {
        double score = (wins / (double) totalRounds) * 100 - (totalAttempts / (double) totalRounds) * 5;
        return Math.round(score * 100.0) / 100.0; 
    }
} 
