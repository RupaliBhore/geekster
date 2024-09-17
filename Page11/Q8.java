// // Print 4,13,22,31.....n

// A programming task was assigned to a beginner named Alex. The task was to print the sequence 4, 13, 22, 31.... until n using a while loop. Alex took the value of n as input from the user and successfully completed the task.

// Input Format

// Input integer N.

// Constraints

// NA
// Output Format

// Print 4,13,22,31 till n

// Sample Input 0

// 55
// Sample Output 0

// 4
// 13
// 22
// 31
// 40
// 49
// Explanation 0

// Printng All the number of Sequence till 55

import java.util.*;

public class Q8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input n
        int n = scanner.nextInt();

        // Close the scanner
        scanner.close();

        // Initialize the starting number of the sequence
        int currentNumber = 4;

        // Print numbers in the sequence until currentNumber exceeds n
        while (currentNumber <= n) {
            System.out.println(currentNumber);
            currentNumber += 9; // Increment by 9 for the next term in the sequence
        }
        
    }
}