// HW_Length of Longest Palindrome

// You are given a string str, print the length of the longest palindrome that can be formed using the characters of the string.

// Letters are case sensitive, for example, "Aa" is not considered a palindrome here.

// str consists of lowercase or uppercase letters.

// NOTE :- After answering the question, attempt the related question in the linked resource to improve your understanding of the question . Question Link -> https://leetcode.com/problems/longest-palindrome/

// Input Format

// A String
// Constraints

// 1 <= s.length <= 2000
// str consists of lowercase and/or uppercase English letters only.
// Output Format

// An integer value
// Sample Input 0

// abccccdd
// Sample Output 0

// 7
// Explanation 0

// One longest palindrome that can be formed is "dccaccd", whose length is 7.


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input: Read the string
        String str = scanner.nextLine();
        
        // Output: Calculate and print the length of the longest palindrome
        System.out.println(longestPalindromeLength(str));
        
        scanner.close();
    }

    private static int longestPalindromeLength(String str) {
        Map<Character, Integer> charCount = new HashMap<>();
        
        // Count the frequency of each character
        for (char c : str.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        int length = 0;
        boolean hasOddCount = false;

        // Calculate the length of the longest palindrome
        for (int count : charCount.values()) {
            if (count % 2 == 0) {
                length += count; // Add even counts directly
            } else {
                length += count - 1; // Add odd counts minus one
                hasOddCount = true;   // Indicate we have at least one odd count
            }
        }

        // If there is at least one odd character, we can place one in the center
        if (hasOddCount) {
            length += 1;
        }

        return length;
    }
}
//finded
