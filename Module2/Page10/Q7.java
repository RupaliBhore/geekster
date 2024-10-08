// Find Unique

// Alice was a computer science student who loved to experiment with different programming techniques. One day, she came across a problem that required her to find the total number of unique digits in a given string.

// wirte a program that find out the number if unique digits in a string.

// Input Format

// First line contains an String consist of only numeric digits.

// Constraints

// 1 <= str.length() <= 10^4
// Output Format

// An integer value

// Sample Input 0

// 100234
// Sample Output 0

// 5
// Explanation 0

// above string contains 0 1 2 3 4 as unique digits

// Sample Input 1

// 000022
// Sample Output 1

// 2
// Explanation 1

// 0 and 2 are only two unique digits


import java.util.*;

public class Q7 {

     public static int countUniqueDigits(String str) {
        // Create a set to store unique digits
        Set<Character> uniqueDigits = new HashSet<>();
        
        // Iterate through each character in the string
        for (char c : str.toCharArray()) {
            // Add the character to the set (duplicates are ignored)
            uniqueDigits.add(c);
        }
        
        // The size of the set represents the number of unique digits
        return uniqueDigits.size();
    }

    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Read the input string
        String input = scanner.nextLine();
        
        // Close the scanner
        scanner.close();
        
        // Calculate and print the number of unique digits
        int result = countUniqueDigits(input);
        System.out.println(result);
    }
}