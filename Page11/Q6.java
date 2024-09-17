// // Print 0 to n
// You will be given an input n of integer data-type.

// You have to print numbers from 0 to n in n different lines.

// for eg. n is 5, so the output should be something like, As given below

// 0
// 1
// 2
// 3
// 4
// 5
// Input Format

// For each test case, you will be given the value of n as an integer-input.

// Constraints

// 0 <= n <= 2^31-1
// Output Format

// You have to print the output in n different lines.

// Sample Input 0

// 7
// Sample Output 0

// 0
// 1
// 2
// 3
// 4
// 5
// 6
// 7
// Sample Input 1

// 11
// Sample Output 1

// 0
// 1
// 2
// 3
// 4
// 5
// 6
// 7
// 8
// 9
// 10
// 11
// Sample Input 2

// 6
// Sample Output 2

// 0
// 1
// 2
// 3
// 4
// 5
// 6

import java.util.*;

public class Q6 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
           Scanner scanner = new Scanner(System.in);

        // Read input n
        int n = scanner.nextInt();

        // Close the scanner
        scanner.close();

        // Print numbers from 0 to n
        for (int i = 0; i <= n; i++) {
            System.out.println(i);
        }
    }
}