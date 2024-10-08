// // HW_Toggled String

// Lucas was a computer science student who enjoyed coding challenges. One day, he was given a programming problem that required him to take two input strings and determine if the first string was a toggle of the second string.

// Note : toggling means changing uppercase to lowercase and vice-versa

// Input Format

// First line contains a string input s1.

// Second line contains a string input s2.

// Constraints

// 1<=str1.length()<=100000
// 1<=str2.length()<=100000
// Output Format

// Return a boolean value

// Sample Input 0

// aBcD
// AbCd
// Sample Output 0

// true
// Explanation 0

// At each index of string 1 we are its toggled character in string 2

import java.util.*;

public class Q4 {

  public static boolean isToggle(String s1, String s2) {
        // Check if lengths are equal
        if (s1.length() != s2.length()) {
            return false;
        }

        // Check if each character is a toggle of the corresponding character
        for (int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            // Check if the characters are toggled versions of each other
            if (Character.isLowerCase(c1)) {
                if (Character.toUpperCase(c1) != c2) {
                    return false;
                }
            } else {
                if (Character.toLowerCase(c1) != c2) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Read the two input strings
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        
        // Close the scanner
        scanner.close();
        
        // Check if s1 is a toggle of s2 and print the result
        boolean result = isToggle(s1, s2);
        System.out.println(result);
    }
}