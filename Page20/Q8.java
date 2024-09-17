// // HW_First NON Matching Value From End

import java.util.*;

public class Q8 {

      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read size of the arrays
        int N = scanner.nextInt();

        // Initialize arrays
        int[] arr1 = new int[N];
        int[] arr2 = new int[N];

        // Read elements of arr1
        for (int i = 0; i < N; i++) {
            arr1[i] = scanner.nextInt();
        }

        // Read elements of arr2
        for (int i = 0; i < N; i++) {
            arr2[i] = scanner.nextInt();
        }

        // Find the first non-matching index from the end
        int nonMatchingIndex = -1;
        for (int i = N - 1; i >= 0; i--) {
            if (arr1[i] != arr2[i]) {
                nonMatchingIndex = i;
                break;
            }
        }

        // Print the result
        System.out.println(nonMatchingIndex);

        scanner.close();
    }
}


// Time Complexity: O(n) due to a single reverse pass through the arrays to find the first non-matching index.
// Space Complexity: O(n) because of the storage required for two arrays, each of size n.












// Declare the first array of size n that stores values of int data-type. Then take n integer inputs and store them in the array one by one.

// Then again declare a second array of size n that stores values of int data-type. Then take n integer inputs and store them in the array one by one. Start traversing the array from the last and Then print the index at which you find the first non-matching number in the array.

// Input Format

// First line Int Value N representing Size of array

// Second line contains N Integer values Representing the values of Arr1

// Third line contains N int values representaing the value of arr2

// Constraints

// NA
// Output Format

// Returns an index of arr2 where you find first non matching integer value from end

// Sample Input 0

// 5
// 10
// 20
// 30
// 40
// 50
// 10
// 20
// 23
// 40
// 52
// Sample Output 0

// 4
// Explanation 0

// 52 is the first NON matching integer value of arr2 from end Print 4 idx of 52

