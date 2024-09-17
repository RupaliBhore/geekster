// // Print first index of x in array


// You have given array of n elements and key . you need to find the first index in the array . If key does not exist then return -1.

// Input Format

// First Line consists of an integer n.

// Second Line consists of n integers representing an array.

// Third line consists of a key.

// Constraints

// 1 < n <= 10^8
// Output Format

// Returns an index as integer assuming 0 based indexing.

// Sample Input 0

// 5
// 1 2 3 3 3
// 3
// Sample Output 0

// 2
// Explanation 0

// the first index key is occuring at index 2


import java.util.*;

public class Q3 {

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the array
        int n = scanner.nextInt();

        // Initialize array of size n
        int[] arr = new int[n];

        // Read elements into the array
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Read the key to search for
        int key = scanner.nextInt();

        // Find the first index of the key in the array
        int index = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                index = i;
                break;
            }
        }

        // Output the result
        System.out.println(index);

        scanner.close();
    }
}