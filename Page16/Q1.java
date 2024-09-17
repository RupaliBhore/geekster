// // Find nCr.

// Given two Integer n and r , find the value of nCr .

// Since the answer may be very large, calculate the answer modulo 10^9+7.

// Input Format

// The first line contains an Integer n.

// The second line contains an Integer r.

// Constraints

// 1 ≤ n ≤ 1000
// 1 ≤ r ≤ 800
// Output Format

// Print the value of nCr.

// Since the answer may be large , calculate the answer modulo 10^9+7. Then print the answer.

// Sample Input 0

// 3
// 2
// Sample Output 0

// 3
// Explanation 0

// 3C2 = 3.

// Sample Input 1

// 2
// 4
// Sample Output 1

// 0
// Explanation 1

// r is greater than n.




import java.util.*;

public class Q1 {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        
        int fact=1;
        int a=n-r;
        // for(int i=1;i<=n; i++)
        // {
        //     fact*=i;
        // }
        
        //System.out.println(fact);
        
        for(int i=1; i<=a; i++)
        {
            fact*=i;
        }
        System.out.println(fact);
    }
}