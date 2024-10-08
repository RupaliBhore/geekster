// HW_maximum diamonds

// There are N bags with diamonds in them. The i'th of these bags contains A[i] diamonds. If you drop a bag with P diamonds, it changes to [p/2] diamonds, and you gain P diamonds, where [p] is the greatest integer less than P . Dropping a bag takes 1 minute. Find the maximum number of diamonds that you can take if you are given K minutes.

// Input Format

// Two Integers N and K.
// N integers seperated by single space.
// Constraints

// 1 <= N <= 10^5
// 0 <= K <= 10^5
// 0 <= A[i] <= 10^5
// Output Format

// Single Integer representing max diamonds.

// Sample Input 0

// 5 3
// 2 1 7 4 2
// Sample Output 0

// 14
// Explanation 0

// The state of bags is: [ 2 1 7 4 2 ]
// You take all diamonds from Third bag (7).
// The state of bags becomes: [ 2 1 3 4 2 ]
// Take all diamonds from Fourth bag (4).
// The state of bags becomes: [ 2 1 3 2 2 ]
// Take all diamonds from Third bag (3).
// The state of bags becomes: [ 2 1 1 2 2 ]
// Hence, number of Diamonds = 7+4+3 = 14.



import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read N and K
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        
        // Read the array A
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        
        // Max-heap to store the diamond counts
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        
        // Add all diamond counts to the max-heap
        for (int diamonds : A) {
            maxHeap.offer(diamonds);
        }
        
        int totalDiamonds = 0;
        
        // Drop bags for K minutes or until we run out of bags
        for (int i = 0; i < K; i++) {
            if (maxHeap.isEmpty()) {
                break; // No more bags to drop
            }
            
            // Get the bag with the maximum diamonds
            int maxDiamonds = maxHeap.poll();
            totalDiamonds += maxDiamonds; // Collect diamonds
            
            // Calculate the diamonds left after dropping the bag
            int remainingDiamonds = maxDiamonds / 2; // Greatest integer less than maxDiamonds / 2
            
            // If there are any diamonds left, put it back in the heap
            if (remainingDiamonds > 0) {
                maxHeap.offer(remainingDiamonds);
            }
        }
        
        // Output the total number of diamonds collected
        System.out.println(totalDiamonds);
    }
}
//Finded 
// Time Complexity: O((N+K)logN) due to heap operations for inserting and polling diamonds.
// Space Complexity: O(N) for storing the diamonds in the max-heap.



