// HW_Remove K Digits 2
// Given a non-negative integer num represented as a string, remove k digits from the number so that the new number is the smallest possible.

// Note:

// The length of num is less than 10002 and will be ≥ k.
// The given num does not contain any leading zero.
// Input Format

// First line contain a string num and number k.

// Constraints

// The length of num is less than 10002 and will be ≥ k.

// Output Format

// Print the output string after removing K digits.

// Sample Input 0

// 1432219 3
// Sample Output 0

// 1219
// Explanation 0

// Remove the three digits 4, 3, and 2 to form the new number 1219 which is the smallest



import java.util.*;

public class Q9 {

       public static String removeKdigits(String num, int k) {
        // Edge case: if k is equal to the length of the number, return "0"
        if (num.length() == k) {
            return "0";
        }

        Stack<Character> stack = new Stack<>();

        for (char digit : num.toCharArray()) {
            // Maintain a monotonically increasing stack by removing larger digits
            while (!stack.isEmpty() && k > 0 && stack.peek() > digit) {
                stack.pop();
                k--;
            }
            stack.push(digit);
        }

        // If k digits remain to be removed, pop from the end
        while (k > 0) {
            stack.pop();
            k--;
        }

        // Build the number from the stack
        StringBuilder sb = new StringBuilder();
        for (char digit : stack) {
            sb.append(digit);
        }

        // Remove leading zeros
        while (sb.length() > 0 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }

        // Return "0" if the result is empty
        return sb.length() == 0 ? "0" : sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        int k = sc.nextInt();
        System.out.println(removeKdigits(num, k));
    }
}
// finded
// Time Complexity: O(N), where N is the length of the string num. We traverse the number once and perform stack operations in O(1).
// Space Complexity: O(N), where N is the space used by the stack to store digits.