// Valid Anagram 5

// Given two strings s and t, return true if t is an anagram of s, and false otherwise. An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

// Input Format

// The First line will be contains String s.

// The Second line will be contains String t.

// Constraints

// 1 <= s.length, t.length <= 5 * 10^4

// s and t consist of lowercase English letters.

// Output Format

// return true if t is an anagram of s, and false otherwise.

// Sample Input 0

// anagram
// nagaram
// Sample Output 0

// true


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input: Read the first and second strings
        String s = scanner.nextLine();
        String t = scanner.nextLine();
        
        // Output: Check if t is an anagram of s
        System.out.println(isAnagram(s, t));
        
        scanner.close();
    }
    
    private static boolean isAnagram(String s, String t) {
        // Step 1: Check if lengths are equal
        if (s.length() != t.length()) {
            return false;
        }
        
        // Step 2: Count characters using a frequency map
        Map<Character, Integer> charCount = new HashMap<>();
        
        // Count characters in the first string
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        
        // Decrease counts based on the second string
        for (char c : t.toCharArray()) {
            if (!charCount.containsKey(c)) {
                return false; // Character not in s
            }
            charCount.put(c, charCount.get(c) - 1);
            // If count goes to zero, remove it from the map
            if (charCount.get(c) == 0) {
                charCount.remove(c);
            }
        }
        
        // If the map is empty, it means all counts matched
        return charCount.isEmpty();
    }
}
//finded