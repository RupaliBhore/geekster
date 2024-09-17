// Pattern 9 - Square Ladder with top and bottom
// Take n as an integer input, then

// print n tab separated stars in the first line,

// then in the second line print a star, then n-2 tabs, then print a star.

// then print n tab separated stars in the third line.

// then in the fourth line print a star, then n-2 tabs, then print a star .

// .

// .

// Continue the pattern like this.

// Example: n=5

// Pattern will be:

// image

// Input Format

// For each test case, n will be given as an integer input.

// Constraints

// 3<=n<2^31-1 and also n will be an odd integer.

// Output Format

// Print as given in the problem statement.

// Sample Input 0

// 5
// Sample Output 0

// *    *    *    *    *
// *                   *
// *    *    *    *    *
// *                   *
// *    *    *    *    *


import java.util.Scanner;

public class Q3 {
    public static void printStarPattern(int n) {
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                // Print n stars separated by spaces
                for (int j = 0; j < n; j++) {
                    System.out.print("*");
                    if (j < n - 1) {
                        System.out.print("\t");
                    }
                }
                System.out.println();
            } else {
                // Print a star, then n-2 tabs, then another star
                System.out.print("*");
                for (int j = 0; j < n - 2; j++) {
                    System.out.print("\t");
                }
                System.out.println("\t*");
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        // Print the star pattern
        printStarPattern(n);
        
        scanner.close();
    }
}