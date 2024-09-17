// nth power of 10 using while loop
// A programming task was assigned to a beginner named Emily. The task was to take an integer input n and print the nth power of 10 integers as an output. Emily successfully completed the task by taking the input value of n and using it to access the desired element of the sequence.

// Input Format

// For each test case, n will be given as an integer input.

// Constraints

// 0 <= n <= 8
// Output Format

// Print the answer as an integer ouput.

// Sample Input 0

// 1
// Sample Output 0

// 10
// Sample Input 1

// 0
// Sample Output 1

// 1
// Sample Input 2

// 2
// Sample Output 2

// 100
// Sample Input 3

// 3
// Sample Output 3

// 1000
// Sample Input 4

// 5
// Sample Output 4

// 100000
// Sample Input 5

// 7
// Sample Output 5

// 10000000

import java.util.*;

public class Q9 {

    public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        // Base case: 10^0 = 1
        if (n == 0) {
            System.out.println(1);
        } else {
            // Compute 10^n
            int powerOfTen = (int) Math.pow(10, n);
            System.out.println(powerOfTen);
        }
    }
}