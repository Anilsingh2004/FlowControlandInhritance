package stringQuestion;

	import java.util.ArrayList;

	public class SumOfEvenNumber {
	    public static void main(String[] args) {
	        // Create an ArrayList of integers
	        ArrayList<Integer> numbers = new ArrayList<>();
	        
	        // Adding some integers to the ArrayList
	        numbers.add(10);
	        numbers.add(15);
	        numbers.add(20);
	        numbers.add(25);
	        numbers.add(30);
	        numbers.add(35);
	        numbers.add(40);
	        numbers.add(45);
	        numbers.add(50);
	        numbers.add(60);
	        numbers.add(70);
	        numbers.add(57);
	        numbers.add(60);
	        
	        // Variable to hold the sum of even numbers
	        int sum = 0;

	        // Iterate through the ArrayList and calculate the sum of even numbers
	        for (int number : numbers) {
	            if (number % 2 == 0) { // Check if the number is even
	                sum += number; // Add to sum
	            }
	        }

	        // Display the sum of even numbers
	        System.out.println("Sum of even numbers: " + sum);
	    }
	}

