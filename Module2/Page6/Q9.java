// // Int with Maximum Freq

// Mark is a data analyst who is trying to analyze the customer data of a retail company. One of the tasks he needs to perform is to find the most common digit in the customer IDs. The IDs are represented as an array of single-digit integers from 0-9. Mark needs to find the digit that occurs the most in the array in order to identify patterns in customer behavior.

// Help Mark and find the digit form the array that occurs maximum number of times.

// Input Format

// First line contains integer N representing size of array.

// Second line contains N integer representing elements of array.

// Constraints

// 1 <= N <= 10^4

// 0 <= A[i] <= 9
// Output Format

// Return Value whose freq is maximum.

// Sample Input 0

// 5
// 1 1 2 3 4
// Sample Output 0

// 1

// Finded

// import java.util.*;

// public class Q9 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
        
//         // Read the size of the array
//         int N = scanner.nextInt();
//         int[] digits = new int[N];
        
//         // Read the array elements
//         for (int i = 0; i < N; i++) {
//             digits[i] = scanner.nextInt();
//         }
        
//         // Find the most common digit
//         int result = findMostCommonDigit(digits);
//         System.out.println(result);
        
//         scanner.close();
//     }

//     public static int findMostCommonDigit(int[] digits) {
//         int[] frequency = new int[10]; // Array to store frequency of digits 0-9
        
//         // Count the frequency of each digit
//         for (int digit : digits) {
//             frequency[digit]++;
//         }
        
//         // Find the digit with the maximum frequency
//         int maxFrequency = -1;
//         int mostCommonDigit = -1;
//         for (int i = 0; i < frequency.length; i++) {
//             if (frequency[i] > maxFrequency) {
//                 maxFrequency = frequency[i];
//                 mostCommonDigit = i;
//             }
//         }
        
//         return mostCommonDigit;
//     }
// }

// DiSxussed One

import java.util.*;

public class Q9 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = scn.nextInt();
        }
        int[] freq = new int[10];
        for (int i = 0; i < n; i++) {
            freq[A[i]] = freq[A[i]] + 1;
        }
        int maxIdx = 0;
        for (int i = 0; i < 10; i++) {
            if (freq[maxIdx] < freq[i]) {
                maxIdx = i;

            }
        }
        System.out.println(maxIdx);
    }
}
