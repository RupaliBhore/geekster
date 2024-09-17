// // HW_Print n, n-3k, n-6k, n-12k,... till m.

// Take n, k and m as integer inputs and Print the series n, n-3k, n-6k, n-9k, n-12k, n-15k, n-18k… using a while loop. Print till the time the printed value is greater than equal to m.

// Input Format

// take n as an integer input in the first line

// k as an integer input in the second line

// m as an integer input in the third line.

// Constraints

// 1 <= n <= 1000
// 1 <= k <= 1000
// 1 <= m <=1000
// Output Format

// Print the series as per given question.

// Sample Input 0

// 20
// 1
// 2
// Sample Output 0

// 20 17 14 11 8 5 2 
// Explanation 0

// given n = 20, k = 1, m= 2. our series start with n = 20 second value = (20 - (3*1)) = 17 third value = (20 - (6*1)) = 14 fourth value = (20 - (9*1)) = 11 fifth value = (20 - (12*1)) = 8 sixth value = (20- (15*1)) = 5 seventh value = (20 - (18*1)) = 2 since eight value i.e 20 - (21*1) is smaller than 2. therfore we stop the series.


import java.util.*;

public class Q9 {

    public static void main(String[] args) {  Scanner scanner = new Scanner(System.in);
        
        // Read the integer inputs
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int m = scanner.nextInt();
        
        // Print the series
        int value = n;
        int decrement = 0;
        
        while (value >= m) {
            System.out.print(value + " ");
            decrement += 3 * k;
            value = n - decrement;
        }
        
        scanner.close();
    }
}
