// 
// HW_print all even number
// Take x and y as input. Write a function that takes in x and y as integer parameters and prints all the even numbers between x and y (x and y both inclusive)

// Input Format

// Take integer T as an integer input which represents the number of testcases.

// for each test cases:-

// first line take an integer input from user as x.

// second line take an integer input from user as y.

// Constraints

// 1 <= T <= 10^4
// 1 <= x <= 1000
// 1 <= y <= 10^4
// Output Format

// Print all even number between given intervals.

// Sample Input 0

// 2
// 1 10
// 3 15
// Sample Output 0

// 2 4 6 8 10 
// 4 6 8 10 12 14 
// Explanation 0

// Print all even numbers between 1 and 10

// Sample Input 1

// 1
// 19 100
// Sample Output 1

// 20 22 24 26 28 30 32 34 36 38 40 42 44 46 48 50 52 54 56 58 60 62 64 66 68 70 72 74 76 78 80 82 84 86 88 90 92 94 96 98 100 

import java.util.*;

public class Q6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading the number of test cases
        int T = scanner.nextInt();

        // Iterating over each test case
        for (int i = 0; i < T; i++) {
            // Reading x and y for each test case
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            
            // Finding and printing even numbers in the range [x, y]
            printEvenNumbers(x, y);
        }

        scanner.close();
    }

    public static void printEvenNumbers(int x, int y) {
        // Loop through the range from x to y
        for (int i = x; i <= y; i++) {
            if (i % 2 == 0) {
                // Print even number
                System.out.print(i + " ");
            }
        }
        // Print a newline after printing all even numbers for a test case
        System.out.println();
    }
}