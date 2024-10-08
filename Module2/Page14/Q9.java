// HW_Delete middle element of a stack

// Given a stack, delete the middle element of the stack.

// Input Format

// The first line contains integer n that representing size of stack.

// The Second line contains n integer representing element of stack.

// Constraints

// 2 ≤ size of stack ≤ 10^5

// Output Format

// Return the middle element of the stack and print remaining element of stack.

// Sample Input 0

// 5
// 10 20 30 40 50
// Sample Output 0

// 10 20 40 50


import java.util.*;

public class Q9 {

     // Function to delete the middle element of the stack
    public static void deleteMiddle(Stack<Integer> stack, int n, int curr) {
        // Base case: If we've reached the middle of the stack
        if (curr == n / 2) {
            stack.pop(); // Remove the middle element
            return;
        }
        
        // Store the top element and pop it
        int top = stack.pop();
        
        // Recursively call for the next element
        deleteMiddle(stack, n, curr + 1);
        
        // Push the top element back after the middle is deleted
        stack.push(top);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input stack size
        int n = sc.nextInt();
        
        // Initialize the stack and take input elements
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            stack.push(sc.nextInt());
        }
        
        // Call the function to delete the middle element
        deleteMiddle(stack, n, 0);
        
        // Print the remaining elements in the stack
        while (!stack.isEmpty()) {
            System.out.print(stack.get(0) + " ");
            stack.remove(0); // Simulates FIFO for printing
        }
        
        sc.close();
    }
}
//Finded
// Time and Space Complexity:
// Time Complexity: O(n), where n is the number of elements in the stack, because each element is pushed and popped once.
// Space Complexity: O(n), due to the recursive call stack.