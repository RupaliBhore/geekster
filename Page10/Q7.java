// // Print n/3
// Imagine Alice is a computer science student and she is trying to understand a concept related to loops. Her friend Bob, who is a computer science professor, gives her the following problem:

// "Write a program that takes an integer input from the user. The program should keep dividing the integer by 3 and printing the resultant value on each iteration until the value is greater than 0.

// Can you write a solution for this problem?"

// Note: Start printing from n, keep on updating n by dividing n by 3 each time, and print the the updated value of n each time.

// Input Format

// For each test case, n will given as an integer input.

// Constraints

// 0 <= n <= 2^31-1
// Output Format

// You have print an integer each time in a separate line.

// Sample Input 0

// 24
// Sample Output 0

// 24 8 2 


import java.util.*;

public class Q7 {

    public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);

        // Read the input integer n
        int n = scanner.nextInt();

        // Use a flag to handle the first number without a leading space
        boolean first = true;

        // Loop to divide n by 3 until n > 0
        while (n > 0) {
            if (!first) {
                System.out.print(" "); // Print space before the number (except for the first number)
            } else {
                first = false; // Set flag to false after printing the first number
            }
            System.out.print(n); // Print the current value of n
            n = n / 3; // Update n by dividing it by 3
        }
    }
}