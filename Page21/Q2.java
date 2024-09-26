// // GKSTR35 Count_Even
// Given an integer n, the task is to define an integer array arr[] of size n &

// Print the Count / Number of even elements in the array.

// Input Format

// An integer n, which is the size of the array arr[]
// n integers each in a new line, depicting the elements of the array arr[]
// Constraints

// 0 <= arr.length <= 1000
// 0 <= arr[i] <= 1000
// Output Format

// Single line of output

// An integer, which is the number of even numbers in the array.
// Sample Input 0

// 5
// 2
// 3
// 4
// 2
// 8
// Sample Output 0

// 4
// Explanation 0

// Since the array is of length 5 and it's elements are {2, 3, 4, 2, 8} therefore, output will be :- 4 , As only 2, 4, 2, 8 are even numbers in the array, thus making the count of even number equal to 4


import java.util.*;

public class Q2 {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read size of the array
        int n = scanner.nextInt();
        
        // Edge case: if array size is 0
        if (n == 0) {
            System.out.println(0);
            scanner.close();
            return;
        }

        // Initialize array
        int[] arr = new int[n];

        // Read elements into the array
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Calculate the number of even elements
        int evenCount = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                evenCount++;
            }
        }

        // Print the number of even elements
        System.out.println(evenCount);

        scanner.close();
    }
}
