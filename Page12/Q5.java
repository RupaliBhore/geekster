// // HW_Print fibonacci series 2

// You are given an input n as an integer input , Write a program to print the alternate fibonacci numbers starting from the first fibonacci till the nth fibonacci numbers accordingly , if nth fibonacci number is part of the series or not.

// Input Format

// For each test case, you will get n as an integer input.

// Constraints

// 1 <= n <= 50
// Output Format

// Print the output in a single line.

// Sample Input 0

// 10
// Sample Output 0

// 0 1 3 8 21 
// Explanation 0

// Alternate fibonacci till nth fibonacci are 0 1 3 8 21

import java.util.*;

public class Q5 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
           Scanner scanner = new Scanner(System.in);
        
        // Read the integer n from input
        int n = scanner.nextInt();
        
        // Edge case: If n is 1, only need to print the first Fibonacci number
        if (n == 1) {
            System.out.println(0); // The first Fibonacci number is 0
            return;
        }
        
        // Initialize the Fibonacci sequence array
        int[] fibonacci = new int[n];
        
        // Compute the Fibonacci sequence up to the nth Fibonacci number
        fibonacci[0] = 0; // F(0)
        fibonacci[1] = 1; // F(1)
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2]; // F(n) = F(n-1) + F(n-2)
        }
        
        // Print alternate Fibonacci numbers
        for (int i = 0; i < n; i += 2) {
            System.out.print(fibonacci[i] + " ");
        }
    }
}
