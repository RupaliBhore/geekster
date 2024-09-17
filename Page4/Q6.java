// // HW_abcd 88

// Maria, a software developer, created a program that takes four integer inputs, determines their product, and prints true if the product is greater than 1000 and false otherwise. The program accurately determines the product and outputs true or false based on the value, helping Maria and her team quickly evaluate the product of four integers.

// Input Format

// For each test you will get four integer inputs in each line.

// Constraints

// 0 <= N1,N2,N3,N4 <= 100
// Output Format

// Print true or false accordingly

// Sample Input 0

// 4
// 2
// 3
// 5
// Sample Output 0

// false
// Explanation 0

// The product of 4,2,3,5 is 120, and since it is not greater than 1000, so we print false.

import java.util.*;

public class Q6 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);

        int N1 = scanner.nextInt();
        int N2 = scanner.nextInt();
        int N3 = scanner.nextInt();
        int N4 = scanner.nextInt();

        long product = (long) N1 * N2 * N3 * N4;

      
        boolean result = (product > 1000);

       
        System.out.println(result);
    }
}