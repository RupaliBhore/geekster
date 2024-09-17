// // Hw_Print Spaced Right-angled whole numbers
// Take an integer input n and Print the pattern.

// Input Format

// A single line n take input from user.

// Constraints

// 1 <= n <= 100
// Output Format

// Print the pattern.

// Sample Input 0

// 5
// Sample Output 0

//         1 
//       1 2 
//     1 2 3 
//   1 2 3 4 
// 1 2 3 4 5 


import java.util.*;

public class Q8 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        
        // Read the integer input n
        int n = scanner.nextInt();
        
        // Print the pattern
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            
            // Print numbers
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
                
                // Print space if it's not the last number in the line
                if (k < i) {
                    System.out.print(" ");
                }
            }
            
            System.out.println(); // Move to the next line after each row
        }
        
        scanner.close();
    }
}
