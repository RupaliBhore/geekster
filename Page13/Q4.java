// // Print steps and update maximum

// Take n as input from the user. Then you will be given a list of n positive integers, each time you find a new maximumal value, you have to increment the steps by 1.

// Take steps as 0 initially and maximum value as -100 in the starting.

// In the end print the number of steps performed.

// Note : Use function.

// Input Format

// Take n as an integer input from the user.

// Constraints

// 0 <= n <= 2^31-1

// 1 <= Each positive integer number <= 2^31-1
// Output Format

// Print the total steps in the end.

// Sample Input 0

// 6
// 1
// 2
// 3
// 4
// 5
// 6
// Sample Output 0

// 6
// Sample Input 1

// 7
// 2
// 3
// 4
// 5
// 1
// 2
// 10
// Sample Output 1

// 5
// Sample Input 2

// 9
// 2
// 2
// 3
// 2
// 2
// 2
// 7
// 8
// 1
// Sample Output 2

// 4
// Sample Input 3

// 6
// 3
// 2
// 9
// 11
// 2
// 1
// Sample Output 3

// 3
// Sample Input 4

// 5
// 7
// 2
// 3
// 5
// 1
// Sample Output 4

// 1


import java.util.*;

public class Q4 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */  Scanner scanner = new Scanner(System.in);
        
        // Read the integer input
        int n = scanner.nextInt();
    
        // Read the list of n positive integers
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        // Calculate and print the number of steps
        System.out.println(calculateSteps(numbers));
        
        scanner.close();
    }
    
    // Function to calculate the number of steps to find new maximum values
    private static int calculateSteps(int[] numbers) {
        int steps = 0;
        int max = Integer.MIN_VALUE;
        
        for (int num : numbers) {
            if (num > max) {
                max = num;
                steps++;
            }
        }
        
        return steps;
    }
}