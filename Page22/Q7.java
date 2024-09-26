// // HW_Element as an index
// Construct an array called "ans" that has the same length as the "nums" array, which is indexed starting at 0. Each element in "ans" should be assigned with the value of "nums[nums[i]]". Finally, return the "ans" array.

// Note: nums is an array of distinct integers from 0 to nums.length - 1

// Input Format

// First line contains an integer number n representing size of array.

// Second line contains n integer inputs representing elements of array.

// Constraints

// 1 <= nums.length <= 1000

// 0 <= nums[i] < nums.length

// The elements in nums are distinct
// Output Format

// Print ans array as an output.

// Sample Input 0

// 6
// 0 2 1 5 3 4
// Sample Output 0

// 0 1 2 4 5 3
// Explanation 0

// The array ans is built as follows: ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]] = [nums[0], nums[2], nums[1], nums[5], nums[3], nums[4]] = [0,1,2,4,5,3]


import java.util.*;

public class Q7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the array
        int n = scanner.nextInt();
        int[] nums = new int[n];
        int[] ans = new int[n];

        // Read the elements of the nums array
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        // Construct the ans array
        for (int i = 0; i < n; i++) {
            ans[i] = nums[nums[i]];
        }

        // Print the ans array elements
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}