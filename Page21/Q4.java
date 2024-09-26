// // Product of Elements Except Itself
// Declare the first array of size n that stores values of int data-type. Then take n integer inputs and store them in the array one by one.

// For each index print the product of all the elements except the element present at that index..

// NOTE:- After answering the question, attempt the related question in the linked resource to improve your understanding of the question . Question Link ->https://leetcode.com/problems/product-of-array-except-self/

// Input Format

// First line contains integer N as Size of Array.

// Second line contains N integer value as Arr[i] values

// Constraints

// NA

// Output Format

// Print value of Product of array except that particular index.

// Sample Input 0

// 3
// 2
// 5
// 3
// Sample Output 0

// 15
// 6
// 10
// Explanation 0

// Product of Array:-30 5*3=15 2*3=6 2*5=10


import java.util.*;

public class Q4 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read size of the array
        int n = scanner.nextInt();

        // Edge case: if array size is 0
        if (n == 0) {
            System.out.println("Array is empty");
            scanner.close();
            return;
        }

        // Initialize arrays
        int[] arr = new int[n];
        int[] prefixProduct = new int[n];
        int[] suffixProduct = new int[n];
        int[] result = new int[n];

        // Read elements into the array
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Calculate prefix products
        prefixProduct[0] = 1; // Initialize first element as 1
        for (int i = 1; i < n; i++) {
            prefixProduct[i] = prefixProduct[i - 1] * arr[i - 1];
        }

        // Calculate suffix products
        suffixProduct[n - 1] = 1; // Initialize last element as 1
        for (int i = n - 2; i >= 0; i--) {
            suffixProduct[i] = suffixProduct[i + 1] * arr[i + 1];
        }

        // Calculate result array
        for (int i = 0; i < n; i++) {
            result[i] = prefixProduct[i] * suffixProduct[i];
        }

        // Print the result array
        for (int i = 0; i < n; i++) {
            System.out.println(result[i] );
        }
        System.out.println();

        scanner.close();
    }
}