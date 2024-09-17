// // Printing 5 to N(While Loop)

// WAP to print numbers from 5 to n(using while loop) where n is taken as input from the user using while loop.

// Input Format

// Input integer N

// Constraints

// NA
// Output Format

// Print All the Number from 5 to N.

// Sample Input 0

// 10        
// Sample Output 0

// 5
// 6
// 7
// 8
// 9
// 10
// Explanation 0

// Printing All The Number from 5 to 10
import java.util.*;

public class Q7 {

    public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);

        // Read input n
        int n = scanner.nextInt();

        // Close the scanner
        scanner.close();

        // Initialize starting number
        int start = 5;

        // Print numbers from 5 to n using while loop
        while (start <= n) {
            System.out.println(start);
            start++;
        }
    }
}
