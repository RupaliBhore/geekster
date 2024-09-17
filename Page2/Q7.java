// Even or not
           

// You have to take an integer as input and print True if it is an even number and False otherwise.

// Input Format

// For each test case, you will be given an integer input.

// Constraints

// -2^31 <= Integer Input <=2^31 -1

// Output Format

// true or false accordingly

// Sample Input 0

// 22
// Sample Output 0

// True
// Explanation 0

// Since 22 is an even number so we print true.




import java.util.*;

public class Q7 {

    public static void main(String[] args) {
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        if (x % 2 == 0 ) {
            System.out.println("True");
        }else {
             System.out.println("False");
        }
    }
}