// // HW_Print Lower triangular matrix

// John is a software engineer working for a leading tech company. One day, he is given a task to analyze a complex matrix of size m and n that contains crucial data for an upcoming project. As he dives into the matrix, John realizes that the lower triangle holds important insights that could unlock the data's secrets.

// Help John and print the lower triangular matrix.

// Input Format

// First line contains integers m and n depicting the size of matrix.

// Second line contains m * n Integer values, depicting all the elements of matrix.

// Constraints

// 1<=m and n<=1000
// -1000<=mat[i][j]<=1000
// Output Format

// Print the Lower triangular matrix

// Sample Input 0

// 3
// 3
// 7 9 9
// 0 2 5
// 2 9 9
// Sample Output 0

// 7 0 0 
// 0 2 0 
// 2 9 9 


import java.util.*;

public class Q3 {

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
        
        // Print the lower triangular matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // Print element if it is in the lower triangular part
                if (i >= j) {
                    System.out.print(matrix[i][j] + " ");
                } else {
                    // Print 0 for elements above the diagonal
                    System.out.print("0 ");
                }
            }
            System.out.println(); // Move to the next line after printing a row
        }
        
        scanner.close();
    }
}