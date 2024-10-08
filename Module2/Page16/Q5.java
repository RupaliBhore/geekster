// HW_Contains Duplicate?

// Take an integer array arr as input and print "true" if any value appears at least twice in the array, else print "false" if every element is distinct.

// NOTE :- After answering the question, attempt the related question in the linked resource to improve your understanding of the question . Question Link -> https://leetcode.com/problems/contains-duplicate/

// Input Format

// An Integer N.
// N integers depicting elements of array.
// Constraints

// 1 <= arr.length <= 10^5
// -10^9 <= arr[i] <= 10^9
// Output Format

// "true" or "false"
// Sample Input 0

// 5
// 1 2 3 4 5
// Sample Output 0

// false
// Sample Input 1

// 5 
// 1 2 2 3 1
// Sample Output 1

// true



import java.util.*;

public class Q5 {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the size of the array
        int n = scanner.nextInt();
        // Initialize an array to store the elements
        int[] arr = new int[n];

        // Read the array elements
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Check for duplicates and print the result
        boolean hasDuplicate = containsDuplicate(arr);
        System.out.println(hasDuplicate);
        
        scanner.close();
    }

    private static boolean containsDuplicate(int[] arr) {
        // Create a HashSet to store the elements
        HashSet<Integer> seen = new HashSet<>();

        // Iterate through the array
        for (int num : arr) {
            // If the number is already in the set, we found a duplicate
            if (seen.contains(num)) {
                return true; // Duplicate found
            }
            // Add the number to the set
            seen.add(num);
        }
        
        // No duplicates found
        return false;
    }
}
//finded
 // Time Complexity: O(n), where n is the length of the array. Each element is processed once, and set operations (insert and lookup) are average O(1).
// Space Complexity: O(n) in the worst case, if all elements are distinct and stored in the set.