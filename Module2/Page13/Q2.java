// Find Square Root


// Given an integer number n. find its square root using binary search.

// If exact square root of n is not possible then print the just nearest and smaller perfect square to n.

// For example: if n=79, then nearest square root will be 8, not 9.

// NOTE:- After answering the question, attempt the related question in the linked resource to improve your understanding of this question .Click here

// Input Format

// An Integer number

// Constraints

// 1 <= n <= 10^9
// Output Format

// An Integer value

// Sample Input 0

// 16
// Sample Output 0

// 4
// Explanation 0

// 4*4 =16


import java.util.*;

public class Q2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Read input number
        sc.close();
        
        // Find the square root or the closest smaller integer
        int result = findSquareRoot(n);
        
        // Print the result
        System.out.println(result);
    }

    public static int findSquareRoot(int n) {
        if (n == 0 || n == 1) {
            return n; // The square root of 0 or 1 is the number itself
        }

        int low = 0, high = n, result = 0;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            long square = (long) mid * mid; // Use long to prevent overflow
            
            if (square == n) {
                return mid; // Found exact square root
            } else if (square < n) {
                result = mid; // Mid is a potential answer
                low = mid + 1; // Search in the right half
            } else {
                high = mid - 1; // Search in the left half
            }
        }
        
        return result;
    }
}