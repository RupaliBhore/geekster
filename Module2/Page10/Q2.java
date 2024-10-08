// Count Words
// Samantha was a college student majoring in English literature. One day, her professor assigned the class a writing exercise where they had to write a short story. Samantha was excited about the challenge, but she wasn't sure how to keep track of the word count as she wrote.

// Can you create a program that can count the number of words present in the Samantha's short story.

// Input Format

// Input contains a String str.

// Constraints

// 1<=Str.length()<=100000
// Output Format

// Return An integer value.

// Sample Input 0

// Welcome to geekster
// Sample Output 0

// 3
// Explanation 0

// 3 words are present in string i.e welcome, to, geekster.


import java.util.*;

public class Q2 {
public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Read the input string
        String str = scanner.nextLine();
        
        // Close the scanner
        scanner.close();
        
        // Split the string by spaces to get words
        String[] words = str.trim().split("\\s+");
        
        // Print the number of words
        System.out.println(words.length);
    }
}