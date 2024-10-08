// First Negative Integer 2
// Given an array A[] of size N and a positive integer K, find the first negative integer for each and every window(contiguous subarray) of size K.

// NOTE :- After answering the question, attempt the related question in the linked resource to improve your understanding of this question . Click here

// Input Format

// Two Integer N , K.
// N Integers spaced with single spaces.
// Constraints

// 1 <= N <= 10^5
// -10^5 <= A[i] <= 10^5
// 1 <= K <= N
// Output Format

// Print (N-K-1) Integers spaced with single spaces.
// Sample Input 0

// 5 2
// -8 2 3 -6 10
// Sample Output 0

// -8 0 -6 -6
// Explanation 0

// First negative integer for each window of size k
// {-8, 2} = -8
// {2, 3} = 0 (does not contain a negative integer)
// {3, -6} = -6
// {-6, 10} = -6


import java.util.*;

public class Q4 {

 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input for N and K
        int N = sc.nextInt();
        int K = sc.nextInt();
        
        // Input for the array A
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        
        // Find first negative integers in each window
        List<Integer> result = firstNegativeInWindow(A, N, K);
        
        // Print the result
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i));
            if (i < result.size() - 1) {
                System.out.print(" "); // Print space between elements
            }
        }
        
        sc.close();
    }

    public static List<Integer> firstNegativeInWindow(int[] A, int N, int K) {
        List<Integer> result = new ArrayList<>();
        Queue<Integer> negatives = new LinkedList<>();

        // Process the first K elements
        for (int i = 0; i < K; i++) {
            if (A[i] < 0) {
                negatives.offer(i); // Store the index of the negative number
            }
        }

        // Process the rest of the elements
        for (int i = K; i < N; i++) {
            // Check the first window
            if (!negatives.isEmpty()) {
                result.add(A[negatives.peek()]);
            } else {
                result.add(0); // No negative number in the window
            }

            // Remove elements that are out of this window
            if (!negatives.isEmpty() && negatives.peek() <= i - K) {
                negatives.poll();
            }

            // Add the next element of the array if it is negative
            if (A[i] < 0) {
                negatives.offer(i);
            }
        }

        // Check the last window
        if (!negatives.isEmpty()) {
            result.add(A[negatives.peek()]);
        } else {
            result.add(0);
        }

        return result;
    }
}
// // Finded
// Time Complexity: O(N) since each element is added and removed from the queue at most once.
// Space Complexity: O(K) for storing indices of negative numbers.
