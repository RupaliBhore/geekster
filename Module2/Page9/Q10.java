// // Is Equal?

// Once there was a girl named Sarah who loved to write poetry. She had a habit of writting down her thoughts in a notebook whenever she felt inspired. One day, while she was working on a new piece, she accidentally spilled her coffee on the notebook.

// Desperate to salvage her work, she decided to copy the poem onto a new page. However, when she finished rewriting it, she noticed that there were a few discrepancies between the original version and the new one. She wondered if she had missed anything while transcribing the poem.

// Help Sarah and write a program that check if two strings are identical or not.

// Input Format

// First line contains string s1.

// Second line contains strinf s2.

// Constraints

// 1 <= string1.length() <= 100000

// 1 <= string2.length() <= 100000
// Output Format

// Return A boolean value

// Sample Input 0

// GEEKSTER
// GEEKSTER
// Sample Output 0

// true
// Explanation 0

// since both string have same character at each index. therfore it is a equal string



import java.util.*;

public class Q10 {

    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Read the first string
        String s1 = scanner.nextLine();
        
        // Read the second string
        String s2 = scanner.nextLine();
        
        // Close the scanner
        scanner.close();
        
        // Compare the two strings and print the result
        if (s1.equals(s2)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}