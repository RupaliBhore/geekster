// // maximum difference between the two elements
// Given an array arr[] of integers, find out the maximum difference between any two elements such that larger element appears after the smaller number.

// Input Format

// First line contains an integer N represent the size of array.

// Second line contains N number of integers represent the elements of array.

// Constraints

// 0 <= N <= 10000

// 0 <= arr[i] <= 10000
// Output Format

// print the required output.

// Sample Input 0

// 7
// 2 3 10 6 4 8 1
// Sample Output 0

// 8


import java.util.*;

public class Q4 {

   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the size of the array
        int N = sc.nextInt();
        
        if (N == 0) {
            // If there are no elements, the maximum difference is 0
            System.out.println(0);
            return;
        }
        
        // Read the array elements
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Initialize variables
        int minElement = arr[0];
        int maxDifference = 0;
        
        // Traverse the array to find the maximum difference
        for (int i = 1; i < N; i++) {
            if (arr[i] < minElement) {
                minElement = arr[i];
            }
            int difference = arr[i] - minElement;
            if (difference > maxDifference) {
                maxDifference = difference;
            }
        }
        
        // Output the result
        System.out.println(maxDifference);
    }
}