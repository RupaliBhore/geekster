// // Print a, c, e... till the characters are less than z

// Print a, c, e... till the characters are less than z, where each character is printed in a separate line.

// Input Format

// No input will be given

// Constraints

// There are no constraints
// Output Format

// Print the output as given in the problem statement

// Sample Output 0

// a
// c
// e
// g
// i
// k
// m
// o
// q
// s
// u
// w
// y

public class Q5 {

    public static void main(String[] args) {
       
        for (char c = 'a'; c < 'z'; c += 2) {
            System.out.println(c);
        }
    
    }
}

// Time complexity: O(1), as the loop runs a fixed number of times (approximately 13 iterations).
// Space complexity: O(1), because only a single loop variable (c) is used and no additional significant memory is consumed.





