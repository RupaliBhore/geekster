// // Print the matrix left-diagonal wise

// Once upon a time, you discovered a mysterious matrix that contained vital information. However, this matrix was a bit of a mess - the data was scattered all over the place, and you needed to figure out how to read it. Your task was to print the matrix left-diagonal wise, starting from the very first upper left-diagonal.

// It was no easy feat, but with some clever problem-solving, you knew you could crack the code and uncover the secrets hidden within the matrix. Are you ready to take on the challenge?

// Take a matrix of size n * n as input and Print the matrix left-diagonal wise starting from the first upper left-diagonal.

// Input Format

// First line contains integer N representing Row and column of matrix.

// Second line contains n * n elements as a matrix.

// Constraints

// 1 <= N <=1000

// -1000<=mat[i][j]<=1000
// Output Format

// Return a single consisting the elements of matrix

// Sample Input 0

// 3
// 1 2 3 
// 4 5 6 
// 7 8 9
// Sample Output 0

// 1 2 4 3 5 7 6 8 9

//Finded 
// import java.util.*;

// public class Q9 {
//  public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // Read the size of the matrix
//         int N = scanner.nextInt();

//         // Initialize the matrix
//         int[][] matrix = new int[N][N];

//         // Read the matrix elements
//         for (int i = 0; i < N; i++) {
//             for (int j = 0; j < N; j++) {
//                 matrix[i][j] = scanner.nextInt();
//             }
//         }

//         // Print the matrix diagonally
//         // First print the diagonals starting from the top row
//         for (int startCol = 0; startCol < N; startCol++) {
//             int row = 0;
//             int col = startCol;
//             while (row < N && col >= 0) {
//                 System.out.print(matrix[row][col] + " ");
//                 row++;
//                 col--;
//             }
//         }

//         // Then print the diagonals starting from the left column
//         for (int startRow = 1; startRow < N; startRow++) {
//             int row = startRow;
//             int col = N - 1;
//             while (row < N && col >= 0) {
//                 System.out.print(matrix[row][col] + " ");
//                 row++;
//                 col--;
//             }
//         }

//         scanner.close();
//     }
// }

//Discussed One

import java.util.*;

public class Q9 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] A = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = scn.nextInt();
            }
        }
        int d = 2 * n - 1;

        for (int sum = 0; sum < d; sum++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i + j == sum) {
                        System.out.print(A[i][j] + " ");
                    }
                }

            }
        }
    }
}