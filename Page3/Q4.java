// // Print Bonus
// The bonus in a company is given by Bonus= Salary * (5 / 100). A company decided to give a bonus of 5% to employees if his/her years of service is more than 5 years. Ask user for their salary and year of service and print the net bonus amount. If the years of service is less than or equal to 5, print 0, otherwise print Bonus calculated.

// Input Format

// For each test case, you will be given Salary of the user in the first line as an integer input. Years of service in the second line as an integer input.

// Constraints

// 0<=salary<=2^20 0<=years of service<=2^20

// Output Format

// Print the bonus of the employee in the integer format.

// Sample Input 0

// 20000
// 6
// Sample Output 0

// 1000
// Explanation 0

// Since the years of service is 6, so we give the bonus. Hence the bonus is 1000.


import java.util.*;

public class Q4 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner sc = new Scanner(System.in);

        int salary = sc.nextInt();

        // Read the employee's years of service
        int yearsOfService = sc.nextInt();

        // Calculate the bonus
        int bonus = 0;
        if (yearsOfService > 5) {
            bonus = salary * 5 / 100;
        }

        // Print the bonus amount
        System.out.println(bonus);
    }
}