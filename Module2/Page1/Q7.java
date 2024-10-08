// // HW_Kth Smallest Element

// Meet Sarah, a computer science student who is working on a project that requires finding the Kth smallest element in an array.

// The array contains distinct elements, and Sarah's task is to determine the Kth smallest element where K is less than the size of the array.

// Input Format

// First line take an integer input from user as N , where N is the size of array.

// Second line takes N elements as Integer input in array.

// Third line take an integer input K .

// Constraints

// 1 <= N <= 10^5

// 1 <= arr[i] <= 10^5

// 1 <= K <= N
// Output Format

// Return an integer representing kth smallest element

// Sample Input 0

// 5
// 7 3 1 8 5 
// 2
// Sample Output 0

// 3


//ASKED

import java.util.*;

public class Q7 {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        // Read the size of the array
        int N = scanner.nextInt();

        // Read the array elements
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        // Read the value of K
        int K = scanner.nextInt();

        // Find the Kth smallest element
        int kthSmallest = findKthSmallest(arr, K);

        // Output the Kth smallest element
        System.out.println(kthSmallest);
    }

    // Function to find the Kth smallest element in the array
    public static int findKthSmallest(int[] arr, int K) {
        // Sort the array
        Arrays.sort(arr);

        // Return the Kth smallest element (1-indexed)
        return arr[K - 1];
    }
}