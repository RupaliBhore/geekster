// // Print 3 7 11 15...
// You will be given an integer input n, and you have to print the series 3, 7, 11, 15till the integer just less than n, in n different lines.

// Input Format

// For each test case, you will be given an integer input n.

// Constraints

// 1 <= n <= 2^31-1
// Output Format

// Print the series 3, 7, 11, 15in n different lines.

// Sample Input 0

// 20
// Sample Output 0

// 3
// 7
// 11
// 15
// 19
// Sample Input 1

// 30
// Sample Output 1

// 3
// 7
// 11
// 15
// 19
// 23
// 27
// Sample Input 2

// 45
// Sample Output 2

// 3
// 7
// 11
// 15
// 19
// 23
// 27
// 31
// 35
// 39
// 43
// Sample Input 3

// 51
// Sample Output 3

// 3
// 7
// 11
// 15
// 19
// 23
// 27
// 31
// 35
// 39
// 43
// 47
// Explanation 3

// Here 51 although a part of the series is still not printed as we have to print the series just less than 51.

import java.util.*;

public class Q9 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
          Scanner scanner = new Scanner(System.in);
        
        // Read integer input N
        int n = scanner.nextInt();
        
        // Start with the first number in the series
        int current = 3;
        
        // Print numbers from the series until we reach or slightly exceed n
        while (current < n) {
            System.out.println(current);
            current += 4;  // Increment by 4 for the next number in the series
        }
    }
}


