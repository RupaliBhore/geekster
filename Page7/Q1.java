// // Hw_Print two-digit number


// As a junior programmer, Jenny was given the task to develop a program that could take two character inputs, x and y, and form a two-digit number. The program had to follow certain conditions while forming the number. If the first character x was zero, then only the second character y should be printed in the integer data-type format. However, if x was any other digit, the program should print the number xy.

// Jenny was excited to work on the project, and she knew that it would help her learn more about programming. She spent several hours coding and testing the program, ensuring that it would give the correct output for any values of x and y. After testing the program with various inputs, including x = '3' and y = '8', she was pleased to see that the program correctly outputted the number 38 in the integer data-type format.

// Input Format

// For each test case,

// You will get the digit character x as a character data-type in the first line,

// You will get the digit character y as a character data-type in the second line.

// Constraints

// x and y can be any character.
// Output Format

// Print the final number.

// Sample Input 0

// 5
// 6
// Sample Output 0

// 56
// Sample Input 1

// 0
// 8
// Sample Output 1

// 8
// Sample Input 2

// 4
// 8
// Sample Output 2

// 48
// Sample Input 3

// 0
// 3
// Sample Output 3

// 3
// Sample Input 4

// 9
// 0
// Sample Output 4

// 90


import java.util.*;

public class Q1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner scanner = new Scanner(System.in);
        
        // Reading inputs
        char x = scanner.next().charAt(0);
        char y = scanner.next().charAt(0);
        
        // Forming and printing the final number based on the given conditions
        if (x == '0') {
            System.out.println(Character.getNumericValue(y));
        } else {
            System.out.println(Integer.parseInt("" + x + y));
        }
    }
}