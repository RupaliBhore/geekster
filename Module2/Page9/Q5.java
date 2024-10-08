// // HW_Rotation Check In Matrix
// Check whether all rows of a matrix are circular rotations of each other.

// Given a matrix of N * N size, the task is to find whether all rows are circular rotations of each other or not.

// Input Format

// First line contains integer N as integer Input.

// Second line contains N * N elements as Elements of matrix.

// Constraints

// 1 <= N <= 1000
// 0 <= mat[i][j] <= 1000
// Output Format

// Return "YES" OR "NO"

// Sample Input 0

// 3
// 1 2 3 
// 3 1 2 
// 2 3 1
// Sample Output 0

// YES
// Explanation 0

// All rows are rotated permutation of each other.

// Sample Input 1

// 3
// 1 2 3
// 3 2 1
// 1 3 2
// Sample Output 1

// NO


// import java.io.*;
// import java.util.*;

// public class Q5 {

//     public static void main(String[] args) {
//         Scanner cin = new Scanner(System.in);
//         int n = cin.nextInt();
//         int arr[][] = new int[n][n];
//         for(int i=0; i<n; i++){
//             for(int j=0; j<n; j++){
//                 arr[i][j] = cin.nextInt();
//             }
//         }
//         String specialString = "";
//         for(int i =0; i<n; i++){
//             specialString += arr[0][i];
//         }
//         specialString += specialString;
//         for(int i=1; i<n; i++){
//             String temp = "";
//             for(int j=0; j<n; j++){
//                 temp+= arr[i][j] ;
//             }
//             if( ! specialString.contains(temp) ){
//                 System.out.println("NO");
//                 return;
//             }
//         }
//         System.out.println("YES");
//     }
// }



import java.util.*;

public class Q5 {

   private static String[] generateAllRotations(String row) {
        int len = row.length();
        String[] rotations = new String[len];
        for (int i = 0; i < len; i++) {
            rotations[i] = row.substring(i) + row.substring(0, i);
        }
        return rotations;
    }

    // Function to check if all rows are rotations of each other
    private static boolean areAllRowsCircularRotations(int[][] matrix) {
        int N = matrix.length;
        HashSet<String> rotationsSet = new HashSet<>();

        // Convert the first row into a string
        String firstRow = "";
        for (int j = 0; j < N; j++) {
            firstRow += matrix[0][j];
        }

        // Generate all rotations of the first row
        String[] rotations = generateAllRotations(firstRow);

        // Add all rotations to a set
        for (String rotation : rotations) {
            rotationsSet.add(rotation);
        }

        // Check each row if it is one of the rotations
        for (int i = 1; i < N; i++) {
            String currentRow = "";
            for (int j = 0; j < N; j++) {
                currentRow += matrix[i][j];
            }
            if (!rotationsSet.contains(currentRow)) {
                return false;
            }
        }

        return true;
    }

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
        
        // Close the scanner
        scanner.close();
        
        // Check and print the result
        if (areAllRowsCircularRotations(matrix)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}