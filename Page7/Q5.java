// // Print x to n

// You will be given x and n as an integer input from the user. You have to print the number from x to n(both inclusive), each number in the different line.

// Input Format

// For each test case, you will get

// x as an integer input in the first line.

// n as an integer input in the second line.

// Constraints

// -2^31 < x , n <= 2^31-1
// Output Format

// Print the integer output in n different lines.

// Sample Input 0

// 3
// 10
// Sample Output 0

// 3
// 4
// 5
// 6
// 7
// 8
// 9
// 10
// Sample Input 1

// 2
// 9
// Sample Output 1

// 2
// 3
// 4
// 5
// 6
// 7
// 8
// 9
// Sample Input 2

// 7
// 18
// Sample Output 2

// 7
// 8
// 9
// 10
// 11
// 12
// 13
// 14
// 15
// 16
// 17
// 18
// Submissions: 54
// Max Score: 10
// Difficulty: Medium
// Rate This Challenge:

    
// More
 
// 1
import java.util.*;

public class Q5 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner scanner = new Scanner(System.in);
        
        // Read input x
        long x = scanner.nextLong();
        
        // Read input n
        long n = scanner.nextLong();
        
        // Determine the start and end for loop
        long start = Math.min(x, n);
        long end = Math.max(x, n);
        
        // Print numbers from start to end
        for (long i = start; i <= end; i++) {
            System.out.println(i);
        }
        
    }
}

