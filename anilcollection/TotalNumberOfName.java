package anilcollection;

	import java.util.ArrayList;
	public class TotalNumberOfName {

	    public static void main(String[] args) {
	        // Create an ArrayList of names
	        ArrayList<String> names = new ArrayList<>();

	        // Add five names to the list
	        names.add("Anil");
	        names.add("Ramniwas");
	        names.add("Manisha");
	        names.add("Avinash");
	        names.add("Samar");
	        names.add(" Rahul") ;
	        names.add("12362");
	        names.add(" November11");
	        names.add(" August");
	        // Print the total number of names in the list
	        System.out.println("Total number of names: " + names.size());

	        // Display the name at the second position (index 1)
	        System.out.println("Name at second position: " + names.get(1));
	    }
	}

