// HW_Remove Outermost Parentheses 4

// A valid parentheses string is either empty "", "(" + A + ")", or A + B, where A and B are valid parentheses strings, and + represents string concatenation.

// Return s after removing the outermost parentheses of every primitive string in the primitive decomposition of s.

// Input Format

// The first line be String S .

// Constraints

// 1 <= s.length <= 10^5

// s[i] is either '(' or ')'.

// s is a valid parentheses string.

// Output Format

// Return s after removing the outermost parentheses of every primitive string in the primitive decomposition of s.

// Sample Input 0

// (()())(())
// Sample Output 0

// ()()()


import java.util.*;

public class Q10 {

   public static String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int balance = 0;

        // Traverse the string
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                // If balance is greater than 0, it's not an outer '('
                if (balance > 0) {
                    result.append(ch);
                }
                balance++;
            } else {
                balance--;
                // If balance is greater than 0, it's not an outer ')'
                if (balance > 0) {
                    result.append(ch);
                }
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(removeOuterParentheses(s));
    }
}
// finded
// Time Complexity: O(N), where N is the length of the string. We process each character exactly once.
// Space Complexity: O(N), because we use a StringBuilder to store the result string.





