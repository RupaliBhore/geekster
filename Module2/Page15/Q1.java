// // HW_Reverse Number

// Given Single Integer T. Next T lines will have a Single Integer N.
// Print the Reverse of the Integer N .
// (Note: You have to use stack to perform this operation)

// Input Format

// Single Integer T .
// Next T lines will have Single Integer N .
// Constraints

//  1 <= T <= 10^4
//  0 <= N <= 10^8
// Output Format

// T Lines of Reverse of N Integers.
// Sample Input 0

// 4
// 1234
// 1001
// 1000
// 2340
// Sample Output 0

// 4321
// 1001
// 1
// 432

// Explanation 0

//  1234--> 4321
//  1001 -->1001 
//  1000-->0001 -->1 
//  2340 --> 432 



import java.util.*;

public class Q1 {

  
    // Function to reverse a given integer using a stack
    public static String reverseInteger(int num) {
        Stack<Character> stack = new Stack<>();
        String number = String.valueOf(num);
        
        // Push all digits of the number onto the stack
        for (int i = 0; i < number.length(); i++) {
            stack.push(number.charAt(i));
        }
        
        // Pop digits from the stack to form the reversed number
        StringBuilder reversedNumber = new StringBuilder();
        while (!stack.isEmpty()) {
            reversedNumber.append(stack.pop());
        }
        
        // Parse the reversed number string back to an integer to remove leading zeros
        int reversedInt = Integer.parseInt(reversedNumber.toString());
        
        return String.valueOf(reversedInt);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input the number of integers
        int n = sc.nextInt();
        
        // Process each integer and print its reverse
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            System.out.println(reverseInteger(num));
        }
        
        sc.close();
    }
}
//finded
// Time Complexity: O(n * d), where n is the number of integers and d is the average number of digits per integer.
// Space Complexity: O(d) for the stack used to store the digits of each integer.