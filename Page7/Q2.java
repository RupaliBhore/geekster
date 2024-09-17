// // HW_Toggle and 2 jumps left
// Take in a character as an input from the user,

// A. Conditon 1: If the character is an alphabet then you need to toggle the character first,

// For eg, if the entered character is a, then convert it into A, and if the entered character is A then convert it into a, this simply means that if the entered character is a capital case then convert it into small case character and vice-versa.

// After toggling the character, a. if the resultant character is not ‘a’, ‘A’, ‘b’, ‘B’, then take two jumps to the left and print the character, for eg. If the toggled character is c then print a, If the toggled character is Z, then print X.

// b. If the toggled character is ‘a’, ‘A’, ‘b’, ‘B’, then print Sorry

// B. Condition 2: Otherwise print No alphabet

// Input Format

// For each test case, you will get a character as an input

// Constraints

// You will get a character
// Output Format

// Print according to the given conditions.

// Sample Input 0

// d
// Sample Output 0

// B
// Explanation 0

// Since the given character is 'd', its toggled character is 'D', after taking two jumps to left, we print 'B'

// Sample Input 1

// Z
// Sample Output 1

// x
// Sample Input 2

// a
// Sample Output 2

// Sorry
// Sample Input 3

// B
// Sample Output 3

// Sorry
// Sample Input 4

// \
// Sample Output 4

// No alphabet
// Sample Input 5

// &
// Sample Output 5

// // No alphabet




import java.util.*;

public class Q2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        
        // Reading input
       
        char input = scanner.next().charAt(0);
        
        // Check if the input is an alphabet
        if (Character.isLetter(input)) {
            // Toggle the character
            char toggledChar;
            if (Character.isUpperCase(input)) {
                toggledChar = Character.toLowerCase(input);
            } else {
                toggledChar = Character.toUpperCase(input);
            }
            
            // Check if the toggled character is 'a', 'A', 'b', or 'B'
            if (toggledChar == 'a' || toggledChar == 'A' || toggledChar == 'b' || toggledChar == 'B') {
                System.out.println("Sorry");
            } else {
                // Take two jumps to the left
                char resultChar = (char)(toggledChar - 2);
                System.out.println(resultChar);
            }
        } else {
            System.out.println("No alphabet");
        }
        

    }
}