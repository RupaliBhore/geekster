// Stack Syntax Learning

// 1. Declare an Empty stack s.
// 2. Take Single Integer T as input.
// 3. For next T Lines format (case, x(optional))
// · case 1. Print the size of the stack in a separate line.
// · case 2. Remove an element from the stack. If the stack is empty then print -1 in a separate
// .
// case 3. Add Integer x to the stack s.
// . case 4. Print an element at the top of the stack. If stack is empty print -1 in a seperate line
// Input Format
// Single Integer T.
// · T Lines of format (case, x(optional)).
// Constraints
// 1 <= T <= 10^4
// 0 <= X <= 10^8

// Sample Input 0

// 10
// 3 1
// 3 2
// 4
// 4
// 2
// 4
// 3 4
// 2
// 4
// 1
// Sample Output 0

// 2
// 2
// 1
// 1
// 1








//Discussed One
import java.util.*;

public class Q4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        Stack<Integer> st = new Stack();
        for (int i = 1; i <= t; i++) {
            int caseNu = scn.nextInt();
            if (caseNu == 1) {
                System.out.println(st.size());
            } else if (caseNu == 2) {
                if (st.size() == 0) {
                    System.out.println(-1);
                } else {
                    st.pop();
                }
            } else if (caseNu == 3) {
                int x = scn.nextInt();
                st.push(x);
            } else {
                if (st.size() == 0) {
                    System.out.println(-1);
                } else {
                    System.out.println(st.peek());
                }
            }
        }
    }
}







// Finded
// import java.io.*;
// import java.util.*;

// public class Q4 {

//    public static void main(String[] args) {
//         // Create a scanner object to read input
//         Scanner sc = new Scanner(System.in);
//         // Declare an empty stack of integers
//         Stack<Integer> s = new Stack<>();
        
//         // Take the number of operations T as input
//         int T = sc.nextInt();
        
//         // Loop over T operations
//         for (int i = 0; i < T; i++) {
//             // Read the case type
//             int query = sc.nextInt();
            
//             switch (query) {
//                 case 1:
//                     // Case 1: Print the size of the stack
//                     System.out.println(s.size());
//                     break;
                
//                 case 2:
//                     // Case 2: Remove an element from the stack, print -1 if stack is empty
//                     if (s.isEmpty()) {
//                         System.out.println(-1);
//                     } else {
//                         s.pop();
//                     }
//                     break;
                    
//                 case 3:
//                     // Case 3: Add an integer x to the stack
//                     int x = sc.nextInt();
//                     s.push(x);
//                     break;
                
//                 case 4:
//                     // Case 4: Print the top element of the stack, print -1 if stack is empty
//                     if (s.isEmpty()) {
//                         System.out.println(-1);
//                     } else {
//                         System.out.println(s.peek());
//                     }
//                     break;
//             }
//         }
        
//         // Close the scanner
//         sc.close();
//     }
// }