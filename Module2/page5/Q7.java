// // HW_Find Pair\
// The given array is not sorted. The given array may or may not contain duplicate elements. Then take the target as an integer input. Return Pair of target sum in which all pairs are unique.

// Input Format

// An integer number N representing size of array

// N integer number representing elements of array

// An integer number Target

// Constraints

// 1 <= N <= 10^4

// -10^6 <= array[index] <= 10^6

// -10^6 <= Target <= 10^6
// Output Format

// Return required pair in different lines.

// Sample Input 0

// 7
// 1 2 3 4 3 2 1
// 6
// Sample Output 0

// 2 4
// 3 3
// Explanation 0

// 2 + 4 = 6 3 + 3 = 6 Note: we need only unique pairs

import java.util.*;

public class Q7 {

      public static Set<String> findUniquePairs(int[] arr, int target) {
        Set<String> uniquePairs = new HashSet<>();
        
        // Step 1: Sort the array
        Arrays.sort(arr);
        
        int left = 0;
        int right = arr.length - 1;
        
        while (left < right) {
            int sum = arr[left] + arr[right];
            
            if (sum == target) {
                // Create a sorted pair string to ensure uniqueness
                String pair = arr[left] < arr[right] ? arr[left] + " " + arr[right] : arr[right] + " " + arr[left];
                uniquePairs.add(pair);
                
                // Skip duplicates
                while (left < right && arr[left] == arr[left + 1]) {
                    left++;
                }
                while (left < right && arr[right] == arr[right - 1]) {
                    right--;
                }
                
                left++;
                right--;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        
        return uniquePairs;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt(); // Read size of the array
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt(); // Read array elements
        }
        
        int target = scanner.nextInt(); // Read the target sum
        
        Set<String> result = findUniquePairs(arr, target);
        
        for (String pair : result) {
            System.out.println(pair);
        }
        
        scanner.close();
    }
}
