// // HW_Find Difference 1

// Take the array and k as an integer input. Given condition is that the array contains all the unique elements. Then take the sum as an integer input and print all the permutations of the pairs whose absolute difference is k.

// Input Format

// First line contains an integer number n representing size of array.

// Second line contains n integer numbers representing elements of the array.

// Third line contains an integer number k

// Constraints

// 1 <= n <= 100000

// 0 <= array[index] <= 100000

// 0 <= k <= 1000000
// Output Format

// Print the required permutation in different line.

// Sample Input 0

// 5
// 1 2 3 4 5
// 3
// Sample Output 0

// 1 4
// 2 5
// 4 1
// 5 2
// Explanation 0

// |arr[0]-arr[3]| = |1-4| = 3

// |arr[1]-arr[4]| = |2-5| = 3

// |arr[3]-arr[1]| = |4-1| = 3

// |arr[4]-arr[1]| = |5-2| = 3

import java.util.*;

public class Q8 {
  public static void findPairsWithDifference(int[] nums, int k) {
        Set<Integer> numSet = new HashSet<>();
        
        // Add all elements to the HashSet
        for (int num : nums) {
            numSet.add(num);
        }
        
        List<String> pairs = new ArrayList<>();
        Set<String> seenPairs = new HashSet<>();
        
        // Find pairs
        for (int num : nums) {
            // Check for num + k
            if (numSet.contains(num + k)) {
                String pair1 = num + " " + (num + k);
                String pair2 = (num + k) + " " + num;
                if (!seenPairs.contains(pair1)) {
                    pairs.add(pair1);
                    seenPairs.add(pair1);
                }
                if (!seenPairs.contains(pair2)) {
                    pairs.add(pair2);
                    seenPairs.add(pair2);
                }
            }
            // Check for num - k
            if (numSet.contains(num - k)) {
                String pair1 = (num - k) + " " + num;
                String pair2 = num + " " + (num - k);
                if (!seenPairs.contains(pair1)) {
                    pairs.add(pair1);
                    seenPairs.add(pair1);
                }
                if (!seenPairs.contains(pair2)) {
                    pairs.add(pair2);
                    seenPairs.add(pair2);
                }
            }
        }
        
        // Sort pairs to ensure consistent output order
        pairs.sort((a, b) -> {
            String[] partsA = a.split(" ");
            String[] partsB = b.split(" ");
            if (partsA[0].equals(partsB[0])) {
                return Integer.compare(Integer.parseInt(partsA[1]), Integer.parseInt(partsB[1]));
            }
            return Integer.compare(Integer.parseInt(partsA[0]), Integer.parseInt(partsB[0]));
        });
        
        // Print pairs
        for (String pair : pairs) {
            System.out.println(pair);
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the size of the array
        int n = scanner.nextInt();
        int[] nums = new int[n];
        
        // Read the elements of the array
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        
        // Read the integer k
        int k = scanner.nextInt();
        
        // Find and print pairs with the given difference k
        findPairsWithDifference(nums, k);
        
        scanner.close();
    }
}