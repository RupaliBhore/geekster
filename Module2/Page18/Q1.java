// HW_Pair that is divisible by 60
// You are given a list of songs where the ith song has a duration of time[i] seconds.

// Return the number of pairs of songs for which their total duration in seconds is divisible by 60. Formally, we want the number of indices i, j such that i < j with (time[i] + time[j]) % 60 == 0.

// Input Format

// Take the Integer N as size of an array

// Take the N integer as element of an array

// Constraints

// 1 <= time.length <= 6 * 10^4

// 1 <= time[i] <= 500

// Output Format

// Return the number of pairs of songs for which their total duration in seconds is divisible by 60.

// Sample Input 0

// 5
// 30
// 20
// 150
// 100
// 40
// Sample Output 0

// 3
// Explanation 0

// Three pairs have a total duration divisible by 60:
// (time[0] = 30, time[2] = 150): total duration 180
// (time[1] = 20, time[3] = 100): total duration 120
// (time[1] = 20, time[4] = 40): total duration 60


import java.util.Scanner;

public class Q1 {

    public static int numPairsDivisibleBy60(int[] time) {
        int[] remainderCount = new int[60]; // Array to count occurrences of each remainder
        int count = 0; // Variable to store the number of valid pairs
        
        for (int t : time) {
            int remainder = t % 60; // Calculate the remainder
            int complement = (60 - remainder) % 60; // Find the complement remainder
            
            // Add the number of times the complement remainder has been seen
            count += remainderCount[complement];
            
            // Increment the count of the current remainder
            remainderCount[remainder]++;
        }
        
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Reading the size of the array
        int N = scanner.nextInt();
        
        // Reading the array of song durations
        int[] time = new int[N];
        for (int i = 0; i < N; i++) {
            time[i] = scanner.nextInt();
        }
        
        // Output the result: number of pairs divisible by 60
        System.out.println(numPairsDivisibleBy60(time));
        
        scanner.close();
    }
}
//.Finded 