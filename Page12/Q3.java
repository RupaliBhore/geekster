// // HW_Print n, n-5, n-10 till greater than 0
// /
// A programming task was assigned to a novice programmer named Max to print a sequence of numbers n, n-5, n-10, n-15, n-20.... using a while loop. Max took the input value of n from the user and used a while loop to print the numbers in decreasing order. Within the loop, he used decrement the value of the current number by 5 to print the next number until the value became zero. Max successfully completed the task, learned how to use while loop, and gained experience in manipulating values in a loop.

// Input Format

// Integers N as an input value.

// Constraints

// 1 <= n <= 10^6
// Output Format

// A series of n,n-5,n-10,n-15,n-20...

// Sample Input 0

// 30
// Sample Output 0

// 30 25 20 15 10 5
// Explanation 0

// starting with n = 30 and printed till n is greater than 0 with difference of 5 between each term. therfore series is 30 25 20 15 10 5

import java.util.*;

public class Q3 {

    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        
        // Read integer n from input
        int n = scanner.nextInt();
        
        // Initialize current number to n
        int current = n;
        
        // Print the initial number
        System.out.print(current);
        
        // Decrement current by 5 until it becomes non-positive
        while (current - 5 > 0) {
            current -= 5;
            System.out.print(" " + current);
        }
        
        // Print newline after the sequence
        System.out.println();
          }
}