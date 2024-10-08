// // Modify The Matrix

// Once upon a time, there was a company that was developing a system to track the inventory levels of different products in different warehouses. They had a boolean matrix Mat of size M X N, where each cell represented the availability of a product in a specific warehouse. If the value of a cell was true (or 1), it meant that the product was available in that warehouse.

// The company wanted to modify the matrix in such a way that if a cell, Mat[i][j], was true, then all cells in the ith row and jth column of the matrix would also be set to true. This would ensure that if a product was available in a particular warehouse, all the products in that row and column would also be considered available.

// Can you write a program thet modify the matrix such that if a matrix cell Mat[i][j] is 1 (or true) then make all the cells of ith row and jth column as 1.

// Input Format

// First line contains, M and N depicting the size of first matrix.

// Second line contains M * N Integer values, depicting all the elements of matrix.

// Constraints

// 1 <= m and n <= 1000
// 0 <= mat[i][j] <= 1
// Output Format

// Return the matrix

// Sample Input 0

// 3
// 4
// 1 0 0 1
// 0 0 1 0
// 0 0 0 0
// Sample Output 0

// 1 1 1 1 
// 1 1 1 1 
// 1 0 1 1 


import java.util.*;

public class Q4 {

    public static void modifyMatrix(int M, int N, int[][] matrix) {
        // Create arrays to keep track of rows and columns to be updated
        boolean[] rowsToUpdate = new boolean[M];
        boolean[] colsToUpdate = new boolean[N];

        // Identify which rows and columns need to be updated
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (matrix[i][j] == 1) {
                    rowsToUpdate[i] = true;
                    colsToUpdate[j] = true;
                }
            }
        }

        // Modify the matrix based on the rows and columns that need to be updated
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (rowsToUpdate[i] || colsToUpdate[j]) {
                    matrix[i][j] = 1;
                }
            }
        }

        // Print the modified matrix
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read dimensions of the matrix
        int M = scanner.nextInt();
        int N = scanner.nextInt();
        
        // Read the matrix
        int[][] matrix = new int[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        
        // Close the scanner
        scanner.close();
        
        // Modify and print the matrix
        modifyMatrix(M, N, matrix);
    }
}