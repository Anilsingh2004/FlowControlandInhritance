package lab.fowcontrlandinhritance;

import java.util.Arrays;

public class SecondHighest {
	
	public static void main(String[] args) {
    // Step 1: Declare an array with 10 elements
    int[] array = {2, 4, 5, 3, 6, 7, 9, 4, 5, 6};
    

    // Step 2: Get the subarray from index 2 to 6
    int[] subArray = Arrays.copyOfRange(array, 2, 7); // Copy elements from index 2 to 6 (exclusive)

    
    // Output the subarray
    System.out.print("Sub array: ");
    for (int num : subArray) {
        System.out.print(num + " ");
    }
    
    System.out.println();

    // Step 3: Find the 2nd highest number in the subarray
    int secondHighest = findSecondHighest(subArray);

    // Output the result
    System.out.println("2nd Highest element: " + secondHighest);
}

// Method to find the 2nd highest number in an array
public static int findSecondHighest(int[] arr) {
    int first = Integer.MIN_VALUE;
    int second = Integer.MIN_VALUE;

    for (int num : arr) {
        if (num > first) {
            second = first; // Update second before updating first
            first = num; // Update first
        } else if (num > second && num < first) {
            second = num; // Update second
        }
    }
    return second;
}
}


