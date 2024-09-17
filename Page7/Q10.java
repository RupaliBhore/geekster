// // Print n to 1
// You will be given an input n as an integer data-type. You have to print the series from n to 1 in n different lines.

// Input Format

// For each test case, you will be given a number n as an integer data-type.

// Constraints

// 1 <= n <= 2^31-1
// Output Format

// Print the series where each number is printed in a different line.

// Sample Input 0

// 8
// Sample Output 0

// 8
// 7
// 6
// 5
// 4
// 3
// 2
// 1

import java.util.*;

public class Q10 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner scanner = new Scanner(System.in);
        
        // Read integer input N
        int n = scanner.nextInt();
        
        // Print numbers from n to 1
        for (int i = n; i >= 1; i--) {
            System.out.println(i);
        }
    }
}