// // HW_REVERSE IN RANGE

// As a software engineer, John was tasked with implementing a function that could reverse a part of an integer array. The function would take as input an array of size N, along with two integers l and r, representing the range of elements to be reversed (both inclusive).

// John worked hard on the task, carefully considering different edge cases and potential bugs that could arise. Finally, he successfully implemented the function, which would efficiently reverse the specified range of elements in the array.

// Input Format

// N int value
// N integer as array elements
// l int value
// r int value
// Constraints

// 0 <= N <= 10^4

// 0 <= l,r <= N

// -10^4 <= arr[i] <= 10^4
// Output Format

// Return the new array.

// Sample Input 0

// 5
// 1 2 3 4 5
// 1 3
// Sample Output 0

// 1
// 4
// 3
// 2
// 5
// Explanation 0

// L=1 R=3 Reversing from 1 idx to 3 idx Array becomes-->1,4,3,2,5

import java.util.*;

public class Q8 {

 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the size of the array
        int n = scanner.nextInt();
        
        // Input the array elements
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        // Input the range l and r
        int l = scanner.nextInt();
        int r = scanner.nextInt();
        
        // Reverse the segment of the array from index l to r
        reverseSegment(arr, l, r);
        
        // Print the new array
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
    
    public static void reverseSegment(int[] arr, int l, int r) {
        // Reverse the sub-array from index l to r
        while (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
}