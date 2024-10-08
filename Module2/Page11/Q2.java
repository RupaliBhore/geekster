// HW_Target String
// Take Two Strings as input. First string as "str" and second string as a "Target" string.

// You are allowed to rotate the original string "str" multiple times.

// Print "True" if "Target" string can be achieved by rotating the "str" any number of times else print "False".

// Note: String "bcda" is a rotation of "abcd" but "bdca" is not a rotation of String "abcd".

// Input Format

// String "str"
// String "Target"
// Constraints

// 1<=str.length()<=1000
// 1<=Target.length()<=1000
// Output Format

// A String "True" or "False".

// Sample Input 0

// abcde
// cdeab
// Sample Output 0

// True
// Sample Input 1

// abcde
// abced
// Sample Output 1

// False


import java.util.*;

public class Q2 {
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the two strings
        String str = scanner.nextLine();
        String target = scanner.nextLine();

        // Check if the target can be obtained by rotating str
        boolean result = canRotate(str, target);
        
        // Print the result
        System.out.println(result ? "True" : "False");
    }

    public static boolean canRotate(String str, String target) {
        // Check if lengths are equal
        if (str.length() != target.length()) {
            return false;
        }

        // Concatenate str with itself
        String concatenated = str + str;

        // Check if target is a substring of the concatenated string
        return concatenated.contains(target);
    }
}