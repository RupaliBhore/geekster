// // Maximum Product Subarray 2
// Sofia is a student who is struggling with her grades in math class. Her teacher has given her a list of N integers, and she needs to find the contiguous subarray with the largest product. Can you help Sofia find the solution to this problem?

// Note: According to testcases answer will not overflow long

// NOTE:- After answering the question, attempt the related question in the linked resource to improve your understanding of the question . Click here

// Input Format

// First line contain N, number of elements in an array.

// Second line contain N integers representing array elements.

// Constraints

// 1 <= N <= 1000000

// -100 <= A[i] <= 100
// Output Format

// return the contiguous subarray with the largest product.

// Sample Input 0

// 4
// 2 3 -2 4 
// Sample Output 0

// 6

import java.util.*;

public class Q9 {

    public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        int N = scanner.nextInt();
        int[] arr = new int[N];

        // Input the elements of the array
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        // Edge case for a single element array
        if (N == 1) {
            System.out.println(arr[0]);
            scanner.close();
            return;
        }

        // Initialize variables for the algorithm
        int maxProduct = arr[0];
        int minProduct = arr[0];
        int currentMax = arr[0];
        int currentMin = arr[0];

        // Process each element in the array
        for (int i = 1; i < N; i++) {
            if (arr[i] < 0) {
                // Swap max and min when current element is negative
                int temp = currentMax;
                currentMax = currentMin;
                currentMin = temp;
            }

            // Update the current max and min product
            currentMax = Math.max(arr[i], arr[i] * currentMax);
            currentMin = Math.min(arr[i], arr[i] * currentMin);

            // Update the global max product
            maxProduct = Math.max(maxProduct, currentMax);
        }

        // Output the result
        System.out.println(maxProduct);

        scanner.close();
    }
}