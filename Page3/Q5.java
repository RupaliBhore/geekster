// // hw_Tax or not

// Take income of a person as input from the user, print No tax to be paid if income is less than 500,000 and print Tax to be paid if income is greater than or equal to 500,000.

// Input Format

// For each test case, You will be given the income of a person as an integer input.

// Constraints

// 0<=income<= 2^31-1
// Output Format

// Print No tax to be paid or Tax to be paid

// Sample Input 0

// 600000
// Sample Output 0

// Tax to be paid
// Explanation 0

// Since the salary is 600000, which is greater than or equal to 500000, so we print "Tax to be paid"


import java.util.*;

public class Q5 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner scanner = new Scanner(System.in);

        long income = scanner.nextLong();

        
        if (income < 500000) {
            System.out.println("No tax to be paid");
        } else {
            System.out.println("Tax to be paid");
        }

    }
}