// // HW_Print Alternate Columns
// Sophia is a talented data scientist working at a leading research institute. One day, she is tasked with analyzing a matrix of size m * n that contains crucial data for an upcoming project. As she delves into the matrix, Sophia realizes that the alternate columns hold key insights that could unlock the data's secrets.

// your task is to print the alternate columns of the matrix starting from the first column.

// Input Format

// First line contains integers m and n representing the size of matrix.

// Second line contains m * n integers representing elements of a matrix.

// Constraints

// 1 <= m,n <=1000

// -1000<=mat[i][j]<=1000
// Output Format

// Print Alternate columns of matrix.

// Sample Input 0

// 3 3
// 1 2 3 
// 4 5 6
// 7 8 9
// Sample Output 0

// 1 3 
// 4 6
// 7 9


import java.util.*;

public class Q1 {

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
        
        // Print alternate columns of the matrix
        for (int i = 0; i < m; i++) { // Traverse rows
            for (int j = 0; j < n; j += 2) { // Traverse every second column
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // Move to the next line after printing a row
        }
        
        scanner.close();
    }
}