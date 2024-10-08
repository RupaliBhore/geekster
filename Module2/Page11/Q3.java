// HW_palindromic string 13


// A palindrome is a term that can be read the same way forwards and backwards, irrespective of any punctuation or capitalization changes. To determine whether a phrase is a palindrome, the phrase is first converted to lowercase, and all non-alphanumeric characters are removed, leaving only letters and numbers.

// Input Format

// string str as an input.

// Constraints

// 1 <= str.length <= 2 * 10^5

// str consists only of printable ASCII characters.

// Output Format

// return true or false.

// Sample Input 0

// A man, a plan, a canal: Panama
// Sample Output 0

// true



import java.util.*;

public class Q3 {

    public static boolean palindrome(String str){
    
        str = str.toLowerCase();
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) {
            
            while (left < right && ! Character.isLetterOrDigit(str.charAt(left))) {
                left++;
            }
            
            while (left < right && !Character.isLetterOrDigit(str.charAt(right))) {
                right--;
            }
            
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }
        
        return true;
    }
    
    public static void main(String[] args) {
       
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        
        boolean result = palindrome(str);
        System.out.println(result);
    }
}