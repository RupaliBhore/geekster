// // Print n, n-3, n-6 .....

// You will be given an input n of integer data type.

// You have to print the series n, n-3, n-6....

// Important points:

// 1. You have to print each number in a different line

// 2. Also you have to print till the time the printed value is greater than 0.

// Take a look at the sample test cases.

// Input Format

// For each test case, you will be given n as an integer input.

// Constraints

// 0 <= n <= 2^31-1
// Output Format

// Print each number as an integer output in a different line.

// Sample Input 0

// 20
// Sample Output 0

// 20
// 17
// 14
// 11
// 8
// 5
// 2
// Sample Input 1

// 31
// Sample Output 1

// 31
// 28
// 25
// 22
// 19
// 16
// 13
// 10
// 7
// 4
// 1
// Sample Input 2

// 15
// Sample Output 2

// 15
// 12
// 9
// 6
// 3
// Sample Input 3

// 12
// Sample Output 3

// 12
// 9
// 6
// 3


import java.util.*;

public class Q2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner sc = new Scanner(System.in);
        
        // Read the input value
        int n = sc.nextInt();
        
        // Call the method to print the series
        printSeries(n);
        
    }
     public static void printSeries(int n) {
        // Loop to print the series
        while (n > 0) {
            System.out.println(n);
            n -= 3;
        }
    }
}