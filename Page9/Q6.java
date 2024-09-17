// // Print a, B, c, D, e, F, g...... 26 characters
// Print a, B, c, D, e, F, g...... 26 characters where each character should be printed in a separate line.

// Input Format

// No input will be given

// Constraints

// No constraints are there
// Output Format

// Print as mentioned in the problem statement.

// Sample Output 0

// a
// B
// c
// D
// e
// F
// g
// H
// i
// J
// k
// L
// m
// N
// o
// P
// q
// R
// s
// T
// u
// V
// w
// X
// y
// Z

public class Q6 {

    public static void main(String[] args) {
     char currentChar = 'a';
        
        for (int i = 0; i < 26; i++) {
            if (i % 2 == 0) {
                // Print lowercase character for even indices
                System.out.println(currentChar);
            } else {
                // Print uppercase character for odd indices
                System.out.println(Character.toUpperCase(currentChar));
            }
            // Move to the next character in the alphabet
            currentChar = (char) (currentChar + 1);
        } }
}

// Time complexity: O(1), because the loop runs a fixed number of times (26 iterations) regardless of input size.
// Space complexity: O(1), as only a few variables are used and no additional significant memory is consumed.