// Grade the student 1

// You are given marks of a student as an integer input. You need to print according to the following rules: 1 for marks above 90, print excellent. 2 for marks above 80 and less than equal to 90, print good. 3 for marks above 70 and less than equal to 80, print fair. 4 for marks above 60 and less than equal to 70, print meets expectations. 5 for marks above 40 and less than equal to 60, print below par. 6 print failed if none of the above conditions follow.

// Input Format

// For each test case, you will get marks of the student as an integer input.

// Constraints

// 0<=marks<=100

// Output Format

// You need to print according to the rules given above.

// Sample Input 0

// 92
// Sample Output 0

// excellent
// Explanation 0

// Since the marks entered by the user is above 90, so we print "excellent"

import java.util.*;

public class Q3 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner scanner = new Scanner(System.in);

        // Read the student's marks
        int marks = scanner.nextInt();

        // Determine and print the result based on the marks
        if (marks > 90) {
            System.out.println("excellent");
        } else if (marks > 80 && marks <= 90) {
            System.out.println("good");
        } else if (marks > 70 && marks <= 80) {
            System.out.println("fair");
        } else if (marks > 60 && marks <= 70) {
            System.out.println("meets expectations");
        } else if (marks > 40 && marks <= 60) {
            System.out.println("below par");
        } else {
            System.out.println("failed");
        }
    }
}