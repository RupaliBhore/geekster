// Valid Parentheses 4



// import java.util.*;
// Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

// An input string is valid if:

// Open brackets must be closed by the same type of brackets.
// Open brackets must be closed in the correct order.
// Input Format

// 1 <= s.length <= 10^4
// s consists of parentheses only '()[]{}'
// Constraints

// 1 <= s.length <= 10^4

// Output Format

// print 'true' or 'false'

// Sample Input 0

// ()[]{}
// Sample Output 0

// true
// Sample Input 1

// (]
// Sample Output 1

// false

public class Q2 {

   public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else {
                if (st.size() == 0) {
                    return false;
                } else if (ch == ')' && st.peek() != '(') {
                    return false;
                } else if (ch == ']' && st.peek() != '[') {
                    return false;
                } else if (ch == '}' && st.peek() != '{') {
                    return false;
                } else {
                    st.pop();
                }
            }
        }
        return st.size() == 0;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        System.out.println(isValid(s));
    }
}
//discussed one