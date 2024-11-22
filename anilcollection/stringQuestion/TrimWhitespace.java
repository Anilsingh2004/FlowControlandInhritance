package stringQuestion;

public class TrimWhitespace  {
    public static void main(String[] args) {
        // Initialize a string with leading and trailing whitespace
        String str = " Hello My name is Anil Singh I am from Bhopa!  ";
        
        // Trim the whitespace using the trim() method
        String trimmedStr = str.trim();
        
        // Print the original and trimmed strings
        System.out.println("Original String: '" + str + "'");
        System.out.println("Trimmed String: '" + trimmedStr + "'");
    }
}

