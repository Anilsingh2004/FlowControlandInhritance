package anilcollection;

	import java.util.ArrayList;
	
	public class SumOfAllNumber{
	
	    public static void main(String[] args) {
	        // Create an ArrayList of integers
	        ArrayList<Integer> numbers = new ArrayList<>();

	        // Add numbers 10, 20, 30, 40, and 50 to the list
	        numbers.add(10);
	        numbers.add(20);
	        numbers.add(30);
	        numbers.add(40);
	        numbers.add(50);

	        // Iterate over the list and calculate the sum of all numbers
	        int sum = 0;
	        for (int number : numbers) {
	            sum += number;
	        }

	        // Print the sum
	        System.out.println("Sum of all numbers: " + sum);
	    }
	}

