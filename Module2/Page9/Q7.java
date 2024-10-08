// // HW_Search in a sorted matrix

// Given a m*n matrix and you are also given an integer x. Each row and column of the matrix is sorted in increasing order. You are required to find x in the matrix and print it's location int (row, col) format as discussed in output format below. In case an element is not found, print "Not Found".

// `Note :- Each row is sorted in non-decreasing order.

// The first integer of each column is greater than the last integer of the previous column.`

// NOTE:- After answering the question, attempt the related question in the linked resource to improve your understanding of the question . Question Link -> https://leetcode.com/problems/search-a-2d-matrix-ii/

// Input Format

// First line contains, m and n depicting the size of first matrix.
// m*n Integer values, depicting all the elements of matrix.
// 3.Take a Integer input x , which is to be search.

// Constraints

// 1 <= m and n <=1000

// -1000<=mat[i][j]<=1000

// Output Format

// Print the row and col index in a seperate line if present otherwise print "Not Found" without quote.

// Sample Input 0

// 2
// 3
// 1 4 7
// 2 5 8
// 8
// Sample Output 0

// 1
// 2
// Sample Input 1

// 4
// 5
// 1 4 7 11 15
// 2 5 8 12 19
// 3 6 9 16 22
// 10 13 14 17 24
// 23
// Sample Output 1

// Not Found
// Explanation 1

// 23 is not found so print "Not Found".


import java.util.*;

public class Q7 {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read matrix dimensions
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        // Initialize the matrix
        int[][] matrix = new int[m][n];

        // Read matrix elements
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Read the target value x
        int x = scanner.nextInt();

        // Close the scanner
        scanner.close();

        // Perform the search
        boolean found = false;
        int row = 0;
        int col = n - 1;

        while (row < m && col >= 0) {
            if (matrix[row][col] == x) {
                System.out.println(row);
                System.out.println(col);
                found = true;
                break;
            } else if (matrix[row][col] > x) {
                col--;
            } else {
                row++;
            }
        }

        if (!found) {
            System.out.println("Not Found");
        }
    }
}