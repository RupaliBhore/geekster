// Desired String
// Take a string as input. Print the count of all the substrings that start with ‘A’ and end with ‘A’. Also print the length of the longest such substring in the second line. In the third line, print that longest substring.

// If no such substring exists, print -1.

// Input Format

// Take string as an input.

// Constraints

// 1 <= str.length() <= 10^4
// Output Format

// Count of all the substrings
// Length of the longest substring
// Print the longest substring
// Sample Input 0

// ABADA
// Sample Output 0

// 3
// 5
// ABADA
// Explanation 0

// there are 3 substring ABA , ABADA and ADA. longest substring is ABADA and its length is 5

import java.util.*;

public class Q5 {

      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();
        
        int count = 0;
        int maxLength = 0;
        String longestSubstring = "";
        
        // Iterate through the string to find substrings starting and ending with 'A'
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'A') {
                for (int j = i + 1; j < input.length(); j++) {
                    if (input.charAt(j) == 'A') {
                        count++;  // Increment count for each valid substring
                        String substring = input.substring(i, j + 1);
                        int length = substring.length();
                        if (length > maxLength) {
                            maxLength = length;  // Update the maxLength
                            longestSubstring = substring;  // Update the longest substring
                        }
                    }
                }
            }
        }
        
        // Check if any valid substrings were found
        if (count == 0) {
            System.out.println(-1);
        } else {
            System.out.println(count);
            System.out.println(maxLength);
            System.out.println(longestSubstring);
        }
    }
}