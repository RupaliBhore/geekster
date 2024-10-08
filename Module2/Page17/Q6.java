// HW_Permutation in String 2
// Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.

// In other words, return true if one of s1's permutations is the substring of s2.

// Input Format

// The First line will represent String s1

// The Second line will represent String s2

// Constraints

// 1 <= s1.length, s2.length <= 10^4

// s1 and s2 consist of lowercase English letters

// Output Format

// return true if s2 contains a permutation of s1, or false otherwise.

// Sample Input 0

// ab
// eidbaooo
// Sample Output 0

// true


import java.util.Scanner;

public class Q6 {
    public static boolean checkInclusion(String s1, String s2) {
        int lenS1 = s1.length();
        int lenS2 = s2.length();
        
        // If s1 is longer than s2, no permutation of s1 can be a substring of s2
        if (lenS1 > lenS2) {
            return false;
        }

        // Frequency array for s1 and the current window in s2
        int[] count1 = new int[26];
        int[] count2 = new int[26];

        // Count the frequency of characters in s1
        for (int i = 0; i < lenS1; i++) {
            count1[s1.charAt(i) - 'a']++;
            count2[s2.charAt(i) - 'a']++;
        }

        // Slide over s2 with a window of size lenS1
        for (int i = lenS1; i < lenS2; i++) {
            // Compare frequency arrays
            if (matches(count1, count2)) {
                return true;
            }

            // Add the next character in the window
            count2[s2.charAt(i) - 'a']++;

            // Remove the leftmost character of the previous window
            count2[s2.charAt(i - lenS1) - 'a']--;
        }

        // Check the last window
        return matches(count1, count2);
    }

    // Helper function to compare two frequency arrays
    static boolean matches(int[] count1, int[] count2) {
        for (int i = 0; i < 26; i++) {
            if (count1[i] != count2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Reading input from user
        //System.out.println("Enter string s1:");
        String s1 = sc.nextLine();
        
        //System.out.println("Enter string s2:");
        String s2 = sc.nextLine();
        
        // Checking if any permutation of s1 is a substring of s2
        boolean result = checkInclusion(s1, s2);
        System.out.println(result);
        
        sc.close();
    }
}
//finded