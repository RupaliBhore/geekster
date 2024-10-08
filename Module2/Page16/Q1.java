// Word Meaning
// You are required to create a dictionary consisting of word and its meaning.

// Take an integer N as input and Continue the process untill Case 4 is not achieved.

// If N==1, take word and meaning as input from user and add it to the dictionary.
// If N==2, take a word as input from the user and print its meaning, if the word is not found print -1.
// If N==3, take a word as input from the user and delete it from the dictionary.
// If N==4, Close the dictionary(Exit the program).
// Input Format

// Integer N.
// String Word and Meaning.
// Constraints

// 1<=N<=4
// 1<=word.length(), meaning.length()<=10^3
// Output Format

// As described in Problem Statement
// Sample Input 0

// 1 
// Geekster 
// Coding
// 1
// Geek
// Coder
// 2
// Geek
// 3
// Geekster
// 2
// Geekster
// 4
// Sample Output 0

// Coder
// -1
// Sample Input 1

// 1 
// Geekster 
// Coding
// 1
// Geek
// Coder
// 2
// Geek
// 3
// Geek
// 2
// Geekster
// 2
// Geek
// 4
// Sample Output 1

// Coder
// Coding
// -1


import java.util.HashMap;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input String
        String s = scanner.nextLine();
        // Input K
        int k = scanner.nextInt();
        
        int result = lengthOfLongestSubstringKUnique(s, k);
        System.out.println(result);
    }

    public static int lengthOfLongestSubstringKUnique(String s, int k) {
        if (s.length() == 0 || k == 0) {
            return -1;
        }

        HashMap<Character, Integer> charCount = new HashMap<>();
        int maxLength = -1;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            // Add current character to the map
            charCount.put(s.charAt(right), charCount.getOrDefault(s.charAt(right), 0) + 1);

            // If there are more than K unique characters, shrink the window
            while (charCount.size() > k) {
                charCount.put(s.charAt(left), charCount.get(s.charAt(left)) - 1);
                if (charCount.get(s.charAt(left)) == 0) {
                    charCount.remove(s.charAt(left));
                }
                left++;
            }

            // Check if the current window has exactly K unique characters
            if (charCount.size() == k) {
                maxLength = Math.max(maxLength, right - left + 1);
            }
        }

        return maxLength;
    }
}