// // Print nth Tribonacci number

// nth term Tn of The Tribonacci sequence is defined as follows:

// T0(0th term) = 0, 
// T1(1st term) = 1, 
// T2(2nd term) = 1, 
// and Tn+3 = Tn + Tn+1 + Tn+2 for n >= 0.
// Take n as an integer inout, print the value of Tn(nth term) as an integer output.

// Input Format

// For each test case, n will be given as an integer input.

// Constraints

// 0 <= n <= 37
// Output Format

// Print the value of nth Tribonacci number.

// Sample Input 0

// 0
// Sample Output 0

// 0

import java.util.*;

public class Q10 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
          Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        // Base cases
        if (n == 0) {
            System.out.println(0);
            return;
        } else if (n == 1 || n == 2) {
            System.out.println(1);
            return;
        }
        
        // Initialize variables for the Tribonacci sequence
        int T0 = 0, T1 = 1, T2 = 1;
        int Tn = 0;
        
        // Calculate Tn for n >= 3
        for (int i = 3; i <= n; i++) {
            Tn = T0 + T1 + T2;
            T0 = T1;
            T1 = T2;
            T2 = Tn;
        }
        
        // Print the nth Tribonacci number
        System.out.println(Tn);
    }
}





// or

// import java.io.*;
// import java.util.*;

// public class Q10 {

//     public static void main(String[] args) {
//         /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
        
//         int a=0,b=1,c=1;
        
//         for(int i=0;i<n; i++)
//         {
//             int d=a+b+c;
//             a=b;
//             b=c;
//             c=d;
//         }
//         System.out.println(a);
//     }
// }