// // HW_calculator 36

// Take an array arr of size N as input which represents a large number. Add X to this large number and print the resultant array.

// eg:-for X = 2 and array is [4,2,3,6,5,8,7,1,5,3,9,6] In this case answer must be [4,2,3,6,5,8,7,1,5,3,9,8]

// Note: The large integer does not contain any leading 0's in the array.

// Input Format

// First line contains an integer N representing the length of array.

// Second line contains N integers representing the elements of array.

// Third line contains an integer X .

// Constraints

// 1 <= N <= 1000000

// 0 <= arr[i] <= 9

// 0 <= X <= 9
// Output Format

// print the resultant array.

// Sample Input 0

// 10
// 1 8 7 5 2 2 9 3 7 4
// 9
// Sample Output 0

// 1 8 7 5 2 2 9 3 8 3 

import java.util.*;

public class Q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the array
        int N = scanner.nextInt();
        int[] arr = new int[N];

        // Read the elements of the array
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        // Read the integer X
        int X = scanner.nextInt();

        // Add X to the number represented by the array
        int carry = X;
        for (int i = N - 1; i >= 0; i--) {
            int sum = arr[i] + carry;
            arr[i] = sum % 10;
            carry = sum / 10;
        }

        // Handle the case where there is an additional carry
        if (carry > 0) {
            System.out.print(carry + " ");
        }

        // Print the resultant array
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
