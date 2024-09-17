// // HW_Print Array Elements where index is not divisible by 4 inline
import java.util.*;
public class Q10 {
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

        // Print elements where index is not divisible by 4
        for (int i = 0; i < n; i++) {
            if (i % 4 != 0) {
                System.out.print(arr[i] + " ");
            }
        }

        scanner.close();
    }
}

// Time Complexity:- O(N) because reading N elements into the array and printing elements with indices not divisible by 4 each require iterating through the array.
// Space complexity:- O(N) due to the storage of the array of size N.




// Question:-
// Take n as an integer input. Declare an array of size n that stores value of int data-type. Then take n integer inputs and store them in the array one by one.

// Then print all the elements of the array where the index is not divisible by 4.

// Input Format

// n=4 10 20 30 40

// Constraints

// NA

// Output Format

// 10 40

// Sample Input 0

// 5
// 1 2 3 7 10
// Sample Output 0

// 2 3 7
// Sample Input 1

// 6
// 11 23 32 71 100 200
// Sample Output 1

// 23 32 71 200

