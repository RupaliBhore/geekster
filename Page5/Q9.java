// // HW_Print the day
// Write a Java program that prompts the user to enter a number between 1 and 7 (inclusive) that represents a day of the week. The program should then use a switch statement to output the corresponding name of the day of the week.

// for 1 output is Monday , for 2 output is Tuesday and so on.

// Input Format

// Take input N form the user.

// Constraints

// 1 <= N <= 7
// Output Format

// Print the desired output.

import java.util.*;

public class Q9 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);


        int dayNumber = scanner.nextInt();

        // Check if the input is within the valid range
        if (dayNumber < 1 || dayNumber > 7) {
            System.out.println("Invalid input. Please enter a number between 1 and 7.");
        } else {
            switch (dayNumber) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    // This case will never be reached due to the previous validation check
                    System.out.println("Invalid input.");
                    break;
            }
        }
    }
}