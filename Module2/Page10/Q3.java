// HW_String Print

// Take a string str as input and print all its characters such that each character is printed in the same line by giving a tab after printing each character.

// Input Format

// Input contains a string str.

// Constraints

// 1 <= str.length <= 10^5
// Output Format

// print the string taken by the user.

// Sample Input 0

// geekster
// Sample Output 0

// g    e    e    k    s    t    e    r


import java.util.*;

public class Q3 {

       public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Read the input string
        String str = scanner.nextLine();
        
        // Close the scanner
        scanner.close();
        
        // Iterate through each character in the string
        for (int i = 0; i < str.length(); i++) {
            // Print the character followed by a tab
            System.out.print(str.charAt(i) + "\t");
        }
        
        // Print a newline at the end
        System.out.println();
    }
}