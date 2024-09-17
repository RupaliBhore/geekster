// // HW_Marks and Rank
// Take in marks and rank of a student as an integer input, and follow these conditions below in the stepwise manner, which is if the condition given before fails only then move on to the next condition, otherwise don’t

// a. If marks are below 20 or rank is above 100, print Needs improvement

// b. Or If marks are below 40 or rank is above 80, print Concentrate

// c. Or If marks are below 60 or rank is above 120, print Needs to focus

// d. Or if marks are above 100 or rank is below 10, print Very good

// e. If none of the above condition follows, print Bright Student

// Input Format

// For each test case, you will be given

// Marks of a student as an integer input in the first line,

// Rank of the student as an integer input in the second line.

// Constraints

// 0 <= marks , rank <= 2^31-1
// Output Format

// Print the string according to the conditions given.

// Sample Input 0

// 15
// 90
// Sample Output 0

// Needs improvement
// Explanation 0

// Since the marks of the student is below 20, so we print the string "Needs improvement"

// Sample Input 1

// 25
// 75
// Sample Output 1

// Concentrate
// Explanation 1

// Here the second condition follows, so we print the string "Concentrate"

// Sample Input 2

// 55
// 50
// Sample Output 2

// Needs to focus
// Sample Input 3

// 120
// 10
// Sample Output 3

// Very good
// Sample Input 4

// 65
// 15
// Sample Output 4

// Bright Student

import java.util.*;

public class Q8 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
           Scanner scanner = new Scanner(System.in);

        // Reading the inputs
        int marks = scanner.nextInt();
        int rank = scanner.nextInt();
        scanner.close();

        // Checking the conditions in the specified order
        if (marks < 20 || rank > 100) {
            System.out.println("Needs improvement");
        } else if (marks < 40 || rank > 80) {
            System.out.println("Concentrate");
        } else if (marks < 60 || rank > 120) {
            System.out.println("Needs to focus");
        } else if (marks > 100 || rank < 10) {
            System.out.println("Very good");
        } else {
            System.out.println("Bright Student");
        }
    
    }
}