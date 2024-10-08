// Sum of All Substrings
// Take a String str as input and print the sum of all substrings of a string representing a number.

// Eg: str="1234"

// Sum = 1 + 2 + 3 + 4 + 12 + 23 + 34 + 123 + 234 + 1234 = 1670

// Note: Number will be in string fromat.

// Input Format

// A String.

// Constraints

// 1<=str.length<=1000
// Output Format

// An Integer value.

// Sample Input 0

// 12345
// Sample Output 0

// 16755


import java.util.*;

public class Q4 {

    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        String s = sc.next();
        for(int i=0; i<s.length(); i++){
        for(int j=i; j<s.length(); j++){
        String ss = s.substring(i, j+1); 
        ans += Integer.parseInt(ss);
    }
        }
        System.out.println(ans);
    }
    
    
}

//aman sir Logic














// import java.io.*;
// import java.util.*;

// public class Solution {

//     public static void main(String[] args) {
//         // Taking input
//         Scanner scanner = new Scanner(System.in);
//         String str = scanner.nextLine();
//         scanner.close();
        
//         // Calling the method to calculate sum of substrings
//         System.out.println(sumOfSubstrings(str));
//     }

//     public static long sumOfSubstrings(String str) {
//         int n = str.length();
//         long totalSum = 0;
//         long prevSum = 0;
        
//         // Traverse each character of the string
//         for (int i = 0; i < n; i++) {
//             // Convert the character to integer
//             int num = str.charAt(i) - '0';

//             // Compute the current sum using the formula: prevSum * 10 + num * (i + 1)
//             long currSum = prevSum * 10 + num * (i + 1);

//             // Add to the total sum
//             totalSum += currSum;

//             // Update prevSum for the next iteration
//             prevSum = currSum;
//         }

//         return totalSum;
//     }
// }