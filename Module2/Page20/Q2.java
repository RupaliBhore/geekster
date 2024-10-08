// // HW_Furthest Building You Can Reach

// You are given an integer array heights representing the heights of buildings, some bricks, and some ladders.

// You start your journey from building 0 and move to the next building by possibly using bricks or ladders.

// While moving from building i to building i+1 (0-indexed),

// If the current building's height is greater than or equal to the next building's height, you do not need a ladder or bricks.
// If the current building's height is less than the next building's height, you can either use one ladder or (h[i+1] - h[i]) bricks.
// Print the furthest building index (0-indexed) you can reach if you use the given ladders and bricks optimally.

// Question Link: https://leetcode.com/problems/furthest-building-you-can-reach/

// Input Format

// First line contains an integer input n

// Next line contains an array heights[i] of size n.

// Next line contains an integer input which denotes number of bricks.

// Next line contains an integer input which denotes the number of ladder.

// Constraints

// 1 <= heights.length <= 10^5
// 1 <= heights[i] <= 10^6
// 0 <= bricks <= 10^9
// 0 <= ladders <= heights.length
// Output Format

// Print the furthest building index (0-indexed) you can reach if you use the given ladders and bricks optimally.

// Sample Input 0

// 7
// 4 2 7 6 9 14 12
// 5
// 1
// Sample Output 0

// 4
// Explanation 0

// Starting at building 0, you can follow these steps:

// Go to building 1 without using ladders nor bricks since 4 >= 2.
// Go to building 2 using 5 bricks. You must use either bricks or ladders because 2 < 7.
// Go to building 3 without using ladders nor bricks since 7 >= 6.
// Go to building 4 using your only ladder. You must use either bricks or ladders because 6 < 9.
// It is impossible to go beyond building 4 because you do not have any more bricks or ladders.


import java.util.*;

public class Q2 {

 public static int furthestBuilding(int[] heights, int bricks, int ladders) {
        // Min-heap to store the differences where ladders were used
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        // Iterate through the buildings
        for (int i = 0; i < heights.length - 1; i++) {
            int diff = heights[i + 1] - heights[i];
            
            // If the next building is taller
            if (diff > 0) {
                // Add the difference to the heap (for possible ladder use)
                minHeap.add(diff);
                
                // If the heap size exceeds the number of ladders, we need to use bricks
                if (minHeap.size() > ladders) {
                    bricks -= minHeap.poll();  // Use bricks for the smallest diff in the heap
                    
                    // If bricks are exhausted, return the current building index
                    if (bricks < 0) {
                        return i;
                    }
                }
            }
        }
        
        // If we've managed to go through all buildings, return the last index
        return heights.length - 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the number of buildings
        int n = sc.nextInt();
        int[] heights = new int[n];

        // Input the heights of buildings
        for (int i = 0; i < n; i++) {
            heights[i] = sc.nextInt();
        }

        // Input the number of bricks
        int bricks = sc.nextInt();

        // Input the number of ladders
        int ladders = sc.nextInt();

        // Print the furthest building you can reach
        System.out.println(furthestBuilding(heights, bricks, ladders));
    }
}

// // findend 2 methods
// Time Complexity:
// O(n log k), where n is the number of buildings and k is the number of ladders. We iterate through the buildings and each time add/remove from the heap, which takes log k time.
// Space Complexity:
// O(k), where k is the number of ladders, because the heap stores at most k elements.
// This approach efficiently balances the use of ladders and bricks to get the furthest possible building index.


















// import java.io.*;
// import java.util.*;

// public class Q2 {

//    public static int furthestBuilding(int[] heights, int bricks, int ladders) {
//         // PriorityQueue to store the climbs where we use bricks
//         PriorityQueue<Integer> minHeap = new PriorityQueue<>();

//         for (int i = 0; i < heights.length - 1; i++) {
//             int diff = heights[i + 1] - heights[i];

//             if (diff > 0) {
//                 minHeap.add(diff); // Add the climb to the priority queue

//                 // If we have more climbs than ladders, use bricks for the smallest climb
//                 if (minHeap.size() > ladders) {
//                     bricks -= minHeap.poll();
//                 }

//                 // If we run out of bricks, return the current index
//                 if (bricks < 0) {
//                     return i;
//                 }
//             }
//         }

//         // If we can reach the last building
//         return heights.length - 1;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         // Input the number of buildings
//         int n = sc.nextInt();
        
//         // Input the heights array
//         int[] heights = new int[n];
//         for (int i = 0; i < n; i++) {
//             heights[i] = sc.nextInt();
//         }
        
//         // Input number of bricks
//         int bricks = sc.nextInt();
        
//         // Input number of ladders
//         int ladders = sc.nextInt();
        
//         // Output the furthest building index
//         System.out.println(furthestBuilding(heights, bricks, ladders));
//     }
// }
// // Findend 2 methods 
// // // Time Complexity:
// // O(n log k) where n is the number of buildings, and k is the number of ladders. The log k comes from maintaining the priority queue (min-heap) that contains the k largest height differences. The loop runs n times, and for each step, we may need to insert into the heap, costing log k.

// // Space Complexity:
// // O(k) where k is the number of ladders since the heap stores at most k elements.
