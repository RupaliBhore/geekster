// // Rotate The Matrix by 180 Degree

// Given a n * n matrix, rotate it by 180 degrees, without taking any extra space and making the changes within the matrix. Print the final matrix such that all elements of the row are tab separated and are in one line.

// NOTE:- After answering the question, attempt the related question in the linked resource to improve your understanding of the question . Click here

// Input Format

// First Line contains Integer N depicting the size of matrix.

// Second line contains N * N Integer values, depicting all the elements of matrix.

// Constraints

// 1<=N<=1000

// 1<=mat[i][j]<=1000
// Output Format

// Returun A Square matrix of size n * n.

// Sample Input 0

// 3 
// 1 2 3
// 4 5 6
// 7 8 9
// Sample Output 0

// 9  8  7  
// 6  5  4  
// 3  2  1  


// Finded
// import java.util.Scanner;

// public class MatrixRotation {
//     // Method to transpose the matrix
//     public static void transpose(int[][] A, int n) {
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 if (i < j) {
//                     int tmp = A[i][j];
//                     A[i][j] = A[j][i];
//                     A[j][i] = tmp;
//                 }
//             }
//         }
//     }

//     // Method to reverse rows of the matrix
//     public static void reverseRows(int[][] A, int n) {
//         for (int row = 0; row < n; row++) {
//             int i = 0;
//             int j = n - 1;
//             while (i < j) {
//                 int tmp = A[row][i];
//                 A[row][i] = A[row][j];
//                 A[row][j] = tmp;
//                 j--;
//                 i++; // Corrected from 1++ to i++
//             }
//         }
//     }
// public static void rotateby90(int A[][],int n){
//     transpose(A,n);
//     reverseRows(A,n);
// }
//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         int n = scn.nextInt();
//         int[][] A = new int[n][n];
        
//         // Input matrix elements
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 A[i][j] = scn.nextInt();
//             }
//         }

//     rotateby90(A,n);
//         rotateby90(A,n);

//         // Output the rotated matrix
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 System.out.print(A[i][j] + "  ");
//             }
//             System.out.println();
//         }
        
//         scn.close();
//     }
// }



//Discussed
import java.util.*;

public class Q5 {

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

    public static void rotateBy90(int[][] A, int n){
         // step 1.
         transpose(A, n);

         // step 2. reverse all rows
         reverseRows(A, n);

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
       
        rotateBy90(A, n);
        rotateBy90(A, n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }
}