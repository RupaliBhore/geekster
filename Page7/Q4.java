// // GKSTR09 Print_Range


// Given a number n, print all integers in range 1 to n.

// You can assume that input is a positive integer

// Input Format

// Single line of input

// An integer n
// Constraints

// 1 <= n <= 1000
// Output Format

// A range/series of numbers from 1 till n, with each number in one line

// Sample Input 0

// 5
// Sample Output 0

// 1
// 2
// 3
// 4
// 5
// Explanation 0

// Since n is 5, output is numbers from 1 to 5

import java.util.*;

public class Q4 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        
        // Read input
        int n = scanner.nextInt();
        
        // Loop from 1 to n and print each number
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
        
    }
}