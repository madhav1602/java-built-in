import java.util.Scanner;

public class RandomNumberGuessing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = 1;
        int high = 100;
        int guess;
        String feedback;
        
        System.out.println("Think of a number between 1 and 100.");
        
        while (true) {
            // Generate a random guess within the current range
            guess = low + (int) (Math.random() * (high - low + 1));
            System.out.println("Is your number " + guess + "? (Enter 'high', 'low', or 'correct')");
            feedback = sc.next().toLowerCase();
            
            if (feedback.equals("correct")) {
                System.out.println("Great! The computer guessed your number.");
                break;
            } else if (feedback.equals("high")) {
                high = guess - 1; // Adjust the upper bound
            } else if (feedback.equals("low")) {
                low = guess + 1; // Adjust the lower bound
            } else {
                System.out.println("Invalid input. Please enter 'high', 'low', or 'correct'.");
            }
        }
        
    }
}
