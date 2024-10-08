// HW_Find First Palindromic String in the Array

// Given an array of strings words, return the first palindromic string in the array. If there is no such string, return an string "empty".

// A string is palindromic if it reads the same forward and backward.

// Input Format

// first line is the length of array of string
// array of string
// Constraints

// 1 <= words.length <= 100
// 1 <= words[i].length <= 100
// words[i] consists only of lowercase English letters.
// Output Format

// Return the palindromic string from the array, print "empty" if string is not possible.

// Sample Input 0

// 5
// abc car ada racecar cool 
// Sample Output 0

// ada
// Explanation 0

// The first string that is palindromic is "ada".
//  Note that "racecar" is also palindromic, but it is not the first.
// Sample Input 1

// 2
// def ghi
// Sample Output 1

// empty
// Explanation 1

//  There are no palindromic strings, so the empty string is returned.


import java.util.*;

public class Q1 {

  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the length of the array
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline
        
        // Read the array of strings
        String[] words = scanner.nextLine().split(" ");
        
        // Find and print the first palindromic string
        String result = findFirstPalindromicString(words);
        System.out.println(result);
    }
    
    private static String findFirstPalindromicString(String[] words) {
        for (String word : words) {
            if (isPalindrome(word)) {
                return word; // Return the first palindromic string
            }
        }
        return "empty"; // Return "empty" if no palindromic string is found
    }
    
    private static boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;
        
        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false; // Not a palindrome
            }
            left++;
            right--;
        }
        return true; // Is a palindrome
    }
}