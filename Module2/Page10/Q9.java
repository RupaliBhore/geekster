// // Find Distance B/W Two Characters
// Given a string and two characters. Print the minimum distance between two given characters a and b in a string.

// Input Format

// A string str
// Two characters
// Constraints

// 2<=String.length()<=100000
// Two characters from given string
// Output Format

// An integer value
// Sample Input 0

// Geeks
// G
// s
// Sample Output 0

// 3
// Explanation 0

// there are 3 character e e k between our target character




//aman sir class  solution
import java.util.*;

public class Q9 {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        char c1 = sc.next().charAt(0);
        char c2 = sc.next().charAt(0);
        
       int i1 = s.indexOf(c1);
       int i2 = s.indexOf(c2);
        System.out.println( i2 - i1 - 1);
    }
}




// import java.io.*;
// import java.util.*;

// public class Q9 {


//      public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
        
//         // Input the string
//        // System.out.print("Enter the string: ");
//         String str = scanner.nextLine();
        
//         // Input the two characters
//        // System.out.print("Enter the first character: ");
//         char char1 = scanner.next().charAt(0);
//       //  System.out.print("Enter the second character: ");
//         char char2 = scanner.next().charAt(0);
        
//         // Call the method to find the minimum distance
//         int minDistance = findMinDistance(str, char1, char2);
        
//         // Output the result
//         System.out.println(minDistance);
        
//         scanner.close();
//     }

//     public static int findMinDistance(String str, char char1, char char2) {
//         int lastChar1Index = -1;
//         int lastChar2Index = -1;
//         int minDistance = Integer.MAX_VALUE;

//         for (int i = 0; i < str.length(); i++) {
//             if (str.charAt(i) == char1) {
//                 lastChar1Index = i;
//                 if (lastChar2Index != -1) {
//                     minDistance = Math.min(minDistance, lastChar1Index - lastChar2Index - 1);
//                 }
//             } else if (str.charAt(i) == char2) {
//                 lastChar2Index = i;
//                 if (lastChar1Index != -1) {
//                     minDistance = Math.min(minDistance, lastChar2Index - lastChar1Index - 1);
//                 }
//             }
//         }

//         return minDistance == Integer.MAX_VALUE ? -1 : minDistance; // Return -1 if characters not found
//     }
// }