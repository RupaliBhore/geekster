// // GKSTR46 Number of Digits

// Take an integer N as input.

// Print the number of digits present in N.

// Input Format

// An integer input N.

// Constraints

// 1 <= N <= 10^6
// Output Format

// Print an integer N.

// Sample Input 0

// 523
// Sample Output 0

// 3
// Explanation 0

// There are three didgits in number 523.


import java.util.*;

public class Q2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */Scanner scanner = new Scanner(System.in);
        
        // Read the integer input
        int N = scanner.nextInt();
        
        // Print the number of digits in N
        System.out.println(countDigits(N));
        
        scanner.close();
    }
    
    // Function to count the number of digits in the number
    private static int countDigits(int n) {
        int count = 0;
        while (n != 0) {
            n /= 10;
            count++;
        }
        return count;
    }
}