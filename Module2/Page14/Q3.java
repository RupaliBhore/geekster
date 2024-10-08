// Merge two sorted arrays 7

// Given two sorted arrays A[] and B[] of size N and M. The task is to merge both the arrays into a single ArrayList in non-decreasing order but it contains only unique elements.

// Input Format

// First line take an integer input from user as N , where N is the size of A[].
// Second line takes N elements as Integer input in A[].
// Third line take an integer input from user as M , where M is the size of B[].
// Next line takes M elements as Integer input in B[].
// Constraints

// 1 <= N <= 200 1 <= M <= 200 -1000 <= A[i], B[j] <= 1000

// Output Format

// Print the merged Array.

// Sample Input 0

// 4
// 1 3 3 7
// 4
// 2 4 4 8
// Sample Output 0

// 1 2 3 4 7 8 
// Explanation 0

// merged array = [ 1, 2, 3, 4, 7, 8 ]



import java.util.*;

public class Q3 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Step 1: Input for first array A
        int N = scn.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scn.nextInt();
        }

        // Step 2: Input for second array B
        int M = scn.nextInt();
        int[] B = new int[M];
        for (int i = 0; i < M; i++) {
            B[i] = scn.nextInt();
        }

        // Step 3: Use a TreeSet to store unique elements in sorted order
        Set<Integer> mergedSet = new TreeSet<>();

        // Step 4: Add elements of A and B to the TreeSet
        for (int i = 0; i < N; i++) {
            mergedSet.add(A[i]);
        }
        for (int i = 0; i < M; i++) {
            mergedSet.add(B[i]);
        }

        // Step 5: Convert the TreeSet to ArrayList to maintain sorted unique elements
        ArrayList<Integer> mergedList = new ArrayList<>(mergedSet);

        // Step 6: Print the merged list
        for (int element : mergedList) {
            System.out.print(element + " ");
        }
        System.out.println(); // Move to the next line after printing
    }
}