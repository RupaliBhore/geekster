// // HW_Marks of a student in 5 subjects

// Meet John, a math teacher who created a program that takes a student's marks in five subjects as input, calculates the total marks and percentage, and prints the results in Double variable. The maximum marks a student can score is 500.0 . The program accurately calculates the total marks and percentage for each student based on their five subject scores, making it easier for John to track their performance.

// Input Format

// For each test case,

// In the first line you will get, marks in the 1st subject.

// In the second line you will get, marks in the 2nd subject.

// In the third line you will get, marks in the 3rd subject.

// In the fourth line you will get, marks in the 4th subject.

// In the fifth line you will get, marks in the 5th subject.

// Constraints

// In each line you will get marks as an input as a double data-type.
// Output Format

// In the first line, print the sum of the marks of the student as a double variable.

// In the second line, print the percentage of the marks of the student as a double variable.

// Sample Input 0

// 10.0
// 10.0
// 10.0
// 10.0
// 10.0
// Sample Output 0

// 50.0
// 10.0
// Explanation 0

// Sum of the students'marks is 50.0 and since the maximum marks is 500.0, so the percentage is 10.0



import java.util.*;

public class Q5 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
          Scanner scanner = new Scanner(System.in);

        double marks1 = scanner.nextDouble();
        double marks2 = scanner.nextDouble();
        double marks3 = scanner.nextDouble();
        double marks4 = scanner.nextDouble();
        double marks5 = scanner.nextDouble();


        double totalMarks = marks1 + marks2 + marks3 + marks4 + marks5;

        double percentage = (totalMarks / 500.0) * 100.0;

        System.out.println(totalMarks);
        System.out.println(percentage);
    }}