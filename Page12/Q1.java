// // HW_Print till n for this Series 5,11,17,23,29..
// The task was given to a novice programmer named Kim to print the first n numbers of the series 5, 11, 17, 23, 29, 35, 41 using a while loop. Kim took the input value of n from the user and completed the task successfully.

// Input Format

// Given a Int Input N

// Constraints

// NA
// Output Format

// Print the sequence till N

// Sample Input 0

// 50
// Sample Output 0

// 5
// 11
// 17
// 23
// 29
// 35
// 41
// 47
// Explanation 0

// Printed All the Number till 50 of the following sequence

import java.util.*;

public class Q1 {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        
        // Read integer n from input
        int n = scanner.nextInt();
        
        // Start with the first number in the series
        int current = 5;
        
        // Loop to print numbers in the series that are <= n
        while (current <= n) {
            System.out.println(current);
            current += 6; // Move to the next number in the series
        }
        
        
       
    }
}