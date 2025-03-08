import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Taking input from the user
        System.out.println("Enter first number:");
        double num1 = sc.nextDouble();
        
        System.out.println("Enter second number:");
        double num2 = sc.nextDouble();
        
        System.out.println("Choose operation (+, -, *, /):");
        char op = sc.next().charAt(0);
        
        double result = 0;
        boolean valid = true;
        
        // Performing operation based on user choice
        switch (op) {
            case '+':
                result = add(num1, num2);
                break;
            case '-':
                result = subtract(num1, num2);
                break;
            case '*':
                result = multiply(num1, num2);
                break;
            case '/':
                if (num2 != 0) {
                    result = divide(num1, num2);
                } else {
                    System.out.println("Error: Division by zero.");
                    valid = false;
                }
                break;
            default:
                System.out.println("Invalid operation.");
                valid = false;
        }
        
        if (valid) {
            System.out.println("Result: " + result);
        }
        
    }
    
    // Function for addition
    public static double add(double a, double b) {
        return a + b;
    }
    
    // Function for subtraction
    public static double subtract(double a, double b) {
        return a - b;
    }
    
    // Function for multiplication
    public static double multiply(double a, double b) {
        return a * b;
    }
    
    // Function for division
    public static double divide(double a, double b) {
        return a / b;
    }
}
