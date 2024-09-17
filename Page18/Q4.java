// // Prime checker 2

import java.util.*;

public class Q4 {

    public static boolean isPrime(int N) {
        if (N <= 1) {
            return false;
        }
        if (N == 2) {
            return true;
        }
        if (N % 2 == 0) {
            return false;
        }
        
        // Check for divisibility from 3 up to sqrt(N)
        for (int i = 3; i * i <= N; i += 2) {
            if (N % i == 0) {
                return false;
            }
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input number of test cases
       
        int T = scanner.nextInt();
        
        // Process each test case
        for (int t = 0; t < T; t++) {
            // Input N for each test case
           
            int N = scanner.nextInt();
            
            // Check if N is prime
            if (isPrime(N)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
        
        scanner.close();
    }
}
//Time Complexity: 𝑂(𝑇×𝑁) because each primality test runs in O(N​) time and there are T test cases.
//Space Complexity: O(1) due to the constant space used for integer variables in the algorithm.










// Write a Java program to check whether a number is a Prime number or not.

// Input Format

// The first line of input will contain an integer T — the number of test cases. The description of T test cases follows.

// For each test case,

// First line contain an integer N.

// Constraints

// 1 <= N <= 10^4
// Output Format

// Print Yes or No.

// Sample Input 0

// 1
// 5
// Sample Output 0

// Yes
