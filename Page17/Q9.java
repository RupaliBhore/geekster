// // HW_Check Palindrome
// Write a Program to check whether a given number n is a Palindrome or not.

// Definition of Palindrome:- A number which is equal to the reverse of the number.

// Input Format

// For each test case, you will get an positive integer input.

// Constraints

// 10 <= n <= 10^4
// Output Format

// If number is a Palindrome then Print "YES"

// If number is not a Palindrome number then Print "NO"

// Sample Input 0

// 3
// 121
// 123
// 333
// Sample Output 0

// YES
// NO
// YES
// Explanation 0

// Number 121 is equal to its reverse so, the answer will be YES

import java.util.*;

public class Q9 {

   // Function to check if a number is a palindrome
    public static boolean isPalindrome(int n) {
        int originalNumber = n;
        int reversed = 0;
        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        return originalNumber == reversed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        int T = scanner.nextInt();
        
        // Loop through each test case
        for (int i = 0; i < T; i++) {
            int n = scanner.nextInt();
            // Print "YES" if the number is a palindrome, otherwise "NO"
            if (isPalindrome(n)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        scanner.close();
    }
}