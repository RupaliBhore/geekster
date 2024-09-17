// Sum is less than 150 or not.
// You will be given three integer inputs x, y, z. You have to find the sum of these inputs. Print true if the sum is less than 150 and false otherwise.

// Input Format

// For each test case, In the first line, you will be given the value of x. In the second line, you will be given the value of y. In the third line, you will be given the value of z.

// Constraints

// -2^31 <= x,y,z <= 2^31-1

// Output Format

// True or False accordingly

// Sample Input 0

// 20
// 30
// 50
// Sample Output 0

// True
// Explanation 0

// Sum of 20, 30, 50 is 100, since the sum is less than 150 so we print true.




import java.util.*;

public class Q8 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
             int x = scn.nextInt();
        int y = scn.nextInt();
        int z = scn.nextInt();
        
        if (x+y+z < 150 ){
            System.out.println("True");
        }else{
                        System.out.println("False");

        }
    }
}