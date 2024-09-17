// // GKSTR19 Pattern_4
// Take Integer N as input and print the following pattern.

// image

// Input Format

// An integer Value N.

// Constraints

// 1 <= N <= 100
// Output Format

// Print N Line of Pattern as shown in problem statement.

// Sample Input 0

// 5
// Sample Output 0

// * 
// * * 
// * * * 
// * * * * 
// * * * * * 

import java.util.*;

public class Q4 {

    public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
        
        // Read the integer input n
        int n = scanner.nextInt();
        
        // Print the pattern
        for (int i = 1; i <= n; i++) {
            // Inner loop to print i stars in each line
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(); // Move to the next line after each row of stars
        }
        
        scanner.close();
    }
}