// Merge K sorted arrays
// Given k different arrays, which are sorted individually (in ascending order). You need to merge all the given arrays such that output array should be sorted (in ascending order).

// Hint : Use Heaps.

// Input Format

// The first line of input contains an integer, that denotes value of k.

// The following lines of input represent k sorted arrays. Each sorted array uses two lines of input. The first line contains an integer, that denotes the size of the array. The following line contains elements of the array.

// Constraints

// 0 <= k <= 1000 0 <= n1, n2 <= 10000

// Output Format

// The first and only line of output contains space separated elements of the merged and sorted array, as described in the task.

// Sample Input 0

// 4
// 3
// 1 5 9
// 2
// 45 90
// 5
// 2 6 78 100 234
// 1
// 0
// Sample Output 0

// 0 1 2 5 6 9 45 78 90 100 234




import java.io.*;
import java.util.*;

public class Solution {

      static class Q9 {
        int value; // The value of the array element
        int arrayIndex; // The index of the array it came from
        int elementIndex; // The index of the element in that array
        
        ArrayEntry(int value, int arrayIndex, int elementIndex) {
            this.value = value;
            this.arrayIndex = arrayIndex;
            this.elementIndex = elementIndex;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the number of arrays
        int k = sc.nextInt();
        PriorityQueue<ArrayEntry> minHeap = new PriorityQueue<>((a, b) -> Integer.compare(a.value, b.value));
        int[][] arrays = new int[k][];
        
        // Read each array
        for (int i = 0; i < k; i++) {
            int size = sc.nextInt(); // Read the size of the array
            arrays[i] = new int[size];
            for (int j = 0; j < size; j++) {
                arrays[i][j] = sc.nextInt(); // Read the elements of the array
            }
            // Add the first element of each array to the min-heap
            if (size > 0) {
                minHeap.add(new ArrayEntry(arrays[i][0], i, 0));
            }
        }
        
        // Result array to store the merged sorted elements
        StringBuilder result = new StringBuilder();
        
        // Merge process
        while (!minHeap.isEmpty()) {
            ArrayEntry current = minHeap.poll(); // Get the smallest element
            
            // Append to result
            result.append(current.value).append(" ");
            
            // If there is a next element in the same array, add it to the heap
            if (current.elementIndex + 1 < arrays[current.arrayIndex].length) {
                minHeap.add(new ArrayEntry(arrays[current.arrayIndex][current.elementIndex + 1], current.arrayIndex, current.elementIndex + 1));
            }
        }
        
        // Print the merged sorted array
        System.out.println(result.toString().trim());
    }
}
//Finded
// Time Complexity:
// The total time complexity is O(Nlogk), where N is the total number of elements across all arrays. The log factor comes from the operations on the min-heap, which contains at most 

// Space Complexity:
// The space complexity is O(k) for the min-heap, and O(N) for storing the result.