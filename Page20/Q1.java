// // HW_Print indexes where array elements are even

import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the array
        int n = scanner.nextInt();

        // Initialize array of size n
        int[] arr = new int[n];

        // Read elements into the array
        for (int i = 0; i < n; i++) { //n=10 // 0,1,2,3,4,5,6,7,8,9
            arr[i] = scanner.nextInt(); // 0,1,2,3,4,5,6,7,8,9
        }

        // Print 1-based indexes where elements are even
        for (int i = 0; i < n; i++) { // 0,1,2,3,4,5,6,7,8,9
            if (arr[i] % 2 == 0) { //2 //4 //6 //8 
                System.out.print(( i) + " "); // +1 because indexes are 1-based
            }
        }

        scanner.close();
    }
}
// Time Complexity: O(n) because it involves two separate linear passes over the array.
// Space Complexity: O(n) due to storing the array of size n.




// Take n as an integer input. Declare an array of size n that stores value of int data-type. Then take n integer inputs and store them in the array one by one.

// Then print all the indexes of the array from the starting where the elements are even.
// Input Format
// 5 11 12 15 14 22

// Constraints
// NA
// Output Format
// 2 4 5
// Sample Input 0
// 5
// 11
// 12
// 13
// 14
// 15
// Sample Output 0

// 1 3