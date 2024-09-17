// // HW_Print n to 5

// Write a program to print numbers from n to 5 .Where n is taken as input from user.

// Input Format

// A single line n take input from user.

// Constraints

// 5 <= n <= 10^4
// Output Format

// Print numbers from n to 5.

// Sample Input 0

// 10
// Sample Output 0

// 10 9 8 7 6 5 
// Explanation 0

// Numbers from 10 to 5 are 10 9 8 7 6 5.

import java.util.*;

public class Q10 {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        
        // Read integer input n
        int n = scanner.nextInt();
        
        // Print numbers from n down to 5 in a single line separated by spaces
        for (int i = n; i >= 5; i--) {
            System.out.print(i);
            if (i > 5) {
                System.out.print(" "); // Print a space between numbers except after the last one
            }
        }
        
    }
}

// Time complexity: O(n - 5), which simplifies to O(n) in the worst case, as the loop runs from n to 5.
// Space complexity: O(1), because only a few variables are used and no additional significant memory is consumed.