// hw_Print last index of x in array
// You have given an array of integers of length n and a key. you need to find the last index of the key in the given array . If not present, then return -1.

// Input Format

// First line consists of an integer n.

// Second line consists of an array of integers of size n.

// Third line consists an integer key.

// Constraints

// 1 < n <= 10^8
// Output Format

// Returns an integer as index.

// Sample Input 0

// 5
// 1 2 3 4 4
// 4
// Sample Output 0

// 4
// Explanation 0

//  the last index of the key is 4



import java.util.*;

public class Q10 {

      public static int findLastIndex(int[] arr, int key) {
        // Traverse the array from the end to the beginning
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == key) {
                return i; // Return the last index where the key is found
            }
        }
        // If key is not found, return -1
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input the size of the array
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        // Input the array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Input the key to be searched
        int key = sc.nextInt();
        
        // Find and print the last index of the key
        System.out.println(findLastIndex(arr, key));
    }
}
//fINDED
//Time Complexity: O(n) where n is the size of the array, since we may need to traverse the entire array to find the last occurrence of the key.
// Space Complexity: O(1) since we are only using a fixed amount of additional space regardless of the input size.