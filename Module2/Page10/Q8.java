// // Locate the Target String

// Given two strings str & target, return the index where target string occurs for the first time in String str.

// Input Format

// The first line contains the string str.
// The second line contains the string target.
// Constraints

// 1 <= str.length <= 10^4
// str consists of lowercase English letters.
// Output Format

// Print the index where the target string occurs for the first time.
// If the target string is not found, print -1.
// Sample Input 0

// geekster
// st
// Sample Output 0

// 4
// Explanation 0

// The string "geekster" contains the target string "st" from index [4-5]. So, the starting index (4) is printed as the result.

// Sample Input 1

// geekster
// ab
// Sample Output 1

// -1
// Explanation 1

// String "geekster" does not contain "ab". So, result is -1.


import java.util.*;

public class Q8 {
    public static int findFirstOccurrence(String str, String target) {
        // Use the indexOf method to find the index of the first occurrence of target in str
        return str.indexOf(target);
    }

    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Read the main string
        String str = scanner.nextLine();
        
        // Read the target string
        String target = scanner.nextLine();
        
        // Close the scanner
        scanner.close();
        
        // Find the index of the first occurrence of target in str
        int result = findFirstOccurrence(str, target);
        
        // Print the result
        System.out.println(result);
    }
}