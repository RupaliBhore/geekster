// // HW_Total Salary 2
// Write a program to calculate the total salary of a person. The user has to enter the basic salary (an integer) and the grade (an uppercase character), and depending upon which the total salary is calculated as -

//    totalSalary = basic + hra + da + allow – pf
//         where :
// hra   = 20% of basic

// da    = 50% of basic

// allow = 1700 if grade = ‘A’

// allow = 1500 if grade = ‘B’

// allow = 1300 if grade = ‘C' or any other character

// pf    = 11% of basic.
// Round off the total salary and then print the integral part only.

// Note: use functions.

// Input Format

// Basic salary & Grade (separated by space)

// Constraints

// 0 <= Basic Salary <= 7,500,000
// Output Format

// Print Total Salary

// Sample Input 0

// 10000
// A
// Sample Output 0

// 17600
// Sample Input 1

// 4567
// B
// Sample Output 1

// 8762
// Sample Input 2

// 3159
// C
// Sample Output 2

// 6323

import java.util.*;

public class Q8 {

    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

        // Reading inputs
        int basicSalary = scanner.nextInt();
        char grade = scanner.next().charAt(0);

        // Calculating total salary
        int totalSalary = calculateTotalSalary(basicSalary, grade);

        // Printing the integral part of total salary
        System.out.println(totalSalary);

        scanner.close();
    }

    // Function to calculate total salary
    public static int calculateTotalSalary(int basic, char grade) {
        // Calculate HRA, DA, Allowance, and PF
        double hra = 0.20 * basic;
        double da = 0.50 * basic;
        int allow = 0;
        
        switch (grade) {
            case 'A':
                allow = 1700;
                break;
            case 'B':
                allow = 1500;
                break;
            default:
                allow = 1300;
                break;
        }
        
        double pf = 0.11 * basic;

        // Calculate total salary
        double totalSalary = basic + hra + da + allow - pf;

        // Round off the total salary and return the integral part
        return (int) Math.round(totalSalary);
    }
}