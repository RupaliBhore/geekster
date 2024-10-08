// HW_Majority Element 5

// Given an array nums of size n, return the majority element. Note : The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

// Input Format

// The First line will contain integer N representing the size of array.

// The Second line will contain N integer representing number of element an array

// Constraints

// 1 <= n <= 5 * 10^4

// -10^9 <= nums[i] <= 10^9

// Output Format

// return the element which appear more than [n/2] times.

// Sample Input 0

// 3
// 3 2 3
// Sample Output 0

// 3



import java.util.*;

public class Q8 {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the size of the array
        int n = scanner.nextInt();
        int[] nums = new int[n];
        
        // Read the elements of the array
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        
        // Find the majority element
        int majorityElement = findMajorityElement(nums);
        System.out.println(majorityElement);
        
        scanner.close();
    }
    
    private static int findMajorityElement(int[] nums) {
        int candidate = nums[0];
        int count = 1;
        
        // First pass: Find the candidate for majority element
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == candidate) {
                count++;
            } else {
                count--;
            }
            
            if (count == 0) {
                candidate = nums[i];
                count = 1;
            }
        }
        
        // Since the problem guarantees that a majority element always exists,
        // we don't need to verify if the candidate is the majority element.
        return candidate;
    }
}
//Finded 
// Time Complexity: O(n), where n is the number of elements in the array.
// Space Complexity: O(1), since we are using a constant amount of space.