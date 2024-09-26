// // Check Characterstic

// For each index,

// Store 1 at that index if the element at that index is greater than zero.

// Store 0 at the index if the element at that index is equal to zero.

// Store -1 at the index if the element at that index is less than zero.

// In the end print the complete array one by one.

// Input Format

// First line contains a number n representing size of array

// Second line contains N numbers representing elemnts of array.

// Constraints

// 1 < n <= 1000000

// -10^6 <= n <= 10^6
// Output Format

// Print n numbers in single line.

// Sample Input 0

// 5
// -12 23 0 12 -19
// Sample Output 0

// -1 1 0 1 -1
// Explanation 0

// Since value at index 0 is negative therefore we store -1 at index 0. similarly value at index 1 is postive therefore we store 1 at index 1. similarly value at index 2 is zero therefore we store 0 at index 2. And so on.

import java.util.*;

public class Q1 {

   public static int[] transformArray(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                arr[i] = 1;
            } else if (arr[i] == 0) {
                arr[i] = 0;
            } else {
                arr[i] = -1;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the array
        int n = scanner.nextInt();

        // Declare and initialize the array
        int[] arr = new int[n];

        // Read the array elements
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Transform the array
        int[] transformedArr = transformArray(arr, n);

        // Print the transformed array
        for (int i = 0; i < n; i++) {
            System.out.print(transformedArr[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}
