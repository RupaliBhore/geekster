// HW_Take Gifts From the Richest Pile 2


// You are given an integer array gifts denoting the number of gifts in various piles. Every second, you do the following:

// Choose the pile with the maximum number of gifts. If there is more than one pile with the maximum number of gifts, choose any. Leave behind the floor of the square root of the number of gifts in the pile. Take the rest of the gifts.

// Return the number of gifts remaining after k seconds.

// Input Format

// First line contains an integer n.

// Second line contains an integer array of size n.

// Third line contains an integer k.

// Constraints

// 1 <= gifts.length <= 10^3
    
// 1 <= gifts[i] <= 10^9
    
// 1 <= k <= 10^3
// Output Format

// Returns an integer value.

// Sample Input 0

// 5
// 25 64 9 4 100
// 4
// Sample Output 0

// 29



import java.util.*;

public class Q1 {

  public static int pickGifts(int[] gifts, int k) {
        // Max heap to store gifts (negative values because PriorityQueue is min-heap by default)
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);

        // Add all piles of gifts to the heap
        for (int gift : gifts) {
            maxHeap.add(gift);
        }

        // Perform k operations
        for (int i = 0; i < k; i++) {
            // Remove the pile with the maximum gifts
            int maxGifts = maxHeap.poll();
            
            // Calculate the remaining gifts after taking the floor of sqrt
            int remainingGifts = (int) Math.floor(Math.sqrt(maxGifts));
            
            // Add the remaining gifts back into the heap
            maxHeap.add(remainingGifts);
        }

        // Sum up the remaining gifts in all piles
        int totalRemainingGifts = 0;
        while (!maxHeap.isEmpty()) {
            totalRemainingGifts += maxHeap.poll();
        }

        return totalRemainingGifts;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the number of piles
        int n = sc.nextInt();

        // Input the gifts array
        int[] gifts = new int[n];
        for (int i = 0; i < n; i++) {
            gifts[i] = sc.nextInt();
        }

        // Input the number of seconds k
        int k = sc.nextInt();

        // Output the remaining gifts after k seconds
        System.out.println(pickGifts(gifts, k));
    }
}

// //Finded
// Time Complexity:
// O(k log n) where n is the number of piles, and k is the number of seconds. For each of the k operations, we extract and insert an element in the heap, which takes log n time.

// Space Complexity:
// O(n) because we store the number of piles in the max-heap, which has space proportional to the number of piles.