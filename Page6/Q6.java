// // Print character at 3rd index

// You will be given a string as an input, and

// a. If the length of the string is greater than or equal to 4, then print the character at 3rd index.

// b. Otherwise, print Small string

// Eg. If the input string is abcdef, then print d.

// Input Format

// For each test case, you will get a string as input.

// Constraints

// You will get a string as input.
// Output Format

// Print accoriding to the conditions mentioned above.

// Sample Input 0

// wxyza
// Sample Output 0

// z
// Explanation 0

// Since the length of the string is 5 which is greater than or equal to 4, so we print the character at the third index which is z.

// Sample Input 1

// abc
// Sample Output 1

// Small string
// Sample Input 2

// lmnopqr
// Sample Output 2

// o
// Sample Input 3

// k
// Sample Output 3

// Small string


import java.util.*;

public class Q6 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner scanner = new Scanner(System.in);
      
        String input = scanner.nextLine();
        
        if (input.length() >= 4) {
            System.out.println(input.charAt(3));
        } else {
            System.out.println("Small string");
        }
    }
}

