// //  Print z and x divisible by 3

// Once upon a time, there was a program that took three integers (x, y, z) as input from the user. Depending on the value of x, the program would perform different operations on the value of z.

// If x was divisible by 3, the program checked the value of y.

// If y was greater than or equal to 200, the program added 10 to the value of z.

// If y was greater than or equal to 100 but less than 200, the program added 5 to the value of z.

// If y was greater than or equal to 50 but less than 100, the program added 4 to the value of z.

// If y was less than 50, the program added 1 to the value of z.

// On the other hand, if x was not divisible by 3, the program also checked the value of y.

// If y was greater than or equal to 200, the program added 3 to the value of z.

// If y was greater than or equal to 100 but less than 200, the program added 2 to the value of z.

// If y was less than 100, the program added 1 to the value of z.

// Finally, the program added 10 to the value of z and printed the final value of z.

// Can you write a program to perform these operations using your programming skills?

// Input Format

// For each test case, You get the value of x in the first line as an integer input

// You get the value of y in the second line as an integer input

// You get the value of z in the third line as an integer input

// Constraints

// -2^31<=x,y,z<=2^31-1
// Output Format

// Print the final value of z as an integer output

// Sample Input 0

// 30
// 300
// 5
// Sample Output 0

// 25
// Explanation 0

// Since x is 30 which is divisible by 3, and y is 300 which is greater than or equal to 200, so we add 10 to the value of z, so the value of z becomes 15.

// In the end we add 10 to the value of z again, so now the value of z becomes 25.

// Sample Input 1

// 41
// 150
// 7
// Sample Output 1

// 19
// Explanation 1

// Since the value of x is 41, which is not divisible by 3, and value of y is 150 which is greater than or equal to 100, so we add 2 to the value of z, so z becomes 7+2=9,

// In the end, we add 10 to the value of z, so the value of z becomes 9+10=19.






import java.util.*;

public class Q2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner scanner = new Scanner(System.in);

        
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        if (x % 3 == 0) {
            if (y >= 200) {
                z += 10;
            } else if (y >= 100) {
                z += 5;
            } else if (y >= 50) {
                z += 4;
            } else {
                z += 1;
            }
        } else {
            if (y >= 200) {
                z += 3;
            } else if (y >= 100) {
                z += 2;
            } else {
                z += 1;
            }
        }

      
        z += 10;

        System.out.println(z);
    }
}