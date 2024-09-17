// // GKSTR29_Pattern_12_Diamond
// Take Integer N as input and print the following pattern.

// image

// Input Format

// An integer Value N

// Constraints

// 1 <= N <= 100
// Output Format

// ((2*N)-1) Line of Pattern as shown in problem statement.

// Note: No space in between stars.

// Sample Input 0

// 5
// Sample Output 0

//     *
//    ***
//   *****
//  *******
// *********
//  *******
//   *****
//    ***
//     *

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        // Top half (inverted triangle)
        for (int i = 1; i <= N; i++) {
            // Print spaces
            for (int j = 1; j <= N - i; j++) {
                System.out.print(" ");
            }
            
            // Print stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            
            System.out.println(); // Move to the next line
        }
        
        // Bottom half (regular triangle)
        for (int i = N - 1; i >= 1; i--) {
            // Print spaces
            for (int j = 1; j <= N - i; j++) {
                System.out.print(" ");
            }
            
            // Print stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            
            System.out.println(); // Move to the next line
        }
        
        scanner.close();
    }
}
