// // Running product while loop.
// Imagine you are a math teacher and one of your students, Maria, is struggling with understanding how to find the running product of a series of integers. You decide to give her a problem to work on as practice.

// The problem is as follows: Maria will be given a series of n integers as input, she has to print the product after she take input of an integer each time.

// For example, if the series of integers is3, 4, 5, 6the output should be 3, 12, 60, 360 Maria is a little bit confused at first, but with your guidance and some careful practice, she is eventually able to understand and solve the problem successfully.

// Input Format

// First line contains integer N.

// Second line contains N integers.

// Constraints

// 0 <= n <= 2^10

// -2^31 <= Each integer input <= 2^31-1
// Output Format

// Print the running product.

// Sample Input 0

// 4
// 3 4 5 6
// Sample Output 0

// 3 12 60 360 

import java.util.*;

public class Q7 {

    public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
        
        // Read the number of integers
        int N = scanner.nextInt();
        
        // Read the N integers
        int[] numbers = new int[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        // Initialize product to 1
        long product = 1;
        
        // Print running product after each input
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            product *= numbers[i];
            sb.append(product).append(" ");
        }
        
        // Print the result without trailing space
        System.out.println(sb.toString().trim());  }
}