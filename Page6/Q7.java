// // Concatenate_Two_Strings

// Take two strings as input by creating a Scanner object. Print the final string as output after concatenation.

// Hello + Friends = HelloFriends

// Input Format

// Two Lines of input.

// The first line of input will contain 1st string.

// The second line of input will contain 2nd string.

// Constraints

// 1<=Length_Of_First_String<=100

// 1<=Length_Of_Second_String<=100
// Output Format

// Print the concatenated string.

// Sample Input 0

// Hello
// Friends
// Sample Output 0

// HelloFriends


import java.util.*;

public class Q7 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
          Scanner scanner = new Scanner(System.in);

       
        String firstString = scanner.nextLine();

        String secondString = scanner.nextLine();

        // Concatenate the strings
        String concatenatedString = firstString + secondString;

        // Print the concatenated string
        System.out.println(concatenatedString);
    }
}