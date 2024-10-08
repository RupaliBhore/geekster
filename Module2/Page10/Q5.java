// HW_Print Consonants Indices
// Given a string. Print the indices of consonants in the string.

// Input Format

// A String

// Constraints

// 1<=str.length()<=100000

// Output Format

// An integer series in single line

// Sample Input 0

// qwertyuiop
// Sample Output 0

// 0 1 3 4 5 9
// Explanation 0

// print the indices of character which are consonants


import java.io.*;
import java.util.*;

public class Q5{
public static void printConsonantIndices(String str) {
        // Convert the string to lowercase to handle case insensitivity
        str = str.toLowerCase();
        
        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            // Check if the character is a consonant
            if (Character.isLetter(ch) && !isVowel(ch)) {
                System.out.print(i + " ");
            }
        }
    }

    // Helper method to check if a character is a vowel
    private static boolean isVowel(char ch) {
        // Define vowels
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Read the input string
        String str = scanner.nextLine();
        
        // Close the scanner
        scanner.close();
        
        // Print the indices of consonants
        printConsonantIndices(str);
    }
}