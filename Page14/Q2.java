// // Pattern 3 - nxn star rectangle

// Take n as an integer input. Then print nxn star rectangle as mentioned below.

// In each line, n stars should be printed.

// And there should be n such lines.

// Input Format

// For each test case, n will be given as an integer input.

// Constraints

// 0 <= n <= 2^31-1
// Output Format

// Print according to the problem statement.

// For reference, look at the test cases below.

// Sample Input 0

// 4
// Sample Output 0

// ****
// ****
// ****
// ****
// Sample Input 1

// 6
// Sample Output 1

// ******
// ******
// ******
// ******
// ******
// ******
// Sample Input 2

// 8
// Sample Output 2

// ********
// ********
// ********
// ********
// ********
// ********
// ********
// ********
// Sample Input 3

// 2
// Sample Output 3

// **
// **
// Sample Input 4

// 1
// Sample Output 4

// *
// Sample Input 5

// 0


import java.util.*;

public class Q2 {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        
        // Read the integer input n
        int n = scanner.nextInt();
        
        // Print the nxn star rectangle
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line after printing n stars
        }
        
      
    }
}