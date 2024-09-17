// // HW_Print z, w, t...

// Write a Program using while loop for printing z, w, t… alphabets using a while loop, where the last alphabet printed should be greater than or equal to d.

// Input Format

// No Input

// Constraints

// NA
// Output Format

// Print as Described in Problem Statement

// Sample Output 0

// z w t q n k h e 

public class Q7 {

    public static void main(String[] args) {   char ch = 'z';
        
        // Using while loop to print the sequence as described
        while (ch >= 'd') {
            System.out.print(ch + " ");
            ch -= 3; // Decrease by 3 to get the next character in the sequence
        }
    }
}