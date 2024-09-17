// // HW_Print All Composite Number of Array

import java.util.*;

public class Q7 {
  public static boolean isComposite(int num) {
        if (num <= 1) {
            return false;
        }
        if (num == 2 || num == 3) {
            return false;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return true;
        }
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the array
        int n = scanner.nextInt();

        // Initialize array of size n
        int[] arr = new int[n];

        // Read elements into the array
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Print composite numbers in the array
        for (int i = 0; i < n; i++) {
            if (isComposite(arr[i])) {
                System.out.println(arr[i] );
            }
        }

        scanner.close();
    }
}

// Time Complexity: O(n * √m) where n is the number of elements in the array and m is the maximum value in the array, due to checking each number in the array for compositeness using trial division up to its square root.

// Space Complexity: O(n) because of the storage required for the array of size n.





// Given an array print all composite number present in the array
// Input Format
// First line contains an integer N representing the size
// Second line contains N integer values of array
// Constraints
// NA
// Output Format
// print all value of array which are composite.
// Sample Input 0
// 5
// 1
// 4
// 8
// 11
// 14
// Sample Output 0

// 4
// 8
// 14
// Explanation 0

// 4,8,14 Are the composite number present in array
