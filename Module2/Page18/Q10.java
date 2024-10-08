// Reduce Array Size to the half 1

// You are given an integer array arr. You can choose a set of integers and remove all the occurrences of these integers in the array.

// Return the minimum size of the set so that at least half of the integers of the array are removed.

// Input Format

// Take the Integer N representing the size of an array.

// Take the N integer representing element of an array.

// Constraints

// 2 <= arr.length <= 10^5

// arr.length is even.

// 1 <= arr[i] <= 10^5

// Output Format

// Return the minimum size of the set so that at least half of the integers of the array are removed.

// Sample Input 0

// 10
// 3
// 3
// 3
// 3
// 5
// 5
// 5
// 2
// 2
// 7
// Sample Output 0

// 2
// Explanation 0

// Choosing {3,7} will make the new array [5,5,5,2,2] which has size 5 (i.e equal to half       of the size of the old array). Possible sets of size 2 are {3,5},{3,2},{5,2}.Choosing       set {2,7} is not possible as it will make the new array [3,3,3,3,5,5,5] which has a size     greater than half of the size of the old array.



import java.util.*;

public class Q10 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i<n; i++){
            int x = scn.nextInt();
            hm.put(x, hm.getOrDefault(x, 0)+1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.addAll(hm.values());
        int removed = 0;
        int count = 0;
        while(removed < n/2){
            removed += pq.remove();
            count++ ;
        }
        System.out.println(count);
    }
}
//class discussed aman sir
// Time Complexity:
// Building the frequency map: O(n), where n is the number of elements in the array.
// Adding frequencies to the priority queue: O(m log m), where m is the number of unique elements in the array.
// Removing elements from the priority queue: O(m log m).
// Overall time complexity: O(n + m log m), where n is the size of the array and m is the number of unique elements, because sorting in the priority queue dominates the process.

// Space Complexity:
// HashMap and PriorityQueue: O(m), where m is the number of unique elements.
// Overall space complexity: O(m) because we store frequencies for each unique element.






// import java.io.*;
// import java.util.*;

// public class Solution {
//   public static int minSetSize(int[] arr) {
//         // Step 1: Count the frequency of each element
//         Map<Integer, Integer> frequencyMap = new HashMap<>();
//         for (int num : arr) {
//             frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
//         }

//         // Step 2: Create a list of frequencies and sort them in descending order
//         List<Integer> frequencies = new ArrayList<>(frequencyMap.values());
//         Collections.sort(frequencies, Collections.reverseOrder());

//         // Step 3: Keep removing the most frequent elements until at least half of the array is removed
//         int removedElements = 0;
//         int setSize = 0;
//         int halfSize = arr.length / 2;
        
//         for (int freq : frequencies) {
//             removedElements += freq;
//             setSize++;
//             if (removedElements >= halfSize) {
//                 break;
//             }
//         }

//         return setSize;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // Input: Size of the array
//         int n = sc.nextInt();
//         int[] arr = new int[n];
        
//         // Input: Elements of the array
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         // Output: Minimum size of the set
//         System.out.println(minSetSize(arr));
        
//         sc.close();
//     }
// }
// //Finded 

