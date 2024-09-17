// // HW_Print Inverted Right Angled Triangle Pattern

// Take an Integer input n and Print the pattern given below.

// Input Format

// A single line n take input from user.

// Constraints

// 1 <= n <= 100
// Output Format

// Print the pattern.

// Sample Input 0

// 7
// Sample Output 0

// *******
// ******
// *****
// ****
// ***
// **
// *
// Explanation 0

// Pattern for n=7

import java.util.*;

public class Q7 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        
        // Read the integer input n
        int n = scanner.nextInt();
        
        // Print the pattern
        for (int i = n; i >= 1; i--) {
            // Print stars for each line
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line after each row
        }
        
        scanner.close();
    }
}
