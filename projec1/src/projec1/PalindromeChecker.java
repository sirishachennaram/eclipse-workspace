package projec1;
import java.util.Scanner;

public class PalindromeChecker {

    // Method to check if a string is a P alindrome
    public static boolean isPalindrome(String input) {
        int start = 0;
        int end = input.length() - 1;

        // Check characters from start and end
        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false; // Not a palindromehell
            }
            start++;
            end--;
        }
        return true; // Is a palindrome
        
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter a string to check if it is a palindrome:");
        String input = scanner.nextLine();

        // Removing spaces and converting to lowercase for uniformity
        input = input.replaceAll("\\s+", "").toLowerCase();

        // Check if the string is a palindrome
        if (isPalindrome(input)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        scanner.close(); // Close the scanner to prevent resource leaks
    }
}



