// // Running Sum for loop
// Imagine you are a math teacher and one of your students, Maria, is struggling with understanding how to find the running sum of a series of integers. You decide to give her a problem to work on as practice.

// The problem is as follows: Maria will be given a series of n integers as input, she has to print the sum after she take input of an integer each time.

// For example, if the series of integers is 3, 4, 5, 6 the output should be 3, 7, 12, 18

// Maria is a little bit confused at first, but with your guidance and some careful practice, she is eventually able to understand and solve the problem successfully.

// NOTE: Initially the sum is zero.

// Input Format

// For each test case, You will get the value n as an integer input in the first line,

// and n integers as intger input in different lines.

// Constraints

// 0 <= n <= 2^10

// -2^31 <= Each integer input <= 2^31-1
// Output Format

// Print the running sum, each time in a different line.You will be given a number n of integer data-type.

// Sample Input 0

// 5
// 1 2 3 4 5
// Sample Output 0

// 1 3 6 10 15
// Explanation 0

// In the first line we receive 5, means five integer inputs will be given as input.

// Initially before taking any integer input the sum is zero.

// When we take in the first integer input which is 3, sum becomes 3.

// When we take in the second integer input which is 2, sum becomes 5.

// After 3rd input, sum becomes 7.

// After 4th input, sum becomes 6,

// After 5th input, sum becomes 10.



import java.util.*;

public class Q3 {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        // Read the number of integers n
        int n = scanner.nextInt();

        // Array to store the integers
        int[] numbers = new int[n];

        // Read the integers
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Variable to store the running sum
        int runningSum = 0;

        // Print the running sums
        for (int i = 0; i < n; i++) {
            runningSum = runningSum + numbers[i];
            System.out.print(runningSum + " ");
        }
    }
}