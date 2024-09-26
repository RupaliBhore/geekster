// // Store Maximum
// Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much maximum water it can trap after raining.

// image

// NOTE :-

// After answering the question, attempt the related question in the linked resource to improve your understanding of the question . Click here

// Input Format

// First line contains an integer number n representing size of array.

// Second line contains integer n integer inputs representing elements of array.

// Constraints

// 1 <= N <= 1000

// 0 <= arr[i] <= 100000
// Output Format

// Returns an Integer number

// Sample Input 0

// 12
// 0 1 0 2 1 0 1 3 2 1 2 1
// Sample Output 0

// 6

import java.util.*;

public class Q4 {

    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

        // Input size of the array
        int n = scanner.nextInt();
        int[] height = new int[n];

        // Input elements of the array
        for (int i = 0; i < n; i++) {
            height[i] = scanner.nextInt();
        }

        // Function call to compute the trapped water
        System.out.println(trap(height));
    }

    public static int trap(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }

        int left = 0, right = height.length - 1;
        int leftMax = 0, rightMax = 0;
        int trappedWater = 0;

        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] >= leftMax) {
                    leftMax = height[left];
                } else {
                    trappedWater += leftMax - height[left];
                }
                left++;
            } else {
                if (height[right] >= rightMax) {
                    rightMax = height[right];
                } else {
                    trappedWater += rightMax - height[right];
                }
                right--;
            }
        }

        return trappedWater;
    }
}