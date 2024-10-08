// HW_Generate Rotation
// Given a string. Generate all rotations of a string.

// Input Format

// A String

// Constraints

// 1<=string.length()<=10^3

// Output Format

// An series of String in differnt lines.

// Sample Input 0

// geeks
// Sample Output 0

// geeks
// sgeek
// ksgee
// eksge
// eeksg
// Explanation 0

// after each right rotation we print the string.


import java.util.*;

public class Q6 {


   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String input = scanner.nextLine();
        
        generateRotations(input);
    }

    public static void generateRotations(String s) {
        int n = s.length();
        for (int i = 0; i < n; i++) {
            // Create the rotation by slicing the string
            String rotation = s.substring(n - i) + s.substring(0, n - i);
            System.out.println(rotation);
        }
    }
}