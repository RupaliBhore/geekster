// HW_Kth smallest element 21

// Given an array arr[] and an integer K where K is smaller than size of array, the task is to find the Kth smallest element in the given array. It is given that all array elements are distinct.

// Input Format

// The first line integer N represent the size of array

// The second line n integer represent element of an array

// The third line integer K represent kth Smallest element

// Constraints

// 1 <= N <= 10^5

// 1 <= arr[i] <= 10^5

// 1 <= K <= N

// Output Format

// return kth smallest element in an array.

// Sample Input 0

// 6
// 7 10 4 3 20 15
// 3
// Sample Output 0

// 7


import java.util.*;

public class Q2 {   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the size of the array
        int N = scanner.nextInt();
        
        // Create the array and read elements
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        
        // Read K
        int K = scanner.nextInt();
        
        // Sort the array
        Arrays.sort(arr);
        
        // Output the Kth smallest element (K is 1-based index)
        System.out.println(arr[K - 1]);
        
        scanner.close();
    }
}