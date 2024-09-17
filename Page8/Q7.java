// // HW_Print first n multiples of 11.

// Once upon a time, there was a young programmer named Ben who was passionate about coding. One day, his mentor challenged him to write a program that would print the first N multiples of 11.

// Ben approached the problem by using a loop to iterate over the numbers and multiplying each number by 11 to generate the multiples. As the loop ran, he printed each multiple to the console, ensuring that only the first N multiples were printed.

// After a few attempts, Ben was able to complete the program successfully. He was thrilled to have solved the challenge and was proud of the new coding skills he had acquired.

// Input Format

// A single line take N as a input from user.

// Constraints

// 2 <= N <= 100
// Output Format

// Print all the multiples of 11 in a single line such that each multiple of 11 should be space separated.

// Sample Input 0

// 10
// Sample Output 0

// 11 22 33 44 55 66 77 88 99 110 
// Explanation 0

// First 10 multiples of 11 are 11 22 33 44 55 66 77 88 99 110

import java.util.*;

public class Q7 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        
        // Read integer input N
        int N = scanner.nextInt();
        
        // Print the first N multiples of 11 in a single line
        for (int i = 1; i <= N; i++) {
            int multiple = 11 * i;
            System.out.print(multiple);
            if (i < N) {
                System.out.print(" "); // Print a space between multiples except after the last one
            }
        }
        
        // Print a new line after the output
        System.out.println();
        
    }
}