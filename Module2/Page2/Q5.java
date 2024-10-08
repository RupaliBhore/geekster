// Merge two sorted arrays

// Given two sorted arrays A[] and B[] of size N and M. The task is to merge both the arrays into a single array in non-decreasing order.

// Input Format

// First line take an integer input from user as N , where N is the size of A[].

// Second line takes N elements as Integer input in A[].

// Third line take an integer input from user as M , where M is the size of B[].

// Next line takes M elements as Integer input in B[].

// NOTE:- After answering the question, attempt the related question in the linked resource to improve your understanding of the question . Click here

// Constraints

// 1<=N<=200

// 1<=M<=200

// -10^4 <= A[i], B[j] <= 10^4
// Output Format

// Return the merged Array.

// Sample Input 0

// 4
// 1 3 5 7
// 4
// 2 4 6 8
// Sample Output 0

// 1 2 3 4 5 6 7 8 
// Explanation 0

// The merged array contains all the elements from both arrays in sorted order.



import java.util.*;

public class Q5 {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read size of the first array
        int N = sc.nextInt();
        int[] A = new int[N];
        
        // Read elements of the first array
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        // Read size of the second array
        int M = sc.nextInt();
        int[] B = new int[M];
        
        // Read elements of the second array
        for (int i = 0; i < M; i++) {
            B[i] = sc.nextInt();
        }

        // Merge the arrays
        int[] mergedArray = mergeSortedArrays(A, B);

        // Print the merged array
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }
    }

    private static int[] mergeSortedArrays(int[] A, int[] B) {
        int N = A.length;
        int M = B.length;
        int[] result = new int[N + M];
        
        int i = 0, j = 0, k = 0;
        
        while (i < N && j < M) {
            if (A[i] <= B[j]) {
                result[k++] = A[i++];
            } else {
                result[k++] = B[j++];
            }
        }
        
        // Copy remaining elements of A[], if any
        while (i < N) {
            result[k++] = A[i++];
        }
        
        // Copy remaining elements of B[], if any
        while (j < M) {
            result[k++] = B[j++];
        }
        
        return result;
    }
}