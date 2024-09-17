// xyzw

// You will be given four integer inputs x, y, z, w. Print True if x*y is equal to z*w and False otherwise.

// Input Format

// For each test-case In the first you will get x as integer input. In the second you will get y as integer input. In the third you will get z as integer input. In the fourth you will get w as integer input.

// Constraints

// -2^31 <= x,y,z,w <= 2^31 - 1

// Output Format

// Print true or false accordingly.

// Sample Input 0

// 5
// 8
// 10
// 4
// Sample Output 0

// True
// Explanation 0

// Since x=5, y=8, z=10, w=4. xy is 40 and yz is 40, since xy is equal to yz so we print true.



import java.util.*;

public class Q6 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        
        int x = scn.nextInt();
        int y = scn.nextInt();
        int z = scn.nextInt();
        int w = scn.nextInt();
        if ((x * y) == (z * w)) {
            System.out.println("True");
        }else{
              System.out.println("False");
        }
        
    }
}