// // Add One
// Take an array arr of size N as input which represents a large number.

// Add 1 (one) to this large number and print the resultant array.

// eg:- [4,2,3,6,5,8,7,1,5,3,9,6] In this case answer must be [4,2,3,6,5,8,7,1,5,3,9,7]

// Note: The large integer does not contain any leading 0's in the array.

// NOTE:- After answering the question, attempt the related question in the linked resource to improve your understanding of this question . Click here

// Input Format

// First line contains an integer N, which is the size of the array.

// Second line contains N integers, depicting the elements of the array.

// Constraints

// 1 <= N <= 1000

// 0 <= arr[i] <= 9
// Output Format

// The resultant array.

// Sample Input 0

// 5
// 1 2 3 4 5 
// Sample Output 0

// 1 2 3 4 6
// Sample Input 1

// 1
// 9
// Sample Output 1

// 1 0


import java.util.*;

public class Q4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the array
        int N = scanner.nextInt();
        int[] arr = new int[N];

        // Read the elements of the array
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        // Add 1 to the large number represented by the array
        int carry = 1;
        for (int i = N - 1; i >= 0; i--) {
            int sum = arr[i] + carry;
            arr[i] = sum % 10;
            carry = sum / 10;
        }

        // If there is still a carry, we need to resize the array and shift elements
        if (carry > 0) {
            int[] result = new int[N + 1];
            result[0] = carry;
            System.arraycopy(arr, 0, result, 1, N);
            arr = result;
        }

        // Print the resultant array
        System.out.println(Arrays.toString(arr).replaceAll("[\\[\\],]", ""));
    }
}