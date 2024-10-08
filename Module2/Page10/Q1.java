// // Print Indices of Vowels

// Maggie is a language enthusiast who loves exploring the intricacies of different languages. One day, while studying English, she comes across a coding challenge that involves printing the indices of vowels in a given string.

// Maggie is determined to solve the challenge and begins working on the problem.

// Help Maggie and write a program that prompts the user to input a string, and then scans the string for vowels while keeping track of the indices. Whenever you find a vowel print the index.

// Input Format

// Input contains a String str.

// Constraints

// 1 <= str.length() <= 10^4
// Output Format

// Return An series of integer number in single line.

// Sample Input 0

// aqua
// Sample Output 0

// 0 2 3
// Explanation 0

// at index 0 we have a

// at index 2 we have u

// at index 3 we have a


import java.util.*;

public class Q1 {

  public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Read the input string
        String str = scanner.nextLine();
        
        // Close the scanner
        scanner.close();
        
        // Initialize a string to store indices
        StringBuilder result = new StringBuilder();
        
        // Define a string containing all vowels
        String vowels = "aeiouAEIOU";
        
        // Iterate through the string
        for (int i = 0; i < str.length(); i++) {
            // Check if the current character is a vowel
            if (vowels.indexOf(str.charAt(i)) != -1) {
                // Append the index to the result
                result.append(i).append(" ");
            }
        }
        
        // Print the result with a trailing newline
        System.out.println(result.toString().trim());
    }
}