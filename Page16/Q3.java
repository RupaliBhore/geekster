// // Find product of the two numbers using function.

// The process goes like:

// First take in two integer inputs x and y.

// Then make a function findProduct(int x, int y) which takes in an integer as an input then print the product of x and y.

// Input Format

// T will be given as an integer input which represents the number of test cases.

// For each test case,

// x will be given as an integer input in the first line,

// y will be given as an integer input in the second line.

// Constraints

// 1 <= T <= 2^10

// -2^10 <= x , y <= 2^10
// Output Format

// Print the final product as an integer input.

// Sample Input 0

// 3
// 2
// 3
// 5
// 5
// 4
// 6
// Sample Output 0

// 6
// 25
// 24
// Sample Input 1

// 1
// 3
// 4
// Sample Output 1

// 12


import java.util.*;

public class Q3 {

    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

        // Reading the number of test cases
        int T = scanner.nextInt();

        // Iterating over each test case
        for (int i = 0; i < T; i++) {
            // Reading x and y for each test case
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            
            // Finding and printing the product
            findProduct(x, y);
        }

        scanner.close();
    }

    public static void findProduct(int x, int y) {
        // Calculating the product
        int product = x * y;
        
        // Printing the product
        System.out.println(product);
    }
}