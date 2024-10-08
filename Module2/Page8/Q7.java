// // Print row wise with condition


// Once upon a time, there was a programmer named Alex who was given the task of printing a matrix row-wise. However, there was a twist - the even-numbered rows had to be printed from left to right, and the odd-numbered rows had to be printed from right to left.

// help Alex and write a program that would iterate through each row of the matrix and check if it was an even or odd row. If it was an even row, the program would traverse it from left to right, and if it was an odd row, the program would traverse it from right to left.

// Input Format

// First line contains, m and n depicting the size of first matrix.

// Second line contains m * n Integer values, depicting all the elements of matrix.

// Constraints

// 1<=m and n<=1000
 
// -1000<=mat[i][j]<=1000
// Output Format

// Print the matrix

// Sample Input 0

// 3
// 3
// 3 1 2 
// 3 0 2 
// 4 5 4 
// Sample Output 0

// 3 1 2 
// 2 0 3 
// 4 5 4 


// Finded
// import java.util.*;

// public class Q7 {

//      public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
        
//         // Read dimensions of the matrix
//         int m = scanner.nextInt();
//         int n = scanner.nextInt();
        
//         // Initialize the matrix
//         int[][] matrix = new int[m][n];
        
//         // Read matrix elements
//         for (int i = 0; i < m; i++) {
//             for (int j = 0; j < n; j++) {
//                 matrix[i][j] = scanner.nextInt();
//             }
//         }
        
//         // Print matrix with the required row order
//         for (int i = 0; i < m; i++) {
//             if (i % 2 == 0) {
//                 // Print even rows from left to right
//                 for (int j = 0; j < n; j++) {
//                     System.out.print(matrix[i][j]);
//                     if (j < n - 1) {
//                         System.out.print(" "); // Print space between elements
//                     }
//                 }
//             } else {
//                 // Print odd rows from right to left
//                 for (int j = n - 1; j >= 0; j--) {
//                     System.out.print(matrix[i][j]);
//                     if (j > 0) {
//                         System.out.print(" "); // Print space between elements
//                     }
//                 }
//             }
//             System.out.println(); // Move to the next line after printing a row
//         }
        
//         scanner.close();
//     }
// }


//dISCUSSED
import java.util.*;
public class Q7 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        int n = scn.nextInt();
        int[][] A = new int[m][n];

        // Input the matrix elements
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = scn.nextInt();
            }
        }

        // Traverse the matrix row by row
        for (int i = 0; i < m; i++) {
            if (i % 2 == 0) {
                // Print left to right for even rows
                for (int j = 0; j < n; j++) {
                    System.out.print(A[i][j] + " ");
                }
            } else {
                // Print right to left for odd rows
                for (int j = n - 1; j >= 0; j--) {
                    System.out.print(A[i][j] + " ");
                }
            }
            // Print a newline after processing each row
            System.out.println();
        }
    }
}
//dISCUSSED