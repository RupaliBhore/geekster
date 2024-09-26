// // HW_Second Largest in array 2
// You have been given a random integer array/list(ARR) of size N. You are required to find and return the second largest element present in the array/list.

// If N <= 1 or all the elements are same in the array/list then return -2147483648 or -2 ^ 31(It is the smallest value for the range of Integer)

// Input Format

// The first line contains an integer 'N' representing the size of the array/list.

// The second line contains 'N' single space separated integers representing the elements in the array/list.

// Constraints

// 0 <= N <= 10^5
// Output Format

// Print the second largest in the array/list if exists, -2147483648 otherwise.

// Output will be printed in a separate line.

// Sample Input 0

// 7
// 2 13 4 1 3 6 28
// Sample Output 0

// 13
// Sample Input 1

// 5
// 9 3 6 2 9
// Sample Output 1

// 6
// Sample Input 2

// 2
// 6 6
// Sample Output 2

// -2147483648
// Sample Input 3

// 4
// 90 8 90 5
// Sample Output 3

// 8


import java.util.*;

public class Q6 {

      public static int findSecondLargest(int[] arr, int n) {
        if (n <= 1) {
            return -2147483648;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        if (largest == secondLargest) {
            return -2147483648;
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the array
        int n = scanner.nextInt();

        // Read the array elements
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Find the second largest element
        int secondLargest = findSecondLargest(arr, n);

        // Print the result
        System.out.println(secondLargest);

        scanner.close();
    }
}