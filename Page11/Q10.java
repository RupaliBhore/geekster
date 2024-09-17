// // HW_Print In Range(x and y)
// Sarah was tasked with printing numbers from x till y, including both x and y, using a while loop. She took inputs for x and y from the user using a while loop, initialized a variable to x, and used a while loop to print the numbers until the value exceeded y. Sarah successfully completed the task, gained experience in using while loops, and felt more confident in her programming abilities.

// Input Format

// x and y are given to you as Input

// Constraints

// 0 <= x < y <= 10^4
// Output Format

// Print from X to Y(both Included)

// Sample Input 0

// 10
// 15
// Sample Output 0

// 10
// 11
// 12
// 13
// 14
// 15
// Explanation 0

// x is 10 y is 15 Printing Done from 10 to 15

import java.util.*;

public class Q10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read inputs x and y
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        // Close the scanner
        scanner.close();

        // Initialize current to x
        int current = x;

        // Print from x to y (both inclusive)
        while (current <= y) {
            System.out.println(current);
            current++; // Increment current
        }
    }
}