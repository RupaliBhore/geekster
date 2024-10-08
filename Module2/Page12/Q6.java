// Binary Search in an Array

// Given a array of n elements sorted in the increasing order, write a function to search a given element x in array and print the index of x in the array.

// Note: Consider the array is 0 based index and also that x definitely lies in range [0,arr.length].

// Input Format

// First line contains an integer n representing size of array. Second line contains n integer representing elements of array.

// Constraints

// 1 <= n <= 10^4
// 1 <= arr[i] <= 10^9
// Output Format

// An Integer Value

// Sample Input 0

// 7
// 1 2 3 4 5 6 7
// 3
// Sample Output 0

// 2
// Explanation 0

// since 3 is present at index 2 i.e arr[2] = 3


import java.util.*;

public class Q6 {

  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading the size of the array
        int n = scanner.nextInt();

        // Reading the sorted array elements
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Reading the element to search for
        int x = scanner.nextInt();

        // Performing binary search
        int index = binarySearch(arr, x);
        System.out.println(index);
    }

    // Binary Search function
    public static int binarySearch(int[] arr, int x) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // To avoid overflow

            if (arr[mid] == x) {
                return mid; // Element found, return index
            } else if (arr[mid] < x) {
                left = mid + 1; // Search right half
            } else {
                right = mid - 1; // Search left half
            }
        }

        return -1; // This line will never be reached as per problem statement constraints
    }
}