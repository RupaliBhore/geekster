// // HW_print above given ab

// Once upon a time, there was a program that took two integers (a and b) as input from the user. The program performed different operations based on the values of a and b.

// If a was greater than 100 and b was greater than 10, the program printed a is above 100 and b is above 10.If this condition was not satisfied, the program checked if a was greater than 50 and b was greater than 50, in which case it printed a is above 50 and b is above 50. If this condition also didn't match, the program checked if a was greater than 20 and b was greater than 100, and printed a is above 20 and b is above 100 if this condition was met. If none of these conditions were met, the program simply printed None.

// Would you like to write a program that performs these operations using your programming skills?

// Input Format

// For each test case, you will get

// Value of a as an integer input, in the first line

// Value of b as an integer input, in the second line

// Constraints

// -2^31 <= a , b <= 2^31-1
// Output Format

// Print the string according to the condition satisfied.

// Sample Input 0

// 120
// 11
// Sample Output 0

// a is above 100 and b is above 10
// Explanation 0

// Since the value of a is 120 and b is 11, so the first condition is satisfied, hence we print the string "a is above 100 and b is above 10"

// Sample Input 1

// 57
// 60
// Sample Output 1

// a is above 50 and b is above 50
// Explanation 1

// Here the second condition follows, so we print "a is above 50 and b is above 50"

// Sample Input 2

// 25
// 120
// Sample Output 2

// a is above 20 and b is above 100
// Explanation 2

// Here the third condition follows so we print the string "a is above 20 and b is above 100"

// Sample Input 3

// 120
// 5
// Sample Output 3

// None
// Explanation 3

// Here none of the condition 1, condition 2 and condition 3 fails, so we print "None"

// Sample Input 4

// 100
// 10
// Sample Output 4

// None

import java.util.*;

public class Q6 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
          Scanner scanner = new Scanner(System.in);

        // Reading the inputs
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        // Checking the conditions and printing the corresponding message
        if (a > 100 && b > 10) {
            System.out.println("a is above 100 and b is above 10");
        } else if (a > 50 && b > 50) {
            System.out.println("a is above 50 and b is above 50");
        } else if (a > 20 && b > 100) {
            System.out.println("a is above 20 and b is above 100");
        } else {
            System.out.println("None");
        }
    }
}
    