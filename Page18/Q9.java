// // HW_Print "prime" or "not prime"

import java.util.*;
public class Q9 {
    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num <= 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read number of integers to process
        int n = scanner.nextInt();
        
        // Process each integer
        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            if (isPrime(number)) {
                System.out.println("prime");
            } else {
                System.out.println("not prime");
            }
        }

        scanner.close();
    }
}

//Time Complexity: O(n×m) where n is the number of integers to process and m is the largest integer being checked for primality, as each prime check runs in O(𝑚) time and there are n checks.

//Space Complexity: O(1) because only a few integer variables are used, regardless of the input size.





// Question

// Take n as an integer input from the user, after this n integer inputs will be given by the user. And for each integer input,you have to print prime if the integer in a prime number and not prime is the integer is not a prime number.

// Input Format

// For each case, n will be given as an integer input in the first line.

// After this n integer numbers will be given as

// Constraints

// 0 <= n < 2^31-1

// 1 <= Each integer number <= 2^31-1
// Output Format

// Print prime or not prime in a separate line accordingly.

// Sample Input 0

// 3
// 45
// 17
// 32
// Sample Output 0

// not prime
// prime
// not prime
// Sample Input 1

// 5
// 17
// 33
// 32
// 45
// 60
// Sample Output 1

// prime
// not prime
// not prime
// not prime
// not prime
// Sample Input 2

// 5
// 17
// 16
// 23
// 90
// 100
// Sample Output 2

// prime
// not prime
// prime
// not prime
// not prime
// Sample Input 3

// 2
// 31
// 54
// Sample Output 3

// prime
// not prime
// Sample Input 4

// 1
// 10
// Sample Output 4

// not prime
