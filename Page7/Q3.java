// // HW_UpperCase_Or_LowerCase
// Take a Character as Input and check whether the character is in Uppercase or Lowercase.

// Print "Char is Uppercase" if the given character is an Uppercase or Capital Alphabet, and print "Char is Lowercase" if the character is an Lowercase or Small Alphabet.

// Note:- You can Assume that the given Character is an alphabet & Do not use built-in methods.

// Input Format

// Input Single Line

// A Character,ch of char type.
// Constraints

// ch contains aa alphabetic character
// Output Format

// Single Line of Output

// A String "Char is Uppercase" or "Char is Lowercase"
// Sample Input 0

// A
// Sample Output 0

// Char is Uppercase
// Explanation 0

// A is an uppercase character

// Sample Input 1

// h
// Sample Output 1

// Char is Lowercase
// Explanation 1

// h is a lowercase character

// Submissions: 52
// Max Score: 10
// Difficulty: Easy
// Rate This Challenge:

    
// More
 

import java.util.*;

public class Q3 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
          Scanner scanner = new Scanner(System.in);
        

        char ch = scanner.next().charAt(0);
        
        // Check if the character is uppercase or lowercase
        if (ch >= 65 && ch <= 90) {
            System.out.println("Char is Uppercase");
        } else if (ch >= 97 && ch <= 122) {
            System.out.println("Char is Lowercase");
        }
        
    }
}

