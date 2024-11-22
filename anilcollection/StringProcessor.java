package anilcollection;

 import java.util.HashSet;
import java.util.Set;

public class StringProcessor {

    public static void main(String[] args) {
        String input = "programming";
        String result = removeDuplicatesAndCount(input);
        System.out.println("Resulting string: " + result);
    }

    public static String removeDuplicatesAndCount(String input) {
        Set<Character> seen = new HashSet<>();
        StringBuilder result = new StringBuilder();
        int vowelCount = 0;
        int consonantCount = 0;

        for (char c : input.toCharArray()) {
            // Check if character is already seen
            if (!seen.contains(c)) {
                seen.add(c);
                result.append(c);

                // Check if the character is a vowel or consonant
                if (isVowel(c)) {
                    vowelCount++;
                } else if (Character.isLetter(c)) {
                    consonantCount++;
                }
            }
        }

        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);
        return result.toString();
    }

    private static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}


