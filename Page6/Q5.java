// // Toggle the character
// Take in a character as an input from the user

// a. If the entered character is a small-case character, the convert it into the corresponding uppercase character and print it.

// b. If the entered character is an upper-case character, the convert it into the corresponding lowercase character and print it.

// Input Format

// For each test case, you will get an alphabet as a character input.

// Constraints

// The alphabet that is taken as input is only small-case or capital-case.
// Output Format

// Print the output as a character data-type.

// Sample Input 0

// a
// Sample Output 0

// A
// Sample Input 1

// K
// Sample Output 1

// k


import java.util.*;

public class Q5 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        
        char ch = scanner.next().charAt(0);
        
        if (Character.isLowerCase(ch)) {
            // Convert lowercase to uppercase
            char upperCaseChar = Character.toUpperCase(ch);
            System.out.println(upperCaseChar);
        } else if (Character.isUpperCase(ch)) {
            // Convert uppercase to lowercase
            char lowerCaseChar = Character.toLowerCase(ch);
            System.out.println(lowerCaseChar);
        } else {
            System.out.println("Invalid input. Please enter an alphabet character.");
        }
        
    }
}