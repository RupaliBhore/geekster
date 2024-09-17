// // HW_Print Even Array Elements inline

import java.util.*;

public class Q9 {

   
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

        // Print even elements
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }

        scanner.close();
    }
}




// Time Complexity:-O(N) because both reading N elements into the array and checking each element to print even numbers involve iterating through the array.


// Space complexity:- O(N) due to the storage of the array of size N.




// Question:-
// Take n as an integer input. Declare an array of size n that stores value of int data-type. Then take n integer inputs and store them in the array one by one.

// Then print all the elements of the array from the starting which are even.

// Input Format

// n=5 10 21 31 42 50

// Constraints

// NA

// Output Format

// 10 42 50

// Sample Input 0

// 6
// 10
// 11
// 13
// 14
// 15
// 19
// Sample Output 0

// 10 14