// // HW_Concatenate 3 strings
// You will be given three strings as string data-type input in three separate lines, you need to simply concatenate them and print the length of the string in the first line, and the character at 2nd index in the second line.

// For eg. 
// String 1 = abcd
// String 2 = efgh
// String 3 = xyzw
// then, Concatenated String is abcdefghxyzw.
// Input Format

// For each test case, you will get

// S1 as a string data-type input in the first line.

// S2 as a string data-type input in the second line,

// S3 as a string data-type input in the third line.

// Constraints

// You won't get an empty string as input.
// Output Format

// Print the length of the final concatenated string in the first line, and print the character at the 2nd index in the final concatenated string in the second line.

// Sample Input 0

// ab
// cd
// efg
// Sample Output 0

// 7
// c
// Sample Input 1

// a
// b
// c
// Sample Output 1

// 3
// c
// Sample Input 2

// abc
// hel
// def
// Sample Output 2

// 9
// c
// Sample Input 3

// a
// bcd
// ghij
// Sample Output 3

// 8
// c
// Sample Input 4

// ab
// c
// def
// Sample Output 4

// 6
// c



import java.util.*;

public class Q9 {

    public static void main(String[] args) {
       
         Scanner scanner = new Scanner(System.in);
        
        // Input three strings
      
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        String s3 = scanner.nextLine();
        
        // Concatenate the strings
        String concatenatedString = s1 + s2 + s3;
        
        // Output the length of the concatenated string
        int length = concatenatedString.length();
        System.out.println( length);
        
        // Output the character at index 2 of the concatenated string
        if (length > 2) {
            char charAtIndex2 = concatenatedString.charAt(2);
            System.out.println( charAtIndex2);
        } else {
            System.out.println("Concatenated string is too short to get character at index 2.");
        }
        
    }
}

