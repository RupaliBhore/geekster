// // HW_Calculate Area 3
// Take the length as l and breadth as b of a rectangle as input. Write a function that takes length and breadth as integer parameters and returns the area of the rectangle. Print the final area returned.

// Input Format

// first line takes user input length as l.

// second line takes user input breadth as b.

// Constraints

// 1 <= l <= 1000
// 1 <= b <= 1000
// Output Format

// Print the area of rectangle.

// Sample Input 0

// 4
// 4 6
// 2 4
// 6 8
// 9 6
// Sample Output 0

// 24
// 8
// 48
// 54
// Sample Input 1

// 2
// 10 12
// 2 7
// Sample Output 1

// 120
// 14

import java.util.*;

public class Q7 {

    public static void main(String[] args) {
              Scanner scanner = new Scanner(System.in);

        // Reading the number of test cases
        int T = scanner.nextInt();
        scanner.nextLine(); // Consume newline character after T

        // Iterating over each test case
        for (int i = 0; i < T; i++) {
            // Reading the entire line for each test case
            String line = scanner.nextLine();
            
            // Splitting the line into parts to extract length and breadth
            String[] parts = line.split(" ");
            int length = Integer.parseInt(parts[0]);
            int breadth = Integer.parseInt(parts[1]);
            
            // Calculating the area using the function
            int area = calculateArea(length, breadth);
            
            // Printing the area
            System.out.println(area);
        }

        scanner.close();
    }

    // Function to calculate the area of a rectangle
    public static int calculateArea(int length, int breadth) {
        return length * breadth; // Area formula for rectangle
    }
}