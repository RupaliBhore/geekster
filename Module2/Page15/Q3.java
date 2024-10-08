// Postfix expression calculation
// Given a string Str in Postfix expression calculate the result of this expression.
// String has 2 types of char.
// - case 1: char type1 = [0-9]
// - case 2: char type2 = [+, - , / ,* ]
// (Note : It can be assumed that the expression is always valid.)
// Input Format

// String with a postfix expression.

// Constraints

// 1 <= Str.length() <= 10^5
// Output Format

// Integer Output.

// Sample Input 0

// 4572+-*
// Sample Output 0

// -16
// Explanation 0

// Infix expression : 4 * (5 - (7 + 2)) => -16



import java.util.*;

public class Q3 {

 
    // Function to evaluate the postfix expression
    public static int evaluatePostfix(String exp) {
        Stack<Integer> stack = new Stack<>();
        
        // Traverse the string character by character
        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);
            
            // If the character is a digit, push it onto the stack
            if (Character.isDigit(c)) {
                stack.push(c - '0'); // Convert char to int
            } else {
                // It's an operator, so pop two elements from the stack
                int val2 = stack.pop();
                int val1 = stack.pop();
                
                // Perform the appropriate operation and push the result back onto the stack
                switch (c) {
                    case '+':
                        stack.push(val1 + val2);
                        break;
                    case '-':
                        stack.push(val1 - val2);
                        break;
                    case '*':
                        stack.push(val1 * val2);
                        break;
                    case '/':
                        stack.push(val1 / val2);
                        break;
                }
            }
        }
        
        // The final result will be on the top of the stack
        return stack.pop();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input the postfix expression
        String postfixExpression = sc.nextLine();
        
        // Evaluate and print the result of the postfix expression
        int result = evaluatePostfix(postfixExpression);
        System.out.println(result);
        
        sc.close();
    }
}
// // finded
// Time Complexity: O(n), where n is the length of the postfix expression since we traverse the string once and perform constant-time operations for each character.
// Space Complexity: O(n), where n is the length of the postfix expression, due to the stack used to store the operands.