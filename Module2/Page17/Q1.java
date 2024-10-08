// // Max Number of K-Sum Pairs

// You are given an integer array nums and an integer k.

// In one operation, you can pick two numbers from the array whose sum equals k and remove them from the array.

// Return the maximum number of operations you can perform on the array.

// Input Format

// In the first line, an integer array nums is given. In the second line, an integer k is given.

// Constraints

// 1 <= nums.length <= 105 1 <= nums[i] <= 109 1 <= k <= 109

// Output Format

// Returns an integer value

// Sample Input 0

// 4
// 1 2 3 4
// 5
// Sample Output 0

// 2
// Explanation 0

// Starting with nums = [1,2,3,4]: - Remove numbers 1 and 4, then nums = [2,3] - Remove numbers 2 and 3, then nums = [] There are no more pairs that sum up to 5, hence a total of 2 operations.



import java.util.HashMap;
import java.util.Scanner;

public class Q1 {
    public static int maxOperations(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        // Traverse through the array
        for (int num : nums) {
            int complement = k - num;

            // Check if complement exists in the map
            if (map.getOrDefault(complement, 0) > 0) {
                // If complement exists, we found a valid pair
                count++;
                // Decrement the frequency of the complement
                map.put(complement, map.get(complement) - 1);
            } else {
                // Otherwise, add the current number to the map
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input the array size
        int n = sc.nextInt();
        int[] nums = new int[n];
        
        // Input the array elements
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Input the integer k
        int k = sc.nextInt();
        
        // Calculate and print the result
        int result = maxOperations(nums, k);
        System.out.println(result);
        
        sc.close();
    }
}
//Finded