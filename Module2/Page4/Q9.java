// // HW_Rotate Number 1
// Suppose you are working on a project with a data analytics team, and you are responsible for handling the data preprocessing. One of the preprocessing steps involves rotating an integer N based on a given integer K. If K is positive, you need to rotate the integer N to the right by K steps, and if K is negative, you need to rotate the integer N to the left by K steps. How would you implement this preprocessing step efficiently?

// Note:- Integers are from 1-9.

// Input Format

// First line of input contains an integer N.

// Secind line of input contains an integer K.

// Constraints

// 1 <= N <= 10^9

// 1 <= K <= 9
// Output Format

// Return the integer value.

// Sample Input 0

// 12345
// 2
// Sample Output 0

// 34512
// Explanation 0

// Left rotating N(= 12345) by K(= 2) modifies N to 34512. Therefore, the required output is 34512

// Sample Input 1

// 12345
// 3
// Sample Output 1

// 45123
// Sample Input 2

// 12345987
// -3
// Sample Output 2

// 98712345
// Sample Input 3

// 12345
// 5
// Sample Output 3

// 12345
// Sample Input 4

// 123456789
// -4
// Sample Output 4

// 678912345
// Sample Input 5

// 3456789
// 4
// Sample Output 5

// 7893456


import java.util.*;

public class Q9 {

  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the integer N
        String N = scanner.nextLine();
        
        // Input the integer K
        int K = scanner.nextInt();
        
        // Get the length of the integer N
        int len = N.length();
        
        // Normalize K (handle cases where K is larger than the length of N)
        K = K % len;
        
        if (K < 0) {
            // Left rotation
            K = len + K;
        }
        
        // Rotate the string representation of N
        String rotated = N.substring(K) + N.substring(0, K);
        
        // Output the rotated integer
        System.out.println(rotated);
    }
}

