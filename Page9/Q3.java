// // Print n, n-k, n-2k, n-3k .....

// You will be given two integers N and K as an integer input.

// You have to print the series N, N-K, N-2K where each number should be printed in a separate line and you have to print till the time the printed integer is greater than or equal to zero.

// Kindly take a look at the sample test cases for a better understanding.

// Input Format

// For each test case,

// N will be given as an integer input in the first line,

// K will be given as an integer input in the second line.

// Constraints

// 0 <= N , K <= 2^31-1
// Output Format

// Print the numbers as integer outputs in the separate line.

// Sample Input 0

// 30
// 4
// Sample Output 0

// 30
// 26
// 22
// 18
// 14
// 10
// 6
// 2

import java.util.*;

public class Q3 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner scanner = new Scanner(System.in);
        
        // Read the input values
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        
        // Call the method to print the series
        printSeries(N, K);
    }
      public static void printSeries(int N, int K) {
        // Loop to print the series
        while (N >= 0) {
            System.out.println(N);
            N -= K;
        }
    }
}

// Time complexity: O(N / K), as the loop runs until N becomes negative, which depends on the ratio of N to K.
// Space complexity: O(1), since only a few variables are used and no additional significant memory is consumed.