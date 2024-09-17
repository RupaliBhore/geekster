// Print Array element if index divisible by 3
import java.util.*;

public class Q3 {

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

        // Print elements of the array where index is divisible by 3
        for (int i = 0; i < N; i++) {
            if (i % 3 == 0) {
                System.out.print(arr[i] + " ");
            }
        }

        scanner.close();
    }
}


// Time Complexity:-O(N) because reading N integers into the array and printing elements with indices divisible by 3 each require iterating through the array.
// Space complexity:-O(N) due to the storage of the array of size N.


// Question:-
// Take n as an integer input. Declare an array of size n that stores value of int data-type. Then take n integer inputs and store them in the array one by one.

// Then print all the elements of the array where the index is divisible by 3

// Input Format

// First line contains integer N as size of array.

// Second line contains N integers representing size of array.

// Constraints

// 1 <= n <= 1000000
// 1 <= arr[i] <= 1000000
// Output Format

// Print all the elements of the array where the index is divisible by 3.

// Sample Input 0

// 7
// 1
// 2
// 3
// 4
// 5
// 6
// 7
// Sample Output 0

// 1 4 7 
// Explanation 0

// index 0 , 3 and 6 are the only multiple of three. therefore we have printed value at this index.

