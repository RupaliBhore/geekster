// // HW_Print numbers 1-n in separate lines.

// As part of his programming assignment, Jack was required to write a program that would print each number from 1 to n on a new line. Jack used a loop to iterate over the numbers and printed each number on a new line. The program worked perfectly, and Jack submitted it on time.

// Input Format

// For each test case, you will get n as an integer input.

// Constraints

// 1 <= n <= 1000
// Output Format

// Print each number on a new line.

// Sample Input 0

// 5
// Sample Output 0

// 1
// 2
// 3
// 4
// 5
// Explanation 0

// print numbers from 1 to 5.
import java.util.*;

public class Q1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner scanner = new Scanner(System.in);

        // Read the input integer n
        int n = scanner.nextInt();

        // Print numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }

        // Close the scanner
        scanner.close();
    }
}

