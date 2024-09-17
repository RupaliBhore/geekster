// // Print Array Elements Reverse linewise
import java.util.*;

public class Q2 {

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the array
        int N = scanner.nextInt();

        // Initialize an array of size N
        int[] arr = new int[N];

        // Read N integers into the array
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        // Print elements of the array from last index to first index
        for (int i = N - 1; i >= 0; i--) {
            System.out.print(arr[i]+ " ");
        }

        scanner.close();
    }
}


// Time Complexity:-because both reading N integers into the array and printing them in reverse order each require a single pass through the array.
// Space complexity:-  O(N) due to the storage of the array of size N.

















// Question:-
// Take N as an integer input. Declare an array of size N that stores value of int data-type. Then take N integer inputs and store them in the array one by one.

// Then print the elements of the array from the last index till the 0th index such that each element is printed one by one in each line

// Input Format

// First line contains integer N as size of array.

// Second line contains N integers representing size of array.

// Constraints

// 1 <= N <= 1000000
// 1 <= arr[i] <= 1000000
// Output Format

// Print the elements of the array from the last index till the 0th index

// Sample Input 0

// 5
// 1
// 2
// 3
// 4
// 5
// Sample Output 0

// 5 4 3 2 1
// Explanation 0

// we print the last element first and then second last element, then last third element and so on.. till our first index in single line.

