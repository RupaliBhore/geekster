// Reverse Words in a Given String

// Mr. Reverse can only read reverse sentences.

// If a sentence is : i like geekster

// Mr. Reverse will be able to read it only if it is written as: geekster like i

// Let's help him read.

// Write a program to reverse the words in a given sentence.

// Take a String str as input and Reverse all the words in a given string.

// NOTE :-

// After answering the question, attempt the related question in the linked resource to improve your understanding of the question . Click here

// Input Format

// There is only one line of input: String str.

// Note: Only lowercase characters are present in the String.

// Constraints

// 1 <= str.length <= 10^4

// Output Format

// Print the sentence after reversing each word.

// Check the example for clarity.

// Sample Input 0

// reverse words in a given string
// Sample Output 0

// string given a in words reverse
// Explanation 0

// The given string is : reverse words in a given string

// On reversing the position of each word, we get:

// string given a in words reverse

// as result.



import java.util.*;

public class Q7 {

   public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        Stack<String> st = new Stack<>();
        String tmp = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                st.push(tmp);
                tmp = "";
            } else {
                tmp += s.charAt(i);
            }
        }

        while (st.size() != 0) {
            tmp += " " + st.pop();
        }
        System.out.println(tmp);
    }
} // discussed 