// // Add if a digit
// Take in a character as an input from the user

// a. If the entered character is a digit, then add 100 to the value of the digit entered and print the final answer.

// Convert the digit which is added as a character data-type into the integer data-type using two ways,

// First: By using [Use the in-built function Character.getNumericValue]

// Second using: By manipulating the digit character data-type into the integer data-type.
// b. Else print This is not a digit

// Input Format

// For each test case, you will get ch as a character data-type.

// Constraints

// You will be given a character as an input.
// Output Format

// Print according to the given conditions.

// Sample Input 0

// 7
// Sample Output 0

// 107
// Explanation 0

// Since the entered character is a digit, so we add 100 to the value of the digit and print the final answer.

// Sample Input 1

// 5
// Sample Output 1

// 105
// Sample Input 2

// a
// Sample Output 2

// This is not a digit
// Explanation 2

// Since the entered character is not a digit so we print the string "This is not a digit"

// Sample Input 3

// A
// Sample Output 3

// This is not a digit
// Sample Input 4

// ?
// Sample Output 4

// This is not a digit

import java.util.*;

public class Q4 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
           Scanner scanner = new Scanner(System.in);
        
      
        char ch = scanner.next().charAt(0);
        
        if (Character.isDigit(ch)) {
            // Convert char to int using Character.getNumericValue
            int digitValue1 = Character.getNumericValue(ch);
            int result1 = digitValue1 + 100;
            System.out.println(result1);
        } else {
            System.out.println("This is not a digit");
        }
    }
}