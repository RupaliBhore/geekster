// // Print all digits from end

// Imagine Charlie is a high school student who is learning programming as a hobby. One day, he comes across the following problem:

// "Write a program that takes an integer input from the user. The program should print the digits of the number starting from the end, going towards the first digit, where each digit should be printed on a separate line. Can you write a solution for this problem?"

// Input Format

// The first line of input contains a single integer T denoting the number of test cases. The description of T test cases follows.

// For each test case, print n as an integer input

// Constraints

// 1 <= T <= 100

// 0 <= n <= 2^31-1
// Output Format

// Print digits as an integer output as given in the problem statement, where each digit should be printed in a separate line.

// Sample Input 0

// 7654
// Sample Output 0

// 4
// 5
// 6
// 7
// Sample Input 1

// 87543
// Sample Output 1

// 3
// 4
// 5
// 7
// 8
// Sample Input 2

// 987651
// Sample Output 2

// 1
// 5
// 6
// 7
// 8
// 9
// Sample Input 3

// 67532
// Sample Output 3

// 2
// 3
// 5
// 7
// 6
// Sample Input 4

// 10000
// Sample Output 4

// 0
// 0
// 0
// 0
// 1



import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
        
        // Check if there is an input
        if (scanner.hasNextInt()) {
            // Read the integer input
            int n = scanner.nextInt();
            
            // Print the digits of the number in reverse order
            printDigitsInReverse(n);
        }
        
        scanner.close();
    }
    
    // Function to print the digits of the number in reverse order
    private static void printDigitsInReverse(int n) {
        if (n == 0) {
            System.out.println(0);
            return;
        }
        
        while (n > 0) {
            int digit = n % 10;
            System.out.println(digit);
            n /= 10;
        }
    }
}

