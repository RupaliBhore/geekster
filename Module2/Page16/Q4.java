// Character and it's Frequency

// Take an integer N as input from user, then take N characters as input. And print the Frequency of Each Character.

// Input Format

// Integer N
// All ASCII characters
// Constraints

// 1<=N<=10^5
// Output Format

// Frequency of each character.

// Sample Input 0

// 6
// a b a d b c
// Sample Output 0

// a 2
// b 2
// c 1
// d 1
// Sample Input 1

// 7
// * / - + * . +
// Sample Output 1

// * 2
// + 2
// - 1
// . 1
// / 1
// Submissions: 23
// Max Score: 10
// Difficulty: Medium
// Rate This Challenge:

    

import java.util.*;

public class Q4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of characters
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Frequency array for all ASCII characters (128 ASCII characters)
        int[] frequency = new int[128];

        // Read N characters
        String[] input = scanner.nextLine().split(" ");
        
        // Count frequencies
        for (String s : input) {
            char ch = s.charAt(0); // Get the character
            frequency[ch]++; // Increment the frequency for this character
        }

        // Print the frequencies
        for (char ch = 0; ch < frequency.length; ch++) {
            if (frequency[ch] > 0) { // Only print characters that occurred
                System.out.println(ch + " " + frequency[ch]);
            }
        }

        scanner.close();
    }
}
//Fidedd
// Time Complexity: O(N), where N is the number of characters. Each character is processed once.
// Space Complexity: O(1), as the size of the frequency array is fixed at 128.

