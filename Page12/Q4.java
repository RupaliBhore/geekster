// // HW_Find Permutation 1
// Given n and r, find the value of nPr.

// ( formula of npr=n!/(n-r)! ) 
// Input Format

// Take 2 input n and r as integer.

// Constraints

// 1 <= n,r <= 10^4
// Output Format

// Print a integer as output.

// Sample Input 0

// 5
// 2
// Sample Output 0

// 20
// Explanation 0

// Take n = 5 and r = 2.

// Output should be 20 by the formulae mentioned above.

import java.util.*;

public class Q4 {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        
        // Read integers n and r
        int n = scanner.nextInt();
        int r = scanner.nextInt();
        
        // Calculate nPr = n! / (n-r)!
        long nPr = permutation(n, r);
        
        // Print the result
        System.out.println(nPr);
        
    }
       private static long permutation(int n, int r) {
        long numerator = factorial(n);
        long denominator = factorial(n - r);
        return numerator / denominator;
    }
    
    // Function to calculate factorial of a number
    private static long factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        long fact = 1;
        for (int i = 2; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
}