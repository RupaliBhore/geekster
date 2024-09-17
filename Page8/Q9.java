// // HW_Print series 13, 18, 23, 28...

// As a software developer, Jane was always looking for new challenges to improve her programming skills. One day, she came across a series of numbers that she found interesting: 13, 18, 23, 28, 33... She decided to write a program that could print this series up to a given value of n, using i = i + 5.

// Input Format

// A single line take N as a input from user.

// Constraints

// 20 <= N <= 10^4
// Output Format

// Print the series.

// Sample Input 0

// 35
// Sample Output 0

// 13 18 23 28 33 
// Explanation 0

// Series till 35 are **13 18 23 28 33 **


import java.util.*;

public class Q9 {

    public static void main(String[] args) {
     
          Scanner scanner = new Scanner(System.in);
        
        // Read integer input N
        int N = scanner.nextInt();
        
        // Initialize the first number in the series
        int num = 13;
        
        // Print the series up to N
        while (num <= N) {
            System.out.print(num + " ");
            num += 5; // Increment num by 5 for the next number in the series
        }
    }
}

// Time complexity: O((N - 13) / 5), which simplifies to O(N) in the worst case, because the loop runs a number of times proportional to N.
// Space complexity: O(1), as only a few variables are used and no significant additional memory is consumed.