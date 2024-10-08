// // Sort 0 1 2

// You have given an array arr with 0's , 1's and 2's in it. You need to sort the array but the condition is you are not allowed to use the any sorting algorithum.

// Note: Use Two Pointer approach.

// NOTE:- After answering the question, attempt the related question in the linked resource to improve your understanding of the question . Click here

// Input Format

// First line will contain N representing size of array.

// Second line will contain N integers representing elements of array.

// Constraints

// 0 <= N <= 10^6

// arr[i] == 0 or 1 or 2
// Output Format

// Return the sorted array.

// Sample Input 0

// 5
// 1 0 1 2 0
// Sample Output 0

// 0 0 1 1 2
// Sample Input 1

// 4
// 1 0 1 2
// Sample Output 1

// 0 1 1 2


import java.util.*;

public class Q7 {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the size of the array
        int n = scanner.nextInt();
        
        // Input the array elements
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        // Sort the array using two-pointer approach
        sortArray(arr);
        
        // Print the sorted array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
    public static void sortArray(int[] arr) {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;
        
        while (mid <= high) {
            switch (arr[mid]) {
                case 0:
                    // Swap arr[low] and arr[mid] and increment low and mid
                    int temp0 = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp0;
                    low++;
                    mid++;
                    break;
                case 1:
                    // No swap needed, just move mid pointer
                    mid++;
                    break;
                case 2:
                    // Swap arr[mid] and arr[high] and decrement high
                    int temp2 = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp2;
                    high--;
                    break;
            }
        }
    }
}