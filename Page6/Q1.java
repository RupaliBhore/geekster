// // Male or Female
// Take in a ch as a character input from the user, and print You are a male if M or m is taken as input. And print You are a female if F or f is taken as input. And if some other character is taken as an input, then print Type again.

// Input Format

// For each test case, You will be given a ch as a character input.

// Constraints

// For each test case,
// you will be given a character as an input.
// Output Format

// Print the string accordingly.

// Sample Input 0

// M
// Sample Output 0

// You are a male
// Explanation 0

// Since we get the character 'M' as an input from the user, so we print the string "You are a male"

// Sample Input 1

// f
// Sample Output 1

// You are a female
// Explanation 1

// Since the character 'f' is taken as a character input from the user, so we print the string "You are a female"

// Sample Input 2

// m
// Sample Output 2

// You are a male
// Sample Input 3

// F
// Sample Output 3

// You are a female
// Sample Input 4

// j
// Sample Output 4

// Type again

import java.util.*;

public class Q1{

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        char ch = scanner.next().charAt(0);

        // Determine gender based on input character
        if (ch == 'M' || ch == 'm') {
            System.out.println("You are a male");
        } else if (ch == 'F' || ch == 'f') {
            System.out.println("You are a female");
        } else {
            System.out.println("Type again");
        }
    }
}


