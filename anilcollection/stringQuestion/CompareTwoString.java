package stringQuestion;

public class CompareTwoString {

	    public static void main(String[] args) {
	        
	        String string1 = "Hello";
	        String string2 = "Hello";
	        String string3 = "World";

	        
	        boolean areEqual1 = string1.equals(string2);
	        
	        boolean areEqual2 = string1.equals(string3);

	       
	        System.out.println("Are string1 and string2 equal? " + areEqual1);
	        System.out.println("Are string1 and string3 equal? " + areEqual2);
	    }
	}

