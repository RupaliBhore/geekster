// // Print powers of 2 less than n
// Imagine you are a computer science teacher and one of your students, Ben, is learning about loops and control structures. You decide to give him a problem to work on as practice.

// The problem is as follows: Ben needs to write a program that takes in an integer n as input and prints out all the powers of 2 that are less than n. For example, if n is 10, the program should print out 1, 2, 4, and 8.

// Input Format

// For each test case, you will be given n as an integer input from the user.

// Constraints

// 0 <= n <= 2^30
// Output Format

// Print as mentioned in the description.

// Sample Input 0

// 20
// Sample Output 0

// 1 2 4 8 16 


import java.util.*;

public class Q6 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
           Scanner scanner = new Scanner(System.in);

        // Read the input integer n
        int n = scanner.nextInt();
        
        // Initialize the power of 2 and result string
        int powerOfTwo = 1;
        StringBuilder result = new StringBuilder();

        // Loop to print powers of 2 less than n
        while (powerOfTwo < n) {
            result.append(powerOfTwo).append(" ");
            powerOfTwo *= 2;
        }

        // Print the result
        System.out.println(result.toString().trim());
    }
}