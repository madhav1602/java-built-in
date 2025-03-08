import java.util.Scanner;

public class MaxOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Taking three integer inputs from the user
        System.out.println("Enter three numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        // Calling Method
        int max = findMax(a, b, c);
        
        // Displaying the result
        System.out.println("The maximum number is: " + max);
        
    }
    
    // Function to find the maximum of three numbers using Math.max
    public static int findMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
}
