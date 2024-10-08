// HW_k frequent elements

// Given an integer array nums and an integer k, return the k most frequent elements.

// If 2 elements have same frequency than print them in decreasing order.

// Input Format

// The first line contains N, i.e. the size of the array.

// The second line contains N space-separated positive integers nums[i] denoting elements of the array.

// The third line contains integer k.

// Constraints

// 1 <= N <= 10^5

// 0 <= nums[i] <= 9

// k is in the range [1, the number of unique elements in the array].

// It is guaranteed that the answer is unique.
// Output Format

// Return the top k frequent elements.

// Sample Input 0

// 7
// 1 1 1 2 2 3 3
// 2
// Sample Output 0

// 1 3


import java.util.*;

public class Q6 {

 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the size of the array
        int N = scanner.nextInt();
        int[] nums = new int[N];
        
        // Read the array elements
        for (int i = 0; i < N; i++) {
            nums[i] = scanner.nextInt();
        }
        
        // Read the value of k
        int k = scanner.nextInt();
        
        // Call the function to get the top k frequent elements
        int[] result = topKFrequent(nums, k);
        
        // Print the result
        for (int i : result) {
            System.out.print(i + " ");
        }
        
        scanner.close();
    }
    
    public static int[] topKFrequent(int[] nums, int k) {
        // Frequency array for digits 0-9
        int[] frequency = new int[10];
        
        // Count the frequency of each digit
        for (int num : nums) {
            frequency[num]++;
        }
        
        // Create a list of elements based on their frequency
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                list.add(i);
            }
        }
        
        // Sort the list by frequency and then by value in descending order if frequencies are the same
        list.sort((a, b) -> {
            int freqComparison = Integer.compare(frequency[b], frequency[a]);
            if (freqComparison == 0) {
                return Integer.compare(b, a);
            }
            return freqComparison;
        });
        
        // Get the top k elements
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = list.get(i);
        }
        
        return result;
    }
}