// // Print final z
// Take input three numbers x, y, z as an integer input

// Then if the value of x is greater than or equal to 20,

// a. If the value of y is greater than or equal to 100 then add 100 to the value of z.

// b. If the value of y is less than 100 and greater than or equal to 50, then add 50 to the value of z.

// c. Else add 10 to the value of z.

// Else if the value of x is less than 20,

// a. If the value of y is greater than or equal to 100 then add 3 to the value of z.

// b. If the value of y is less than 100 and greater than or equal to 50, then add 2 to the value of z.

// c. Else add 1 to the value of z.

// Print the final value of z as an integer output in the end.

// Input Format

// For each test case,

// Value of x as an integer input will be given in the first line

// Value of y as an integer input will be given in the second line

// Value of z as an integer input will be given in the third line

// Constraints

// 0<=x,y,z<=2^31-1
// Output Format

// Print the final value of z as an integer output

// Sample Input 0

// 30
// 120
// 30
// Sample Output 0

// 130
// Explanation 0

// Since the value of x is 30 which is greater than or equal to 20, and the value of y is 120 which is greater than or equal to 100, so we add 100 to the value of z.

// Sample Input 1

// 22
// 55
// 40
// Sample Output 1

// 90
// Explanation 1

// Since the value of x is greater than or equal to 20, and the value of y is 55 which is greater than or equal to 50 and less than 100, so we print 50 to the value of z. Hence we print 90.



import java.util.*;

public class Q2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);

        // Read the values of x, y, and z as inputs
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        // Determine the output based on the values of x and y
        if (x >= 20) {
            if (y >= 100) {
                z += 100;
            } else if (y >= 50) {
                z += 50;
            } else {
                z += 10;
            }
        } else {
            if (y >= 100) {
                z += 3;
            } else if (y >= 50) {
                z += 2;
            } else {
                z += 1;
            }
        }

        // Print the final value of z
        System.out.println(z);

    }}