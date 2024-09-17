// // nth power of 2
// Meet John, a computer science student who is working on a project for his algorithms class. One of the tasks he has been assigned is to write a function that takes in an integer n and returns the nth power of 2. For example, if n is 3, the function should return 8 because 2 to the power of 3 is 8.

// Can you help John come up with a solution for this problem?

// Input Format

// The first and the only line of each test case contains an integer n.

// Constraints

// 0 <= n <= 30
// Output Format

// Print the nth power of 2 as an integer.

// Sample Input 0

// 3
// Sample Output 0

// 8

import java.util.*;

public class Q5 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
           Scanner scanner = new Scanner(System.in);

        // Read the input integer n
        int n = scanner.nextInt();

        // Calculate the nth power of 2
        int result = (int) Math.pow(2, n);

        // Print the result
        System.out.println(result);
    }
}
