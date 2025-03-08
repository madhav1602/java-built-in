import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Taking input from the user
        System.out.println("Enter the number of terms:");
        int terms = sc.nextInt();
        
        // Generating and printing Fibonacci sequence
        generateFibonacci(terms);
        
    }
    
    // Function to generate and print Fibonacci sequence
    public static void generateFibonacci(int terms) {
        int a = 0, b = 1;
        
        System.out.println("Fibonacci Sequence:");
        for (int i = 0; i < terms; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
