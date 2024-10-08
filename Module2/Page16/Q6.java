// HW_First Unique Character in a String


// You are given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

// NOTE :- After answering the question, attempt the related question in the linked resource to improve your understanding of the question . Question Link -> https://leetcode.com/problems/first-unique-character-in-a-string

// Input Format

// A String
// Constraints

// 1 <= s.length <= 10^5
// s consists of only lowercase English letters.
// Output Format

// An Integer Value
// Sample Input 0

// geekugeek
// Sample Output 0

// 4
// Sample Input 1

// geekuhgfdrteugeek
// Sample Output 1

// 5
// Sample Input 2

// geekuhgfdrteugeekgeekuhgfdrteugeekja
// Sample Output 2

// 34
// Submissions: 17
// Max Score: 10
// Difficulty: Medium
// Rate This Challenge:

    
import java.util.*;

public class Q6 {
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Read the input string
        String s = scanner.nextLine();
        
        // Call the function to find the first non-repeating character index
        int index = firstUniqueCharacter(s);
        
        // Print the result
        System.out.println(index);
        
        scanner.close();
    }

    private static int firstUniqueCharacter(String s) {
        // Create a HashMap to store character counts
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        // Count occurrences of each character
        for (char c : s.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Find the index of the first non-repeating character
        for (int i = 0; i < s.length(); i++) {
            if (charCountMap.get(s.charAt(i)) == 1) {
                return i; // Return the index
            }
        }

        return -1; // Return -1 if no non-repeating character is found
    }
}
//finded
// Time Complexity: O(n), where n is the length of the string. We make two passes over the string: one for counting characters and another for finding the first unique character.
// Space Complexity: O(1) for the character map, since we are only dealing with lowercase English letters (at most 26 unique characters).

