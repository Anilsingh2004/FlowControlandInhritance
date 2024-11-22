package stringQuestion;

public class SplitString {
	public class StringSplitExample {
	    public static void main(String[] args) {
	        // Initialize a string
	        String str = "apple,banana,cherry,mango, pineapple, orange";
	        
	        // Split the string into an array of substrings using the split() method
	        String[] fruits = str.split(",");
	        
	        // Print the resulting array of substrings
	        System.out.println("Fruits:");
	        for (String fruit : fruits) {
	            System.out.println(fruit);
	        }
	    }
	}
}
