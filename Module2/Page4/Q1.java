// // HW_Count Subarray Sum Zero

// Take an array of size n from the user. Print the count of subarrays in the array which have the sum equal to zero.

// Input Format

// An Integer input n representing size of array

// N integer input representing elements of an array

// Constraints

// 1<=n<=1000

// -10^6<=n<=10^6

// Output Format

// An Integer value

// Sample Input 0

// 5
// 1 2 -2 -1 0
// Sample Output 0

// 4
// Explanation 0

// 4 subarray with sum equals to 0 {1 2 -2 -1 0} {2 -2} {1 2 -2 -1} {0}

import java.util.*;

public class Q1 {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the size of the array
        int n = scanner.nextInt();
        int[] arr = new int[n];
        
        // Input the elements of the array
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        // To store the cumulative sum and its frequency
        HashMap<Integer, Integer> sumMap = new HashMap<>();
        
        // Initialize sum and count
        int sum = 0;
        int count = 0;
        
        // Traverse through the array
        for (int i = 0; i < n; i++) {
            // Add current element to sum
            sum += arr[i];
            
            // If sum is zero, a subarray from the start to the current index has zero sum
            if (sum == 0) {
                count++;
            }
            
            // If sum is found in map, add its frequency to count
            if (sumMap.containsKey(sum)) {
                count += sumMap.get(sum);
            }
            
            // Update the frequency of the sum in the map
            sumMap.put(sum, sumMap.getOrDefault(sum, 0) + 1);
        }
        
        // Output the count of subarrays with sum zero
        System.out.println(count);
    }
}