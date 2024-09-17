// // HW_Print first N multiples of 9

// Alice, a programmer, was given a task to write a program that prints the first N multiples of 9 in a single line. She tackled the problem by using a loop to iterate over the numbers . Finally, Alice printed all N multiples of 9 in a single line.

// Input Format
// A single line take N as a input from user
// Constraints
// 2 <= N <= 100

// Output Format
// Print the first 20 multiples of 9 in a single line.

// Sample Input 0
// 20

// Sample Output 0
// 9 18 27 36 45 54 63 72 81 90 99 108 117 126 135 144 153 162 171 180 

import java.util.*;

public class Q6 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner scanner = new Scanner(System.in);
        
        // Read integer input N
        int N = scanner.nextInt();
        
        // Print the first N multiples of 9 in a single line
        for (int i = 1; i <= N; i++) {
            System.out.print(9 * i);
            if (i < N) {
                System.out.print(" "); // Print a space between multiples except after the last one
            }
        }
        
        // Print a new line after the output
        System.out.println();
    }
}

// Time complexity: O(N), because the loop runs N times to print the multiples.
// Space complexity: O(1), since only a few variables are used, and no significant additional memory is consumed beyond the input.