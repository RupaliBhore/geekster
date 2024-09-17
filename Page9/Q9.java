// // HW_Print series n, n-3k, n-6k, n-12k..
// You are required to write a program that takes two integer inputs: n and k. The program should generate a series of numbers based on the following pattern:

// n, n-3k, n-6k, n-9k, n-12k, and so on, until the value to be printed is greater than zero.

// Your task is to implement a program that will output this series of number.

// Input Format

// For each test case, you will get n and k as an integer input.

// Constraints

// 1 <= n <= 1000
// 1 <= k <= 50
// Output Format

// Print the series in a single line.

// Sample Input 0

// 20
// 1
// Sample Output 0

// 20 17 14 11 8 5 2 
// Explanation 0

// In the above test case n=20 and k=1 so , the series are 20 17 14 11 8 5 2

// n=20

// 20-3*1=17

// 20-6*1=14

// 20-9*1=11

// 20-12*1=8

// 20-15*1=5

// 20-18*1=2


import java.util.*;

public class Q9 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        
        // Read inputs n and k
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        
        // Initialize variable to track the current number
        int current = n;
        
        // Print the first number in the series (which is n)
        System.out.print(current);
        
        // Loop to generate and print the series
        while (current > 0) {
            current -= 3 * k;
            if (current > 0) {
                System.out.print(" " + current);
            }
        }
        
    }
}
