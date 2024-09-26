// // Rotate 7-digit number to right by three


// Take n as an integer input, you have to pick the last 3 digits of the number of and put them in the starting.

// eg. 1234567 is given, then this number should transform to 5671234.

// Input Format

// The first line of input will contain an integer T — the number of test cases. The description of T test cases follows.

// For each test case,

// A 7 -digit number will be given as an integer input.

// Constraints

// 1 <= T <= 10^4

// Only 7-digit number will be given as input.
// Output Format

// Print the rotated number

// Sample Input 0

// 3
// 2345678
// 1234567
// 9876543
// Sample Output 0

// 6782345
// 5671234
// 5439876
// Sample Input 1

// 2
// 1236789
// 1111111
// Sample Output 1

// 7891236
// 1111111

import java.util.*;

public class Q7 {

   // Function to rotate the last 3 digits to the beginning
    public static String rotateLastThreeDigits(int n) {
        // Extract the last three digits
        int lastThreeDigits = n % 1000;
        // Extract the first four digits
        int firstFourDigits = n / 1000;
        // Combine last three digits with first four digits
        return String.format("%03d%04d", lastThreeDigits, firstFourDigits);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        int T = scanner.nextInt();
        
        // Loop through each test case
        for (int i = 0; i < T; i++) {
            int n = scanner.nextInt();
            // Print the rotated number
            System.out.println(rotateLastThreeDigits(n));
        }
        
        scanner.close();
    }
}