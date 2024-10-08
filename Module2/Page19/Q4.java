// subtract numbers 1

// You are given a non-negative integer array nums. In one operation, you must:

// Choose a positive integer x such that x is less than or equal to the smallest non-zero element in nums.
// Subtract x from every positive element in nums.
// Return the minimum number of operations to make every element in nums equal to .

// Input Format

// Single Integer N .
// N Integers seperated with single space.
// Constraints

// 1 <= nums.length <= 10^5
// 0 <= nums[i] <= 10^5
// Output Format

// Single Integer representing steps.

// Sample Input 0

// 5
// 1 5 0 3 5
// Sample Output 0

// 3

// Explanation 0

// In the first operation, choose x = 1. Now, nums = [0,4,0,2,4].
// In the second operation, choose x = 2. Now, nums = [0,2,0,0,2].
// In the third operation, choose x = 2. Now, nums = [0,0,0,0,0].






import java.util.*;

public class Q4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        HashSet<Integer> hs = new HashSet<>();
        while(n-- > 0) {
            int x = scn.nextInt();
            if(x != 0) {
                hs.add(x);
            }
        }
        System.out.println(hs.size());
    }
}
//Discussed aman sir
// Time complexity: O(n), because we iterate through the array once and insert each element into the HashSet in average O(1) time.

// Space complexity: O(n), since the HashSet stores up to n unique non-zero integers.









// import java.io.*;
// import java.util.*;

// public class Q4 {

//     public static int minOperations(int[] nums) {
//         Set<Integer> uniquePositive = new HashSet<>();
        
//         // Collect all unique positive numbers
//         for (int num : nums) {
//             if (num > 0) {
//                 uniquePositive.add(num);
//             }
//         }s
        
//         // The number of unique positive numbers is the result
//         return uniquePositive.size();
//     }

//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
        
//         // Input size of the array
//         int n = scn.nextInt();
        
//         // Input array elements
//         int[] nums = new int[n];
//         for (int i = 0; i < n; i++) {
//             nums[i] = scn.nextInt();
//         }
        
//         // Output the minimum number of operations
//         System.out.println(minOperations(nums));
        
//         scn.close();
//     }
// }
// //Finded 

// // Time Complexity:
// // O(n): Iterating over the array to collect unique positive elements.
// // Space Complexity:
// // O(m): Storing the unique positive integers, where m is the number of distinct positive integers.