package stringQuestion;
import java.util.Scanner;

public class StringContainsSubstring {
	
	
	    public static void main(String[] args) {
	        // Create a Scanner object for user input
	        Scanner scanner = new Scanner(System.in);

	        // Prompt the user to enter the main string
	        System.out.print("Enter the main string: ");
	        String mainString = scanner.nextLine();

	        // Prompt the user to enter the substring to check
	        System.out.print("Enter the substring to check: ");
	        String substring = scanner.nextLine();

	        // Check if the main string contains the substring
	        boolean containsSubstring = mainString.contains(substring);

	        // Display the result
	        if (containsSubstring) {
	            System.out.println("The main string contains the substring.");
	        } else {
	            System.out.println("The main string does not contain the substring.");
	        }

	        // Close the scanner to prevent resource leaks
	        scanner.close();
	    }
	}

