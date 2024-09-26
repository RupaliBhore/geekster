// // HW_Remove elements 1
// Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The relative order of the elements may be changed.

// Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums. More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.

// Return k after placing the final result in the first k slots of nums.

// Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.

// Input Format

// First line of input contains integer N as size of array.

// Second line of input contains N integers representing elements of array.

// Third line of input contains integer val.

// Constraints

// 0 <= N <= 100
    
// 0 <= nums[i] <= 50
    
// 0 <= val <= 100
// Output Format

// Return the value of k.

// Sample Input 0

// 4
// 2 3 2 3 
// 3
// Sample Output 0

// 2
// Explanation 0

// Your function should return k = 2, with the first two elements of nums being 2. It does not matter what you leave beyond the returned k (hence they are underscores).


import java.util.*;

public class Q10 {

    public static int removeElement(int[] nums, int val) {
        int k = 0; // Initialize k to 0
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i]; // Place the non-matching element at index k
                k++; // Increment k
            }
        }
        
        return k; // Return the value of k
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the array
        int n = scanner.nextInt();

        // Declare and initialize the array
        int[] nums = new int[n];

        // Read the array elements
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        // Read the value to be removed
        int val = scanner.nextInt();

        // Remove the occurrences of the value and get the new size
        int k = removeElement(nums, val);

        // Print the value of k
        System.out.println(k);

        scanner.close();
    }
}