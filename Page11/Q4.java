// // Nth Fibonacci Number 7

// Nth term of Fibonacci series F(n), where F(n) is a function, is calculated using the following formula -

// F(n) = F(n-1) + F(n-2), 
// Where, F(1) = F(2) = 1
// Provided N you have to find out the Nth Fibonacci Number.

// Input Format

// The first line of each test case contains a real number N.

// Constraints

// 1 <= N <= 10000 

// Where ‘N’ represents the number for which we have to find its equivalent Fibonacci number.
// Output Format

// For each test case, Return its equivalent Fibonacci number.

// Sample Input 0

// 6
// Sample Output 0

// 8
// Explanation 0

// Now the number is ‘6’ so we have to find the “6th” Fibonacci number

// So by using the property of the Fibonacci series i.e 

// 1, 1, 2, 3, 5, 8

// So the “6th” element is “8” hence we get the output.
// Sample Input 1

// 5
// Sample Output 1

// 5



import java.util.*;

public class Q4 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
                
  Scanner scanner = new Scanner(System.in);

        // Read input value N
        int N = scanner.nextInt();

        // Close scanner
        scanner.close();

        // Array to store Fibonacci numbers
        long[] fib = new long[N + 1];

        // Base cases
        if (N >= 1) {
            fib[1] = 1;
        }
        if (N >= 2) {
            fib[2] = 1;
        }

        // Calculate Fibonacci numbers iteratively
        for (int i = 3; i <= N; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        // Output the Nth Fibonacci number
        System.out.println(fib[N]);
    }
}


