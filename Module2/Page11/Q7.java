// HW_First Non-Repeating char

// Sam has a non empty String and he wants to find out the first non-repeating character in the string.

// Write a program to print the first non-repeating character in the string and if there is not any non-repeating character then print -1

// NOTE:- After answering the question, attempt the related question in the linked resource to improve your understanding of the question . Question Link -> https://leetcode.com/problems/first-unique-character-in-a-string

// Input Format

// Single line of input: String str ( contains only lowercase alphabets)

// Constraints

// 1<=N<=10^4
// N: length of string
// string consists of only lowercase letters
// Output Format

// single line output : a character

// Print the first non-repeating character

// If there are no such characters, print -1.

// Sample Input 0

// geekstergeek
// Sample Output 0

// s
// Explanation 0

// For string="geekstergeek" the first non-repeating character is s

// Sample Input 1

// sorttors
// Sample Output 1

// -1
// Explanation 1

// For string="sorttors" every character is repeating so output is : -1


import java.util.*;

public class Q7 {
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        scanner.close();
        
        // To store frequency of each character
        Map<Character, Integer> frequencyMap = new HashMap<>();
        
        // First pass: Fill the frequency map
        for (char c : str.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        
        // Second pass: Find the first character with frequency 1
        for (char c : str.toCharArray()) {
            if (frequencyMap.get(c) == 1) {
                System.out.println(c);
                return;
            }
        }
        
        // If no non-repeating character found
        System.out.println(-1);
    }
}