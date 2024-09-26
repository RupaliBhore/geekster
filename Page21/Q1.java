// // Sum of all Elements of Array

// You are given an array, and you have to calculate the sum of all elements in the array.

// Input Format

// First line consists of size of array n.

// Second line consists Elements of array (seperated by space).

// Constraints

// 1 <= N <= 10^3
// Output Format

// Returns a sum

// Sample Input 0

// 3
// 9 8 9
// Sample Output 0

// 26
// Sample Input 1

// 3
// 4 2 1
// Sample Output 1

// 7


import java.util.*;

public class Q1 {

   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read size of the array
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline after integer input

        // Initialize array
        int[] arr = new int[n];

        // Read elements into the array
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Calculate the sum of array elements
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        // Print the sum
        System.out.println(sum);

        scanner.close();
    }
}