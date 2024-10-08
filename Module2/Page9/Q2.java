// // Convert 1-D Array to 2-D Array
// Take an array of size N as input, representing a 1-D array.

// There are many possible factors of N, for eg:- p * q = N.

// Now take p and q as input and print the 2-D array with dimensions as p*q.

// Note: It is guaranteed that a 2-D array will be formed

// NOTE:- After answering the question, attempt the related question in the linked resource to improve your understanding of this question . Click here

// Input Format

// First line contains an integer N, which is the size of the array.

// Second line contains N integers, depicting the elements of the array.

// Third line contains Integers p and q representing the dimensions of 2-D array.

// Constraints

// 1 <= N <= 10^6
// 0 <= arr[i] <= 1000
// 1 <= p , q <= 10^3
// Output Format

// Return a 2-D array of size p * q.

// Sample Input 0

// 9
// 1 2 3 4 5 6 7 8 9
// 3 3
// Sample Output 0

// 1 2 3 
// 4 5 6 
// 7 8 9 
// Sample Input 1

// 6
// 1 2 3 4 5 6
// 3 2
// Sample Output 1

// 1 2 
// 3 4 
// 5 6 


// Finded

import java.util.*;

public class Q2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the array
        int N = scanner.nextInt();

        // Read the 1-D array elements
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }

        // Read dimensions of the 2-D array
        int p = scanner.nextInt();
        int q = scanner.nextInt();

        // Initialize the 2-D array
        int[][] matrix = new int[p][q];

        // Fill the 2-D array with elements from the 1-D array
        int index = 0;
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < q; j++) {
                matrix[i][j] = array[index++];
            }
        }

        // Print the 2-D array
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < q; j++) {
                System.out.print(matrix[i][j]);
                if (j < q - 1) {
                    System.out.print(" "); // Space between elements
                }
            }
            System.out.println(); // New line after each row
        }

        scanner.close();
    }
}