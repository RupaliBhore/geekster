// // HW_Print Primes 1

import java.util.*;
public class Q8 {
     public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n <= 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input x and y
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        // Print prime numbers between x and y (inclusive)
        for (int i = x; i <= y; i++) {
            if (isPrime(i)) {
                System.out.print(i +" ");
            }
        }
        scanner.close();
    }
}

//Time Complexity: O((y−x+1)× y) because checking for prime numbers between x and y involves iterating over (y−x+1) numbers and each prime check runs in O(Y) time.

//Space Complexity: 𝑂(1) because only a few integer variables are used for the calculations, regardless of the input size.
// You are given two integer inputs x and y. Make a function that takes in x and y as parameters. Then print all the prime numbers which lie between x and y (x and y both inclusive and y>x).

// Input Format

// First line take an Integer input from user as x.

// Second line take an Integer input from user as y.

// Constraints

// 1 <= x <= 1000

// 1 <= y <= 10^4
// Output Format

// Print all the prime number between given intervals.

// Sample Input 0

// 10
// 20
// Sample Output 0

// 11 13 17 19 
// Explanation 0

// All prime numbers between 10 to 20 are 11 13 17 19 .
