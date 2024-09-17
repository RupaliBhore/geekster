// // HW_Print Big Ladder

// Print the below pattern below

// Given m and n integer input, where m tab separated stars are printed in the first line, and in total there are n lines.

// Eg. for m=7,n=13 the output is written under.

// Recognise the pattern and print the final output.

// image

// Input Format

// m will be given in the first line,

// n will be given in the second line.

// Constraints

// 3 <= m <= 2^31-1

// n can be any positive integer in the series 1, 4, 7, 10, 13....
// Output Format

// Print the pattern accordingly.

// Sample Input 0

// 3
// 10
// Sample Output 0

// *    *    *    
// *         *    
// *         *    
// *    *    *    
// *         *    
// *         *    
// *    *    *    
// *         *    
// *         *    
// *    *    *    
// Sample Input 1

// 5
// 13
// Sample Output 1

// *    *    *    *    *    
// *                   *    
// *                   *    
// *    *    *    *    *    
// *                   *    
// *                   *    
// *    *    *    *    *    
// *                   *    
// *                   *    
// *    *    *    *    *    
// *                   *    
// *                   *    
// *    *    *    *    *
// Sample Input 2

// 8
// 13
// Sample Output 2

// *    *    *    *    *    *    *    *    
// *                                  *    
// *                                  *    
// *    *    *    *    *    *    *    *    
// *                                  *    
// *                                  *    
// *    *    *    *    *    *    *    *    
// *                                  *    
// *                                  *    
// *    *    *    *    *    *    *    *    
// *                                  *    
// *                                  *    
// *    *    *    *    *    *    *    *
// Sample Input 3

// 10
// 16
// Sample Output 3

// *    *    *    *    *    *    *    *    *    *    
// *                                            *    
// *                                            *    
// *    *    *    *    *    *    *    *    *    *    
// *                                            *    
// *                                            *    
// *    *    *    *    *    *    *    *    *    *    
// *                                            *    
// *                                            *    
// *    *    *    *    *    *    *    *    *    *    
// *                                            *    
// *                                            *    
// *    *    *    *    *    *    *    *    *    *    
// *                                            *    
// *                                            *    
// *    *    *    *    *    *    *    *    *    *    
// Sample Input 4

// 4
// 10
// Sample Output 4

// *    *    *    *    
// *              *    
// *              *    
// *    *    *    *    
// *              *    
// *              *    
// *    *    *    *    
// *              *    
// *              *    
// *    *    *    *



import java.util.Scanner;

public class Q6 {
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Reading inputs
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        
        // Close the scanner as we no longer need it
        scanner.close();
        
        // Printing the pattern
        for (int i = 0; i < n; i++) {
            if (i % 3 == 0) { // Full row of stars
                for (int j = 0; j < m; j++) {
                    if (j < m - 1) {
                        System.out.print("*\t");
                    } else {
                        System.out.print("*");
                    }
                }
            } else { // Only first and last stars
                for (int j = 0; j < m; j++) {
                    if (j == 0 || j == m - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print("\t");
                    }
                    
                    if (j < m - 1) {
                        System.out.print("\t");
                    }
                }
            }
            System.out.println();
        }
    }
}
