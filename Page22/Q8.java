// // HW_update with k
// Suppose you have an array of size n and a specific element k. Your task is to modify the array based on the following rules:

// If the element is even and greater than k, divide it by 2.

// If the element is odd and greater than k, add k to it.

// Input Format

// First line contains integer number n representing size of array.

// Second line contains n integer inputs representing elements of array.

// Third line contains an integer k.

// Constraints

// 1 <= n <= 10000

// 0 <= arr[i] < 10000

// 0 <= k <= 10000
// Output Format

// print the updated array.

// Sample Input 0

// 5
// 1 3 5 6 4
// 2
// Sample Output 0

// 1 5 7 3 2 

import java.util.*;

public class Q8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the array
        int n = scanner.nextInt();
        int[] array = new int[n];

        // Read the elements of the array
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Read the specific element k
        int k = scanner.nextInt();

        // Modify the array based on the given rules
        for (int i = 0; i < n; i++) {
            if (array[i] > k) {
                if (array[i] % 2 == 0) {
                    array[i] /= 2;
                } else {
                    array[i] += k;
                }
            }
        }

        // Print the updated array
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}