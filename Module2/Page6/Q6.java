// // HW_Prefix Small from Left

// Make a prefix array of size N such that at the kth index of the prefix array store the smallest element from the left till the kth index of the given array.

// Input Format

// First line contains integer N representing soze of array.

// Second line contains N integers as array elements.

// Constraints

// 1 <= N <= 10^4

// -10^4 <= A[i] <= 10^4
// Output Format

// Return the prefix array.

// Sample Input 0

// 7
// 1
// 88
// 3
// 2
// 16
// 10
// 9
// Sample Output 0

// 1
// 1
// 1
// 1
// 1
// 1
// 1


import java.util.*;

public class Q6 {

   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the array
        int n = scanner.nextInt();
        int[] nums = new int[n];

        // Read the elements of the array
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        // Compute the prefix array
        int[] prefix = computePrefixMinArray(nums);

        // Print the prefix array
        for (int i = 0; i < prefix.length; i++) {
            System.out.println(prefix[i] + " ");
        }
        System.out.println(); // for newline

        scanner.close();
    }

    public static int[] computePrefixMinArray(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];

        // Initialize the first element
        prefix[0] = nums[0];

        // Fill the prefix array with minimum values
        for (int i = 1; i < n; i++) {
            prefix[i] = Math.min(prefix[i - 1], nums[i]);
        }

        return prefix;
    }
}