// // Write a function to check if an Armstrong number or not 

// Take n as an integer input.

// Then write a function that takes in this n as an integer parameter and returns if n is an Armstrong number or not.

// In the end, print true or false accordingly.

// Note: An armstrong number is a number which is equal to the sum of the cube of its digits.
// 407 = 4^3+0^3+7^3 = 403

// Input Format

// The first line of input will contain an integer T — the number of test cases. The description of T test cases follows.

// For each test case, n will be given as an integer input.

// Constraints

// 1 <= T <= 10^4

// 0 <= n <= 2^10
// Output Format

// Print true or *false accordingly.

// Sample Input 0

// 2
// 153
// 234
// Sample Output 0

// true
// false
// Sample Input 1

// 3
// 243
// 456
// 370
// Sample Output 1

// false
// false
// true

import java.util.*;

public class Q6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        int T = scanner.nextInt();
        
        // Loop through each test case
        for (int i = 0; i < T; i++) {
            int n = scanner.nextInt();
            // Print true or false based on whether n is an Armstrong number
            System.out.println(isArmstrong(n));
        }
        
        scanner.close();
    }

 // Function to check if a number is an Armstrong number
    public static boolean isArmstrong(int n) {   //153 //15 // 1
        int originalNumber = n;
        int sum = 0;
        while (n != 0) {
            int digit = n % 10; //3 //5 // 1
            sum = sum + digit * digit * digit; // 27 // 27 + 125 //  27+125+1 = 153
            n /= 10; //  153/10= 15  // 15/10 = 1 
        }
        return sum == originalNumber;
    }

   
}