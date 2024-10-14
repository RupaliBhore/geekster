// HW_zero brings zero

// Given a fixed-length integer array arr, duplicate each occurrence of zero, shifting the remaining elements to the right.

// Note that elements beyond the length of the original array are not written. Do the above modifications to the input array in place and do not return anything.

// NOTE :- After answering the question, attempt the related question in the linked resource to improve your understanding of this question. Click here

// Input Format

// The first line contains N, i.e. the size of the array.

// The second line contains N space-separated positive integers A[i] denoting elements of the array.

// Constraints

// 1 <= N <= 10^4

// 0 <= arr[i] <= 9
// Output Format

// Return the desired array.

// Sample Input 0

// 8
// 1 0 2 3 0 4 5 0
// Sample Output 0

// 1 0 0 2 3 0 0 4 
// Explanation 0

// After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]

//jaha pe zero he usake next bhi 0 add karo par original aaray ke length change nahi honi chaiye koi elemt chutaha he to thik he par length fix rahegi
import java.io.*;
import java.util.*;

public class Solution {
   
    public static void duplicateZeros(int[] arr) {
       int n = arr.length;
        
        // Traverse the array
        for (int i = 0; i < n; i++) {
            // If a zero is encountered
            if (arr[i] == 0) {
                // Shift elements to the right, starting from the end
                for (int j = n - 1; j > i; j--) {
                    arr[j] = arr[j - 1];
                }
                // Duplicate the zero by setting the next element to zero
                i++;  // Skip over the next position as it contains the duplicated zero
            }
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input array size
        int N = scanner.nextInt();
        int[] arr = new int[N];
        
        // Input array elements
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        
        // Perform the duplication of zeros
        duplicateZeros(arr);
        
        // Print the modified array
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

