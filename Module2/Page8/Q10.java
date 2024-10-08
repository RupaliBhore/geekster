// // HW_Reverse Rows of Matrix
// Meet Jane, a computer science student who was given a challenging programming assignment. She was tasked with reversing each row of an N * N matrix without taking any extra space and making the changes within the matrix. The final matrix was to be printed with all elements of the row tab-separated and in one line.

// Help Jane and raverse each row of the matrix.

// Input Format

// First line contains N depicting the size of matrix.

// Second line contains N * N Integer values, depicting all the elements of matrix.

// Constraints

// 1 <= N <= 1000
// -10^3 <= mat[i][j] <= 10^3
// Output Format

// Print the matrix after reversing each row.

// Sample Input 0

// 3
// 1 2 4
// 1 7 9
// 1 0 4
// Sample Output 0

// 4    2    1    
// 9    7    1    
// 4    0    1    


import java.util.*;

public class Q10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the matrix
        int N = scanner.nextInt();

        // Initialize the matrix
        int[][] matrix = new int[N][N];

        // Read the matrix elements
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Reverse each row in place and print the matrix
        for (int i = 0; i < N; i++) {
            int start = 0;
            int end = N - 1;
            
            // Reverse the row
            while (start < end) {
                // Swap elements
                int temp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp;
                
                start++;
                end--;
            }
            
            // Print the reversed row
            for (int j = 0; j < N; j++) {
                System.out.print(matrix[i][j]);
                if (j < N - 1) {
                    System.out.print("\t"); // Print tab between elements
                }
            }
            System.out.println(); // Move to the next line after printing a row
        }

        scanner.close();
    }
}