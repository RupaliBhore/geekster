// // HW_Grace Marks 1
// You are given the marks of a student as an integer input, the teacher gives 4 marks as grace marks if the marks of the student is less than 33, otherwise no grace marks are given. Print the final marks of the student.

// Input Format

// For each test case, marks of a student will be given as an integer input.

// Constraints

// 0<=marks<=2^31-1
// Output Format

// Print the final marks of a student in the integer output.

// Sample Input 0

// 20
// Sample Output 0

// 24
// Explanation 0

// Since the marks of the student is below 33, so we add 4 marks as the grace marks, so the final marks is 24.

import java.util.*;

public class Q7 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner scanner = new Scanner(System.in);

        int marks = scanner.nextInt();

        if (marks < 33) {
            marks += 4; 
        }

        System.out.println(marks);

    }
}