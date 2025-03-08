import java.util.Scanner;

public class FactorialRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Taking input from the user
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        
        // Calculating factorial using recursion
        long result = factorial(num);
        
        // Displaying the result
        System.out.println("Factorial of " + num + " is: " + result);
        
    }
    
    // Recursive function to calculate factorial
    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
