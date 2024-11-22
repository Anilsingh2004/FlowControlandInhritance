package stringQuestion;

public class ReverseString {
	
	       public static void main(String[] args) {
	        // Initialize a string
	        String str = "My Nmae is Anil Singh I am from Bhopal!";
	        
	        // Reverse the string using StringBuilder
	        String reversedStr = new StringBuilder(str).reverse().toString();
	        
	        // Print the reversed string
	        System.out.println("Reversed String: " + reversedStr);
	    }
	}

