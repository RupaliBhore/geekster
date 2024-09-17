// // Print First NON MATCHING NUMBER

import java.util.*;

public class Q5 {

   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Read the size of the arrays
        int n = scanner.nextInt();     
        // Initialize array1 of size n
        int[] arr1 = new int[n];            //5
        // Read elements into array1
        for (int i = 0; i < n; i++) {        
            arr1[i] = scanner.nextInt(); // 2,3,4,5,6,
        }

        // Initialize array2 of size n
        int[] arr2 = new int[n];            // 7

        // Read elements into array2
        for (int i = 0; i < n; i++) {
            arr2[i] = scanner.nextInt(); // 2,3,1,5,6,6,7
        }

        // Find the first non-matching index
        int index = -1;
        for (int i = 0; i < n; i++) {
            if (arr1[i] != arr2[i]) { 
                index = i;
                break;
            }
        }
        // Output the result
        System.out.println(index);

        scanner.close();
    }
}



// Time Complexity: O(n) due to a single pass through the arrays to find the first non-matching index.
// Space Complexity: O(n) because of the storage required for two arrays, each of size n.







// Declare the first array of size n that stores values of int data-type. Then take n integer inputs and store them in the array one by one.

// Then again declare a second array of size n that stores values of int data-type. Then take n integer inputs and store them in the array one by one. Then print the index at which you find the first non matching number in the array.
// Input Format
// First line consists Value N representing Size of array
// Second Line consists of N Integer values Representing the values of Arr1
// Third Again** N** int values representaing the value of arr2
// Constraints
// 1 <= N <= 10^9
// Output Format
// Returns an index of arr2 where you find first non matching integer value
// Sample Input 0
// 5
// 10
// 20
// 30
// 40
// 50

// 10
// 20
// 23
// 40
// 52
// Sample Output 0
// 2
// Explanation 0
// First NON MATCHING INT value is 23 that is on idx 2 of arr2
