// Merge Strings Alternatively

// Take two strings as input.

// Merge both the strings alternatively.

// Note: Length of strings will be same.

// Input Format

// First line contains String s1. Second liine contains String s2.

// Constraints

// 1<=String1.length<=100
// 1<=String2.length<=100
// Output Format

// Single line output. 1. A String

// Sample Input 0

// GEEK
// STER
// Sample Output 0

// GSETEEKR
// Explanation 0

// Starting from string 1, G is taken, then S from string 2, and then E from string 1.

// Repeat the steps untill the final answer is achieved.

import java.util.*;

public class Q3 {

    public static void main(String[] args) {

   Scanner scn = new Scanner(System.in);
        String s = scn.next();
         String t = scn.next();
        
        String ans = "";
        for(int i=0; i<s.length(); i++){
            
            ans += s.charAt(i);
            ans += t.charAt(i);
            
        }
        System.out.println(ans);
    }
}
//class discussion aman sir











// import java.io.*;
// import java.util.*;

// public class Solution {

//  public static void main(String[] args) {
//         // Initialize Scanner to read input
//         Scanner scanner = new Scanner(System.in);
        
//         // Read the two input strings
//         String s1 = scanner.nextLine();
//         String s2 = scanner.nextLine();
        
//         // Initialize a StringBuilder to store the merged string
//         StringBuilder mergedString = new StringBuilder();
        
//         // Loop over the length of the strings (both are the same length)
//         for (int i = 0; i < s1.length(); i++) {
//             mergedString.append(s1.charAt(i)); // Append character from s1
//             mergedString.append(s2.charAt(i)); // Append character from s2
//         }
        
//         // Print the merged string
//         System.out.println(mergedString.toString());
        
//         // Close the scanner
//         scanner.close();
//     }
// }