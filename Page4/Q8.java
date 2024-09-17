// // Tell about x y

// Take in two inputs x and y from the user, and then

// a. If the value of x is greater than or equal to 59 and y is greater than or equal to 10, then print

// X is greater than or equal to 59 and y is greater than or equal to 10

// b. If the value of x is greater than or equal to 50, and y is less than 10, then print

// X is greater than or equal to 50 and y is less than 10

// c. Else print None of the condition matches

// Input Format

// For each test case, you will get

// Value of x as an integer input in the first line,

// Value of y as an integer input in the second line.

// Constraints

// -2^31<=x,y<=2^31-1
// Output Format

// Print the string according to the condition followed.

// Sample Input 0

// 60
// 12
// Sample Output 0

// X is greater than or equal to 59 and y is greater than or equal to 10
// Explanation 0

// Since the value of x is 60 which is greater than or equal to 59, and the value of y is 12 which is greater than or equal to 10, so we print the string "X is greater than or equal to 59 and y is greater than or equal to 10"

// Sample Input 1

// 55
// 8
// Sample Output 1

// X is greater than or equal to 50 and y is less than 10
// Explanation 1

// Since the value of x is 55 which is greater than or equal to 50, and the value of y is 8 which is less than 8,so we print the string

// X is greater than or equal to 50 and y is less than 10

// Sample Input 2

// 25
// 12
// Sample Output 2

// None of the condition matches
// Explanation 2

// Since the value of x is 25 which doesn't follow

// the condition 1 where it is written that the value of x should be greater than or equal to 59,

// also the condition 2 is not followed as it is written in it that the value of x should be greater than or equal to 50,

// Since none of the above 2 conditions follow, so we print the string "None of the condition matches"

// Sample Input 3

// 55
// 10
// Sample Output 3

// None of the condition matches
// Sample Input 4

// 50
// 9
// Sample Output 4

// X is greater than or equal to 50 and y is less than 10
// Sample Input 5

// 59
// 10
// Sample Output 5

// X is greater than or equal to 59 and y is greater than or equal to 10
// Sample Input 6

// 50
// 10
// Sample Output 6

// None of the condition matches
// Sample Input 7

// 59
// 5
// Sample Output 7

// X is greater than or equal to 50 and y is less than 10



import java.io.*;
import java.util.*;

public class Q8 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
          Scanner scanner = new Scanner(System.in);

    
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if (x >= 59 && y >= 10) {
            System.out.println("X is greater than or equal to 59 and y is greater than or equal to 10");
        } else if (x >= 50 && y < 10) {
            System.out.println("X is greater than or equal to 50 and y is less than 10");
        } else {
            System.out.println("None of the condition matches");
        }

    }
}




