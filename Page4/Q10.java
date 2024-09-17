// // Print final z given xyz

// Take in x, y, z as integer inputs from the user,

// a. If x is greater than or equal to 20 and z is less than 100 then add 200 to the value of z.

// b. If x is greater than or equal to 10, or y is less than 50 Then add 100 to the value of z.

// In the end print the final value of z as an integer output.

// Input Format

// For each test case, you will get

// Value of x as an integer input in the first line,

// Value of y as an integer input in the second line,

// Value of z as an integer input in the third line.

// Constraints

// -2^31 <= x,y,z <= 2^31-1
// Output Format

// You have to print the final value of z as an integer output.

// Sample Input 0

// 25
// 30
// 80
// Sample Output 0

// 280
// Explanation 0

// Since the value of x is 25 which is greater than or equal to 20, and the value of z is 80 which is less than 100, hence the first condition follows, so we 200 to the value of z and hence we print 80+200=280

// Sample Input 1

// 25
// 45
// 190
// Sample Output 1

// 290
// Explanation 1

// Here the second condition follows so we add 100 to the value of z, so z becomes 190+100=290.

// Sample Input 2

// 15
// 60
// 120
// Sample Output 2

// 220
// Sample Input 3

// 30
// 55
// 170
// Sample Output 3

// 270
// Sample Input 4

// 5
// 45
// 130
// Sample Output 4

// 230
// Sample Input 5

// 5
// 40
// 30
// Sample Output 5

// 130
// Sample Input 6

// 9
// 50
// 100
// Sample Output 6

// 100

import java.util.*;

public class Q10 {

    public static void main(String[] args) {
   
       Scanner scanner = new Scanner(System.in);

        // Read the values of x, y, and z as inputs
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        // Check the first condition
        if (x >= 20 && z < 100) {
            z += 200;
        } else if (x >= 10 || y < 50) {
            z += 100;
        }

        // Print the final value of z
        System.out.println(z);

    }
}