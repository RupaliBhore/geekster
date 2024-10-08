// Next Smaller Element To The Right

// You are given a number n, representing the size of array a.
// You are given n numbers, representing elements of array a.
// You are required to "next smaller element on the right" for all elements of array
// Input and output is handled for you.
// "Next smaller element on the right" of an element x is defined as the first element to right of x having value smaller than x. Note -> If an element does not have any element on it's right side smaller than it, consider -1 as it's "next smaller element on right"

// Input Format

// The first line will be Integer N representing the size of array

// The Second line will be N Integer representing element of an array.

// Constraints

// 0 <= n < 10^5

// -10^9 <= a[i] <= 10^9

// Output Format

// Return an array of integers that represent the next smaller element of the element at index i in the given array.

// Sample Input 0

// 9
// 2 5 9 3 1 12 6 8 7
// Sample Output 0

// 1 3 3 1 -1 6 -1 7 -1



import java.util.*;

public class Q5 {

      // Function to find the next smaller element on the right for each element
    public static int[] nextSmallerElementOnRight(int[] arr, int n) {
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        // Traverse the array from right to left
        for (int i = n - 1; i >= 0; i--) {
            // Pop elements from the stack that are greater than or equal to the current element
            while (!stack.isEmpty() && stack.peek() >= arr[i]) {
                stack.pop();
            }

            // If the stack is empty, no smaller element on the right; else the top is the answer
            if (stack.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = stack.peek();
            }

            // Push the current element onto the stack
            stack.push(arr[i]);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the size of the array
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input the elements of the array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Get the result array for next smaller elements on the right
        int[] result = nextSmallerElementOnRight(arr, n);

        // Print the result array
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i == result.length - 1 ? "" : " "));
        }

        sc.close();
    }
}
//Finded
// Time Complexity: O(n), where n is the number of elements in the array. Each element is processed once (pushed and popped from the stack at most once).
// Space Complexity: O(n) for the stack and result array.

