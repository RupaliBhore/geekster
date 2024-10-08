// HW_First non-repeating character in a stream 3

// Given an input stream A of n characters consisting only of lower case alphabets. While reading characters from the stream, you have to tell which character has appeared only once in the stream upto that point. If there are many characters that have appeared only once, you have to tell which one of them was the first one to appear. If there is no such character then append '#' to the answer. NOTE: 1. You need to find the answer for every i (0 <= i < n) 2. In order to find the solution for every i you need to consider the string from starting position till ith position.

// Input Format

// The first line will represent String s with n characters

// Constraints

// 1 <= n <= 10^5

// Output Format

// returns a string after processing the input stream.

// Sample Input 0

// aabc
// Sample Output 0

// a#bb
// Explanation 0

// For every ith character we will consider the string from index 0 till index i first non repeating character is as follow- "a" - first non-repeating character is 'a' "aa" - no non-repeating character so '#' "aab" - first non-repeating character is 'b' "aabc" - there are two non repeating characters 'b' and 'c', first non-repeating character is 'b' because 'b' comes before 'c' in the stream

import java.util.*;

public class Q7 {

    public static String firstNonRepeating(String A) {
        int[] freq = new int[26];  // Frequency array for 'a' to 'z'
        Queue<Character> queue = new LinkedList<>();  // Queue to store characters
        StringBuilder result = new StringBuilder();  // To store the result
        
        // Iterate through each character in the stream
        for (int i = 0; i < A.length(); i++) {
            char ch = A.charAt(i);
            
            // Increment the frequency of the current character
            freq[ch - 'a']++;
            
            // Add the character to the queue
            queue.add(ch);
            
            // Check for the first non-repeating character
            while (!queue.isEmpty()) {
                char front = queue.peek();
                
                // If the frequency of the front character is more than 1, it's repeating, remove it
                if (freq[front - 'a'] > 1) {
                    queue.poll();
                } else {
                    // The front character is non-repeating, append it to the result
                    result.append(front);
                    break;
                }
            }
            
            // If the queue is empty, no non-repeating character exists, append '#'
            if (queue.isEmpty()) {
                result.append('#');
            }
        }
        
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input the stream of characters as a string
        String A = sc.next();
        
        // Get the result
        String result = firstNonRepeating(A);
        
        // Output the result
        System.out.println(result);
        
        sc.close();
    }
}
//finded