// HW_Reverse only letters

// Given a string s, reverse the string according to the following rules:

// All the characters that are not English letters remain in the same position.
// All the English letters (lowercase or uppercase) should be reversed.
// Print s after reversing it.

// NOTE:- After answering the question, attempt the related question in the linked resource to improve your understanding of the question . Question Link -> https://leetcode.com/problems/reverse-only-letters

// Input Format

// A String

// Constraints

// 1 <= s.length <= 10^5
// s consists of characters with ASCII values in the range [33, 122].
// s does not contain '\"' or '\'
// Output Format

// A String

// Sample Input 0

// a-bC-dEf-ghIj
// Sample Output 0

// j-Ih-gfE-dCba



import java.util.*;

public class Q4 {
 public static String reverseOnlyLetters(String s) {
        // Use a stack to collect and reverse letters
        Stack<Character> stack = new Stack<>();
        
        // Push only the letters into the stack
        for (char ch : s.toCharArray()) {
            if (Character.isLetter(ch)) {
                stack.push(ch);
            }
        }
        
        // Create a StringBuilder to build the final string
        StringBuilder result = new StringBuilder();
        
        // Iterate through the original string
        for (char ch : s.toCharArray()) {
            if (Character.isLetter(ch)) {
                // Pop the reversed letter from the stack
                result.append(stack.pop());
            } else {
                // If it's not a letter, keep the original character
                result.append(ch);
            }
        }
        
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(reverseOnlyLetters(s));
    }
}
//ounded










// import java.io.*;
// import java.util.*;

// public class Q4 {
//  public static String reverseOnlyLetters(String s) {
//         // Use a stack to collect and reverse letters
//         Stack<Character> stack = new Stack<>();
        
//         // Push only the letters into the stack
//         for (char ch : s.toCharArray()) {
//             if (Character.isLetter(ch)) {
//                 stack.push(ch);
//             }
//         }
        
//         // Create a StringBuilder to build the final string
//         StringBuilder result = new StringBuilder();
        
//         // Iterate through the original string
//         for (char ch : s.toCharArray()) {
//             if (Character.isLetter(ch)) {
//                 // Pop the reversed letter from the stack
//                 result.append(stack.pop());
//             } else {
//                 // If it's not a letter, keep the original character
//                 result.append(ch);
//             }
//         }
        
//         return result.toString();
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String s = sc.nextLine();
//         System.out.println(reverseOnlyLetters(s));
//     }
// }