// // Sum and Difference of x and y

// You will be given two integers x and y. You have to print the sum of x and y in the first line, and the difference of x and y in the second line.

// First integer input should be stored in x, Second integer input should be stored in y.

// Input Format

// In the first line the value of x will be given and in the second line the value of y will be given.

// Constraints

// Only integers will be given as input.

// Output Format

// Sum of x and y will be printed in the first line i.e x+y Difference of x and y will be printed in the second line i.e x-y

// Sample Input 0

// 40
// 10
// Sample Output 0

// 50

import java.util.*;

public class Q9 {

    public static void main(String[] args) {
       
           Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int y = scn.nextInt();
       System.out.println( x+y );
       System.out.println( x-y );
    }
}