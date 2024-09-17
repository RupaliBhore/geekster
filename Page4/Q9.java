// // Print the final incremented salary

// Take in three inputs age, salary, experience, then

// a. If age is greater than 60 and salary is greater than 20,000 and experience is greater than 20 years, then add 5000 to the salary.

// b. If age is greater than 40 and salary is greater than 15,000 and experience is greater than 10 years, then add 2000 to the salary.

// c. If age is greater than 30 and salary is greater than 10,000 and experience is greater than 5 years, then add 1000 to the salary.

// d. Otherwise add 500 to the salary.

// In the end Print the final salary.

// Input Format

// For each test case,

// You will get age as an integer input in the first line,

// You will get salary as an integer input in the second line,

// You will get experience as an integer input in the third line.

// Constraints

// 0<=age,salary,experience<=20,000
// Output Format

// Print the final salary as an integer output.

// Sample Input 0

// 65
// 25000
// 25
// Sample Output 0

// 30000
// Explanation 0

// Since the age is greater than 60 and salary is greater than 20,000 and experience is greater than 20 years, so we add 5000 to the salary, hence we print 30000

// Sample Input 1

// 30
// 15000
// 7
// Sample Output 1

// 15500
// Explanation 1

// Since the age is 30, so none of the conditions follow, so we add 500 to the salary. Hence the final salary is 15500

// Sample Input 2

// 40
// 15000
// 5
// Sample Output 2

// 15500
// Sample Input 3

// 65
// 10000
// 25
// Sample Output 3

// 10500
// Sample Input 4

// 30
// 25000
// 25
// Sample Output 4

// 25500
// Sample Input 5

// 45
// 20000
// 11
// Sample Output 5

// 22000
// Sample Input 6

// 35
// 11000
// 6
// Sample Output 6

// 12000
// Sample Input 7

// 45
// 16000
// 11
// Sample Output 7

// 18000
// Sample Input 8

// 41
// 15000
// 11
// Sample Output 8

// 16000



import java.util.*;

public class Q9 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner scanner = new Scanner(System.in);

        int age = scanner.nextInt();
        int salary = scanner.nextInt();
        int experience = scanner.nextInt();

      
        if (age > 60 && salary > 20000 && experience > 20) {
            salary += 5000;
        } else if (age > 40 && salary > 15000 && experience > 10) {
            salary += 2000;
        } else if (age > 30 && salary > 10000 && experience > 5) {
            salary += 1000;
        } else {
            salary += 500;
        }

        System.out.println(salary);

    }
}