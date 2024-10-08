// // HW_Rotate The Matrix by 270 Degree
 
// Given a n * n matrix, rotate it by 270 degrees, without taking any extra space and making the changes within the matrix. Print the final matrix such that all elements of the row are tab separated and are in one line.

// Input Format

// First line Integer N depicting the size of matrix.

// Second line contains N * N Integer values, depicting all the elements of matrix.

// Constraints

// 1 <= N <= 1000

// 1 <= mat[i][j] <= 1000
// Output Format

// Return A Square matrix of size n*n.

// Sample Input 0

// 3
// 1 2 3 
// 4 5 6
// 7 8 9
// Sample Output 0

// 3 6 9 
// 2 5 8
// 1 4 7


import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the matrix
        int N = scanner.nextInt();

        // Read the matrix elements
        int[][] matrix = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Rotate the matrix by 270 degrees clockwise
        rotateMatrix270(matrix);

        // Print the rotated matrix
        printMatrix(matrix);
    }

    private static void rotateMatrix270(int[][] matrix) {
        int N = matrix.length;

        // Step 1: Transpose the matrix
        for (int i = 0; i < N; i++) {
            for (int j = i; j < N; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Step 2: Reverse each column
        for (int j = 0; j < N; j++) {
            int top = 0;
            int bottom = N - 1;
            while (top < bottom) {
                int temp = matrix[top][j];
                matrix[top][j] = matrix[bottom][j];
                matrix[bottom][j] = temp;
                top++;
                bottom--;
            }
        }
    }

    private static void printMatrix(int[][] matrix) {
        int N = matrix.length;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (j > 0) {
                    System.out.print(" ");
                }
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}