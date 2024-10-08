// // HW_Traverse Rows with given condition
// Imagine you're a computer programmer tasked with designing a program to print out a matrix of size M * N. The twist is that the program should print out the matrix row-wise, with even rows traversed from left to right and odd rows traversed from right to left.

// Can you write the code to make this happen?

// Input Format

// First line contins M and N as integers.

// Second line contains M * N number of elements representing elemnts of matrix.

// Constraints

// 1 <= M , N <= 1000

// -1000 <= mat[i][j] <= 1000
// Output Format

// Print the Matrix with condition.

// Sample Input 0

// 3 3
// 1 2 3 
// 4 5 6
// 7 8 9
// Sample Output 0

// 1 2 3
// 6 5 4
// 7 8 9

import java.util.*;

public class Q9 {

   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the dimensions of the matrix
        int M = scanner.nextInt();
        int N = scanner.nextInt();

        // Initialize the matrix
        int[][] matrix = new int[M][N];

        // Read the matrix elements
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Print the matrix with the required traversal
        for (int i = 0; i < M; i++) {
            if (i % 2 == 0) {
                // Even row: left to right
                for (int j = 0; j < N; j++) {
                    System.out.print(matrix[i][j]);
                    if (j < N - 1) {
                        System.out.print(" "); // Print space between elements
                    }
                }
            } else {
                // Odd row: right to left
                for (int j = N - 1; j >= 0; j--) {
                    System.out.print(matrix[i][j]);
                    if (j > 0) {
                        System.out.print(" "); // Print space between elements
                    }
                }
            }
            System.out.println(); // Move to the next line after printing a row
        }

        scanner.close();
    }
}