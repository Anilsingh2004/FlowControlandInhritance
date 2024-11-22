package stringQuestion;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseStringList {
    public static void main(String[] args) {
        // Create a List of strings
        List<String> stringList = new ArrayList<>();
        
        // Adding some strings to the list
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Cherry");
        stringList.add("Date");
        stringList.add("Elderberry");
        stringList.add("Orange");
        stringList.add("Pineapple");
        stringList.add("Watermelon");
        stringList.add("Mango");
        // Display the original list
        System.out.println("Original List: " + stringList);
        
        // Reverse the list using Collections.reverse()
        Collections.reverse(stringList);
        
        // Display the reversed list
        System.out.println("Reversed List: " + stringList);
    }
}


