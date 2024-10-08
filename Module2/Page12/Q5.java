// HW_reverse by words

// Given a string str, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order

// Input Format

// string str as an input.

// Constraints

// 1 <= str.length <= 10^4

// Output Format

// return the desired string.

// Sample Input 0

// Let's take LeetCode contest
// Sample Output 0

// s'teL ekat edoCteeL tsetnoc


import java.util.*;

public class Q5 {

 public static String reverseWords(String str) {
        // Split the input string by spaces to get each word
        String[] words = str.split(" ");
        
        // StringBuilder to store the result
        StringBuilder result = new StringBuilder();
        
        // Loop through each word, reverse it, and append to result
        for (int i = 0; i < words.length; i++) {
            StringBuilder reversedWord = new StringBuilder(words[i]).reverse();
            result.append(reversedWord);
            
            // Add a space after each word except the last one
            if (i < words.length - 1) {
                result.append(" ");
            }
        }
        
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(reverseWords(str));
    }
}
//finded