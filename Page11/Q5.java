// // Fibonacci number 12

// You have given an integer n , you have to print first n numbers of the fibonacci series till n.

// Input Format

// First and only line of input contains integer n denoting the number.

// Constraints

// 1 <= n <= 1000
// Output Format

// Print fibonacci series till n.

// Sample Input 0

// 10
// Sample Output 0

// 0 1 1 2 3 5 8 13 21 34 
// Sample Input 1

// 5
// Sample Output 1

// 0 1 1 2 3 


import java.util.*;

public class Q5 {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        // Read input value n
        int n = scanner.nextInt();
        
        // Close scanner
        scanner.close();
        
        // Array to store Fibonacci series
        long[] fib = new long[n];

        // Base cases
        if (n >= 1) {
            fib[0] = 0; // F(1)
        }
        if (n >= 2) {
            fib[1] = 1; // F(2)
        }

        // Calculate Fibonacci numbers and store them in the array
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        // Print Fibonacci series up to n
        for (int i = 0; i < n; i++) {
            System.out.print(fib[i] + " ");
        }
        System.out.println(); 
    }
}