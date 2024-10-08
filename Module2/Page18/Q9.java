// Maximum Product of Two Elements in an Array



// Given the array of integers nums, you will choose two different indices i and j of that array. Return the maximum value of (nums[i]-1)*(nums[j]-1).

// Input Format

// first line contains an integer n representing size of the array.

// next n integers represents the elements of the array.

// Constraints

// 2 <= nums.length <= 500

// 1 <= nums[i] <= 10^3

// Output Format

// print the maximum product

// Sample Input 0

// 4
// 3
// 4
// 5
// 2
// Sample Output 0

// 12
// Explanation 0

// If you choose the indices i=1 and j=2 (indexed from 0), you will get the maximum value, that is, (nums[1]-1)(nums[2]-1) = (4-1)(5-1) = 3*4 = 12.


import java.util.Scanner;

public class Q9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input: First integer is the size of the array
        int n = sc.nextInt();
        
        // Initialize the nums array
        int[] nums = new int[n];
        
        // Read the elements of the array
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        
        // Initialize max1 and max2 to minimum possible values
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        // Find the two largest numbers in the array
        for (int num : nums) {
            if (num > max1) {
                max2 = max1;  // Update second largest
                max1 = num;   // Update largest
            } else if (num > max2) {
                max2 = num;   // Update second largest only
            }
        }
        
        // Calculate the maximum product
        int maxProduct = (max1 - 1) * (max2 - 1);
        
        // Output the maximum product
        System.out.println(maxProduct);
        
        sc.close();
    }
}
//finded