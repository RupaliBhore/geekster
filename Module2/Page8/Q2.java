// // HW_Print Alternate Column wise

// Print the matrix column wise such that we print the alternate columns of the matrix starting from the first column.

// Input Format

// First line contains, m and n depicting the size of first matrix.
// m*n Integer values, depicting all the elements of matrix.
// Constraints

// 1 <= m1 and n1 <=1000
// -1000<=mat[i][j]<=1000
// Output Format

// Print the matrix column wise alternate

// Sample Input 0

// 3
// 3
// 49 22 16
// 71 78 23
// 89 24 61
// Sample Output 0

// 49 71 89   
// 16 23 61   
// Explanation 0

// we will print column 1 and 3 becuase we skip 2. And then print them as rows.


import java.util.*;

public class Q2 {

  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read dimensions of the matrix
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        
        // Initialize the matrix
        int[][] matrix = new int[m][n];
        
        // Read the matrix elements
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        
        // Print alternate columns of the matrix column-wise
        for (int j = 0; j < n; j += 2) { // Traverse every second column
            for (int i = 0; i < m; i++) { // Print each row of the current column
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // Move to the next line after printing a column
        }
        
        scanner.close();
    }
}
