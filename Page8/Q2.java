// // Print n to x
// You will be given an input n and x as an integer input, and you have to print the numbers from n to x in different lines.

// Input Format

// For each test case, you will get

// n as an integer input in the first line,

// x as an integer input in the second line.

// Constraints

// -2^31 <= n , x <= 2^31-1
// Output Format

// Print the numbers as integer outputs as given in the problem statement.

// Sample Input 0

// 10
// 2
// Sample Output 0

// 10
// 9
// 8
// 7
// 6
// 5
// 4
// 3
// 2
// Sample Input 1

// 20
// 14
// Sample Output 1

// 20
// 19
// 18
// 17
// 16
// 15
// 14
// Sample Input 2

// 11
// -2
// Sample Output 2

// 11
// 10
// 9
// 8
// 7
// 6
// 5
// 4
// 3
// 2
// 1
// 0
// -1
// -2
// Sample Input 3

// 9
// -5
// Sample Output 3

// 9
// 8
// 7
// 6
// 5
// 4
// 3
// 2
// 1
// 0
// -1
// -2
// -3
// -4
// -5



import java.util.*;

public class Q2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner scanner = new Scanner(System.in);
        
        // Read integer input n
        int n = scanner.nextInt();
        
        // Read integer input x
        int x = scanner.nextInt();
        
        // Print numbers from n to x
        if (n <= x) {
            for (int i = n; i <= x; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = n; i >= x; i--) {
                System.out.println(i);
            }
        }
    }
}