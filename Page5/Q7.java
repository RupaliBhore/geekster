// // HW_Top Management or not

// Take in experience, salary and rank as integer inputs, then

// a. If experience is greater than or equal to 10 years or the salary is greater than or equal to 50,000 or rank is greater than or equal to 10, then print You are in top management

// b. Else print You are not in top management

// Input Format

// For each test case, you will get

// Experience in the first line as an integer input,

// Salary in the second line as an integer input,

// Rank in the third line as an integer input.

// Constraints

// 0 <= experience , salary , age <= 2^31-1
// Output Format

// Print the string You are in top management or You are not in top management according to the conditions given in the problem statement.

// Sample Input 0

// 11
// 40000
// 9
// Sample Output 0

// You are in top management
// Explanation 0

// Since the experience of the person is 11 which is greater than or equal to 10 so the first condition follows, hence the string "You are in top management" gets printed.

// Sample Input 1

// 8
// 55000
// 8
// Sample Output 1

// You are in top management
// Explanation 1

// Since the salary is 55000 which is greater than or equal to 50000 so the first condition follows, hence we print the string "You are in top management".

// Sample Input 2

// 8
// 48000
// 11
// Sample Output 2

// You are in top management
// Explanation 2

// Since the rank is 11 which is greater than or equal to 10, so the first condition follows, hence we print the string "You are in top management"

// Sample Input 3

// 8
// 45000
// 7
// Sample Output 3

// You are not in top management
// Explanation 3

// Since experience is less than 10, salary is less than 50000 and rank is less than 10, so we print the string "You are not in top management"

// Sample Input 4

// 10
// 48000
// 7
// Sample Output 4

// You are in top management
// Sample Input 5

// 8
// 50000
// 8
// Sample Output 5

// You are in top management
// Sample Input 6

// 7
// 46000
// 10
// Sample Output 6

// You are in top management



import java.util.*;

public class Q7 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);

        // Reading the inputs
        int experience = scanner.nextInt();
        int salary = scanner.nextInt();
        int rank = scanner.nextInt();
        scanner.close();

        // Checking the conditions and printing the corresponding message
        if (experience >= 10 || salary >= 50000 || rank >= 10) {
            System.out.println("You are in top management");
        } else {
            System.out.println("You are not in top management");
        }
    
    }
}