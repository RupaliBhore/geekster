// // Is Palindrome
// Take a String str as input, and check whether the string is Palindrome or not.

// Print "Palindrome" if the string is Palindrome else print "Not a Palindrome".

// Note: A string is called a palindrome string if the reverse of that string is the same as the original string.

// NOTE:- After answering the question, attempt the related question in the linked resource to improve your understanding of the question . Question Link -> https://leetcode.com/problems/valid-palindrome

// Input Format

// Single Line input.

// A String str
// Constraints

// 1<=str.length<=10^5
// Output Format

// A String "Palindrome" or "Not a Palindrome"

// Sample Input 0

// radar
// Sample Output 0

// Palindrome


import java.util.*;

public class Q10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the input string
        String str = scanner.nextLine();
        
        // Close the scanner
        scanner.close();
        
        // Check if the string is a palindrome
        if (isPalindrome(str)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }

    private static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
}