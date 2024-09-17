// // Find sum using a function
// The process goes like:

// You have to first take input of two numbers x and y as an integer input.

// Then make a function findSum(int x, int y), which takes in these two integers as parameters and prints the final sum.

// Input Format

// T will be given as input represents the number of test cases.

// For each test case,

// x will be given as input in the first line,

// y will be given as input in the second line.

// Constraints

// 1<= T <=2^10

// -2^10 <= x , y <=2^10
// Output Format

// Print the final sum as an integer input.

// Sample Input 0

// 2
// 10
// 20
// 30
// 40
// Sample Output 0

// 30
// 70
// Sample Input 1

// 1
// 25
// 10
// Sample Output 1

// 35


import java.util.*;

public class Q2 {

    public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);

        // Reading the number of test cases
        int T = scanner.nextInt();

        // Iterating over each test case
        for (int i = 0; i < T; i++) {
            // Reading x and y for each test case
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            
            // Finding and printing the sum
            findSum(x, y);
        }
        
        scanner.close();
    }

    public static void findSum(int x, int y) {
        // Calculating the sum
        int sum = x + y;
        
        // Printing the sum
        System.out.println(sum);
    }
}