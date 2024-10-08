// HW_Count the Reversals 3

// Given a string S consisting of only opening and closing curly brackets '{' and '}', find out the minimum number of reversals required to convert the string into a balanced expression. A reversal means changing '{' to '}' or vice-versa.

// Input Format

// The First line will be contain String S

// Constraints

// 1 ≤ |S| ≤ 10^5

// Output Format

// returns the minimum number of reversals required to balance the bracket sequence. If balancing is not possible, return -1.

// Sample Input 0

// }{{}}{{{
// Sample Output 0

// 3


import java.util.*;

public class Q8 {

    public static int countReversals(String s) {
        int len = s.length();

        // If length is odd, it is impossible to balance
        if (len % 2 != 0) {
            return -1;
        }

        // Initialize counters for unbalanced brackets
        int open = 0, close = 0;

        // Traverse the string
        for (int i = 0; i < len; i++) {
            char ch = s.charAt(i);

            // If it's an opening bracket, increase open counter
            if (ch == '{') {
                open++;
            } else { // It's a closing bracket
                if (open > 0) {
                    open--;  // Found a match for an opening bracket
                } else {
                    close++; // Unbalanced closing bracket
                }
            }
        }

        // Minimum reversals required to balance
        return (open + 1) / 2 + (close + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(countReversals(s));
    }
}
// // Finded
// Time Complexity:
// The algorithm runs in O(N) since we only traverse the string once.

// Space Complexity:
// The space complexity is O(1) since we only need a few variables to store counts of unbalanced brackets.