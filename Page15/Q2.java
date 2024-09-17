// // Pattern 8 - Print a hollow square without top

// Take an integer input n and then print a hollow n by n square without the top.

// Print as given in the conditions below:

// In the first line there will a star , followed by n-2 spaces and then there will be a star again,

// Just like above, there will n-1 lines and then

// in the last line there will be n stars.

// Input Format

// For each test case, n will be given as an integer input.

// Constraints

// 2 <= n <= 2^31-1
// Output Format

// Take a look at the test case below for better understanding.

// Sample Input 0

// 5
// Sample Output 0

// *   *
// *   *
// *   *
// *   *
// *****
// Sample Input 1

// 7
// Sample Output 1

// *     *
// *     *
// *     *
// *     *
// *     *
// *     *
// *******
// Sample Input 2

// 3
// Sample Output 2

// * *
// * *
// ***
// Sample Input 3

// 8
// Sample Output 3

// *      *
// *      *
// *      *
// *      *
// *      *
// *      *
// *      *
// ********
import java.util.Scanner;

public class Q2 {
    public static void printHollowSquare(int n) {
        // Print the first n-1 lines
        for (int i = 0; i < n - 1; i++) {
            System.out.print("*");
            for (int j = 0; j < n - 2; j++) {
                System.out.print(" ");
            }
            if (n > 1) {
                System.out.println("*");
            } else {
                System.out.println();
            }
        }
        
        // Print the last line
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        // Print the hollow square without the top
        printHollowSquare(n);
        
        scanner.close();
    }
}

