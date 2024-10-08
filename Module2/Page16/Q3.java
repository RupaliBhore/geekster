// Same Number Same Frequency

// Take an Integer N as input and then take N integers input from Geeku.

// Geeku wants to print all those integers whose frequency is exactly same as the integer's absolute value.

// You have to help Geeku in doing so.

// Note: 0 is excluded

// Input Format

// Integer N
// N Integers
// Constraints

// 1<=N<=10^5
// -10^5<=n<=10^5
// Output Format

// As described in Problem Statement
// Sample Input 0

// 10
// 4 5 -3 8 -3 4 4 -3 6 4
// Sample Output 0

// -3
// 4
// Submissions: 23
// Max Score: 10
// Difficulty: Medium
// Rate This Challenge:

    
import java.util.*;

public class Q3{
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of integers
        int N = scanner.nextInt();
        int[] frequency = new int[200001]; // To account for the range [-100000, 100000]

        // Read N integers and count their frequencies
        for (int i = 0; i < N; i++) {
            int num = scanner.nextInt();
            if (num != 0) { // Exclude 0
                frequency[num + 100000]++; // Shift index to handle negative numbers
            }
        }

        // Print integers whose frequency is equal to their absolute value
        for (int i = 1; i < frequency.length; i++) { // Start from 1 to exclude 0
            if (frequency[i] != 0) { // Only check non-zero frequencies
                int num = i - 100000; // Adjust back to original number
                if (Math.abs(num) == frequency[i]) {
                    System.out.println(num);
                }
            }
        }

        scanner.close();
    }
}
//finded 
// Time Complexity: O(N), where N is the number of integers, as we go through the input once and then through the fixed-size frequency array.
// Space Complexity: O(1) for the frequency array since its size is constant (200,001).
