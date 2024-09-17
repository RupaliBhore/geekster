// // Swap x and y
// Given two integers x and y. Swap these integers without using any built-in functions or third variable

// Input Format

// Take x as an integer input in the first line,

// Take y as an integer input in the second line.

// Constraints

// -2^31 <= x , y <= 2^31-1
// Output Format

// Print according to the problem statement.

// Sample Input 0

// 10
// 20
// Sample Output 0

// c = 10
// x = 20
// y = 10
// x = 20
// y = 10
// Sample Input 1

// 35
// 65
// Sample Output 1

// c = 35
// x = 65
// y = 35
// x = 65
// y = 35
// Sample Input 2

// 200
// 300
// Sample Output 2

// c = 200
// x = 300
// y = 200
// x = 300
// y = 200
// Sample Input 3

// 250
// 450
// Sample Output 3

// c = 250
// x = 450
// y = 250
// x = 450
// y = 250
// Sample Input 4

// 40
// 90
// Sample Output 4

// c = 40
// x = 90
// y = 40
// x = 90
// y = 40

import java.util.*;

public class Q4 {

    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

        // Reading the integers x and y
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        // Initial values
        System.out.println("c = " + x);

        // Swapping without using a third variable
        x = x + y; // Step 1
        y = x - y; // Step 2
        x = x - y; // Step 3

        // Swapped values
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        // Print again to match the expected output format
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        scanner.close();
    }
}