// // HW_Print the column wise with given condition

// Print the matrix column wise starting from the 0th column such that the even column is traversed from top to bottom and odd column is traversed from bottom to top.

// Input Format

// First line contains M and N depicting the size of matrix.

// Second line contains M * N Integer values, depicting all the elements of matrix.

// Constraints

// 1 <= M , N <=1000
// -1000 <= mat[i][j] <= 1000
// Output Format

// Print the matrix.

// Sample Input 0

// 3
// 3
// 3 1 2 
// 3 0 2 
// 4 5 4 
// Sample Output 0

// 3 3 4 
// 5 0 1 
// 2 2 4 
// Explanation 0

// Print the matrix according to given conditions.




import java.util.*;

public class Q1 {

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read dimensions of the matrix
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

        // Traverse and print the matrix column-wise with the specified rules
        for (int j = 0; j < N; j++) {
            if (j % 2 == 0) {
                // Even column: top to bottom
                for (int i = 0; i < M; i++) {
                    System.out.print(matrix[i][j]);
                    if (i < M - 1 || j < N - 1) {
                        System.out.print(" "); // Space between elements
                    }
                }
            } else {
                // Odd column: bottom to top
                for (int i = M - 1; i >= 0; i--) {
                    System.out.print(matrix[i][j]);
                    if (i > 0 || j < N - 1) {
                        System.out.print(" "); // Space between elements
                    }
                }
            }
            System.out.println(); // New line after each column
        }

        scanner.close();
    }
}
