// // Print All Substrings
// There is a young girl named Sarah who loves to solve puzzles and riddles. Today, she is given a challenge by her teacher to find all the possible substrings that could be formed from a given string.

// Sarah is excited to take on the challenge, but soon realizes that it is a difficult task. She begins by listing out all the possible substrings manually, but it takes her a long time, and she is not sure if she has found all the possible combinations.

// Can you help Sarah and write a program that print all the possibe substrings.

// Input Format

// Take String as an input.

// Constraints

// 1 <= N <= 10^3
// Where N is the length of the input string.
// Output Format

// Print the total number of substrings possible, where every substring is printed on a single line and hence the total number of output lines will be equal to the total number of substrings.

// Sample Input 0

// abc
// Sample Output 0

// a 
// ab 
// abc 
// b 
// bc 
// c 


// Asked

// import java.io.*;
// import java.util.*;

// public class Q6 {

//     public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);

//         // Input the string
//         String input = scanner.nextLine();

//         // Get the length of the string
//         int length = input.length();

//         // Total number of substrings
//         int totalSubstrings = 0;

//         // Generate and print all possible substrings
//         for (int i = 0; i < length; i++) {
//             for (int j = i + 1; j <= length; j++) {
//                 System.out.println(input.substring(i, j));
//                 totalSubstrings++;
//             }
//         }


//         scanner.close();
//     }
// }


// Discussed
import java.util.*;

public class Q6 {

   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String S = sc.next();
       int n = S.length();
       for(int i=0;  i<n; i++){
          for (int j = i; j < n; j++) {
            //use this logic for Substrings
            for (int k =i; k <= j; k++) {
                System.out.print(S.charAt(k));      
                
            }
               System.out.println();
          }
                        

       } 
    }
}

