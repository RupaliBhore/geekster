// HW_Greater than 1000 or not.

// Meet Sarah, a software engineer who works for a tech company. As part of her job, she was tasked with writing a program that takes an integer input and prints "true" if it is greater than 1000, and "false" if it is not.

// In simpler terms, if the number is more than 1000, the program should output "true". On the other hand, if the number is less than or equal to 1000, the program should output "false".

// Input Format

// For each test case, you will be given an integer as input.

// Constraints

// -2^31 <= Integer Input <= 2^31 -1

// Output Format

// Print True or False accordingly

// Sample Input 0

// 190
// Sample Output 0

// False
// Explanation 0

// Since 190 is less than 1000, so we print false.


import java.util.*;

public class Q9 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
                   Scanner scn = new Scanner(System.in);
           int x = scn.nextInt();
                if( x > 1000){System.out.println("True");
                        }else{
                                 System.out.println("False");

                    }
        

    }
}