// HW_Reversing the equation 1

// Given a mathematical equation that contains only numbers and +, -, *, /. Print the equation in reverse, such that the equation is reversed, but the numbers remain the same.

// Input Format

// The First line will be representing String s.

// Constraints

// 1<=|S|<=10^5

// Output Format

// Return the reverse equation

// Sample Input 0

// 20-3+5*2
// Sample Output 0

// 2*5+3-20

import java.util.*;

public class Q10 {

  // Function to reverse the mathematical equation
    public static String reverseEquation(String s) {
        Stack<String> stack = new Stack<>();
        StringBuilder number = new StringBuilder();
        
        // Traverse the string
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            // If the current character is a digit, accumulate it in 'number'
            if (Character.isDigit(c)) {
                number.append(c);
            } else {
                // If an operator is encountered, push the number and operator separately
                if (number.length() > 0) {
                    stack.push(number.toString());
                    number.setLength(0); // Clear the StringBuilder for the next number
                }
                // Push the operator
                stack.push(String.valueOf(c));
            }
        }
        
        // If there is a number left in the 'number' after the loop, push it onto the stack
        if (number.length() > 0) {
            stack.push(number.toString());
        }
        
        // Pop the elements from the stack to reverse the equation
        StringBuilder reversedEquation = new StringBuilder();
        while (!stack.isEmpty()) {
            reversedEquation.append(stack.pop());
        }
        
        return reversedEquation.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input the equation string
        String s = sc.nextLine();
        
        // Print the reversed equation
        System.out.println(reverseEquation(s));
        
        sc.close();
    }
}
//Finded
// Time and Space Complexity:
// Time Complexity: O(n), where n is the length of the input string, since we traverse the string once and perform constant-time operations for each character.
// Space Complexity: O(n), due to the stack used to store the numbers and operators.