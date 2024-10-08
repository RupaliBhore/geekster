// Power of a String

// Take a String str as input and calculate the Power of the string.

// Power of a string is defined as the maximum length of substring that contains only one unique character.

// A substring is a continuous sequence of characters within a string.

// Note: All characters in the string are in lowercase.

// Input Format

// A String str

// Constraints

// 1 <= str.length <= 10^4
// Output Format

// Print the required Integer Value.

// Sample Input 0

// abbcccddddeeeeeffgghheecccc
// Sample Output 0

// 5
// Explanation 0

// Here, Power of string is 5 (eeeee), as it is a substring of maximum length having only one unique character.


import java.util.*;

public class Q10 {

    public static void main(String[] args) {
    
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        int  curr = 1;
        int max = 0 ;
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i) == s.charAt(i-1)){
                curr ++;
            }else{//evaluate max. of them 
                max = Math.max(max , curr);
                curr = 1;
                
            }
        }
        max = Math.max(max, curr);
        System.out.println(max);
    }
}
// aman sir class answer














// import java.io.*;
// import java.util.*;

// public class Solution {
//   public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.next();
//         sc.close();

//         int maxPower = 0; // To store the maximum power of the string
//         int currentPower = 1; // To track the length of the current substring with the same character
        
//         // Start iterating from the first character
//         char prevChar = str.charAt(0); 

//         // Iterate through the string from the second character onwards
//         for (int i = 1; i < str.length(); i++) {
//             char currentChar = str.charAt(i);
//             if (currentChar == prevChar) {
//                 // If current character is same as previous, increase current power
//                 currentPower++;
//             } else {
//                 // Different character found, update maxPower if currentPower is greater
//                 maxPower = Math.max(maxPower, currentPower);
//                 // Reset currentPower to 1 for the new character
//                 currentPower = 1;
//                 // Update prevChar to the current character
//                 prevChar = currentChar;
//             }
//         }

//         // Final check after loop ends to update maxPower for the last sequence
//         maxPower = Math.max(maxPower, currentPower);
        
//         System.out.println(maxPower);
//     }
// }