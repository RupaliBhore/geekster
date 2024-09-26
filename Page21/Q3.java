// // Maximum of Array
// For the given array having N elements, find the maximum element of the array.

// Input Format

// First line will be N, no of elements.

// Second line contains N elements representing an array

// Constraints

// 1 <= N <= 10^6
// Output Format

// Print Maximum element.

// Sample Input 0

// 5
// 1 2 3 4 5        
// Sample Output 0

// 5
// Explanation 0

// 5 is the maximum element in the array.

import java.util.*;

public class Q3 {

 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read size of the array
        int n = scanner.nextInt();

        // Edge case: if array size is 0
        if (n == 0) {
            System.out.println("Array is empty");
            scanner.close();
            return;
        }

        // Initialize variables
        int[] arr = new int[n];
        int maxElement = Integer.MIN_VALUE;

        // Read elements into the array and find maximum element
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            if (arr[i] > maxElement) {
                maxElement = arr[i];
            }
        }

        // Print the maximum element
        System.out.println(maxElement);

        scanner.close();
    }
}
