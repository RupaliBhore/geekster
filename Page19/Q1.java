// // Print Alternate Array Elements Linewise

import java.util.*;

public class Q1 {

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
        // Print alternate elements starting from index 0
        for (int i = 0; i < N; i += 2) {
            System.out.println(arr[i]);
        }
        scanner.close();
    }
}

// Time Complexity:-O(N) because both reading N integers into the array and printing every alternate element involve iterating through the array.
// Space complexity:- O(N) due to the storage of the array of size 𝑁.









// Question:-
// Take n as an integer input. Declare an array of size n that stores value of int data-type. Then take n integer inputs and store them in the array one by one.
// Then print the alternate elements of the array starting from the 0th index
// Input Format
// First line contains integer N as size of array.
// Second line contains N integers representing size of array.
// Constraints
// 1 <= n <= 10^6
// Output Format
// Print the alternate array elements.
// Sample Input 0
// 10
// 1
// 2
// 3
// 4
// 5
// 6
// 7
// 8
// 9
// 10
// Sample Output 0
// 1
// 3
// 5
// 7
// 9
// Explanation 0

// printed the alternate element of array starting from 0 till n. therefore printed arr[0] = 1 arr[2] = 3 arr[4] = 5 arr[6] = 7 arr[8] = 9



