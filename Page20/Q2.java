// // Check if x is present in array or not
import java.util.*;
public class Q2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        // Read the size of the array
        int n = scanner.nextInt();

        // Initialize array of size n
        int[] arr = new int[n];

        // Read elements into the array
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Read the element to search
        int target = scanner.nextInt();

        // Initialize flag to track if element is found
        boolean found = false;

        // Check if target is present in the array
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                found = true;
                break;
            }
        }

        // Output result
        System.out.println(found ? "True" : "False");

    }
}


// Time Complexity: O(n) due to the single pass through the array to find the target element.
// Space Complexity: O(n) because of the storage required for the array of size n.









// Given an array, the task is to write a Java program to check whether a specific element is present in this Array or not.
// Input Format
// First line contains integer N
// Second line contains N integer representing elements of array.
// Third line contains an integer.
// Constraints
// 1 < n <= 10^8
// Output Format
// Print True or False
// Sample Input 0
// 5
// 1 2 3 4 5
// 3
// Sample Output 0
// True

