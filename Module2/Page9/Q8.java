// // HW_Print The Row With Maximum Number of 1’s
// Given a matrix, print the row that has the maximum number of 1’s in it. Matrix is not sorted row or column wise.

// If the given matrix is zero matrix than print -1.

// Note:-If their are multiples row with same number of 1's print the first one

// Input Format

// First line contains, m and n depicting the size of first matrix.
// m*n Integer values, depicting all the elements of matrix.
// Constraints

// 1<=m and n<=1000

// 0<=mat[i][j]<=1

// Output Format

// Print that row which has maximum 1's.

// Sample Input 0

// 3
// 3
// 1 1 0
// 0 0 1
// 1 1 1
// Sample Output 0

// 1 1 1 


import java.util.*;

public class Q8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read matrix dimensions
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        // Initialize the matrix
        int[][] matrix = new int[m][n];

        // Read matrix elements
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Close the scanner
        scanner.close();

        // Variables to track the row with maximum 1's
        int maxRowIndex = -1;
        int maxOnesCount = 0;

        // Iterate through each row to find the one with the maximum number of 1's
        for (int i = 0; i < m; i++) {
            int countOnes = 0;
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 1) {
                    countOnes++;
                }
            }
            if (countOnes > maxOnesCount) {
                maxOnesCount = countOnes;
                maxRowIndex = i;
            }
        }

        // Print the row with maximum number of 1's or -1 if no 1's are present
        if (maxRowIndex == -1) {
            System.out.println(-1);
        } else {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[maxRowIndex][j] + " ");
            }
            System.out.println(); // for new line after printing the row
        }
    }
}