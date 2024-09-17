// // HW_Print Dumroo Pattern
// Print the below pattern

// Given m as integer input, where m tab separated stars are printed in the first line,

// Eg. for m=7, the output is written under.

// Recognise the pattern and print the final output.

// image

// Input Format

// m will be given as an integer input in the first line.

// Constraints

// 3 <= m <= 2^31-1
// m will be an odd positive integer.
// Output Format

// Print the pattern accordingly.

// Sample Input 0

// 7
// Sample Output 0

// *    *    *    *    *    *    *    
//     *    *    *    *    *    
//         *    *    *    
//             *    
//         *    *    *    
//     *    *    *    *    *    
// *    *    *    *    *    *    *
// Sample Input 1

// 9
// Sample Output 1

// *    *    *    *    *    *    *    *    *    
//     *    *    *    *    *    *    *    
//         *    *    *    *    *    
//             *    *    *    
//                 *    
//             *    *    *    
//         *    *    *    *    *    
//     *    *    *    *    *    *    *    
// *    *    *    *    *    *    *    *    *

import java.util.*;

public class Q8 {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

        // Reading input
        int m = scanner.nextInt();

        // Close the scanner as we no longer need it
        scanner.close();

        // Upper half of the pattern (including the middle line)
        for (int i = 0; i <= m / 2; i++) {
            // Print leading spaces
            for (int j = 0; j < i; j++) {
                System.out.print("\t");
            }
            // Print stars with tabs
            for (int j = 0; j < m - 2 * i; j++) {
                System.out.print("*");
                if (j < m - 2 * i - 1) {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }

        // Lower half of the pattern
        for (int i = m / 2 - 1; i >= 0; i--) {
            // Print leading spaces
            for (int j = 0; j < i; j++) {
                System.out.print("\t");
            }
            // Print stars with tabs
            for (int j = 0; j < m - 2 * i; j++) {
                System.out.print("*");
                if (j < m - 2 * i - 1) {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}


