// HW_Count Consecutive Ones
// Given a string str, return the longest palindromic substring in str.

// NOTE :-

// After answering the question, attempt the related question in the linked resource to improve your understanding of the question . Clickhere

// Input Format

// string str as an input.

// Constraints

// 1 <= str.length <= 10^2

// Output Format

// return the longest palindromic substring.

// Sample Input 0

// cbbd
// Sample Output 0

// bb

import java.util.*;

public class Q8 {

  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        scanner.close();
        
        int maxCount = 0;  // To store the maximum number of consecutive '1's
        int currentCount = 0;  // To store the current streak of consecutive '1's
        
        // Iterate through the string
        for (char c : str.toCharArray()) {
            if (c == '1') {
                // Increment the current count if the character is '1'
                currentCount++;
                // Update maxCount if the current streak is greater
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                }
            } else {
                // Reset currentCount if the character is not '1'
                currentCount = 0;
            }
        }
        
        System.out.println(maxCount);  // Output the maximum number of consecutive '1's
    }
}