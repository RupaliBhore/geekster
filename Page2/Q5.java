// Greater than 100 or not

// You will be given an integer as input, you have to print true if the number is greater than 100, and false otherwise.

// Test Case 1:

// Input: 110

// Output: true

// Explanation: Since the given input is greater than 100, we printed true.

// Input Format

// You will get an integer as input.

// Constraints

// -2^31<= Integer Input <= 2^31

// Output Format

// You have to print True or False.

// Sample Input 0

// 120
// Sample Output 0

// True
// Explanation 0

// Since 120 is greater than 100, so we have printed true.

// Sample Input 1

// 90
// Sample Output 1

// False
// Explanation 1

// Since the input 90 is less than 100, so we print false.

import java.util.*;

public class Q5 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        if (x > 100 ){
            System.out.println("True");
        }
        else {
                        
            System.out.println("False");

            
        }
    }
}
