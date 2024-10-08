// // Print the Matrix Row-wise

// Meet Sarah, a math enthusiast who loves to solve complex problems. One day, Sarah was working on a puzzle that required her to print out the rows of a matrix.

// She knew that she needed to write a Java program that could take a matrix of size m*n as input and print out each row of the matrix one by one.

// help Sarah and write a program that print the matrix row wise.

// Input Format

// First take integer input m and n representing row and columns of matrix.

// Take m * n integer input reresenting elements of matrix.

// Constraints

// 1 <= m,n <=1000

// -1000<=mat[i][j]<=1000
// Output Format

// Return A Matrix of Integer values.

// Sample Input 0

// 3 3
// 1 2 3 
// 4 5 6
// 7 8 9
// Sample Output 0

// 1 2 3 
// 4 5 6
// 7 8 9

//Discussed One

import java.util.*;

public class Q7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        int n = scn.nextInt();
        int[][] A = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = scn.nextInt();
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }
} // Discussed One

// finded
// import java.util.*;

// public class Q7 {

// public static void main(String[] args) {
// Scanner scanner = new Scanner(System.in);

// // Read the number of rows and columns
// int m = scanner.nextInt();
// int n = scanner.nextInt();

// // Initialize the matrix
// int[][] matrix = new int[m][n];

// // Read the matrix elements
// for (int i = 0; i < m; i++) {
// for (int j = 0; j < n; j++) {
// matrix[i][j] = scanner.nextInt();
// }
// }

// // Print the matrix row by row
// for (int i = 0; i < m; i++) {
// for (int j = 0; j < n; j++) {
// System.out.print(matrix[i][j] + " ");
// }
// System.out.println(); // Move to the next line after printing a row
// }

// scanner.close();
// }
// }