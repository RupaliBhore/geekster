// // print a to z

// You have to print characters from a till z where each character should be printed in a separate line.

// Input Format

// No input will be given

// Constraints

// No constraints are needed
// Output Format

// Print characters as given in the problem statement.

public class Q4 {

    public static void main(String[] args) {
         for (char c = 'a'; c <= 'z'; c++) {
            System.out.println(c);
        }
    }
    
}
// Time complexity: O(1), since the loop iterates a fixed number of times (26 iterations) regardless of input size.
// Space complexity: O(1), as only a single loop variable (c) is used and no additional significant memory is consumed.