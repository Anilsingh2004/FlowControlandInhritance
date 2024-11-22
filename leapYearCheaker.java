package lab.fowcontrlandinhritance;

import java.util.Scanner;

public class leapYearCheaker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        
	        // Step 1: Take input from the user
	        System.out.print("Enter a year: ");
	        int year = scanner.nextInt();

	        // Step 2: Check if the year is a leap year
	        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
	            System.out.println(year + " is a leap year.");
	        } else {
	            System.out.println(year + " is not a leap year.");
	        }

	        scanner.close();
	    }
	
	}


