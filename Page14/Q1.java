// // Pattern 2 - Print n x 12 star rectangle

// Take n as an integer input and then print a star rectangle such that each line has n stars.

// Also, there are 12 such lines.

// Input Format

// For each test case, take n as an integer input.

// Constraints

// 0 <= n <= 2^31-1
// Output Format

// Print according to the problem statement.

// For reference, check out the sample test case below.

// Sample Input 0

// 6
// Sample Output 0

// ******
// ******
// ******
// ******
// ******
// ******
// ******
// ******
// ******
// ******
// ******
// ******
// Sample Input 1

// 8
// Sample Output 1

// ********
// ********
// ********
// ********
// ********
// ********
// ********
// ********
// ********
// ********
// ********
// ********
// Sample Input 2

// 3
// Sample Output 2

// ***
// ***
// ***
// ***
// ***
// ***
// ***
// ***
// ***
// ***
// ***
// ***
// Sample Input 3

// 3
// Sample Output 3

// ***
// ***
// ***
// ***
// ***
// ***
// ***
// ***
// ***
// ***
// ***
// ***
// Sample Input 4

// 3
// Sample Output 4

// ***
// ***
// ***
// ***
// ***
// ***
// ***
// ***
// ***
// ***
// ***
// ***
// Sample Input 5

// 4
// Sample Output 5

// ****
// ****
// ****
// ****
// ****
// ****
// ****
// ****
// ****
// ****
// ****
// ****

import java.util.*;

public class Q1 {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        
        // Read the integer input n
        int n = scanner.nextInt();
        
        // Print the star rectangle with 12 lines
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line after printing n stars
        }
        
        scanner.close();
    }
}
