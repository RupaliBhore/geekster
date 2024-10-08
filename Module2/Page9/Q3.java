// // Shift Matrix Row-Wise
// // 

// Once upon a time, there was a group of students who were working on a project to design a gaming platform. They had a 2D grid of N * N size which represented the game board. Each cell of the grid had some data associated with it.
// One day, they encountered a problem where they had to shift the elements of the grid row-wise in clock wise direction by a certain number of positions, k. This was necessary to create a more interesting and challenging gaming experience for their users.
// The students decided to write a Java program to solve this problem. They came up with an algorithm to shift the elements of the grid row-wise by k positions. After implementing the algorithm, they were able to shift the elements of each row by k positions.
// Write a program that shift each row of matrix by k.
// Input Format
// First line contains integer N depicting the size of matrix.
// Second line contains N * N Integer values, depicting all the elements of matrix.
// Third line contains integer k depicting the shift the matrix row-wise by k.
// Constraints
// 1 <= N <= 1000
// 1 <= mat[i][j] <= 1000
// Output Format
// Return the matrix after shifting.
// Sample Input 0
// 3
// 0 5 9
// 2 7 5
// 2 3 3
// 2
// Sample Output 0
// 9 0 5 
// 5 2 7 
// 3 2 3 
// Explanation 0
// print the matrix After shifting by 2

    //discussed 
import java.util.*;

public class Q3 {

    public static void reverse(int[][] A, int i, int j, int row) {
        while (i < j) {

            int tmp = A[row][i];

            A[row][i] = A[row][j];

            A[row][j] = tmp;

            i++;

            j--;

        }

    }

    public static void rotate(int[][] A, int row, int k) {

        int n = A.length;

        reverse(A, 0, k - 1, row);

        reverse(A, k, n - 1, row);

        reverse(A, 0, n - 1, row);

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

        int k = scn.nextInt();

        for (int row = 0; row < n; row++) {

            rotate(A, row, k);

        }

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                System.out.print(A[i][j] + " ");
            }

            System.out.println();

        }

    }
}
