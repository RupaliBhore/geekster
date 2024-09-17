// // GKSTR24 Pattern_7_Pyramid
// Take Integer N as input and print the following pattern.

// image

// Input Format

// An Integer Value N

// Constraints

// 1 <= N <= 100
// Output Format

// N Line of Pattern as shown in problem statement.

// Sample Input 0

// 5
// Sample Output 0

//     * 
//    * * 
//   * * * 
//  * * * * 
// * * * * * 

import java.util.Scanner;

public class Q4 {
    public static void printStarPattern(int n) {
        // Outer loop for each row
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            
            // Print stars
            for (int j = 1; j <= i; j++) {
                // Print a space after the star unless it's the last star in the row
                if (j == i) {
                    System.out.print("*");
                } else {
                    System.out.print("* ");
                }
            }
            
            // Move to the next line after each row is printed
            System.out.println();
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