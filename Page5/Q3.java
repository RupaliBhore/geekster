// // Grade the student-2

// You are given a character ch which represents a grade of a student in a course. The valid grades are A, B, C, and F. Your task is to print a message based on the grade using a switch statement.

// If the grade is A, print Excellent!.

// If the grade is B, print Well done!.

// If the grade is C, print You passed!.

// If the grade is F, print Better luck next time!.

// If the grade is not one of the valid options, print Invalid grade.

// Input Format

// Input contains character ch.

// Constraints

// A <= ch <= Z
// Output Format

// Print the desired output.

// Sample Input 0

// B
// Sample Output 0

// Well done!
// Sample Input 1

// A
// Sample Output 1

// Excellent!


import java.util.*;

public class Q3 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
           Scanner scanner = new Scanner(System.in);
        
        // Reading the grade input
        char ch = scanner.next().charAt(0);
        scanner.close();
        
        // Using a switch statement to print the corresponding message
        switch (ch) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'B':
                System.out.println("Well done!");
                break;
            case 'C':
                System.out.println("You passed!");
                break;
            case 'F':
                System.out.println("Better luck next time!");
                break;
            default:
                System.out.println("Invalid grade");
                break;
        }
    }
}


