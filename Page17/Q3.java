// // Reverse a 3 digit number

// Take in a three digit number as an integer input and reverse its digits. And then print the final reversed number as an integer output.

// Input Format

// The first line of input will contain an integer T — the number of test cases. The description of T test cases follows.

// For each test case,

// A three digit number will be given as an input.

// Constraints

// 100 <= 3 digit number <= 999
// Output Format

// Print the final reverse 3 digit number as an integer output.

// Sample Input 0

// 3
// 234
// 123
// 456
// Sample Output 0

// 432
// 321
// 654
// Sample Input 1

// 2
// 345
// 111
// Sample Output 1

// 543
// 111

import java.util.*;

public class Q3 {
    
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
    
            // Reading the number of test cases
            int T = scanner.nextInt();
            scanner.nextLine(); // Consume newline character after T
    
            // Iterating over each test case
            for (int i = 0; i < T; i++) { 
                    // Reading the three-digit number
                    int number = scanner.nextInt();
        
                    // Calculating the reversed number
                    int reversedNumber = reverseNumber(number);  // suppose number = 345
        
                    // Printing the reversed number
                    System.out.println(reversedNumber);
                }
        
                scanner.close();
            }
        
            // Function to reverse the digits of a three-digit number
            public static int reverseNumber(int number) { // let number = 345
                int ones = number % 10;    //5 
                int tens = (number / 10) % 10; //4
                int hundreds = number / 100; //3
        
                // Reversing the number
                int reversedNumber = ones * 100 + tens * 10 + hundreds; //5*100 + 4*10 + 3 == 543
                return reversedNumber;
            }
        }
        

        // Rupali code there are two code 
        // note:-  main difference b/t rupali code is :- 1  me void function h or 1 me int 
        
        // import java.util.Scanner;
        
        // public class Q3 {
            
        //     public static void main(String[] args) {
            //       Scanner sc=new Scanner(System.in);
            //         int n=sc.nextInt(); //345
            //         lastDigit(n);
            
            //     }
//     public static void lastDigit(int n) //345
//     {
    //         while(n>0) //345 //34 // 3
//         {
//             int d=n%10; //5 // 4 /3
//             System.out.print(d);   //543
//             n=n/10; // 34 // 3
//         }
//     }
// }

//Rupali 2

// import java.util.*;

// public class Q3 {


//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int t = sc.nextInt();

//         for (int i = 0; i < t; i++) {
//             int n = sc.nextInt(); 

//             int digit = reverse2(n); //345

//             System.out.println(digit);

//         }
//     }
//     static int reverse2(int n) { // 345
//         while (n > 0) {  //345
//             int d = n % 10; //5 // 4 
//             // 0 + 5 //4 
//             n = n / 10; // 34 //3
//         }

//         return d;

//     }
// }
