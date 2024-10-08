// Long Pressed Name

// Your friend is typing his name into a keyboard. Sometimes, when typing a character c, the key might get long pressed, and the character will be typed 1 or more times.

// You examine the typed characters of the keyboard. Return True if it is possible that it was your friends name, with some characters (possibly none) being long pressed.

// NOTE:- After answering the question, attempt the related question in the linked resource to improve your understanding of this question .Click here

// Input Format

// Two String name and typed.

// Constraints

// 1 <= name.length, typed.length <= 1000
// Name and typed consist of only lowercase English letters.
// Output Format

// An boolean value

// Sample Input 0

// alex
// aaleex
// Sample Output 0

// true
// Explanation 0

// 'a' and 'e' in 'alex' were long pressed.


import java.util.*;

public class Q2 {

  public static void main(String[] args) {
        Scanner Scn = new Scanner(System.in);

        String name = Scn.nextLine();
     
        String typed = Scn.nextLine();
        
        // Check if typed can be a long-pressed version of name
        boolean result = isLongPressedName(name, typed);
        System.out.println(result); // Output the result
    }

    public static boolean isLongPressedName(String name, String typed) {
        int i = 0, j = 0;

        while (j < typed.length()) {
            if (i < name.length() && name.charAt(i) == typed.charAt(j)) {
                // Characters match, move both pointers
                i++;
                j++;
            } else if (j > 0 && typed.charAt(j) == typed.charAt(j - 1)) {
                // Character in 'typed' is the same as the previous one, indicating long press
                j++;
            } else {
                // Characters do not match and it's not a valid long press
                return false;
            }
        }

        // If we've matched all characters in 'name', return true
        return i == name.length();
    }
}