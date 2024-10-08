// Reverse string

// Given a String Str. We have to Reverse the string Str with the help of only stacks.

// Input Format

// Single String Str.

// Constraints


// 1≤Str.length()≤10^5
 
// Output Format

// Print the Reverse of the String Str.

// Sample Input 0

// Copy code
// abcdee
// Sample Output 0

// Copy code
// eedcba
// Explanation 0

// Reverse of "abcdee" => "eedcba"



// import java.util.*;

// public class Q5 {

//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
        
//         // Read the input string
//         String str = scn.next();
        
//         // Declare a stack to hold characters
//         Stack<Character> st = new Stack<>();
        
//         // Push each character of the string onto the stack
//         for (int i = 0; i < str.length(); i++) {
//             st.push(str.charAt(i));
//         }
        
//         // Build the reversed string using the stack
//         StringBuilder reversedStr = new StringBuilder();
//         while (!st.isEmpty()) {
//             reversedStr.append(st.pop());
//         }
        
//         // Print the reversed string
//         System.out.println(reversedStr.toString());
        
//         scn.close();
//     }
// }








import java.util.*;

public class Q5 {
 public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();  // Read the input string
        
        Stack<Character> st = new Stack<>();  // Declare a stack to hold characters
        
        // Push each character of the string onto the stack
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            st.push(ch);
        }
        
        // Prepare to build the reversed string
        String ans = "";
        
        // Pop characters from the stack and append to the result string
        // while (!st.isEmpty()) {
        //     ans += st.pop();
        // }
     // or
     while(st.size() != 0){
        ans += st.pop();
     }
        // Output the reversed string
        System.out.println(ans);
    }
} // discussed














// import java.io.*;
// import java.util.*;

// public class Solution {
//  public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         String s = scn.next();  // Read the input string
        
//         Stack<Character> st = new Stack<>();  // Declare a stack to hold characters
        
//         // Push each character of the string onto the stack
//         for (int i = 0; i < s.length(); i++) {
//             char ch = s.charAt(i);
//             st.push(ch);
//         }
        
//         // Prepare to build the reversed string
//         String ans = "";
        
//         // Pop characters from the stack and append to the result string
//         while (!st.isEmpty()) {
//             ans += st.pop();
//         }
        
//         // Output the reversed string
//         System.out.println(ans);
//     }
// } // discussed