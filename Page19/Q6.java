// // HW_Print Alternate array elements from 1st index

import java.util.*;

public class Q6 {
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the array
        int N = scanner.nextInt();

        // Initialize array of size N
        int[] arr = new int[N];

        // Read elements into the array
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        // Print alternate elements starting from index 1
        for (int i = 1; i < N; i += 2) {
            System.out.print(arr[i]+" ");
        }

        scanner.close();
    }
}


// Time Complexity:-O(N) because reading N elements into the array and printing every alternate element starting from index 1 each require iterating through the array.
// Space complexity:-O(N) due to the storage of the array of size N.




// Question:-
// Take n as an integer input. Declare an array of size n that stores value of int data-type. Then take n integer inputs and store them in the array one by one.

// Then print the alternate elements of the array starting from the 1st index.

// Input Format

// First line contains integer N as size of array.

// Second line contains N integer representing elements of array.
// Constraints
// 0 <= N <= 10^4
// 0 <= arr[i] <= 10^4
// Output Format
// Print alternate elements of array form Ist index.
// Sample Input 0
// 5
// 10
// 20
// 30
// 40
// 50
// Sample Output 0
// 20 40 
