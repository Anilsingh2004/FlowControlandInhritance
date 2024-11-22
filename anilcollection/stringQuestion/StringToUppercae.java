package stringQuestion;
import java.util.Scanner;
public class StringToUppercae {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Prompt user for input
	        System.out.print("Enter a string: ");
	        String inputString = scanner.nextLine();

	        // Convert to uppercase
	        String upperCaseString = inputString.toUpperCase();

	        // Display the result
	        System.out.println("Uppercase String: " + upperCaseString);

	        scanner.close();
	    }
	}

