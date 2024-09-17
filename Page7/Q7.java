// // GKSTR11 Multiple Of 7
// Take an integer N as input, and print all the multiples of 7 till N(inclusive).

// Input Format

// An integer value

// Constraints

// 0 <= N <= 10^4
// Output Format

// Print Integer values (All multiples of 7)

// Sample Input 0

// 98
// Sample Output 0

// 0 7 14 21 28 35 42 49 56 63 70 77 84 91 98
 import java.util.*;

public class Q7 {

    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        for(int i=0; i<=n; i=i+7){
            System.out.print(i+" ");
        }
    }
}