// // Transpose of Matrix of N*N

// Sophie is a computer science student who loves solving programming challenges. One day, her professor gives her an interesting task - to write a program that finds the transpose of a square matrix of size N * N.

// NOTE:- After answering the question, attempt the related question in the linked resource to improve your understanding of this question . Click here

// Input Format

// First line contains integer N as no. of rows and columns of Matrix.

// Second line contains N * N integers representing elements of Matrix.

// Constraints

// 1 <= N <= 100

// -10^3 <= mat[i][j] <= 10^3
// Output Format

// Return a 2-d array which is transpose of given array

// Sample Input 0

// 4
// 1 1 1 1
// 2 2 2 2
// 3 3 3 3
// 4 4 4 4
// Sample Output 0

// 1 2 3 4
// 1 2 3 4
// 1 2 3 4
// 1 2 3 4
// Sample Input 1

// 3
// 1 2 3
// 1 2 3
// 1 2 3
// Sample Output 1

// 1 1 1 
// 2 2 2 
// 3 3 3 


// Finded
// import java.io.*;
// import java.util.*;

// public class Q4 {

//       public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // Read the size of the matrix
//         int N = scanner.nextInt();
        
//         // Initialize the matrix
//         int[][] matrix = new int[N][N];
        
//         // Read matrix elements
//         for (int i = 0; i < N; i++) {
//             for (int j = 0; j < N; j++) {
//                 matrix[i][j] = scanner.nextInt();
//             }
//         }
        
//         // Initialize the transpose matrix
//         int[][] transpose = new int[N][N];
        
//         // Compute the transpose
//         for (int i = 0; i < N; i++) {
//             for (int j = 0; j < N; j++) {
//                 transpose[j][i] = matrix[i][j];
//             }
//         }
        
//         // Print the transpose matrix
//         for (int i = 0; i < N; i++) {
//             for (int j = 0; j < N; j++) {
//                 System.out.print(transpose[i][j] + " ");
//             }
//             System.out.println(); // Move to the next line after printing a row
//         }
        
//         scanner.close();
//     }
// }

// discussed one

import java.util.*;

public class Q4 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] A = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = scn.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i <= j) {
//i < j
                    int tmp = A[i][j];
                    A[i][j] = A[j][i];
                    A[j][i] = tmp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }
}
