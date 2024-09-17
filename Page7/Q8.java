// // Print 2,9,16...


    // You will be given an input n of integer data-type. You have to print numbers of the series 2, 9, 16, 23.... till n in different lines, where the last number printed should be an integer just less than n or equal to n.

// To be clear, you will print n if it belongs to the series.

// Input Format

// For each test case, you will be a value n of integer data-type.

// Constraints

// 1 <= n <= 2^31-1
// Output Format

// You have to print first n numbers of the series 2, 9, 16, 23 as integer data-type in different lines.

// Sample Input 0

// 40
// Sample Output 0

// 2
// 9
// 16
// 23
// 30
// 37
// Explanation 0

// Since the value of n is 40, so the last number printed is just less than or equal to n.

// Sample Input 1

// 90
// Sample Output 1

// 2
// 9
// 16
// 23
// 30
// 37
// 44
// 51
// 58
// 65
// 72
// 79
// 86
// Sample Input 2

// 35
// Sample Output 2

// 2
// 9
// 16
// 23
// 30
// Sample Input 3

// 44
// Sample Output 3

// 2
// 9
// 16
// 23
// 30
// 37
// 44
// Explanation 3

// Here the given number is 44, and 44 is also a part of the series, and so we print it.
import java.util.*;

public class Q8 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
           Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        
       
        int current = 2;
        
     
        while (current <= n) {
            System.out.println(current);
            current += 7;  
        }
    }
}