// // Find Duplicate 3
// Take an array of size n with integer input. And Print “true” if the array contains a duplicate element and print “false”. if the array doesn’t contain a duplicate element.

// Input Format

// First line contains an integer number n representing size of array.

// Second line contains n integer inputs representing elements of array.

// Constraints

// 1 <= n <= 10000

// -100000 <= arr[i] <= 100000
// Output Format

// Returns a boolean value.

// Sample Input 0

// 5
// 1
// 2
// 3
// 4
// 1
// Sample Output 0

// true
// Explanation 0

// since 1 has occured more than one time therefore 1 is duplicate.


import java.io.*;
import java.util.*;

public class Q2 {

   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input size of the array
        int n = scanner.nextInt();
        int[] arr = new int[n];

        // Input elements of the array
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Use a HashSet to check for duplicates
        Set<Integer> set = new HashSet<>();
        boolean hasDuplicate = false;

        for (int value : arr) {
            if (set.contains(value)) {
                hasDuplicate = true;
                break;
            }
            set.add(value);
        }

        // Print the result
        System.out.println(hasDuplicate);
    }
}