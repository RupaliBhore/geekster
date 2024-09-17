// // HW_Que and Rem
// A beginner programmer named Sarah was tasked to write a program to print the quotient and remainder of two given integers a and b. Sarah took the input values of a and b from the user and used the division and modulus operator to compute the quotient and remainder. She then printed the values in the required format with a space separator. Through this task, Sarah learned how to use basic arithmetic operators to perform mathematical computations and print output in the required format.

// Note : Use Function.

// Input Format

// Take a and b as an input integer.

// Constraints

// 1 < a , b < 1000
// Output Format

// Quotient and remainder separated by space

// Sample Input 0

// 7 2
// Sample Output 0

// 3 1
// Explanation 0

// 7 is divided by 2, so the quotient is 3 and the remainder is 1.


import java.util.*;

public class Q10 {

    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

        // Reading inputs a and b
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // Calculate quotient and remainder
        int quotient = calculateQuotient(a, b);
        int remainder = calculateRemainder(a, b);

        // Printing the result in required format
        System.out.println(quotient + " " + remainder);

        scanner.close();
    }

    // Function to calculate quotient of two numbers
    public static int calculateQuotient(int a, int b) {
        return a / b;
    }

    // Function to calculate remainder of two numbers
    public static int calculateRemainder(int a, int b) {
        return a % b;
    }
}