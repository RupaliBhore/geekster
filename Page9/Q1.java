// // HW_Print multiples of 8 from n to 1

// The problem requires a program to print multiples of 8, starting from a given value N down to 1. The value of N will be taken as input from the user.

// Emily, a young programmer, was tasked with this challenge. She used a while loop and initialized the loop variable to the value of N. Inside the loop, she checked whether the loop variable was a multiple of 8 and printed it to the console if it was. Then, she decremented the loop variable by 1 until it reached 1.

// With a few attempts, Emily was able to solve the problem. She was thrilled to have completed the task and felt more confident in her programming abilities.

// Input Format

// For each test case, you will get n as an integer input.

// Constraints

// 1 <= n <= 10^4
// Output Format

// Print all the multiples of 8.

// Sample Input 0

// 30
// Sample Output 0

// 24 16 8 
// Explanation 0

// multiples of 8 till 30 is 24 16 8 .


import java.util.*;

public class Q1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        
        // Read integer input n
        int n = scanner.nextInt();
        
        // Initialize loop variable to n
        int current = n;
        
        // Print multiples of 8 from n down to 1
        while (current >= 1) {
            if (current % 8 == 0) {
                System.out.print(current + " ");
            }
            current--; // Decrement current in each iteration
        }
        
    }
}
// Time complexity: O(n), because the loop runs from n down to 1, and each iteration takes constant time.
// Space complexity: O(1), as only a few variables are used and no additional significant memory is consumed.





