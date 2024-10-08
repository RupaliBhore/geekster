// HW_Queue Reversal 5
// Given a Queue Q containing N elements. The task is to reverse the Queue.

// Input Format

// The First line integer N represent the size of Queue.

// The Second line N integer represent the element of Queue.

// Constraints

// 1 ≤ N ≤ 10^5

// 1 ≤ elements of Queue ≤ 10^5

// Output Format

// returns the reversed queue.

// Sample Input 0

// 5
// 1 2 3 5 6
// Sample Output 0

// 6 5 3 2 1



import java.util.*;

public class Q5 {

    // Function to reverse the queue
    public static Queue<Integer> reverseQueue(Queue<Integer> q) {
        Stack<Integer> stack = new Stack<>();
        
        // Push all elements of the queue into the stack
        while (!q.isEmpty()) {
            stack.push(q.poll());
        }
        
        // Pop all elements from the stack back into the queue
        while (!stack.isEmpty()) {
            q.add(stack.pop());
        }
        
        return q; // The queue is now reversed
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Reading the size of the queue
        int N = sc.nextInt();
        
        // Initializing the queue
        Queue<Integer> queue = new LinkedList<>();
        
        // Reading the elements of the queue
        for (int i = 0; i < N; i++) {
            queue.add(sc.nextInt());
        }
        
        // Reverse the queue
        queue = reverseQueue(queue);
        
        // Output the reversed queue
        while (!queue.isEmpty()) {
            System.out.print(queue.poll() + " ");
        }
        
        sc.close();
    }
}
//findede2