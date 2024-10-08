// // Print Upper triangular matrix 1

// In the world of finance, every second counts. That's why a young financial analyst named Maria is given a complex matrix of size m * n to analyze, she knows that time is of the essence. The matrix contains vital data that could make or break her company's fortunes, and Maria has to act fast to make sense of it all.

// As she delves into the matrix, Maria realizes that the upper triangle holds the key to unlocking the data's secrets.

// help Maria and create program that print the upper triangular matrix.

// Input Format

// First line contains, m and n depicting the size of matrix.

// Second line contains m * n Integer values, depicting all the elements of matrix.

// Constraints

// 1<=m and n<=1000
 
// -1000<=mat[i][j]<=1000
// Output Format

// Return the upper triangular matrix

// Sample Input 0

// 3
// 3
// 3 7 1
// 6 2 4
// 7 1 0
// Sample Output 0

// 3 7 1 
// 0 2 4 
// 0 0 0 


//Finded
// import java.util.*;

// public class Q10 {

//      public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
        
//         // Read dimensions of the matrix
//         int m = scanner.nextInt();
//         int n = scanner.nextInt();
        
//         // Initialize the matrix
//         int[][] matrix = new int[m][n];
        
//         // Read the matrix elements
//         for (int i = 0; i < m; i++) {
//             for (int j = 0; j < n; j++) {
//                 matrix[i][j] = scanner.nextInt();
//             }
//         }
        
//         // Print the upper triangular matrix
//         for (int i = 0; i < m; i++) {
//             for (int j = 0; j < n; j++) {
//                 if (j >= i) {
//                     // Print the element if it's part of the upper triangle
//                     System.out.print(matrix[i][j] + " ");
//                 } else {
//                     // Print 0 for elements below the diagonal
//                     System.out.print("0 ");
//                 }
//             }
//             System.out.println();
//         }
        
//         scanner.close();
//     }
// }



//Discussed One

import java.util.*;

public class Q10 {

   public static void main(String[] args) {
Scanner scn = new Scanner(System.in);
int m = scn.nextInt();
int n = scn.nextInt();
int [][] A = new int[m] [n];
       
for(int i = 0; i < m; i++) {
for (int j = 0; j < n; j++) {
A[i][j] = scn.nextInt();
}}
       
for(int i = 0; i < m; i++){
for (int j = 0; j < n; j++) {
if(i <= j){
System.out.print(A[i] [j] + " ");
}else{
System.out.print("0 ");
}
}
System.out.println();
}
}
}
//Discussed