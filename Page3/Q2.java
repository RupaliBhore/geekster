// High Sum or Low Sum
// You will get two integer inputs x and y, you need to print “High Sum” if sum is greater than or equal to 100, and print “Low Sum” otherwise.

// Input Format

// You will get the value of x in the first line, You will get the value of y in the second line.

// Constraints

// -2^31 <= x,y <= 2^31 -1

// Output Format

// You need to print "High Sum" or "Low Sum" accordingly.

// Sample Input 0

// 40
// 70
// Sample Output 0

// High Sum
// Explanation 0

// Value of x is 40, value of y is 70. So the sum is 110, since sum is greater than or equal to 100 so we print "High Sum"

import java.util.*;

public class Q2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
          Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();

        // Read the second integer input
        int y = scanner.nextInt();

        // Calculate the sum
        int sum = x + y;

        // Determine if the sum is "High" or "Low"
        if (sum >= 100) {
            System.out.println("High Sum");
        } else {
            System.out.println("Low Sum");
        }
    }
}