package lab.fowcontrlandinhritance;

import java.util.Scanner;

public class StrongNumber {

	
  	 // Method to calculate factorial of a number
	    public static int factorial(int n) {
	        if (n == 0 || n == 1) {
	            return 1; // 0! and 1! are both 1
	        }
	        int fact = 1;
	        for (int i = 2; i <= n; i++) {
	            fact *= i; // Calculate factorial
	        }
	        return fact;
	    }

	    // Method to check if a number is a Strong number
	    public static boolean isStrongNumber(int number) {
	        int sum = 0;
	        int originalNumber = number;

	        // Extract digits and calculate sum of factorials
	        while (number > 0) {
	            int digit = number % 10; // Get last digit
	            sum += factorial(digit); // Add factorial of the digit to sum
	            number /= 10; // Remove last digit
	        }

	        // Compare the sum of factorials with the original number
	        return sum == originalNumber;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        // Input a number from the user
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        // Check if the number is a Strong number
	        if (isStrongNumber(number)) {
	            System.out.println(number + " is a Strong number.");
	        } else {
	            System.out.println(number + " is not a Strong number.");
	        }

	        scanner.close();
	    }
	
		}


