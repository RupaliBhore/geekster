// // Hw_Print Inverted triangle

// Print the below pattern.

// Take m as an integer input, where m tab separated stars are printed in the first line. Then you have to print the pattern below.

// Eg. for m=7, the output is written under.

// image

// Input Format

// m will be given as an integer output.

// Constraints

// 1 <= m <= 2^31-1
// Output Format

// Print the pattern as given under

// Sample Input 0

// 5
// Sample Output 0

// *    *    *    *    *    
//     *    *    *    
//         *
// Sample Input 1

// 7
// Sample Output 1

// *    *    *    *    *    *    *    
//     *    *    *    *    *    
//         *    *    *    
//             *
// Sample Input 2

// 9
// Sample Output 2

// *    *    *    *    *    *    *    *    *    
//     *    *    *    *    *    *    *    
//         *    *    *    *    *    
//             *    *    *    
//                 *
// Sample Input 3

// 11
// Sample Output 3

// *    *    *    *    *    *    *    *    *    *    *    
//     *    *    *    *    *    *    *    *    *    
//         *    *    *    *    *    *    *    
//             *    *    *    *    *    
//                 *    *    *    
//                     *
// Sample Input 4

// 13
// Sample Output 4

// *    *    *    *    *    *    *    *    *    *    *    *    *    
//     *    *    *    *    *    *    *    *    *    *    *    
//         *    *    *    *    *    *    *    *    *    
//             *    *    *    *    *    *    *    
//                 *    *    *    *    *    
//                     *    *    *    
//                         *


import java.util.Scanner;

public class Q10 {
    public static void printPattern(int m) {
        // Iterate from m down to 1
        for (int i = m; i > 0; i -= 2) {
            // Print tabs for alignment
            for (int j = 0; j < (m - i) / 2; j++) {
                System.out.print("\t");
            }
            
            // Print stars separated by tabs
            for (int j = 0; j < i; j++) {
                System.out.print("*\t");
            }
            
            // Move to the next line
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        
        // Print the pattern
        printPattern(m);
        
        scanner.close();
    }
}
