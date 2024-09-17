// Adult or not 1
// You will be given the age of a person as an integer input, you need to print "Adult" if the age is greater than or equal to 18 and print “Below age” if the age is below 18.

// Input Format

// For each test case, you will get the age of a person as an integer input.

// Constraints

// 0<=age<=1000

// Output Format

// Print "Adult" or "Below age" accordingly

// Sample Input 0

// 20
// Sample Output 0

// Adult
// Explanation 0

// Since the age is 18 which is greater than or equal to 18, and so we print "Adult"



import java.util.*;

public class Q10 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
         int age = scn.nextInt();
        if (age >= 18){
            System.out.println("Adult");
        }else{
             System.out.println("Below age");
        }
    }
}