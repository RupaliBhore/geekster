// Delete consecutive


// Given a sequence of N strings, the task is to check if any two similar words come together, then they destroy each other. Other than that, print the number of words left in the sequence after this pairwise destruction.

// Input Format

// Single Integer N.

// Sequence of N strings.

// Constraints


// 1≤N≤1000

// 1≤str.length()≤10

// Output Format

// Print the number of words left in the sequence.
// Sample Input 0

// Copy code
// 4
// aa ab ab ac
// Sample Output 0

// Copy code
// 2
// Explanation 0

// [aa,{ab,ab},ac] => [aa,ac]
// Sample Input 1

// Copy code
// 4
// aa ab ab aa
// Sample Output 1

// Copy code
// 0
// Explanation 1

// [aa,{ab,ab},aa] => [{aa,aa}]=>[]




//discussed one
import java.util.*;

public class Q6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        Stack<String> st = new Stack<>();
        
        for (int i = 1; i <= n; i++) {
            String x = scn.next();
            if (i == 1 || st.size() == 0) {
                st.push(x);
            } else {
                if (x.equals(st.peek())) {
                    st.pop();
                } else {
                    st.push(x);
                }
            }
        }
        
        System.out.println(st.size());
    }
}



// import java.util.Scanner;
// import java.util.Stack;

// public class Solution {
//     public static void main(String[] args) {
//         // Create a Scanner object to read input
//         Scanner scanner = new Scanner(System.in);
        
//         // Read the number of strings
//         int n = scanner.nextInt();
//         scanner.nextLine(); // consume the newline after the integer input
        
//         // We will use a stack to simulate the destruction process
//         Stack<String> stack = new Stack<>();
        
//         // Traverse through the list of words
//         for (int i = 0; i < n; i++) {
//             String word = scanner.next();  // read the next word
            
//             // If the stack is not empty and the top of the stack is equal to the current word
//             if (!stack.isEmpty() && stack.peek().equals(word)) {
//                 // Pop the top element (destroy both)
//                 stack.pop();
//             } else {
//                 // Otherwise, push the current word onto the stack
//                 stack.push(word);
//             }
//         }
        
//         // The size of the stack will be the number of words left after all pairwise destructions
//         System.out.println(stack.size());
        
//         // Close the scanner
//         scanner.close();
//     }
// }