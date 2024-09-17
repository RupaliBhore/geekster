// // HW_GKSTR04 Even_Or_Odd
// Take an integer value as input.

// Print Even if the number is even else print Odd if the number is odd.

// Note:- 0 will be considered as even number.

// Input Format

// An integer value.

// Constraints

// -(10^5)<=N<=10^5
// Output Format

// Print A String Even Or Odd.

// Sample Input 0

// 98
// Sample Output 0

// Even
// Sample Input 1

// 57
// Sample Output 1

// Odd


import java.util.*;

public class Q7 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner scanner = new Scanner(System.in);

       
        int number = scanner.nextInt();

       
        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}