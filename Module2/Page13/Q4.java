// HW_Find Element in Rotated Array

// Given a sorted and rotated array arr[] of size N and a key, the task is to find the key in the array and return the index of the key.

// NOTE:- After answering the question, attempt the related question in the linked resource to improve your understanding of the question . Question Link -> https://leetcode.com/problems/search-in-rotated-sorted-array

// Input Format

// An integer number n representing size of array.
// N number representing elements of array.
// An integer number representing key value.
// Constraints

// 1<=n<=100000
// 1<=arr[i]<=10^9
// 1<=key<=10^9
// Output Format

// An integer value.

// Sample Input 0

// 8
// 5 6 7 8 9 10 1 2
// 1
// Sample Output 0

// 6
// Explanation 0

// key 1 is present at index 6



import java.util.*;

public class Q4 {

  public static int search(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Check if mid is the target
            if (arr[mid] == key) {
                return mid;
            }

            // Check if the left half is sorted
            if (arr[low] <= arr[mid]) {
                // Check if the key is in the left half
                if (arr[low] <= key && key < arr[mid]) {
                    high = mid - 1; // Search in the left half
                } else {
                    low = mid + 1; // Search in the right half
                }
            }
            // Otherwise, the right half is sorted
            else {
                // Check if the key is in the right half
                if (arr[mid] < key && key <= arr[high]) {
                    low = mid + 1; // Search in the right half
                } else {
                    high = mid - 1; // Search in the left half
                }
            }
        }

        // If we reach here, the element was not found
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the size of the array
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input the array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input the key to search for
        int key = sc.nextInt();

        // Search and print the index of the key
        System.out.println(search(arr, key));
    }
}
//FINDED
// Time Complexity:O(log n) because we are using binary search, reducing the search space by half each time.
// Space Complexity: O(1) since we are only using a few variables for binary search.