// // GKSTR20 Pattern_5             Right sided triangle

// Take Integer N as input and print the following pattern.

// image

// Input Format

// An Integer Value N

// Constraints

// 1 <= N <= 100
// Output Format

// Print N Line of Pattern as shown in problem statement.

// Note: No space in between stars.

// Sample Input 0

// 5
// Sample Output 0

//     *
//    **
//   ***
//  ****
// *****


import java.util.*;

public class Q5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the integer input n
        int n = scanner.nextInt();
        
        // Print the pattern
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            
            // Print stars
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            
            System.out.println(); // Move to the next line after each row
        }
        
        scanner.close();
    }
}