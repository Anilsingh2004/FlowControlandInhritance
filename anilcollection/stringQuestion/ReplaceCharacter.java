package stringQuestion;

public class ReplaceCharacter {
    public static void main(String[] args) {
        // Original string
        String originalString = "Hello World!";
        
        // Character to be replaced
        char oldChar = 'o';
        
        // Character to replace with
        char newChar = 'a';
        
        // Replace the character using replace() method
        String modifiedString = originalString.replace(oldChar, newChar);
        
        // Display the original and modified strings
        System.out.println("Original String: " + originalString);
        System.out.println("Modified String: " + modifiedString);
    }
}


