// HW_Count Numbers In a String


// Print the count of numbers in a given string.

// Eg. 132ab2cd45ef6. The above string has 4 numbers.

// Input Format

// A String

// Constraints

// 1<=str.length()<=100000

// Output Format

// An integer value

// Sample Input 0

// 132ab2cd45ef6
// Sample Output 0

// 4
// Explanation 0

// 132, 2, 45 and 6 are number present in string


import java.util.*;

public class Q6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();
        
        int count = 0;
        boolean inNumber = false;
        
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            
            // Check if the current character is a digit
            if (Character.isDigit(c)) {
                // If we are not already in a number sequence, we have found a new number
                if (!inNumber) {
                    count++;
                    inNumber = true;  // Set the flag indicating we are in a number sequence
                }
            } else {
                // If the character is not a digit, reset the inNumber flag
                inNumber = false;
            }
        }
        
        System.out.println(count);
    }
}