// // Small Capital or Digit
// Take in a character as an input and then

// a. Print Small case if it is a small case character.

// b. Print Capital case if it is a capital case character.

// c. Print Digit if it is a digit.

// d. Print None is none of the above conditions follow.

// Input Format

// For each test case you will get a character as an input from the user.

// Constraints

// A character will be given as an input.
// Output Format

// Print the string accordingly.

// Sample Input 0

// a
// Sample Output 0

// Small case
// Explanation 0

// Since the entered character is a small case character, so we print the string "Small case"

// Sample Input 1

// z
// Sample Output 1

// Small case
// Sample Input 2

// A
// Sample Output 2

// Capital case
// Sample Input 3

// D
// Sample Output 3

// Capital case
// Sample Input 4

// Z
// Sample Output 4

// Capital case
// Sample Input 5

// 0
// Sample Output 5

// Digit
// Sample Input 6

// 9
// Sample Output 6

// Digit
// Sample Input 7

// ?
// Sample Output 7

// None

import java.util.*;

public class Q3 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       Scanner scanner = new Scanner(System.in);
        
        char inputChar = scanner.next().charAt(0);
        
        if (Character.isLowerCase(inputChar)) {
            System.out.println("Small case");
        } else if (Character.isUpperCase(inputChar)) {
            System.out.println("Capital case");
        } else if (Character.isDigit(inputChar)) {
            System.out.println("Digit");
        } else {
            System.out.println("None");
        }
    }
}

