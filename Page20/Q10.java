// // HW_Print Odd Elements of Array inline


import java.util.*;

public class Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read size of the array
        int n = scanner.nextInt();

        // Initialize array
        int[] arr = new int[n];

        // Read elements into the array
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Print all odd elements
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                System.out.print(arr[i] + " ");
            }
        }

        scanner.close();
    }
}
// Time Complexity: O(n) due to a single pass through the array to check and print odd elements.
// Space Complexity: O(n) because of the storage required for the array of size n.



//Question
// Take n as an integer input. Declare an array of size n that stores value of int data-type. Then take n integer inputs and store them in the array one by one.

// Then print all the elements of the array from the starting which are odd.

// Input Format

// First line contains an integer n representing length of the array.

// Second line consists n elements of an array.

// Constraints

// 1 <= n <= 1000000
    
// 1 <= arr[i] <= 1000000
// Output Format

// See the Description

// Sample Input 0

// 6
// 1
// 2
// 3
// 5
// 6
// 8
// Sample Output 0

// 1 3 5
// Explanation 0

// traversed the array from 0 till n-1 and printed the odd valued elements.