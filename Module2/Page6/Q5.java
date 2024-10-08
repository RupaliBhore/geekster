// // HW_Middle index

// Given a 0-indexed integer array nums, find the leftmost middleIndex (i.e., the smallest amongst all the possible ones).

// A middleIndex is an index where nums[0] + nums[1] + ... + nums[middleIndex-1] == nums[middleIndex+1] + nums[middleIndex+2] + ... + nums[nums.length-1].

// If middleIndex == 0, the left side sum is considered to be 0. Similarly, if middleIndex == nums.length - 1, the right side sum is considered to be 0.

// Return the leftmost middleIndex that satisfies the condition, or -1 if there is no such index.

// Input Format

// The first line contains N, i.e. the size of the array.

// The second line contains N space-separated positive integers nums[i] denoting elements of the array.

// Constraints

// 1 <= N <= 100

// -1000 <= nums[i] <= 1000
// Output Format

// Return the leftmost index which satisfies the condition.

// Sample Input 0

// 5
// 2 3 -1 8 4
// Sample Output 0

// 3
// Explanation 0

// The sum of the numbers before index 3 is: 2 + 3 + -1 = 4 The sum of the numbers after index 3 is: 4 = 4


import java.util.*;

public class Q5 {

  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the array
        int n = scanner.nextInt();
        int[] nums = new int[n];

        // Read the elements of the array
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        // Find the leftmost middle index
        int middleIndex = findMiddleIndex(nums);
        System.out.println(middleIndex);

        scanner.close();
    }

    public static int findMiddleIndex(int[] nums) {
        int totalSum = 0;
        int leftSum = 0;

        // Calculate the total sum of the array
        for (int num : nums) {
            totalSum += num;
        }

        // Find the middle index
        for (int i = 0; i < nums.length; i++) {
            // Calculate the right sum
            int rightSum = totalSum - leftSum - nums[i];

            if (leftSum == rightSum) {
                return i;
            }

            // Update left sum for the next iteration
            leftSum += nums[i];
        }

        return -1;
    }
}