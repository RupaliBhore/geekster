// HW_Longest Palindromic Substring 13

// Given a string str, return the longest palindromic substring in str.

// NOTE :-

// After answering the question, attempt the related question in the linked resource to improve your understanding of the question . Clickhere

// Input Format

// string str as an input.

// Constraints

// 1 <= str.length <= 10^2

// Output Format

// return the longest palindromic substring.

// Sample Input 0

// cbbd
// Sample Output 0

// bb

import java.util.*;

public class Q9 {

    public static String longestPalindromicSubstring(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        
        String longest = "";
        
        for (int i = 0; i < s.length(); i++) {
           
            String oddPalindrome = expandAroundCenter(s, i, i);
           
            String evenPalindrome = expandAroundCenter(s, i, i + 1);
            
           
            if (oddPalindrome.length() > longest.length()) {
                longest = oddPalindrome;
            }
            if (evenPalindrome.length() > longest.length()) {
                longest = evenPalindrome;
            }
        }
        
        return longest;
    }
    
     public static String expandAroundCenter(String s, int left, int right) {
       
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
       
        return s.substring(left + 1, right);
    }
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(longestPalindromicSubstring(str));
    }
}