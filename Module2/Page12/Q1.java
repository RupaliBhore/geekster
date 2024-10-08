// Count Substring of 0 and 1

// Given a binary string s, return the number of non-empty substrings that have the same number of 0's and 1's, and all the 0's and all the 1's in these substrings are grouped consecutively. Substrings that occur multiple times are counted the number of times they occur.

// NOTE:- After answering the question, attempt the related question in the linked resource to improve your understanding of this question .Click here

// Input Format

// A String

// Constraints

// 1 <= s.length <= 10^6
// s[i] is either '0' or '1'.
// Output Format

// An integer value

// Sample Input 0

// 00110011
// Sample Output 0

// 6
// Explanation 0

// There are 6 substrings that have equal number of consecutive 1's and 0's: "0011", "01", "1100", "10", "0011", and "01". Notice that some of these substrings repeat and are counted the number of times they occur. Also, "00110011" is not a valid substring because all the 0's (and 1's) are not grouped together.

import java.util.*;

public class Q1 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        
        int p = 0;
        int c = 1;
        
        int ans = 0;
        
        
        for( int i = 1; i<s.length(); i++){
            if(s.charAt(i)==s.charAt(i-1)){
                c++;
            }else{
                
                ans += Math.min(p,c);
                p = c; 
                c = 1;
            }
            
        }
        ans += Math.min(p,c);
        System.out.println(ans);
    }
}

// Aman sir class answer
