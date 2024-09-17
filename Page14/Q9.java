// // HW_Print Inverted Right Angled Triangle reversed whole numbers
// Take an integer input n and Prin the pattern.

// Input Format

// A single line n take input from user.

// Constraints

// 1 <= n <= 100
// Output Format

// Print the pattern

// Sample Input 0

// 9
// Sample Output 0

// 9 8 7 6 5 4 3 2 1 
// 9 8 7 6 5 4 3 2 
// 9 8 7 6 5 4 3 
// 9 8 7 6 5 4 
// 9 8 7 6 5 
// 9 8 7 6 
// 9 8 7 
// 9 8 
// 9 
// Sample Input 1

// 7
// Sample Output 1

// 7 6 5 4 3 2 1 
// 7 6 5 4 3 2 
// 7 6 5 4 3 
// 7 6 5 4 
// 7 6 5 
// 7 6 
// 7 



import java.util.*;

public class Q9 {

    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
        
        // Read the integer input n
        int n = scanner.nextInt();
        
        // Print the pattern
        for (int i = 1; i <= n; i++) {
            // Print numbers decreasing from n to 1
            for (int j = n; j >= 1; j--) {
                // Print numbers only if j is greater than or equal to i
                if (j >= i) {
                    System.out.print(j + " ");
                }
            }
            System.out.println(); // Move to the next line after each row
        }
        
        scanner.close();
    }
}