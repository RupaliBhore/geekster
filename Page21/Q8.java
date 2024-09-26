// // HW_Print Sum of Elements Except Itself

// Declare the first array of size n that stores values of int data-type. Then take n integer inputs and store them in the array one by one.

// For each index print the sum of all the elements except the element present at that index..

// Input Format

// First line consists N as Size of Array.

// Second line consists N Int value as Arr[i] values

// Constraints

// NA

// Output Format

// Print value of sum of array except that particular idx

// Sample Input 0

// 4
// 2
// 7
// 8
// 9
// Sample Output 0

// 24
// 19
// 18
// 17
// Explanation 0

// Sum of Arrays Element is 26

// 26-2=24

// 26-7=19

// 26-8=18

// 26-9=17

import java.util.*;

public class Q8 {

     public static void printSumWithoutIndex(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                if (j != i) {
                    sum += arr[j];
                }
            }
            System.out.println(sum);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the array
        int n = scanner.nextInt();

        // Declare and initialize the array
        int[] arr = new int[n];

        // Read the array elements
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Print the sum of all elements except the element at each index
        printSumWithoutIndex(arr, n);

        scanner.close();
    }
}