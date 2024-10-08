// HW_Longest K unique characters substring

// Given a string you need to print the size of the longest possible substring that has exactly K unique characters. If there is no possible substring then print -1.

// Input Format

// Take the String S as in input

// Take the Integer K as in input

// Constraints

// 1 ≤ |S| ≤ 10^5

// 1 ≤ K ≤ 26

// Output Format

// returns the length of the longest substring with exactly K distinct characters. If there is no substring with exactly K distinct characters then return -1.

// Sample Input 0

// aabacbebebe
// 3
// Sample Output 0

// 7
// Sample Input 1

// aaaa
// 2
// Sample Output 1

// -1



import java.util.HashMap;
import java.util.Scanner;

public class Q10 {
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