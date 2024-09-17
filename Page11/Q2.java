// // HW_FizzBuzz problems
// The rules of the FizzBuzz game are given below:

// If a given number is divisible by 3 then the program should print "Fizz".
// If a given number is divisible by 7 then the program should print "Buzz".
// If a given number is divisible by both 3 and 7 then the program should print "FizzBuzz".
// Otherwise print the given number as it is.
// Input Format

// For each test case, you will get n as an integer input.

// Constraints

// 1 <= n <= 1000
// Output Format

// Print the output in a single line.

// Sample Input 0

// 21
// Sample Output 0

// 1 2 Fizz 4 5 Fizz Buzz 8 Fizz 10 11 Fizz 13 Buzz Fizz 16 17 Fizz 19 20 FizzBuzz 
// Explanation 0

// Print the output according to given condition.

import java.util.*;

public class Q2 {

    public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);

        // Read the input integer n
        int n = scanner.nextInt();

        // Loop from 1 to n
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 7 == 0) {
                System.out.print("FizzBuzz ");
            } else if (i % 3 == 0) {
                System.out.print("Fizz ");
            } else if (i % 7 == 0) {
                System.out.print("Buzz ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
