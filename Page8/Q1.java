// // Print n to 0
// You will be given an integer input n and you have to print the integers from n to 0 in different lines.

// Input Format

// For each test case, you will get an input n of integer data-type.

// Constraints

// 0 <= n <= 2 ^31-1
// Output Format

// Print the numbers such that each number is in the int data-type format and in a different line.

// Sample Input 0

// 10
// Sample Output 0

// 10
// 9
// 8
// 7
// 6
// 5
// 4
// 3
// 2
// 1
// 0
// Sample Input 1

// 15
// Sample Output 1

// 15
// 14
// 13
// 12
// 11
// 10
// 9
// 8
// 7
// 6
// 5
// 4
// 3
// 2
// 1
// 0
// Sample Input 2

// 8
// Sample Output 2

// 8
// 7
// 6
// 5
// 4
// 3
// 2
// 1
// 0

import java.util.*;

public class Q1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner scanner = new Scanner(System.in);
        
        // Read integer input N
        int n = scanner.nextInt();
        
        // Print numbers from n to 0
        for (int i = n; i >= 0; i--) {
            System.out.println(i);
        }
        
    }
}