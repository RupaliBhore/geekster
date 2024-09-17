// // HW_Print indexes where array elements are odd
import java.util.*;

public class Q8 {

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

        // Print indexes where elements are odd
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }
}

// Time Complexity:-O(N) because reading N elements into the array and printing every alternate element in reverse order each require iterating through the array.

// Space complexity:-O(N) due to the storage of the array of size N.





// Question:-
// Take n as an integer input. Declare an array of size n that stores value of int data-type. Then take n integer inputs and store them in the array one by one.

// Then print all the indexes of the array from the starting where the elements are odd

// Input Format

// A number n representing length of array. then n elements of array.

// Constraints

// 1<=n<=1000000 1<=arr[index]<=1000000

// Output Format

// See the Description

// Sample Input 0

// 5
// 1
// 2
// 3
// 4
// 5
// Sample Output 0

// 0 2 4 
// Explanation 0

// As value 1, 3, 5 are odd. therefore we have printed their index values.
