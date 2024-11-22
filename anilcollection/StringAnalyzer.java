package anilcollection;


	import java.util.HashMap;
import java.util.Map;

	public class StringAnalyzer {

	    public static void main(String[] args) {
	        String input = "programming";
	        countVowelsConsonantsAndFrequency(input);
	    }

	    public static void countVowelsConsonantsAndFrequency(String input) {
	        int vowelCount = 0;
	        int consonantCount = 0;
	        Map<Character, Integer> frequencyMap = new HashMap<>();

	        // Convert the input string to lower case for uniformity
	        input = input.toLowerCase();

	        for (char c : input.toCharArray()) {
	            // Check if the character is a letter
	            if (Character.isLetter(c)) {
	                // Count frequency
	                frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
	                
	                // Check if the character is a vowel
	                if (isVowel(c)) {
	                    vowelCount++;
	                } else {
	                    consonantCount++;
	                }
	            }
	        }

	        // Output results
	        System.out.println("Number of vowels: " + vowelCount);
	        System.out.println("Number of consonants: " + consonantCount);
	        System.out.println("Character frequency: " + frequencyMap);
	    }

	    private static boolean isVowel(char a) {
	        return "aeiou".indexOf(a) != -1;
	    }
	}
