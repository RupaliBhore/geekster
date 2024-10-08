// Two Sum 14

// Given an array of integers nums and an integer target, print indices of the two numbers such that they add up to target.

// You may assume that each input would have exactly one solution, and you may not use the same element twice.

// Input Format

// first line contain N,K no of elements in array and target element, second line contain array elements

// Constraints

// 1 <= N,K <= 10^5
// Output Format

// Print the indices in ascending order

// Sample Input 0

// 4 9
// 2 7 11 15
// Sample Output 0

// 0 1
// Explanation 0

// 2+7 = 9, so indices are 0,1.


import java.util.*;

public class Q10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the size of the array and the target value
        int n = scanner.nextInt();
        int target = scanner.nextInt();
        
        // Read the array elements
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        
        // HashMap to store the complement and its index
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            int complement = target - nums[i];
            // Check if the complement exists in the map
            if (map.containsKey(complement)) {
                // Print the indices in ascending order
                System.out.println(map.get(complement) + " " + i);
                return;
            }
            // Store the number and its index in the map
            map.put(nums[i], i);
        }
        
        // If no solution is found, you can print a message or handle accordingly
        System.out.println("No two sum solution");
        
        scanner.close();
    }
}
//Finded 
// Time Complexity:The time complexity is O(N), where N is the number of elements in the array, as each element is processed once.
// Space Complexity:The space complexity is O(N) due to the storage of elements in the HashMap.




