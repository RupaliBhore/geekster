// // HW_Print Vowels in the string
// John, a software developer, was tasked with writing a program to print the vowels in a given string. He created a loop to iterate over each character and check if it was a vowel. He tested it and it worked perfectly.

// Input Format

// For each test case, you will get a string str.

// Constraints

// 1 <= n <= 10^4
// String str contains only lower-case characters.
// Output Format

// Print the all volwels in a seperate line.

// Sample Input 0

// apple
// Sample Output 0

// a
// e
// Explanation 0

// Vowel in the string apple is a and e.




import java.util.*;

public class Q9 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
          Scanner scanner = new Scanner(System.in);

        // Read the input string
        String str = scanner.nextLine();

        // Iterate through each character of the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Check if the character is a vowel
            if (isVowel(ch)) {
                System.out.println(ch); // Print the vowel
            }
        }
    } private static boolean isVowel(char ch) {
        // Convert the character to lower case for case-insensitive comparison
        ch = Character.toLowerCase(ch);
        
        // Check if the character is one of the vowels
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}