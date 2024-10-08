// // Rotate The Matrix by 90 Degree

// Take a square matrix of size n*n as input, and rotate the matrix by 90 degree.

// NOTE:- After answering the question, attempt the related question in the linked resource to improve your understanding of this question . Click here

// Input Format

// First line contains Integer N depicting the size of matrix.

// Second line contains N * N Integer values, depicting all the elements of matrix.

// Constraints

// 1<=N<=1000

// 1<=mat[i][j]<=1000
// Output Format

// Return A Square matrix of size n*n.

// Sample Input 0

// 3 
// 1 2 3
// 4 5 6
// 7 8 9
// Sample Output 0

// 7 4 1 
// 8 5 2 
// 9 6 3 

// Finded
// import java.io.*;
// import java.util.*;

// public class Q6 {

//   public static void main(String[] args) {
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

//         // Rotate the matrix by 90 degrees clockwise
//         // Step 1: Transpose the matrix
//         for (int i = 0; i < N; i++) {
//             for (int j = i; j < N; j++) { // Start from i to avoid re-swapping
//                 int temp = matrix[i][j];
//                 matrix[i][j] = matrix[j][i];
//                 matrix[j][i] = temp;
//             }
//         }

//         // Step 2: Reverse each row
//         for (int i = 0; i < N; i++) {
//             for (int j = 0; j < N / 2; j++) {
//                 int temp = matrix[i][j];
//                 matrix[i][j] = matrix[i][N - 1 - j];
//                 matrix[i][N - 1 - j] = temp;
//             }
//         }

//         // Print the rotated matrix with tab separation
//         for (int i = 0; i < N; i++) {
//             for (int j = 0; j < N; j++) {
//                 System.out.print(matrix[i][j]);
//                 if (j < N - 1) {
//                     System.out.print("\t"); // Print tab for separation except after the last element
//                 }
//             }
//             System.out.println(); // Move to the next line after printing a row
//         }

//         scanner.close();
//     }
// }

// Discussed
import java.util.*;

public class Q6 {

    public static void transpose(int[][] A, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i <= j) {
                    // ix j
                    int tmp = A[i][j];
                    A[i][j] = A[j][i];
                    A[j][i] = tmp;
                }
            }
        }
    }

    public static void reverseRows(int[][] A, int n) {
        for (int row = 0; row < n; row++) {
            int i = 0;
            int j = n - 1;
            while (i < j) {
                int tmp = A[row][i];
                A[row][i] = A[row][j];
                A[row][j] = tmp;
                i++;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] A = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = scn.nextInt();
            }
        }
        // step 1.
        transpose(A, n);

        // step 2. reverse all rows
        reverseRows(A, n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }
}