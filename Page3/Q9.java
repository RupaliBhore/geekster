// // HW_Print final salary given age

// The government adds money into the account of a person based on his age. Take age and salary of the person as integer inputs. And print his final income as an integer data-type output.

// a. if age is above 60*, Rs. 1000 is added into the account.

// b. if age is above 40 and less than or equal to 60, Rs. 500 is added.

// c. No money is added if the age is less than or equal to 40.

// Input Format

// For each test case, Age of the person in the first line.

// Salary of the person in the second line.

// Constraints

// 0<=age,salary<=2^31-1
// Output Format

// Print his final income in an integer-data-type format

// Sample Input 0

// 65
// 2000
// Sample Output 0

// 3000
// Explanation 0

// Since the age of the person is above 65, and so we add 1000 into his bank account. Since his salry is 2000, so his final salary becomes 3000.


import java.util.*;

public class Q9 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);

        int age = scanner.nextInt();
        
        int salary = scanner.nextInt();

        int finalIncome = salary;

        if (age > 60) {
            finalIncome += 1000;
        } else if (age > 40 && age <= 60) {
            finalIncome += 500;
        }

        System.out.println(finalIncome);
        
    }
}