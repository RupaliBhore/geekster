// Check if array pair are divisible by K

// Given an array of integers arr of even length n and an integer k.

// We want to divide the array into exactly n / 2 pairs such that the sum of each pair is divisible by k.

// Return true If you can find a way to do that or false otherwise.

// Input Format

// Take the first Integer N representing length of array.

// Take the N integer representing the element of an array.

// Take the Integer K .

// Constraints

// arr.length == n

// 1 <= n <= 10^5

// n is even.

// -10^9 <= arr[i] <= 10^9

// 1 <= k <= 10^5

// Output Format

// Return true If you can find a way to do that or false otherwise.

// Sample Input 0

// 10
// 1
// 2
// 3
// 4
// 5
// 6
// 7
// 8
// 9
// 10
// 5
// Sample Output 0

// true
// Explanation 0

// Pairs are (1,9),(2,8),(3,7),(4,6) and (5,10)


import java.util.Scanner;

public class Q8 {
    public static boolean canArrange(int[] arr, int k) {
        // Frequency array to store remainder counts
        int[] remainderFreq = new int[k];

        // Count the frequency of each remainder
        for (int num : arr) {
            int remainder = ((num % k) + k) % k; // To handle negative numbers
            remainderFreq[remainder]++;
        }

        // Check for remainder 0 (pairs with itself)
        if (remainderFreq[0] % 2 != 0) {
            return false;
        }

        // Check other remainders
        for (int i = 1; i <= k / 2; i++) {
            if (remainderFreq[i] != remainderFreq[k - i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input length of array (n)
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input integer k
        int k = sc.nextInt();
        
        // Check if the array can be divided into pairs
        boolean result = canArrange(arr, k);
        System.out.println(result);
        
        sc.close();
    }
}
//finded