// // HW_Even Odd 1000

// Once upon a time, there was a program that asked the user to enter an integer. The program was designed to behave differently based on whether the integer was even or odd.

// If the integer was even, the program checked if it was greater than 1000. If it was, the program printed Even and above 1000. If it wasn't, the program simply printed Even.

// On the other hand, if the integer was odd, the program also checked if it was greater than 1000. If it was, the program printed Odd and above 1000. If it wasn't, the program printed Odd.

// Can you recreate this program using your programming skills?

// Input Format

// For each test case, you will get an positive integer input.

// Constraints

// 1<=integer input<=2^31-1
// Output Format

// Print a string according to the conditions given above

// Sample Input 0

// 22
// Sample Output 0

// Even
// Explanation 0

// Since the given number is even and is not above 1000, so we print "Even"


import java.util.*;

public class Q4 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        
        if (number % 2 == 0) {
            if (number > 1000) {
                System.out.println("Even and above 1000");
            } else {
                System.out.println("Even");
            }
        } else {
            if (number > 1000) {
                System.out.println("Odd and above 1000");
            } else {
                System.out.println("Odd");
            }
        }

    }
}