// // Print digit by digit of a three digit number

// Given a three-digit positive number. Print its digits one by one starting from the digit at one’s place to the digit at hundred’s place in a separate line.

// Input Format

// For each test case, A three digit number will be given as a positive integer input.

// Constraints

// 100 <= 3 digit number <= 999
// Output Format

// Print the digits one by one as an integer output in separate lines.

// Sample Input 0

// 345
// Sample Output 0

// 5
// 4
// 3
// Sample Input 1

// 987

// Sample Output 1

// 7
// 8
// 9
// Sample Input 2

// 654
// Sample Output 2

// 4
// 5
// 6
// Sample Input 3

// 352
// Sample Output 3

// 2
// 5
// 3
// Sample Input 4

// 197
// Sample Output 4

// 7
// 9
// 1

import java.util.*;

public class Q2 {

    public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);

        // Reading the three-digit number
        int number = scanner.nextInt();

    
       scanner.close();
    
        // Extracting and printing digits
        int ones = number % 10;
        int tens = (number / 10) % 10;
        int hundreds = number / 100;

        // Printing digits in the required order
        System.out.println(ones);
        System.out.println(tens);
        System.out.println(hundreds);
    }
}




//hacker rank rupali 


// import java.io.*;
// import java.util.*;

// public class Q2 {
    
//     public static void main(String[] args) {
//       Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();    //    197 7 

//            while(n>0)
//         {
//             int d = n%10; //7 // 9 // 1
//             System.out.println(d); 
//             n=n/10; //19 // 1 
//         }
        
       
//     }
// }