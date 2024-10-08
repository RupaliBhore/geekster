// HW_Minimum Add to Make Parentheses Valid 3
// A parentheses string is valid if and only if:

// It is the empty string, It can be written as AB (A concatenated with B), where A and B are valid strings, or It can be written as (A), where A is a valid string. You are given a parentheses string s. In one move, you can insert a parenthesis at any position of the string.

// For example, if s = "()))", you can insert an opening parenthesis to be "(()))" or a closing parenthesis to be "())))". Return the minimum number of moves required to make s valid.

// Input Format

// First line contains a string s.

// Constraints

// 1 <= s.length <= 1000 s[i] is either '(' or ')'.

// Output Format

// Returns an integer value.

// Sample Input 0

// ())
// Sample Output 0

// 1
// Explanation 0

// Only 1 opening bracket will make the string s valid "(())"


import java.util.*;

public class Q6 {
   // Function to calculate the minimum moves to make the parentheses string valid
    public static int minAddToMakeValid(String s) {
        int balance = 0;  // Track the balance between '(' and ')'
        int moves = 0;    // Track the number of moves required

        // Traverse through each character in the string
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                balance++;  // Opening parenthesis increases balance
            } else {  // Closing parenthesis
                balance--;  // Closing parenthesis decreases balance
                if (balance < 0) {
                    // More closing parentheses than opening, so we need a move
                    moves++;
                    balance = 0;  // Reset balance because we "insert" an opening parenthesis
                }
            }
        }

        // Final answer is the moves made plus the remaining balance of unmatched '('
        return moves + balance;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the parentheses string
        String s = sc.nextLine();

        // Output the minimum moves required to make the string valid
        System.out.println(minAddToMakeValid(s));

        sc.close();
    }
}
//FINDED
//Time Complexity: O(n), where n is the length of the string. We traverse the string once.
// Space Complexity: O(1), as we only use a few integer variables to track the balance and moves.