// // Pattern 7 - Print a hollow m by n star rectangle.

// Take m and n as an integer input, then print a hollow m by n star rectangle.

// Then print hollow star rectangle which has m stars in the first line and m stars in the nth line.

// There rectangle should have n lines

// and in every line in between should have only first star and then the mth star.

// Input Format

// For each test case, m will be given in the first line.

// And n will be given in the second line.

// Constraints

// 1 <= m , n <= 2^31-1
// Output Format

// Print as given in the test case below.

// Sample Input 0

// 5
// 4
// Sample Output 0

// *****
// *   *
// *   *
// *****
// Sample Input 1

// 7
// 8
// Sample Output 1

// *******
// *     *
// *     *
// *     *
// *     *
// *     *
// *     *
// *******
// Sample Input 2

// 6
// 9
// Sample Output 2

// ******
// *    *
// *    *
// *    *
// *    *
// *    *
// *    *
// *    *
// ******
// Sample Input 3

// 5
// 8
// Sample Output 3

// *****
// *   *
// *   *
// *   *
// *   *
// *   *
// *   *
// *****
// Sample Input 4

// 2
// 2
// Sample Output 4

// **
// **


import java.util.Scanner;

public class Q1 {
    public static void printHollowRectangle(int m, int n) {
        // Print the first line
        for (int i = 0; i < m; i++) {
            System.out.print("*");
        }
        System.out.println();
        
        // Print the intermediate lines
        for (int i = 1; i < n - 1; i++) {
            System.out.print("*");
            for (int j = 1; j < m - 1; j++) {
                System.out.print(" ");
            }
            if (m > 1) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        // Print the last line if n > 1
        if (n > 1) {
            for (int i = 0; i < m; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        
        // Print the hollow rectangle
        printHollowRectangle(m, n);
        
        scanner.close();
    }
}






