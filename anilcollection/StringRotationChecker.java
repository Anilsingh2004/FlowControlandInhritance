package anilcollection;

public class StringRotationChecker {
	
	

	    public static void main(String[] args) {
	        String str1 = "abcde";
	        String str2 = "cdeab";
	        
	        boolean isRotation = isRotation(str1, str2);
	        System.out.println("Is \"" + str2 + "\" a rotation of \"" + str1 + "\"? " + isRotation);
	    }

	    public static boolean isRotation(String str1, String str2) {
	        // Check if the lengths are the same
	        if (str1.length() != str2.length()) {
	            return false;
	        }

	        // Concatenate str1 with itself
	        String concatenated = str1 + str1;

	        // Check if str2 is a substring of the concatenated string
	        return concatenated.contains(str2);
	    }
	}


