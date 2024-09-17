// // HW_Print numbers 20 to n
// Once upon a time, there was a young programmer named John who was working on a project. He needed to create a program that would print numbers from 20 up to a user-specified limit. John knew that he needed to use a loop to iterate over the numbers and print them out one by one.

// He started by writing the code to take input from the user for the upper limit of the range of numbers. Once he had that value stored in a variable, he used a for loop to iterate over the range of numbers from 20 to N.

// As the program ran, it printed out each number in the range, starting with 20 and ending with the user-specified value. John tested the program several times and was satisfied with how it worked.

// Input Format

// A single contain N

// Constraints

// 20 <= N <= 10^4
// Output Format

// Print the numbers

// Sample Input 0

// 30
// Sample Output 0

// 20 21 22 23 24 25 26 27 28 29 30 
// Explanation 0

// Print numbers from 20 to 30

import java.util.*;

public class Q5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read integer input N
        int N = scanner.nextInt();
        
        // Print numbers from 20 to N separated by spaces
        for (int i = 20; i <= N; i++) {
            System.out.print(i + " "); // Print with a space after each number
        }
        

    }
}