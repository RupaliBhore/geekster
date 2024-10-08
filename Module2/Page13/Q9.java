// HW_Minimal Maximum Sum

// You are provided with an integer array nums and another integer k. Your task is to divide the array nums into k non-empty subarrays such that the maximum sum of any subarray is as small as possible.

// Return the minimized largest sum of the split.

// **NOTE:-**A subarray is a contiguous part of the array.

// Input Format

// first line of input contains integer N representing the size of array.

// second line of input contains N integers representing the elements of array.

// third line of input contains integer k.

// Constraints

// 1 <= N <= 1000

// 0 <= nums[i] <= 10^6

// 1 <= k <= min(50, N )

// Output Format

// Return the minimized largest sum of the split.

// Sample Input 0

// 5
// 7 2 5 10 8
// 2
// Sample Output 0

// 18
// Explanation 0

// There are four ways to split nums into two subarrays. The best way is to split it into [7,2,5] and [10,8], where the largest sum among the two subarrays is only 18.


import java.util.*;

public class Q9 {

  // Function to check if it is possible to split the array into k or fewer subarrays
    // such that the maximum sum of any subarray is <= maxSum
    public static boolean canSplit(int[] nums, int k, int maxSum) {
        int currentSum = 0;
        int requiredSubarrays = 1; // We need at least one subarray
        
        for (int num : nums) {
            if (currentSum + num > maxSum) {
                requiredSubarrays++;
                currentSum = num;
                if (requiredSubarrays > k) {
                    return false;
                }
            } else {
                currentSum += num;
            }
        }
        
        return true;
    }

    // Function to find the minimized largest sum
    public static int findMinimizedLargestSum(int[] nums, int k) {
        int low = 0;
        int high = 0;
        
        // Initialize low and high bounds for binary search
        for (int num : nums) {
            low = Math.max(low, num); // Maximum single element
            high += num; // Sum of all elements
        }
        
        int result = high;
        
        // Binary search to find the minimized largest sum
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (canSplit(nums, k, mid)) {
                result = mid;
                high = mid - 1; // Try for a smaller maximum sum
            } else {
                low = mid + 1; // Increase the maximum sum
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input the size of the array
        int n = sc.nextInt();
        int[] nums = new int[n];
        
        // Input the elements of the array
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        
        // Input the number of subarrays
        int k = sc.nextInt();
        
        // Find and print the minimized largest sum
        System.out.println(findMinimizedLargestSum(nums, k));
    }
}

// //Finded
// Time Complexity:
// O(n log S): The binary search runs in O(log S) where S is the sum of the array, and each feasibility check runs in O(n).
// Space Complexity:
// O(1): We use only a few extra variables for binary search and feasibility check.