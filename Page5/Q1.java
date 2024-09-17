// // Print if divisible by both 3 and 4
// Print Divisible by 3 and 4 if the given integer is divisible by both 3 and 4

// Print Not Divisible if the given integer is not divisible by both 3 and 4.

// Input Format

// For each test case, you will be given an integer input.

// Constraints

// 0<=integer input<=2^31-1
// Output Format

// Print the string as given in the problem statement.

// Sample Input 0

// 32
// Sample Output 0

// Not Divisible


import java.util.*;

public class Q1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
                Scanner scanner = new Scanner(System.in);

        // Reading the integer input
        int n = scanner.nextInt();
        scanner.close();

        // Checking divisibility
        if (n % 3 == 0 && n % 4 == 0) {
            System.out.println("Divisible by 3 and 4");
        } else {
            System.out.println("Not Divisible");
        }
    
    }
}