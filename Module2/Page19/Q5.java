// Minimum Cost of ropes 3
// There are given N ropes of different lengths, we need to connect these ropes into one rope. The cost to connect two ropes is equal to sum of their lengths. The task is to connect the ropes with minimum cost. Given N size array arr[] contains the lengths of the ropes.

// Input Format

// The first line integer N represent size of array.

// The second line n integer represent element of an array.

// Constraints

// 1 ≤ N ≤ 200000

// 1 ≤ arr[i] ≤ 10^6

// Output Format

// returns the minimum cost

// Sample Input 0

// 4
// 4 3 2 6
// Sample Output 0

// 29
// Explanation 0

// We can connect the ropes in following ways. 1) First connect ropes of lengths 2 and 3. Which makes the array {4, 5, 6}. Cost of this operation 2+3 = 5. 2) Now connect ropes of lengths 4 and 5. Which makes the array {9, 6}. Cost of this operation 4+5 = 9. 3) Finally connect the two ropes and all ropes have connected. Cost of this operation 9+6 =15 Total cost for connecting all ropes is 5 + 9 + 15 = 29. This is the optimized cost for connecting ropes. Other ways of connecting ropes would always have same or more cost. For example, if we connect 4 and 6 first (we get three rope of 3, 2 and 10), then connect 10 and 3 (we get two rope of 13 and 2). Finally we connect 13 and 2. Total cost in this way is 10 + 13 + 15 = 38.



import java.util.*;

public class Q5 {

    public static int minCost(int[] ropes) {
        // Priority queue (min-heap) to store the lengths of ropes
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Add all ropes to the heap
        for (int rope : ropes) {
            minHeap.add(rope);
        }

        int totalCost = 0;

        // While there are at least two ropes to connect
        while (minHeap.size() > 1) {
            // Extract the two smallest ropes
            int first = minHeap.poll();
            int second = minHeap.poll();

            // Calculate the cost of connecting them
            int cost = first + second;

            // Add the resulting rope back to the heap
            minHeap.add(cost);

            // Accumulate the total cost
            totalCost += cost;
        }

        return totalCost;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: size of the array
        int n = sc.nextInt();

        // Input: the lengths of the ropes
        int[] ropes = new int[n];
        for (int i = 0; i < n; i++) {
            ropes[i] = sc.nextInt();
        }

        // Output: the minimum cost to connect all ropes
        System.out.println(minCost(ropes));
    }
}
// Time Complexity:
// O(n log n) where n is the number of ropes. This is because we are performing heap operations (insertions and deletions) n-1 times, each of which takes O(log n) time.
// Space Complexity:
// O(n) to store the ropes in the priority queue.