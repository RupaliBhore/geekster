// // HW_Running sum and average


// Emma was given a programming task to create a program that takes an integer input n and prints the running sum from 1 to n along with its average. Emma created a loop to calculate the sum and average and printed the results to the console. The program worked perfectly, and Emma was praised for her coding skills.

// Input Format

// For each test case, you will get n as an integer input.

// Constraints

// 1 <= n <= 1000
// Output Format

// First line print the sum.

// Second line print its average.

// Sample Input 0

// 5
// Sample Output 0

// 15
// 3
// Explanation 0

// First line sum from 1 to 5 is 15.

// Second line average is 3.


import java.util.*;

public class Q6 {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        
        // Read the integer n from input
        int n = scanner.nextInt();
        
        // Calculate the sum of numbers from 1 to n
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        
        // Calculate the average
        int average = sum / n; // Integer division gives the floor value
        
        // Print the sum
        System.out.println(sum);
        
        // Print the average
        System.out.println(average);
    }
}