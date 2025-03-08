import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateArithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Define a date format for user input and output
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        
        // Prompt the user to enter a date in the specified format
        System.out.print("Enter a date (yyyy-MM-dd): ");
        LocalDate date = LocalDate.parse(sc.next(), fmt); // Parse the input string into a LocalDate object
        
        // Perform date arithmetic:
        LocalDate modifiedDate = date.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);
        
        // Display the modified date in the same format
        System.out.println("Modified Date: " + modifiedDate.format(fmt));
        
    }
}
