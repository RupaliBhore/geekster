// // Print Alternate


// Given an integer n, the task is to define an array arr[] of size n & Print only the alternate elements staring from 0th index i.e,

// print elements at index ->0th, 2nd, 4th, 6th...... and so on till the end.

// Input Format

// An integer n, which is the size of the array arr[]
// n integers each in a new line, depicting the elements of the array arr[]
// Constraints

// 0 <= arr.length <= 1000
// 0 <= arr[i] <= 1000
// Output Format

// Multiple line of outputs

// Alternate elements of the array with each in new line
// Sample Input 0

// 5
// 2
// 1
// 4
// 3
// 5
// Sample Output 0

// 2
// 4
// 5
// Explanation 0

// Since the array is of length 5 and it's elements are {2, 1, 4, 3, 5} therefore, output will be :- 2 4 5 ,with each integer in one line


import java.util.*;

public class Q8 {

      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the size of the array
        int n = scanner.nextInt();
        
        // Initialize the array
        int[] arr = new int[n];
        
        // Read the array elements
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        // Print alternate elements starting from index 0
        for (int i = 0; i < n; i += 2) {
            System.out.println(arr[i]);
        }
        
        scanner.close();
    }
}