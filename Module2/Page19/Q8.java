// HW_Break stone

// You are given an array of integers stones where stones[i] is the weight of the  'i'th  stone.

// We are playing a game with the stones. On each turn, we choose the heaviest two stones and smash them together. Suppose the heaviest two stones have weights x and y with x <= y. The result of this smash is:

// If x == y, both stones are destroyed, and
// If x != y, the stone of weight x is destroyed, and the stone of weight y has new weight y - x.
// At the end of the game, there is at most one stone left.

// Return the weight of the last remaining stone. If there are no stones left, return 0.

// NOTE :- After answering the question, attempt the related question in the linked resource to improve your understanding of this question . Click here

// Input Format

// Single Integer N .
// N Integer spaced with single space.
// Constraints

// 1 <= stones.length <= 10^6 
// 1 <= stones[i] <= 1000
// Output Format

// Single Integer value of last stone.

// Sample Input 0

// 6
// 2 7 4 1 8 1
// Sample Output 0

// 1
// Explanation 0

// We combine 7 and 8 to get 1 so the array converts to [2,4,1,1,1] then,
// we combine 2 and 4 to get 2 so the array converts to [2,1,1,1] then,
// we combine 2 and 1 to get 1 so the array converts to [1,1,1] then,
// we combine 1 and 1 to get 0 so the array converts to [1] then that's the value of the last stone.



import java.util.*;

public class Q8 {
    public static int lastStoneWeight(int[] stones) {
        // Create a max-heap (priority queue)
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        
        // Add all stones to the heap
        for (int stone : stones) {
            maxHeap.offer(stone);
        }
        
        // Process the stones until one or none remains
        while (maxHeap.size() > 1) {
            int first = maxHeap.poll();  // Heaviest stone
            int second = maxHeap.poll(); // Second heaviest stone
            
            if (first != second) {
                // If they are different, the remaining stone's weight is the difference
                maxHeap.offer(first - second);
            }
            // If they are equal, both stones are destroyed and we do nothing
        }
        
        // If there's a remaining stone, return its weight, else return 0
        return maxHeap.isEmpty() ? 0 : maxHeap.poll();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read number of stones
        int n = sc.nextInt();
        int[] stones = new int[n];

        // Read stones
        for (int i = 0; i < n; i++) {
            stones[i] = sc.nextInt();
        }

        // Get the weight of the last stone
        int result = lastStoneWeight(stones);
        
        // Print the result
        System.out.println(result);
        
        sc.close();
    }
}
//finded