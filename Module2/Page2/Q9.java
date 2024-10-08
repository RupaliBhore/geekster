// // Peak Index in a Mountain Array 2

// Meet Alex, a mountaineer who loves to climb peaks. One day, he discovered a unique mountain that had an array-like structure. He noticed that the array had a peak element that was larger than all its adjacent elements. Alex was fascinated by the mountain's structure and decided to find the peak element's index.

// He carefully analyzed the array's properties and realized that the peak element would be the highest point on the mountain. Alex found the peak element's index by climbing the mountain and marking the highest point. He was then able to return the index of the peak element in the array.

// Let's call an array arr a mountain if the following properties hold:

// arr.length >= 3

// There exists some i with 0 < i < arr.length - 1 such that: arr[0] < arr[1] < ... arr[i-1] < arr[i] > arr[i] > arr[i+1] > ... > arr[arr.length - 1]
// Given an integer array arr that is guaranteed to be a mountain, return any i such that arr[0] < arr[1] < ... arr[i - 1] < arr[i] > arr[i + 1] > ... > arr[arr.length - 1].

// NOTE :- After answering the question, attempt the related question in the linked resource to improve your understanding of this question . Click here

// Input Format

// First line take an integer input from user as N , where N is the size of array.

// Second line takes N elements as non-negative integers input in array.

// Constraints

// 3 <= arr.length <= 10^4
// 0 <= arr[i] <= 10^6
// arr is guaranteed to be a mountain array.
// Output Format

// Return the index , that form mountain

// Sample Input 0

// 3
// 0 1 0 
// Sample Output 0

// 1
// Sample Input 1

// 3
// 0 2 1 0
// Sample Output 1

// 1


import java.util.*;

public class Q9 {

 
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the size of the array
        int N = sc.nextInt();
        int[] arr = new int[N];

        // Read the elements of the array
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        // Find the peak element index
        int peakIndex = findPeakIndex(arr);

        // Print the peak index
        System.out.println(peakIndex);
    }

    private static int findPeakIndex(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if mid is the peak
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            // If the mid element is part of the increasing sequence
            else if (arr[mid] < arr[mid + 1]) {
                left = mid + 1;
            }
            // If the mid element is part of the decreasing sequence
            else {
                right = mid - 1;
            }
        }

        // Return -1 if no peak found, but the problem guarantees a mountain array
        return -1;
    }
}