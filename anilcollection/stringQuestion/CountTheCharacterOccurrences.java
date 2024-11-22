package stringQuestion;

public class CountTheCharacterOccurrences {
	
    public static void main(String[] args) {
        
        String originalString = "Hello World!";
        
        
        char targetChar = 'l';
        
        // Variable to hold the count
        int count = 0;

        // Iterate through the string and count occurrences of targetChar
        for (int i = 0; i < originalString.length(); i++) {
            if (originalString.charAt(i) == targetChar) {
                count++;
            }
        }

        
        System.out.println("The character '" + targetChar + "' occurs " + count + " times in the string.");
    }
}

