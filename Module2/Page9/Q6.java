// HW_Interchange the Row

// Interchange elements of the first and last row of a matrix.

// Input Format

// First line contains, M and N depicting the size of matrix.

// Second line M * N Integer values, depicting all the elements of matrix.

// Constraints

// 1 <= M,N <= 1000
// -1000 <= mat[i][j] <= 1000
// Output Format

// Print the matrix after interchanging the row.

// Sample Input 0

// 3
// 3
// 8 1 0
// 9 9 6
// 6 6 4
// Sample Output 0

// 6 6 4
// 9 9 6
// 8 1 0


import java.util.*;

public class Q6 {

      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read matrix dimensions
        int M = scanner.nextInt();
        int N = scanner.nextInt();

        // Initialize the matrix
        int[][] matrix = new int[M][N];

        // Read matrix elements
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Close the scanner
        scanner.close();

        // Swap the first and last rows
        int[] temp = matrix[0];
        matrix[0] = matrix[M - 1];
        matrix[M - 1] = temp;

        // Print the matrix after swapping
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}