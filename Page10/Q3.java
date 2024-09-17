// // Print Alternate Elements of a String

// Sonu is a computer science student who is working on a project that involves processing text data. He has been asked to write a program that will take a string as input and output every other character of that string, starting with the first character. John is excited to work on this problem because he knows that it will require him to use his programming skills to solve a real-world problem. He knows that the program he writes will be able to take a string as input, such as abcdefg, and output the alternate characters, aceg. John is confident that he can write a solution to this problem and is eager to get started.

// Input Format

// Take string a an input.

// Constraints

// 1 <= str.length() <= 10^4
// Output Format

// Print a String of alternate elements

// Sample Input 0

// geekster
// Sample Output 0

// gese

import java.util.*;

public class Q3 {

    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);

        // Read input string
        String input = scanner.nextLine();
        
        // Initialize a StringBuilder to store the result
        StringBuilder result = new StringBuilder();

        // Loop through the input string, incrementing by 2
        for (int i = 0; i < input.length(); i += 2) {
            result.append(input.charAt(i));
        }

        // Print the result
        System.out.println(result.toString());
        
    }
}