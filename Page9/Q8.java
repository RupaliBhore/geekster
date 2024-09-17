// // GKSTR15 Print_Even

// Given a integer n, print all even numbers from 0 till n (including, if even)

// Input Format

// An integer n

// Constraints

// 0 <= n <= 1000
// Output Format

// Print a range/series of even numbers from 0 till n, with each number in one line

// Sample Input 0

// 10
// Sample Output 0

// 0
// 2
// 4
// 6
// 8
// 10

import java.util.*;

public class Q8 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        
        // Read the input value of n
        int n = scanner.nextInt();
        
        // Print even numbers from 0 to n
        for (int i = 0; i <= n; i += 2) {
            System.out.println(i);
        }
        
    }
}
