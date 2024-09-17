// // HW_Print from n to 3 using while loop
// A programming task was assigned to a beginner named Mike. He was asked to print numbers from n to 3 using a while loop, where n is taken as input from the user. Mike took the input value of n from the user and used a while loop to print the numbers in reverse order until 3.

// Input Format

// Int Given as Input 'N'

// Constraints

// -100 < N < 3

// Output Format

// Print all the numbers from N to 3

// Sample Input 0

// -9
// Sample Output 0

// -9
// -8
// -7
// -6
// -5
// -4
// -3
// -2
// -1
// 0
// 1
// 2
// Explanation 0

// Printing from n=-9 to 3

import java.util.*;

public class Q2 {

    public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);

  int n = scanner.nextInt();

        // Ensure the input is within the given constraints
        if (n >= 3 || n <= -100) {
            System.out.println("Input is out of bounds. Please enter a number between -100 and 3.");
        } else {
            // Print numbers from n to 3 in reverse order
            while (n < 3) {
                System.out.println(n);
                n++;
            }
        }  }
}