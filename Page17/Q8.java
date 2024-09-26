// // HW_Reverse Digits
// You are given a number n , Write a program to reverse digits of n.

// Input Format

// The first line of input will contain an integer T — the number of test cases. The description of T test cases follows.

// For each test case, you will get an integer input.

// Constraints

// 1 <= T <= 10^4

// 1 <= n <= 10^4
// Output Format

// Print the reverse.

// Sample Input 0

// 4
// 1234
// 5678
// 4567
// 89
// Sample Output 0

// 4321
// 8765
// 7654
// 98
// Explanation 0



import java.util.*;

public class Q8 {

    public static int reverseNumber(int n) {
        int reversed = 0;
        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        return reversed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        int T = scanner.nextInt();
        
        // Loop through each test case
        for (int i = 0; i < T; i++) {
            int n = scanner.nextInt();
            // Print the reversed number
            System.out.println(reverseNumber(n));
        }
        
        scanner.close();
    }
}