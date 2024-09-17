// // HW_Print Series 3, 11, 19...

// As a programming enthusiast, Mark enjoyed creating programs that could perform complex calculations and generate interesting patterns. One day, he came across a series of numbers - 3, 11, 19, 27, 35... that intrigued him. He decided to write a program that could print this series up to a given value of n, using i = i + 8.

// Input Format

// A single line take N as a input from user

// Constraints

// 10 <= N <= 10^4
// Output Format

// Print the series.

// Sample Input 0

// 30
// Sample Output 0

// 3 11 19 27 
// Explanation 0

// Series till 30 are 3 11 19 27

import java.util.*;

public class Q8 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        
        // Read integer input N
        int N = scanner.nextInt();
        
        // Initialize the first number in the series
        int num = 3;
        
        // Print the series up to N
        while (num <= N) {
            System.out.print(num + " ");
            num += 8; // Increment num by 8 for the next number in the series
        }
        
 
    }
}