// // Print n, n-k, n-2k, n-3k.... till l
// You will be given three integer inputs N,K and L and you to print the series N, N-K, N-2K, N-3K.... till last where the value printed in the end should be just greater than or equal to the given input L.

// To be clear: You will print L if L belongs to the series.

// Input Format

// For each test case, you will get

// N in the first line as an integer input,

// K in the second line as an integer input,

// L in the third line as an integer input.

// Constraints

// 0 <= N , K < 2^10

// -2^31 <= L <= 2^31-1
// Output Format

// You have to print the series where each number should be printed in a separate line.

// Sample Input 0

// 50
// 5
// 4
// Sample Output 0

// 50
// 45
// 40
// 35
// 30
// 25
// 20
// 15
// 10
// 5
// Sample Input 1

// 70
// 9
// 10
// Sample Output 1

// 70
// 61
// 52
// 43
// 34
// 25
// 16
// Sample Input 2

// 60
// 6
// 14
// Sample Output 2

// 60
// 54
// 48
// 42
// 36
// 30
// 24
// 18
// Sample Input 3

// 22
// 4
// 6
// Sample Output 3

// 22
// 18
// 14
// 10
// 6
// Sample Input 4

// 42
// 7
// 18
// Sample Output 4

// 42
// 35
// 28
// 21

import java.util.*;

public class Q9{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
                Scanner scanner = new Scanner(System.in);

        // Read inputs N, K, L
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int L = scanner.nextInt();

        // Close the scanner
        scanner.close();

        // Start with N as the initial value in the series
        int current = N;

        // Print the series until the last value is >= L
        while (current >= L) {
            System.out.println(current);
            current -= K; // Decrement by K
        }

    }
}