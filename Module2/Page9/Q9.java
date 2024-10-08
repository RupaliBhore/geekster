// // Print Characters
// Amy is a high school student who is passionate about coding. One day, her computer science teacher gives the class an assignment to print all the characters of a given string in separate lines.

// Amy immediately gets to work and writes a simple program. However, she feels that her solution is too basic and wants to find a more efficient way to solve the problem.

// can you help Amy by writing a program thst print all the characters of a given string in separate lines.

// Input Format

// Input contains a String.

// Constraints

// 1<=str.length<=10000
// Output Format

// Print each character in differnt line

// Sample Input 0

// String
// Sample Output 0

// S
// t
// r
// i
// n
// g


import java.util.*;

public class Q9 {

    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Read the input string
        String input = scanner.nextLine();
        
        // Close the scanner
        scanner.close();
        
        // Print each character of the string on a new line
        for (int i = 0; i < input.length(); i++) {
            System.out.println(input.charAt(i));
        }
    }
}