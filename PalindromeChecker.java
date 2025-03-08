import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Taking input from the user
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        
        // Checking if the string is a palindrome
        boolean isPalindrome = checkPalindrome(str);
        
        // Displaying the result
        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
        
    }
    
    // Function to check if a string is a palindrome
    public static boolean checkPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
