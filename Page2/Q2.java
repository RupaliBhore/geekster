
// Add Last Digits

// You will be given two numbers of int data-type as input, and you have to print the sum of their last digits as output.

// Test Case 1:

// Given Inputs: 2357 48986

// Expected Output: 13

// Explanation: The last digit of 2357 is 7 and the last digit of 48986 is 6, and the sum of these last digits is 13. Hence the output is 13.

// Input Format

// In the first line, first number will be given as input. In the second line, second number will be given as input.

// Constraints

// Both the numbers will be positive and will be in integer format.

// Output Format

// Print the sum in the line.

// Sample Input 0

// 23456
// 9873
// Sample Output 0

// 9
// Explanation 0

// Since the last digit of 23456 is 6, and the last digit of 9873 is 3. Therefore the sum is 6+3 or 9.

import java.util.*;

public class Q2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
     Scanner scn = new Scanner(System.in);
         int x = scn.nextInt();
        int y = scn.nextInt();
        int lastDigitNum1 = x % 10;
        int lastDigitNum2 = y % 10;
        int sumLastDigits = lastDigitNum1 + lastDigitNum2;
        
        System.out.println(sumLastDigits);

    }
}