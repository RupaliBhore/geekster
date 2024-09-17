// // Switch Calculator 1
// You are given integer inputs N , a and b. perform operations on a and b for different value of N like :-

// If value of N is 10 -> a + b;

// If value of N is 20 -> a - b;

// If value of N is 30 -> a * b;

// If value of N is 40 -> a % b;

// If value of N is 50 -> a // b;

// However, if N is 40 or 50, and b is 0, print "Error: Integer modulo by zero" or "Error: Division by zero" respectively instead.

// For any other value of N, print "Enter a valid number".

// Input Format

// first line of input contains integer N.

// secind line of input contains integer a.

// third line of input contains intager b.

// Constraints

// 0 <= N <= 50

// 0 <= b <= a <= 10^4
// Output Format

// Print the desired output.

// Sample Input 0

// 20
// 50 
// 30
// Sample Output 0

// 20

import java.io.*;
import java.util.*;

public class Q4 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
             Scanner scanner = new Scanner(System.in);

        // Reading the integer inputs
        int N = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        // Using a switch statement to perform the desired operation
        switch (N) {
            case 10:
                System.out.println(a + b);
                break;
            case 20:
                System.out.println(a - b);
                break;
            case 30:
                System.out.println(a * b);
                break;
            case 40:
                if (b != 0) {
                    System.out.println(a % b);
                } else {
                    System.out.println("Division by zero error");
                }
                break;
            case 50:
                if (b != 0) {
                    System.out.println(a / b);
                } else {
                    System.out.println("Division by zero error");
                }
                break;
            default:
                System.out.println("Enter a valid number");
                break;
        }
    }
}