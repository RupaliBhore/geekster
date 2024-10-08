// hw_single Element in a Sorted Array

// You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once.

// Return the single element that appears only once.

// Your solution must run in O(log n) time and O(1) space.

// Input Format

// An integer N. Array of length N.

// Constraints

// 1 <= nums.length <= 105 0 <= nums[i] <= 105

// Output Format

// Print the output.

// Sample Input 0

// 9
// 1 1 2 3 3 4 4 8 8
// Sample Output 0

// 2
// Sample Input 1

// 7
// 3 3 7 7 10 11 11
// Sample Output 1

// 10


import java.util.*;

public class Q5 {
 public static int singleNonDuplicate(int[] arr) {
        int low = 0;
        int high = arr.length - 1;

        // Binary search loop
        while (low < high) {
            int mid = low + (high - low) / 2;

            // Check if mid is at the start of a pair
            if (mid % 2 == 1) {
                mid--; // Ensure mid is even (start of a pair)
            }

            // Check if the next element forms a valid pair with mid
            if (arr[mid] == arr[mid + 1]) {
                low = mid + 2; // The single element must be to the right
            } else {
                high = mid; // The single element is to the left, including mid
            }
        }

        // When low == high, we've found the single element
        return arr[low];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input the size of the array
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        // Input the elements of the array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Find and print the single non-duplicate element
        System.out.println(singleNonDuplicate(arr));
    }
}
// Time Complexity:O(log n): Binary search reduces the search space by half in each iteration.
// Space Complexity:O(1): We only use a few variables to keep track of the binary search state.