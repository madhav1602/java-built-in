import java.util.Scanner;

public class GCDLCMCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Taking input from the user
        System.out.println("Enter two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        // Calculating GCD and LCM
        int gcd = calculateGCD(a, b);
        int lcm = calculateLCM(a, b, gcd);
        
        // Displaying the results
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd);
        System.out.println("LCM of " + a + " and " + b + " is: " + lcm);
        
    }
    
    // Function to calculate GCD 
    public static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    // Function to calculate LCM using the formula: LCM(a, b) = (a * b) / GCD(a, b)
    public static int calculateLCM(int a, int b, int gcd) {
        return (a * b) / gcd;
    }
}
