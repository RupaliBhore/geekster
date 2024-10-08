

// // // Rotate Right

// John is an athlete who has been training for a marathon for months. He uses a fitness app to track his progress, which stores his daily running data in an array. However, due to a bug in the app, the data is stored is not in order. To fix this, John needs to rotate the array to the right by a certain number of steps.

// Can you help John by writing a program that rotates the array to the right by k steps, where k is a non-negative integer?

// NOTE:- After answering the question, attempt the related question in the linked resource to improve your understanding of the question . Click here

// Input Format
// An integer number N representing size of array
// N integers number representing elements of array.
// An integer number k.

// Constraints
// 1 <= N <= 10^4
// -10^6 <= array[index] <= 10^6

// 0 <= k < N
// Output Format

// Return the array after performing the operation.

// Sample Input 0
// 7
// 1 2 3 4 5 6 7  
// 2

// Sample Output 0
// 6 7 1 2 3 4 5

// Explanation 0
// after 1st rotate 7 1 2 3 4 5 6
// after 2nd rotate 6 7 1 2 3 4 5






// finded
// import java.io.*;
// import java.util.*;

// public class Solution {

//     public static void main(String[] args) {
//    Scanner scanner = new Scanner(System.in);
        
//         // Input the size of the array
//         int n = scanner.nextInt();
        
//         // Input the array elements
//         int[] arr = new int[n];
//         for (int i = 0; i < n; i++) {
//             arr[i] = scanner.nextInt();
//         }
        
//         // Input the number of rotations
//         int k = scanner.nextInt();
        
//         // Normalize k to ensure it doesn't exceed array length
//         k = k % n;
        
//         // Rotate the array
//         rotate(arr, k);
        
//         // Print the rotated array
//         for (int i = 0; i < n; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
    
//     public static void rotate(int[] arr, int k) {
//         int n = arr.length;
        
//         // Step 1: Reverse the entire array
//         reverse(arr, 0, n - 1);
        
//         // Step 2: Reverse the first k elements
//         reverse(arr, 0, k - 1);
        
//         // Step 3: Reverse the remaining elements
//         reverse(arr, k, n - 1);
//     }
    
//     public static void reverse(int[] arr, int start, int end) {
//         while (start < end) {
//             int temp = arr[start];
//             arr[start] = arr[end];
//             arr[end] = temp;
//             start++;
//             end--;
//         }
//     }
// }








// discussed LC-189

import java.util.Scanner;

public class Q5 {
   
    public void reverse(int[] A, int i, int j) {
        while (i < j) {
            int tmp = A[i];
            A[i] = A[j];
            A[j] = tmp;
            i++;
            j--;
        }
    }

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // Ensure k is within the bounds of the array length
        reverse(nums, 0, n - k - 1);
        reverse(nums, n - k, n - 1);
        reverse(nums, 0, n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Q5 rotation = new Q5(); // Updated to match the class name

        // Get the size of the array from the user
  //      System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        // Initialize the array and get elements from the user
        int[] nums = new int[n];
    //    System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        // Get the number of rotations from the user
      //  System.out.print("Enter the number of rotations: ");
        int k = scanner.nextInt();

        // Rotate the array
        rotation.rotate(nums, k);

        // Print the rotated array
    //    System.out.println("Rotated array:");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
// discussed on leet code