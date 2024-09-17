// // string concatenate 2
// Given 2 strings, s1 and s2, return a string of the form short+long+short, with the shorter string on the outside and the longer string on the inside. The strings will not be the same length, but they may be empty (length 0).

// comboString("Hello", "hi") → "hiHellohi" 
// comboString("hi", "Hello") → "hiHellohi" 
// comboString("aaa", "b") → "baaab"
// Input Format

// Given two strings s1 and s2

// Constraints

// 0 <= s1.length, s2.length <= 1000

// s1.length != s2.length
// Output Format

// Print string representing short + long + short

// Sample Input 0

// hi
// hello
// Sample Output 0

// hihellohi
// Sample Input 1

// hello
// hi
// Sample Output 1

// hihellohi

import java.util.*;

public class Q8 {
public static String comboString(String s1, String s2) {
     if (s1.length() < s2.length()) {
            return s1 + s2 + s1;
        } else {
            return s2 + s1 + s2;
        }
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        
        String s1 = scanner.nextLine();
        
        String s2 = scanner.nextLine();
        
        System.out.println(comboString(s1, s2));
    }
}