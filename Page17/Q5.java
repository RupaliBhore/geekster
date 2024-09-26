// // Reverse n-digit number

// Take a number n greater than or equal to zero as an integer input.

// Then you will be given n digits as integer inputs and you have to form a number from it. Print the number formed.

// Then you have to reverse the digits of this number. And then print the final reversed number in the next line.

// Input Format

// For each test case,

// n will be given as an integer input,

// then you will be given n digits as integer inputs in each line.

// Constraints

// 1 <= n <= 8

// 0 <= Digit input <= 9
// Output Format

// Print the number formed from the digits in the first line.

// Print the reversed number formed in the second line.

// Sample Input 0

// 3
// 2
// 5
// 6
// Sample Output 0

// 256
// 652
// Sample Input 1

// 4
// 2
// 5
// 6
// 1
// Sample Output 1

// 2561
// 1652
// Sample Input 2

// 7
// 2
// 5
// 6
// 1
// 3
// 8
// 2
// Sample Output 2

// 2561382
// 2831652
// Sample Input 3

// 6
// 8
// 2
// 1
// 9
// 8
// 7
// Sample Output 3

// 821987
// 789128
// Sample Input 4

// 5
// 1
// 3
// 4
// 9
// 7
// Sample Output 4

// 13497
// 79431

// Note:-  differ between both code is input as digit and array
import java.util.*;

public class Q5 {
    
    public static void main(String[] args) {
               Scanner scanner = new Scanner(System.in);
    
            // Reading the number of digits, n
            int n = scanner.nextInt();    //3
            scanner.nextLine(); // Consume newline character after n
    
            // Array to store the digits
            int[] digits = new int[n];
    
            // Reading the digits
            for (int i = 0; i < n; i++) {
                    digits[i] = scanner.nextInt(); //  [2,5,6]
                }
        
                // Close the scanner
                scanner.close();
        
                // Forming the number from digits
                int formedNumber = formNumber(digits);
        
                // Printing the formed number
                System.out.println(formedNumber);
        
                // Reversing the number and printing the reversed number
                int reversedNumber = reverseNumber(formedNumber);
                System.out.println(reversedNumber);
            }
        
            // Function to form number from digits         *** array to digit
            public static int formNumber(int[] digits) {  //[2,5,6]
                int number = 0;
        
                // Calculate the number from digits
                for (int i = 0; i < digits.length; i++) {
                        number = number * 10 + digits[i]; //2 //5 // 6 
                    }
            
                    return number;
                }
            
                // Function to reverse the digits of a number
                public static int reverseNumber(int number) { //256
                    int reversedNumber = 0;
            
                    // Reversing the number
                    while (number != 0) {
                            int digit = number % 10; // 6 //5 //2
                            reversedNumber = reversedNumber * 10 + digit; // 6 //5 //2
                            number /= 10;
                        }
                
                        return reversedNumber;
                    }
                }
                
                
                
                // Note:-  differ between both code is input as digit and array
                //Rupali code 
                
//                 import java.util.*;
                
//                 public class Q5 {
                    
                    
                    
//                     public static void main(String[] args) {
//                         Scanner sc = new Scanner(System.in);
                        
//                         // Reading the number of digits
//                         int n = sc.nextInt();                       //3

//         // Forming the number from the digits
//         int number = formNumber(sc, n);        

//         // Reversing the number
//         int reversedNumber = reverse(number);

//         // Printing the results
//         System.out.println(number);
//         System.out.println(reversedNumber);
//     }
//     public static int reverse(int n) { 
//         int x = 0;
//         while (n != 0) {
//             int d = n % 10;
//             x = x * 10 + d;
//             n = n / 10;
//         }
//         return x;
//     }
    
//     public static int formNumber(Scanner sc, int n) {
//         int ans = 0;
//         for (int i = 0; i < n; i++) {
//             int t = sc.nextInt();               // 
//             ans = ans * 10 + t;
//         }
//         return ans;
//     }
// }




