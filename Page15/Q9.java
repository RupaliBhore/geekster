// // HW_Print the Number Pattern 2

// Take an Integer input n and k and Print the Pattern below.

// K here Denotes the multiples of k.

// Input Format

// First line n take input from user.

// Second line k take input from user.

// Constraints

// 1 <= n <= 100
// 1 <= k <= 20
// Output Format

// Print the series

// Sample Input 0

// 6
// 7
// Sample Output 0

//                7 
//             7 14 
//          7 14 21 
//       7 14 21 28 
//    7 14 21 28 35 
// 7 14 21 28 35 42 
// Explanation 0

// n=6 and k=7

// k here denotes the multiples of k.

import java.util.*;

public class Q9 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        // Reading inputs
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        // Close the scanner as we no longer need it
        scanner.close();

        // Printing the pattern
        for (int i = 1; i <= n; i++) {
            // Print leading spaces for indentation
            for (int j = 0; j < n - i; j++) {
                System.out.print("   ");
            }
            // Print the multiples of k
            for (int j = 1; j <= i; j++) {
                System.out.print(k * j);
                if (j < i) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}