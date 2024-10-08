// HW_Next greater element on left 1



// Given an array arr, print the Next Greater Element (NGE) for every element. The Next greater Element  for an element x is the first greater element on the left side of x in the array. Elements for which no greater element exist, consider the next greater element as -1 .

// Input Format

// First line contains an integer N representing the size of the array.
// Next N lines contains elements of the array.
// Constraints

// 1 <= N <= 1000
// -1000 <= arr[i] <= 1000
// Output Format

// Print the answer array seperated by a single space
// Sample Input 0

// 5
// 3 4 3 2 1
// Sample Output 0

// -1 -1 4 3 2
// Explanation 0

// No element on left of  arr[0]=3 , which is greater so   res[0]=-1 .
// No element on left of  arr[1]=4 , which is greater so   res[1]=-1 .
//  is nearest element to the left of  arr[2]=3 , which is greater so  res[2]=-1 .
//  is nearest element to the left of  arr[3]=2 , which is greater so  res[3]=3 .
//  is nearest element to the left of  arr[4]=1 , which is greater so  res[2]=2 .


import java.util.*;

public class Q7 {

  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < n; i++) {
            // Pop elements from stack that are less than or equal to the current element
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }
            
            // If stack is empty, no greater element to the left
            if (stack.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = stack.peek();
            }
            
            // Push current element to the stack
            stack.push(arr[i]);
        }
        
        // Print the result array
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }
 }
// finded
// Time Complexity:
// O(N): Each element is pushed and popped from the stack at most once. We traverse the array in a single pass, making the time complexity O(N), where N is the size of the array.
// Space Complexity:
// O(N): The space complexity is O(N) due to the stack used to store elements and the result array, both of which can hold at most N elements.