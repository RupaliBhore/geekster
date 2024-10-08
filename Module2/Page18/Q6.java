// HW_Tickets Shopping
// There are n people in a line queuing to buy tickets, where the 0th person is at the front of the line and the (n - 1)th person is at the back of the line.

// You are given a 0-indexed integer array tickets of length n where the number of tickets that the ith person would like to buy is tickets[i].

// Each person takes exactly 1 second to buy a ticket. A person can only buy 1 ticket at a time and has to go back to the end of the line (which happens instantaneously) in order to buy more tickets. If a person does not have any tickets left to buy, the person will leave the line.

// Return the time taken for the person at position k (0-indexed) to finish buying tickets.

// Input Format

// First line contains an input n. Next line contains an integer array tickets[i] of size n Next line contains an integer k.

// Constraints

// n == tickets.length 1 <= n <= 100 1 <= tickets[i] <= 100 0 <= k < n

// Output Format

// return an integer value

// Sample Input 0

// 3
// 2 3 2
// 2
// Sample Output 0

// 6
// Explanation 0

// In the first pass, everyone in the line buys a ticket and the line becomes [1, 2, 1].

// In the second pass, everyone in the line buys a ticket and the line becomes [0, 1, 0].

// The person at position 2 has successfully bought 2 tickets and it took 3 + 3 = 6 seconds.


import java.util.Scanner;

public class Q6 {

    public static int timeToBuyTickets(int[] tickets, int k) {
        int time = 0; // Track the time taken
        
        // Simulate the process
        while (tickets[k] > 0) {
            // Go through each person in the line
            for (int i = 0; i < tickets.length; i++) {
                // If the current person still has tickets to buy
                if (tickets[i] > 0) {
                    tickets[i]--; // They buy one ticket
                    time++; // Increment the time counter
                    
                    // If the person at index k has bought all their tickets, we stop
                    if (tickets[k] == 0) {
                        return time;
                    }
                }
            }
        }
        
        return time;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input the number of people in the line
        int n = sc.nextInt();
        
        // Input the number of tickets each person wants to buy
        int[] tickets = new int[n];
        for (int i = 0; i < n; i++) {
            tickets[i] = sc.nextInt();
        }
        
        // Input the position of the person we are interested in
        int k = sc.nextInt();
        
        // Output the time taken for the person at position k to buy all their tickets
        System.out.println(timeToBuyTickets(tickets, k));
        
        sc.close();
    }
}
//finded