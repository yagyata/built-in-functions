import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        
        int lowerBound = 1;
        int upperBound = 100;
        int previousGuess = -1;
        String feedback;
        
        System.out.println("Think of a number between 1 and 100, and I will try to guess it!");
        
        while (true) {
            int guess = generateGuess(previousGuess, lowerBound, upperBound, random);
            System.out.println("Is your number " + guess + "? (Enter 'high', 'low', or 'correct')");
            feedback = sc.nextLine().toLowerCase();
            
            if (feedback.equals("correct")) {
                System.out.println("Hooray! I guessed your number!");
                break;
            } else if (feedback.equals("high")) {
                lowerBound = guess + 1;
            } else if (feedback.equals("low")) {
                upperBound = guess - 1;
            } else {
                System.out.println("Invalid input. Please enter 'high', 'low', or 'correct'.");
            }
            
            previousGuess = guess;
            
            if (lowerBound > upperBound) {
                System.out.println("Something went wrong! Are you sure you provided the correct feedback?");
                break;
            }
        }
        
        sc.close();
    }
    
    public static int generateGuess(int previousGuess, int lowerBound, int upperBound, Random random) {
        if (previousGuess != -1) {
            return random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        }
        return lowerBound + random.nextInt(upperBound - lowerBound + 1);
    }
}

/*
Think of a number between 1 and 100, and I will try to guess it!
Is your number 81? (Enter 'high', 'low', or 'correct')
low
Is your number 79? (Enter 'high', 'low', or 'correct')
low
Is your number 49? (Enter 'high', 'low', or 'correct')
high
Is your number 65? (Enter 'high', 'low', or 'correct')
high
Is your number 68? (Enter 'high', 'low', or 'correct')
high
Is your number 74? (Enter 'high', 'low', or 'correct')
high
Is your number 78? (Enter 'high', 'low', or 'correct')
low
Is your number 77? (Enter 'high', 'low', or 'correct')
low
Is your number 76? (Enter 'high', 'low', or 'correct')
correct
Hooray! I guessed your number!
*/
