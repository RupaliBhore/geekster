// // Pattern 1 - Print Stars in same line

// Take an integer input n and print n stars in the same straight line.

// Input Format

// You will be given an integer input n.

// Constraints

// 0 <= n <= 2^31-1
// Output Format

// Print as given in the problem statement.

// For better understanding, check the test case below.

// Sample Input 0

// 5
// Sample Output 0

// *****
// Sample Input 1

// 7
// Sample Output 1

// *******
// Sample Input 2

// 9
// Sample Output 2

// *********
// Sample Input 3

// 10
// Sample Output 3

// **********

import java.util.*;

public class Q10 {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        
        // Read the integer input
        int n = scanner.nextInt();
        
        // Print n stars in the same straight line
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        
        scanner.close();
    }
}