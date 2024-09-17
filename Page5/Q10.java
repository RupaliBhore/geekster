// // HW_Print the month
// Write a program that prompts the user to enter a month number (1-12) and uses a switch statement to display the name of the corresponding month. If the user enters an invalid number, the program should print Invalid Number.

// for 1 print January , for 2 print February and so on.

// Input Format

// Take integer N as an input.

// Constraints

// 0 <= N <= 100
// Output Format

// Print the desired output.

import java.util.*;

public class Q10 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
          Scanner scn = new Scanner(System.in);

        int monthNumber = scn.nextInt();

        switch (monthNumber) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid Number");
        }

    }
}