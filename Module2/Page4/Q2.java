// // HW_Sum of All Odd Length Subarrays 1

// One day, Sarah was going through her array of positive integers and wondered how many odd-length subarrays can be formed from it. She wanted to find out their sum as well.

// Help Sarah by writing a program that takes an array of positive integers as input and returns the sum of all possible odd-length subarrays of the array.

// A subarray is a contiguous subsequence of the array.

// Input Format

// An integer number N representing size of array

// N integer number representing elements of array.

// Constraints

// 1 <= arr.length <= 100

// 1 <= arr[i] <= 1000
// Output Format

// Return the sum of all odd length subarray.

// Sample Input 0

// 5
// 1 4 2 5 3
// Sample Output 0

// 58
// Explanation 0

// The odd-length subarrays of arr and their sums are: [1] = 1 [4] = 4 [2] = 2 [5] = 5 [3] = 3 [1,4,2] = 7 [4,2,5] = 11 [2,5,3] = 10 [1,4,2,5,3] = 15 If we add all these together we get 1 + 4 + 2 + 5 + 3 + 7 + 11 + 10 + 15 = 58


import java.util.*;

public class Q2 {
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the size of the array
        int n = scanner.nextInt();
        int[] arr = new int[n];
        
        // Input the elements of the array
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        // To store the total sum
        int totalSum = 0;
        
        // Iterate through the array
        for (int i = 0; i < n; i++) {
            // For each element, consider it as the starting point
            int end = i + 1;
            int start = n - i;
            
            // Total number of subarrays in which arr[i] appears
            int totalSubarrays = start * end;
            
            // Only half of them (rounded up) are of odd length
            int oddSubarrays = (totalSubarrays + 1) / 2;
            
            // Add the contribution of arr[i] in odd-length subarrays to the total sum
            totalSum += arr[i] * oddSubarrays;
        }
        
        // Output the total sum of all odd length subarrays
        System.out.println(totalSum);
    }
}