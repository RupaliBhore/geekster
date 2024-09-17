// // HW_Print Alternate array elements in reverse inline
import java.util.*;

public class Q7 {

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

        // Print alternate elements in reverse order
        for (int i = n - 1; i >= 0; i -= 2) {
            System.out.print(arr[i] + " ");
        }

        scanner.close();
    }
}


// Time Complexity:- O(N) because reading N elements into the array and printing every alternate element in reverse order each require iterating through the array.
// Space complexity:-O(N) due to the storage of the array of size N.








// Question:-

// Take n as an integer input. Declare an array of size n that stores value of int data-type. Then take n integer inputs and store them in the array one by one.

// Then print all the alternate elements of the array from the last index till the 0th index such that each element is printed one by one in the same line.

// Input Format

// n=6 10 20 30 40 50 60

// Constraints

// NA

// Output Format

// 60 40 20