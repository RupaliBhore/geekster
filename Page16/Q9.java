// // HW_If triangle is possible.

// Three sides A, B and C will be given . Return True if triangle is valid otherwise False.

// Note : Use Function.

// Input Format

// Given three sides of triangle A,B and C.

// Constraints

// 1 <= A < 100
// 1 <= B < 100
// 1 <= C < 100
// Output Format

// Print true if triangle is valid otherwise false.

// Sample Input 0

// 7 
// 10 
// 5
// Sample Output 0

// true
// Explanation 0

// 7+10>5 So,triangle is possible

import java.util.*;

public class Q9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading inputs A, B, and C
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        // Checking if triangle is valid
        boolean isValidTriangle = isTriangleValid(A, B, C);

        // Printing the result
        System.out.println(isValidTriangle);

        scanner.close();
    }

    // Function to check if three sides can form a valid triangle
    public static boolean isTriangleValid(int A, int B, int C) {
        // Check triangle inequality theorem
        return (A + B > C) && (A + C > B) && (B + C > A);
    }
}