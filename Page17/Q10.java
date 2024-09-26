// 
// HW_Transform a Number
// You are given a 6 digit number n , you have to pick the last 2 digits of the number of and put them in the starting.

// Your task is to write a Program for the above problem and Print the Transformed number.

// Input Format

// For each test case, you will given a number n as an integer input.

// Constraints

// Given **n** should be **6** digits Number .
// Output Format

// Print the transformed number.

// Sample Input 0

// 123456
// Sample Output 0

// 561234
// Explanation 0

// 123456 is given, then this number should transform to 561234.

import java.util.*;

public class Q10 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        String n = scanner.nextLine().trim();
        
        // Validate input length
        if (n.length() != 6) {
            System.out.println("Invalid input. Please enter a 6-digit number.");
            return;
        }
        
        // Extract the last two digits and the first four digits
        String lastTwo = n.substring(4); // last two digits
        String firstFour = n.substring(0, 4); // first four digits
        
        // Form the transformed number
        String transformedNumber = lastTwo + firstFour;
        
        // Print the transformed number
        System.out.println(  transformedNumber);
        
        scanner.close();
    }
}