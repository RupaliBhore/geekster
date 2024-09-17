// // Print all factors of a number
import java.util.*;

public class Q6 {

   public static void printFactors(int N) {
        // Handle special case for N = 0
        if (N == 0) {
            System.out.println(0);
            return;
        }
        
        // Iterate from 1 to N
        for (int i = 1; i <= N; i++) {
            // Check if i is a factor of N
            if (N % i == 0) {
                // Print the factor
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input number N
        int N = scanner.nextInt();
        // Print all factors of N
        printFactors(N); 
        scanner.close();
    }
}
//Time Complexity: O(N) because the printFactors() function iterates from 1 to N to find and print factors.
//Space Complexity: O(1) because only a few integer variables are used, regardless of the size of N.











// Take a whole number N as an integer input and print all the factors of it such that each factor should be printed in a separate line.
// Input Format
// N will be given as an integer input.
// Constraints
// 0 <= N <= 2^31-1
// Output Format
// Print all the factors of the number where each factor should be printed in a separate line.
// Sample Input 0
// 12
// Sample Output 0
// 1
// 2
// 3
// 4
// 6
// 12
// Sample Input 1

// 30
// Sample Output 1

// 1
// 2
// 3
// 5
// 6
// 10
// 15
// 30
// Sample Input 2

// 72
// Sample Output 2

// 1
// 2
// 3
// 4
// 6
// 8
// 9
// 12
// 18
// 24
// 36
// 72
// Sample Input 3

// 100
// Sample Output 3

// 1
// 2
// 4
// 5
// 10
// 20
// 25
// 50
// 100
// Sample Input 4

// 235
// Sample Output 4

// 1
// 5
// 47
// 235
