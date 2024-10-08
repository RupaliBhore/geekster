// HW_target indices
// You are given a 0-indexed integer array nums and a target element target.

// A target index is an index i such that nums[i] == target.

// Return all the target indices of nums after sorting nums in non-decreasing order. If there are no target indices return -1.

// Input Format

// Integer N as size of array.

// N integers as elements of array.

// An integer Target.

// Constraints

// 1 <= N <= 100
// 1 <= nums[i], target <= 100
// Output Format

// Print all the target indices.

// Sample Input 0

// 5
// 1 2 5 2 3
// 2
// Sample Output 0

// 1 2


import java.util.*;

public class Q9{
   public static void findTargetIndices(int[] nums, int target) {
        // Sort the array
        Arrays.sort(nums);
        
        // List to store the target indices
        List<Integer> targetIndices = new ArrayList<>();
        
        // Iterate through the sorted array and find target indices
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                targetIndices.add(i);
            }
        }
        
        // If no target index is found, print -1
        if (targetIndices.isEmpty()) {
            System.out.println(-1);
        } else {
            // Print all the target indices
            for (int index : targetIndices) {
                System.out.print(index + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input size of the array
        int N = sc.nextInt();
        int[] nums = new int[N];
        
        // Input elements of the array
        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }
        
        // Input the target
        int target = sc.nextInt();
        
        // Find and print target indices
        findTargetIndices(nums, target);
    }
}
//FINDED

// Time Complexity:
// Sorting the array takes O(N log N).
// Finding the target indices takes O(N).
// Thus, the overall time complexity is O(N log N).
// Space Complexity:
// O(N) for storing the array and the result list.
// This solution ensures that the target indices are found and printed in the correct order after sorting.