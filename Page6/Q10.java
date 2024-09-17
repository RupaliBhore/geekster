// // HW_Basic Calculator 9
// You will be given two integers x,y in the integer data-type format and a character as an input in the character data-type format,

// a. If the entered character is A, then print sum of the two integers in the integer format.

// b. If the entered character is S, then print the value of x - y in the integer format.

// c. If the entered character is M, then print the value of x * y in the integer format.

// d. If the entered character is D, then print the value of x / y in the integer format.

// e. If the entered character is R, then print the value of remainder when x is divided by y.

// f. Else print the string Enter again.

// Input Format

// For each test case,

// You will get the value of x as an integer data-type in the first line,

// You will get the value of y as an integer data-type in the second line,

// You will get a ch as a character data-type in the third line.

// Constraints

// -2^10<=x,y<=2^10

// Input Character can be any character in the character data-type format
// Output Format

// Print according to the conditions given above.

// Sample Input 0

// 10
// 20
// A
// Sample Output 0

// 30
// Explanation 0

// Since the entered character is 'A', so we add the two integers and print the final sum as 30.

// Sample Input 1

// 50
// 60
// S
// Sample Output 1

// -10
// Explanation 1

// Since the entered character is 'S', so we print -10.

// Sample Input 2

// 40
// 30
// k
// Sample Output 2

// Enter again
// Sample Input 3

// 50
// 70
// a
// Sample Output 3

// Enter again
// Sample Input 4

// 30
// 50
// M
// Sample Output 4

// 1500
// Sample Input 5

// 9
// 4
// D
// Sample Output 5

// 2
// Sample Input 6

// 30
// 20
// R
// Sample Output 6

// 10
// Sample Input 7

// 90
// 10
// R
// Sample Output 7

// 0


import java.util.*;

public class Q10 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
          Scanner scanner = new Scanner(System.in);
        
        // Reading inputs
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        char ch = scanner.next().charAt(0);
        
        // Performing operations based on the character input
        switch (ch) {
            case 'A':
                System.out.println(x + y);
                break;
            case 'S':
                System.out.println(x - y);
                break;
            case 'M':
                System.out.println(x * y);
                break;
            case 'D':
                if (y != 0) {
                    System.out.println(x / y);
                } else {
                    System.out.println("Division by zero error");
                }
                break;
            case 'R':
                if (y != 0) {
                    System.out.println(x % y);
                } else {
                    System.out.println("Division by zero error");
                }
                break;
            default:
                System.out.println("Enter again");
                break;
        }
    }
}
