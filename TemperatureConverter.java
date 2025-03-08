import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Taking input from the user
        System.out.println("Enter temperature value:");
        double temp = sc.nextDouble();
        
        System.out.println("Convert to (C/F):");
        char choice = sc.next().charAt(0);
        
        // Converting based on user choice
        if (choice == 'C' || choice == 'c') {
            System.out.println("Temperature in Celsius: " + fahrenheitToCelsius(temp));
        } else if (choice == 'F' || choice == 'f') {
            System.out.println("Temperature in Fahrenheit: " + celsiusToFahrenheit(temp));
        } else {
            System.out.println("Invalid choice.");
        }
        
    }
    
    // Function to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }
    
    // Function to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }
}
