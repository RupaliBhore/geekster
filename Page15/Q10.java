// // Factorial of N
// A teacher is explaining factorial to the students. Since, the calculation involved in factorial is a bit difficult for him to do. The teacher wants to write a program, so that he doesn't need to calculate the factorial of every number. You have to help the teacher in writing a program for factorial calculation.

// Take an integer N as input.

// Print the factorial of N.

// Note: Factorial of 0 is 1.

// Input Format

// An integer value N.

// Constraints

// 0 <= N <= 15
// Output Format

// Print an integer value.

// Sample Input 0

// 5
// Sample Output 0

// 120
import java.util.*;

public class Q10 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Reading input
        int n = scanner.nextInt();

        // Close the scanner as we no longer need it
        scanner.close();

        // Calculate factorial
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        // Print the result
        System.out.println(factorial);
    }
}